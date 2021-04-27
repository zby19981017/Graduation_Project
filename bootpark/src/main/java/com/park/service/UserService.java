package com.park.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.park.DateUtil;
import com.park.DesUtil;
import com.park.mapper.CardrecordMapper;
import com.park.mapper.CarrecordMapper;
import com.park.mapper.CountrecordMapper;
import com.park.mapper.PositionrecordMapper;
import com.park.mapper.SysrecordMapper;
import com.park.mapper.ViewRecordMapper;
import com.park.pojo.Cardrecord;
import com.park.pojo.CardrecordExample;
import com.park.pojo.Carrecord;
import com.park.pojo.CarrecordExample;
import com.park.pojo.Countrecord;
import com.park.pojo.Positionrecord;
import com.park.pojo.PositionrecordExample;
import com.park.pojo.Sysrecord;

@Service
public class UserService {
	@Autowired
	private ViewRecordMapper viewRecordMapper;
	@Autowired
	private CarrecordMapper carrecordMapper;
	@Autowired
	private PositionrecordMapper positionrecordMapper;
	@Autowired
	private CardrecordMapper cardrecordMapper;
	@Autowired
	private SysrecordMapper sysrecordMapper;
	@Autowired
	private CountrecordMapper countrecordMapper;
//	public List<Positionrecord> getFreePosition(){
//		List<Positionrecord> list=positionrecordMapper.selectByExample(null);
//		return list;
//	}
	public int hasCard(Carrecord carrecord) {
		CardrecordExample example=new CardrecordExample();
		example.createCriteria().andCarnumberEqualTo(carrecord.getCarnumber());
		int hasCard=cardrecordMapper.countByExample(example);
		return hasCard;
	}
	
	public int vipset(Cardrecord cardrecord) {
		Date starttime=new Date();
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(starttime);
		calendar.add(Calendar.YEAR, 1);
		Date endtime=calendar.getTime();
		cardrecord.setUsername(DesUtil.encrypt(cardrecord.getUsername()));
		cardrecord.setPhone(DesUtil.encrypt(cardrecord.getPhone()));
		cardrecord.setStarttime(starttime);
		cardrecord.setEndtime(endtime);
		cardrecord.setStarttimestring(DateUtil.getDate(starttime));
		cardrecord.setEndtimestring(DateUtil.getDate(endtime));
		cardrecord.setLevel(1);
		cardrecord.setLveldes("年卡车辆");
		
		
		CardrecordExample example=new CardrecordExample();
		example.createCriteria().andCarnumberEqualTo(cardrecord.getCarnumber());
		int hasCard=cardrecordMapper.countByExample(example);
		Sysrecord sysrecord=sysrecordMapper.selectByExample(null).get(0);
		int countpay=sysrecord.getVipprice();
		Countrecord count=new Countrecord();
		count.setCountcarnumber(cardrecord.getCarnumber());
		count.setCountlevel("年卡车辆");
		count.setCountpay(countpay);
		count.setCountyearmonth(DateUtil.getDate(starttime).substring(0, 7));
		
		if(hasCard==0) {
			cardrecordMapper.insertSelective(cardrecord);
			
		}else {
//			CardrecordExample example=new CardrecordExample();
//			example.createCriteria().andCarnumberEqualTo(cardrecord.getCarnumber());
			cardrecordMapper.updateByExampleSelective(cardrecord, example);
		}
		
		countrecordMapper.insertSelective(count);
		
		return 1;
	}
	
	public int updateCard(Cardrecord cardrecord) {
		return cardrecordMapper.updateByPrimaryKeySelective(cardrecord);
	}
	public int parkCar(Carrecord carrecord) {
		CardrecordExample cardexample=new CardrecordExample();
		cardexample.createCriteria().andCarnumberEqualTo(carrecord.getCarnumber());
		int hasCard=cardrecordMapper.countByExample(cardexample);
		if(hasCard==0) {
			Cardrecord cardrecord=new Cardrecord();
			cardrecord.setCarnumber(carrecord.getCarnumber());
			cardrecord.setLevel(0);
			cardrecord.setLveldes("普通车辆");
			cardrecordMapper.insertSelective(cardrecord);
		}
		
		
		Positionrecord positionrecord=new Positionrecord();
		positionrecord.setPositionname(carrecord.getPosition());
		positionrecord.setPositionstate(1);
		positionrecord.setPositionstatedes("占用");
		PositionrecordExample example=new PositionrecordExample();
		example.createCriteria().andPositionnameEqualTo(carrecord.getPosition());
		positionrecordMapper.updateByExampleSelective(positionrecord, example);
		int result=carrecordMapper.insertSelective(carrecord);
		return result;
		
	}
	public int hasCar(Carrecord carrecord,int carState) {
		CarrecordExample example=new CarrecordExample();
		example.createCriteria().andCarnumberEqualTo(carrecord.getCarnumber()).andCarstateEqualTo(carState);
		int hasCar=carrecordMapper.countByExample(example);
		return hasCar;
		
	}
	public Carrecord getCar(Carrecord carrecord) {
		CarrecordExample example=new CarrecordExample();
		example.createCriteria().andCarnumberEqualTo(carrecord.getCarnumber()).andCarstateEqualTo(1);
		List<Carrecord> list= carrecordMapper.selectByExample(example);
		Carrecord car=list.get(0);
		return car;
		
	}
	
	public Cardrecord getCard(Carrecord carrecord) {
		CardrecordExample example=new CardrecordExample();
		example.createCriteria().andCarnumberEqualTo(carrecord.getCarnumber());
		List<Cardrecord> list= cardrecordMapper.selectByExample(example);
		Cardrecord card=list.get(0);
		return card;
		
	}
	
	public Sysrecord getSys() {
		Sysrecord sysrecord=sysrecordMapper.selectByPrimaryKey(10001);
		return sysrecord;
	}
	public int pay(int carid,int price,int type) {
		
		CarrecordExample carrecordExample=new CarrecordExample();
		carrecordExample.createCriteria().andRidEqualTo(carid).andCarstateEqualTo(1);
		Carrecord carrecord=new Carrecord();
		carrecord.setParkprice(price);
		carrecord.setOuttime(new Date());
		carrecord.setOuttimestring(DateUtil.getDate(new Date()));
		carrecord.setCarstate(0);
		carrecord.setCarstatedes("已结束");
		carrecordMapper.updateByExampleSelective(carrecord, carrecordExample);
		if(type==0) {
			Countrecord countrecord =new Countrecord();
			countrecord.setCountcarnumber(carrecordMapper.selectByPrimaryKey(carid).getCarnumber());
			countrecord.setCountlevel("普通车辆");
			countrecord.setCountpay(price);
			countrecord.setCountyearmonth(DateUtil.getDate(new Date()).substring(0, 7));
			countrecordMapper.insertSelective(countrecord);
		}
		
		Carrecord car=carrecordMapper.selectByPrimaryKey(carid);
		String positionname=car.getPosition();
		PositionrecordExample positionrecordExample=new PositionrecordExample();
		positionrecordExample.createCriteria().andPositionnameEqualTo(positionname);
		Positionrecord positionrecord=new Positionrecord();
		positionrecord.setPositionname(positionname);
		positionrecord.setPositionstate(0);
		positionrecord.setPositionstatedes("可用");
		positionrecordMapper.updateByExampleSelective(positionrecord, positionrecordExample);
		return 1;
		
	}

}
