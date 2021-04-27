package com.park.service.impl;

import com.park.service.findCarNumber;
import org.springframework.stereotype.Service;

/**
 * <p>
 * description
 * </p>
 *
 * @author BOYU.ZHANG@hand-china.com 2021/4/27 16:18
 */
@Service
public class FindCarNumberImpl implements findCarNumber {

	@Override
	public String findNumber(String path) {
		path=path.substring(15,path.length()-1);
		path="C:\\Users\\Ric\\Desktop\\"+path;
		String str=LicensePlate.licensePlate(path);
		str=str.substring(27,34);
		return str;
	}
}
