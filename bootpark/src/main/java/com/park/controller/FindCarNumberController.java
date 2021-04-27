package com.park.controller;

import com.park.service.impl.FindCarNumberImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.security.PermitAll;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * <p>
 * description
 * </p>
 *
 * @author BOYU.ZHANG@hand-china.com 2021/4/27 11:04
 */
@CrossOrigin(origins="*",maxAge=3600)
@RestController
public class FindCarNumberController {
	@Autowired
	FindCarNumberImpl findCarNumber = new FindCarNumberImpl();
	@RequestMapping("/carNumber")
	public String hello(@RequestBody String str) {
		System.out.println(str);
		str=findCarNumber.findNumber(str);
		System.out.println(str);
		return "\""+str+"\"";
	}

}
