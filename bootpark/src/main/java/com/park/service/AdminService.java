package com.park.service;

import java.text.ParseException;
import java.util.List;

import javax.smartcardio.Card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.park.DateUtil;
import com.park.DesUtil;
import com.park.mapper.CardrecordMapper;
import com.park.mapper.CountrecordMapper;
import com.park.mapper.NewsrecordMapper;
import com.park.mapper.PositionrecordMapper;
import com.park.mapper.SysrecordMapper;
import com.park.mapper.UserrecordMapper;
import com.park.mapper.ViewRecordMapper;
import com.park.pojo.Cardrecord;
import com.park.pojo.CardrecordExample;
import com.park.pojo.Countrecord;
import com.park.pojo.CountrecordExample;
import com.park.pojo.Liuliang;
import com.park.pojo.Newsrecord;
import com.park.pojo.Positionrecord;
import com.park.pojo.PositionrecordExample;
import com.park.pojo.Sysrecord;
import com.park.pojo.Userrecord;
import com.park.pojo.UserrecordExample;
import com.park.pojo.ViewRecord;
import com.park.pojo.ViewRecordExample;

@Service
public class AdminService {
	@Autowired
	private UserrecordMapper userrecordMapper;
	@Autowired
	private PositionrecordMapper positionrecordMapper;
	@Autowired
	private ViewRecordMapper viewRecordMapper;
	@Autowired
	private SysrecordMapper sysrecordMapper;
	@Autowired
	private CardrecordMapper cardrecordMapper;
	@Autowired
	private NewsrecordMapper newsrecordMapper;
	@Autowired
	private CountrecordMapper countrecordMapper;

	public int loginCheck(Userrecord userrecord) {
		UserrecordExample userrecordExample = new UserrecordExample();
		userrecordExample.createCriteria().andUsernameEqualTo(userrecord.getUsername())
				.andPasswordEqualTo(userrecord.getPassword());
		List<Userrecord> list = userrecordMapper.selectByExample(userrecordExample);
		if (list.size() > 0) {
			Userrecord user = list.get(0);
			return user.getUserid();
		} else {
			return 0;
		}

	}

	// 保存公告
	public int saveBlog(Newsrecord newsrecord) {
		newsrecordMapper.insertSelective(newsrecord);
		return 1;
	}

	// 查询公告
	public List<Newsrecord> getBlog() {
		List<Newsrecord> list = newsrecordMapper.selectByExample(null);
		return list;
	}

	// 删除公告
	public int deleteBlog(int id) {
		newsrecordMapper.deleteByPrimaryKey(id);
		return 1;
	}

	public int saveRegister(Userrecord userrecord) {
		int result = userrecordMapper.insertSelective(userrecord);
		return result;

	}

	public int saveSys(Sysrecord sysrecord) {
		sysrecord.setSysid(10001);
		int result = sysrecordMapper.updateByPrimaryKeySelective(sysrecord);
		return result;

	}

	public Sysrecord getBasicSys() {
		Sysrecord sysrecord = sysrecordMapper.selectByPrimaryKey(10001);
		return sysrecord;

	}

	public int insertFree(Cardrecord card) {
		CardrecordExample cardexample = new CardrecordExample();
		cardexample.createCriteria().andCarnumberEqualTo(card.getCarnumber());
		int hasCard = cardrecordMapper.countByExample(cardexample);
		int result = 0;
		if (hasCard == 0) {
			Cardrecord cardrecord = new Cardrecord();
			cardrecord.setCarnumber(card.getCarnumber());
			cardrecord.setLevel(2);
			cardrecord.setLveldes("免费车辆");
			result = cardrecordMapper.insertSelective(cardrecord);
		} else {
			card.setLevel(2);
			card.setLveldes("免费车辆");
			result = cardrecordMapper.updateByExampleSelective(card, cardexample);
		}

		return result;
	}

	public int insertPosition(Positionrecord positionrecord) {
		int result = positionrecordMapper.insertSelective(positionrecord);
		return result;
	}

