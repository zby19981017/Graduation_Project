package com.park.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.park.DateUtil;
import com.park.pojo.Cardrecord;
import com.park.pojo.Carrecord;
import com.park.pojo.Newsrecord;
import com.park.pojo.Positionrecord;
import com.park.pojo.Sysrecord;
import com.park.service.AdminService;
import com.park.service.UserService;

@Controller
public class UserController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService userService;
	
	
	/*
	 * 跳转到用户主页
	 * 需要从数据库里查相关数据，然后封装到model里返回给页面
	 */
	@RequestMapping(value="/parkIndex.action")
	public ModelAndView parkIndex(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		session.setAttribute("USER_FLAG", "user");
		ModelAndView modelAndView=new ModelAndView();
		List<Newsrecord> list=adminService.getBlog();
		int count=adminService.getFreePositionCount();
		Sysrecord sysrecord=userService.getSys();
		modelAndView.addObject("vipprice", sysrecord.getVipprice());
		modelAndView.addObject("count", count);
		modelAndView.addObject("list", list);
		modelAndView.addObject("control", sysrecord.getSyscontrol());
		modelAndView.setViewName("parkIndex");
		if(sysrecord.getSyscontrol()==0) {
			modelAndView.setViewName("parkoff");
		}
		return modelAndView;
	}
	@RequestMapping(value="/findPark.action")
	public ModelAndView findPark() {
		ModelAndView modelAndView=new ModelAndView();
		int count=adminService.getFreePositionCount();
		modelAndView.addObject("count", count);
		modelAndView.setViewName("findPark");
		return modelAndView;
	}
	
	//停车模块
	@RequestMapping(value="/parkCar.action")
	public ModelAndView parkCar(Carrecord carrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		//查询停车表里是否有该车辆记录，如果有说明已经停车，没有说明还没停车
		int hasCar=userService.hasCar(carrecord,1);
		if(hasCar==0) {
			List<Positionrecord> list=adminService.getFreePosition();
			String positionName=list.get(0).getPositionname();
			Date date=new Date();
			String dateString=DateUtil.getDate(date);
			carrecord.setIntime(date);
			carrecord.setIntimestring(dateString);
			carrecord.setPosition(positionName);
			carrecord.setCarstate(1);
			carrecord.setCarstatedes("停车中");
			
			int result=userService.parkCar(carrecord);
			modelAndView.addObject("message", "您的车位是："+positionName+"   祝您购物愉快");
			modelAndView.setViewName("userSuccess");
		}else {
			modelAndView.addObject("message", "您已经停车");
			modelAndView.setViewName("userSuccess");
		}
		
		return modelAndView;
	}
	//取车模块
	@RequestMapping(value="/outCar.action")
	public ModelAndView outCar(Carrecord carrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		
		int hasCar=userService.hasCar(carrecord,1);
		if(hasCar!=0) {
			Cardrecord cardrecord=userService.getCard(carrecord);
			int level=cardrecord.getLevel();
			String levelDes=cardrecord.getLveldes();
			
			
			Carrecord car=userService.getCar(carrecord);
			Date dateIn=car.getIntime();
			long ldateIn=dateIn.getTime();
			Date dateOut=new Date();
			long ldateOut=dateOut.getTime();
			int min=(int) ((ldateOut-ldateIn)/60000);
			Sysrecord sysrecord=userService.getSys();
			long minTime =(long) sysrecord.getMintime();
			//如果是年卡用户，显示停车市场和年卡有效期
			if(level==1) {//年卡
				long dateStart = cardrecord.getStarttime().getTime();
				long dateEnd = cardrecord.getEndtime().getTime();
				long validity = (dateEnd-dateStart)/(1000*60*60*24);
				userService.pay(car.getRid(),0,1);
				modelAndView.addObject("message", "年卡车辆：您停车"+min+"分钟，有效期还剩"+validity+"天，祝您一路平安");
				modelAndView.setViewName("userSuccess");
				//如果是免费车辆，显示停车市场
			}else if(level==2) {//免费车辆
				userService.pay(car.getRid(),0,2);
				modelAndView.addObject("message", "免费车辆：您停车"+min+"分钟，祝您一路平安");
				modelAndView.setViewName("userSuccess");
				//普通车辆显示市场，规定时间内不收费，超过免费时间会收费
			}else {//普通车辆
				if(min<=minTime) {
					userService.pay(car.getRid(),0,0);
					modelAndView.addObject("message", "普通车辆：您停车"+min+"分钟，免费");
					modelAndView.setViewName("userSuccess");
				}else {
					long hours=min/60;
					long minutes=min%60;
					long disHours =hours;
					if(minutes>=minTime) {
						hours=hours+1;
					}
					long price= (hours*sysrecord.getUsualprice());
					//如果停车时间大于一小时则显示停车多少小时多少分钟
					if(disHours>1) {
						
						modelAndView.addObject("message", "普通车辆：您停车"+disHours+"小时"+minutes+"分钟，收费"+price+"元");
						//如果没有大于一小时，显示停车多少分钟
					}else {
						modelAndView.addObject("message", "普通车辆：您停车"+minutes+"分钟，收费"+price+"元");
					}
					modelAndView.addObject("price", price);
					modelAndView.addObject("carid", car.getRid());
					modelAndView.setViewName("payOnce");
				}
			}
			
			
		}else {
			modelAndView.addObject("message", "您未停车");
			modelAndView.setViewName("userSuccess");
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="/pay.action")
	public ModelAndView pay(int price,int carid,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		userService.pay(carid,price,0);
		modelAndView.addObject("message", "祝您一路平安");
		modelAndView.setViewName("userSuccess");
	
		
		return modelAndView;
	}
	
	@RequestMapping(value="/vipset.action")
	public ModelAndView vipset(Cardrecord cardrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		userService.vipset(cardrecord);
		modelAndView.addObject("message", "办理成功");
		modelAndView.setViewName("userSuccess");
		
		return modelAndView;
	}


	
	

}
