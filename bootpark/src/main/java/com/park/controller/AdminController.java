package com.park.controller;

import java.io.File;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.park.DateUtil;
import com.park.pojo.Cardrecord;
import com.park.pojo.Countrecord;
import com.park.pojo.Newsrecord;
import com.park.pojo.Positionrecord;
import com.park.pojo.Sysrecord;
import com.park.pojo.Userrecord;
import com.park.pojo.ViewRecord;
import com.park.service.AdminService;
import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;
@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;

	@RequestMapping("/getCarNumber")
	public String getPicture(){
		return "";
	}
	
	@RequestMapping(value="/login.action")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	@RequestMapping(value="/loginCheck.action")
	public ModelAndView loginCheck(Userrecord userrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		int isLogin=adminService.loginCheck(userrecord);
		if(isLogin==0) {
			modelAndView.addObject("message","用户名或密码错误");
			modelAndView.setViewName("login");
		}else {
			session.setAttribute("USER_ID", isLogin);
			session.setAttribute("USER_FLAG", "admin");
			List<Positionrecord> positionList=adminService.getAllPosition();
			List<ViewRecord> positionUseList=adminService.getAllPositionUsing();
			List<Newsrecord> newsList=adminService.getBlog();
			List<Countrecord> countrecords=adminService.getCount();
			int monthCount=0;
			String curentDate=DateUtil.getDate(new Date()).substring(0, 7);
			for(int i=0;i<countrecords.size();i++) {
				if(countrecords.get(i).getCountyearmonth().equals(curentDate)) {
					monthCount=monthCount+countrecords.get(i).getCountpay();
				}
			}
			int freePosition=adminService.getFreePositionCount();
			int cardCount=adminService.getCardCount();
			int usingPosition=adminService.getUsingPositionCount();
			modelAndView.addObject("usingPosition", usingPosition);
			modelAndView.addObject("freePosition", freePosition);
			modelAndView.addObject("cardCount", cardCount);
			modelAndView.addObject("monthCount", monthCount);
			modelAndView.addObject("positionList", positionList);
			modelAndView.addObject("positionUseList", positionUseList);
			modelAndView.addObject("newsList", newsList);
			modelAndView.setViewName("adminIndex");
		}
		
		return modelAndView;
	}
	@RequestMapping(value="/adminIndex.action")
	public ModelAndView adminIndex(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		List<Positionrecord> positionList=adminService.getAllPosition();
		List<ViewRecord> positionUseList=adminService.getAllPositionUsing();
		List<Newsrecord> newsList=adminService.getBlog();
		List<Countrecord> countrecords=adminService.getCount();
		int monthCount=0;
		String curentDate=DateUtil.getDate(new Date()).substring(0, 7);
		for(int i=0;i<countrecords.size();i++) {
			if(countrecords.get(i).getCountyearmonth().equals(curentDate)) {
				monthCount=monthCount+countrecords.get(i).getCountpay();
			}
		}
		int freePosition=adminService.getFreePositionCount();
		int cardCount=adminService.getCardCount();
		int usingPosition=adminService.getUsingPositionCount();
		modelAndView.addObject("usingPosition", usingPosition);
		modelAndView.addObject("freePosition", freePosition);
		modelAndView.addObject("cardCount", cardCount);
		modelAndView.addObject("monthCount", monthCount);
		modelAndView.addObject("positionList", positionList);
		modelAndView.addObject("positionUseList", positionUseList);
		modelAndView.addObject("newsList", newsList);
		modelAndView.setViewName("adminIndex");
		return modelAndView;
	}
	
	@RequestMapping(value="/register.action")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("register");
		return modelAndView;
	}
	@RequestMapping(value="/saveRegister.action")
	public ModelAndView saveRegister(Userrecord userrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		int result=adminService.saveRegister(userrecord);
		if(result!=0) {
			modelAndView.setViewName("success");
			
		}else {
			modelAndView.addObject("message","注册失败");
			modelAndView.setViewName("register");
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="/toInsertPosition.action")
	public ModelAndView toInsertPosition(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("insertPosition");
		return modelAndView;
	}
	
	@RequestMapping(value="/insertPosition.action")
	public ModelAndView insertPosition(Positionrecord positionrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		positionrecord.setPositionstate(0);
		positionrecord.setPositionstatedes("可用");
		int result=adminService.insertPosition(positionrecord);
		if(result!=0) {
			modelAndView.addObject("message","设置成功");
			modelAndView.setViewName("success");
		}else {
			modelAndView.addObject("message","设置失败");
			modelAndView.setViewName("insertPosition");
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="/toSys.action")
	public ModelAndView toSys(Positionrecord positionrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
			ModelAndView modelAndView=new ModelAndView();
			Sysrecord sysrecord=adminService.getBasicSys();
			modelAndView.addObject("sysrecord", sysrecord);
			modelAndView.setViewName("sys");
		return modelAndView;
	}
	@RequestMapping(value="/saveSys.action")
	public ModelAndView saveSys(Sysrecord sysrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		Sysrecord sysrecord1=adminService.getBasicSys();
		modelAndView.addObject("sysrecord", sysrecord1);
		adminService.saveSys(sysrecord);
		modelAndView.setViewName("sys");
		return modelAndView;
	}
	@RequestMapping(value="/saveFree.action")
	public ModelAndView saveFree(Cardrecord card,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		Sysrecord sysrecord1=adminService.getBasicSys();
		modelAndView.addObject("sysrecord", sysrecord1);
		adminService.insertFree(card);
		modelAndView.addObject("messageFree", "添加成功");
		modelAndView.setViewName("sys");
		return modelAndView;
	}
	@RequestMapping(value="/controlPark.action")
	public ModelAndView controlPark(String type,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		Sysrecord sysrecord=new Sysrecord();
		sysrecord.setSysid(10001);
		
		if(type.equals("on")) {
			sysrecord.setSyscontrol(1);
			adminService.saveSys(sysrecord);
		}else {
			sysrecord.setSyscontrol(0);
			adminService.saveSys(sysrecord);
		}
		Sysrecord sysrecord1=adminService.getBasicSys();
		modelAndView.addObject("sysrecord", sysrecord1);
		modelAndView.addObject("messageControl", "设置成功");
		modelAndView.setViewName("sys");
		return modelAndView;
	}
	
	@RequestMapping(value="/saveBlog.action")
	public ModelAndView saveBlog(Newsrecord newsrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		Date date=new Date();
		String dateString=DateUtil.getDate(date);
		newsrecord.setCreattime(date);
		newsrecord.setCreattimestring(dateString);
		adminService.saveBlog(newsrecord);
		modelAndView.addObject("messageFree", "发布成功");
		modelAndView.setViewName("sys");
		return modelAndView;
	}
	@RequestMapping(value="/carRecord.action")
	public ModelAndView carRecord(Newsrecord newsrecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		List<ViewRecord> positionUseList=adminService.getAllRecord();
		modelAndView.addObject("positionUseList", positionUseList);
		modelAndView.setViewName("carRecord");
		return modelAndView;
	}
	@RequestMapping(value="/search.action")
	public ModelAndView search(ViewRecord viewRecord,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		ModelAndView modelAndView=new ModelAndView();
		List<ViewRecord> positionUseList=adminService.search(viewRecord);
		modelAndView.addObject("positionUseList", positionUseList);
		modelAndView.setViewName("carRecord");
		return modelAndView;
	}
	@RequestMapping(value="/deleteBlog.action")
	public String deleteBlog(int newsid,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) {
		adminService.deleteBlog(newsid);
		return "redirect:/adminIndex.action";
	}
	@RequestMapping(value="/dayRecord.action")
	public ModelAndView dayRecord(String day,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) throws ParseException {
		ModelAndView modelAndView=new ModelAndView();
		List<ViewRecord> positionUseList=adminService.getDayRecord(day);
		modelAndView.addObject("positionUseList", positionUseList);
		modelAndView.setViewName("carRecord");
		return modelAndView;
	}
	
	@RequestMapping(value="/liuliang.action")
	public ModelAndView liuliang(String starttime,String endtime,HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) throws ParseException {
		ModelAndView modelAndView=new ModelAndView();
		starttime=starttime.replace("T", " ")+":00";
		endtime=endtime.replace("T", " ")+":00";
		List<ViewRecord> positionUseList=adminService.getLiuliang(starttime, endtime);
		modelAndView.addObject("positionUseList", positionUseList);
		modelAndView.setViewName("carRecord");
		return modelAndView;
	}
	@RequestMapping(value="/searchVip.action")
	public ModelAndView searchVip(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			Model model) throws ParseException {
		ModelAndView modelAndView=new ModelAndView();
		List<Cardrecord> vipRecord=adminService.searchVip();
		modelAndView.addObject("vipRecord", vipRecord);
		modelAndView.setViewName("vipRecord");
		return modelAndView;
	}
	

}