	public List<Positionrecord> getAllPosition() {
		List<Positionrecord> list = positionrecordMapper.selectByExample(null);
		return list;
	}

	public List<Positionrecord> getFreePosition() {
		PositionrecordExample positionrecordExample = new PositionrecordExample();
		positionrecordExample.createCriteria().andPositionstateEqualTo(0);
		List<Positionrecord> list = positionrecordMapper.selectByExample(positionrecordExample);
		return list;
	}

	public int getFreePositionCount() {
		PositionrecordExample positionrecordExample = new PositionrecordExample();
		positionrecordExample.createCriteria().andPositionstateEqualTo(0);
		int count = positionrecordMapper.countByExample(positionrecordExample);
		return count;
	}
	public int getUsingPositionCount() {
		PositionrecordExample positionrecordExample = new PositionrecordExample();
		positionrecordExample.createCriteria().andPositionstateEqualTo(1);
		int count = positionrecordMapper.countByExample(positionrecordExample);
		return count;
	}

	public List<ViewRecord> getAllPositionUsing() {
		ViewRecordExample viewRecordExample = new ViewRecordExample();
		viewRecordExample.createCriteria().andCarstateEqualTo(1);
		List<ViewRecord> list = viewRecordMapper.selectByExample(viewRecordExample);
		return list;
	}
	
	public List<ViewRecord> getAllRecord() {
		ViewRecordExample viewRecordExample = new ViewRecordExample();
		viewRecordExample.createCriteria();
		viewRecordExample.setOrderByClause("rid desc");
		List<ViewRecord> list = viewRecordMapper.selectByExample(viewRecordExample);
		return list;
	}
	
	public List<ViewRecord> search(ViewRecord viewRecord) {
		ViewRecordExample viewRecordExample = new ViewRecordExample();
		viewRecordExample.createCriteria().andCarnumberEqualTo(viewRecord.getCarnumber());
		viewRecordExample.setOrderByClause("rid desc");
		List<ViewRecord> list = viewRecordMapper.selectByExample(viewRecordExample);
		return list;
	}
	
	public List<Cardrecord> searchVip() {
		CardrecordExample cardexample = new CardrecordExample();
		cardexample.createCriteria().andUsernameIsNotNull();
		cardexample.setOrderByClause("cid desc");
		List<Cardrecord> list = cardrecordMapper.selectByExample(cardexample);
		for(int i=0;i<list.size();i++) {
			list.get(i).setUsername(DesUtil.decrypt(list.get(i).getUsername()));
			list.get(i).setPhone(DesUtil.decrypt(list.get(i).getPhone()));
		}
		return list;
	}
	public List<Countrecord> getCount() {
		CountrecordExample countRecordExample = new CountrecordExample();
		List<Countrecord> list = countrecordMapper.selectByExample(null);
		return list;
	}
	public int getCardCount() {
		CardrecordExample example=new CardrecordExample();
		example.createCriteria().andLevelEqualTo(1);
		return cardrecordMapper.countByExample(example);
	}
	
	public List<ViewRecord> getDayRecord(String day) throws ParseException{
		ViewRecordExample viewRecordExample = new ViewRecordExample();
		String starttime=day+" 00:00:00";
		String endtime=day+" 23:59:59";
		viewRecordExample.createCriteria().andIntimeBetween(DateUtil.toDate(starttime), DateUtil.toDate(endtime));
		List<ViewRecord> list = viewRecordMapper.selectByExample(viewRecordExample);
		return list;
	}
	public List<ViewRecord> getLiuliang(String starttime,String endtime) throws ParseException {
		ViewRecordExample viewRecordExample = new ViewRecordExample();
		viewRecordExample.createCriteria().andIntimeBetween(DateUtil.toDate(starttime), DateUtil.toDate(endtime));
		List<ViewRecord> list = viewRecordMapper.selectByExample(viewRecordExample);
		return list;
	}

}
