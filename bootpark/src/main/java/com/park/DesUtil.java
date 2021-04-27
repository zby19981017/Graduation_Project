package com.park;

import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.print.attribute.standard.MediaName;

public class DesUtil {
	public static void main(String[] args) {
		System.out.println(encrypt("15663585487"));
	}
	
	public static String encrypt(String message) {
		//设置密码
		String password="12345678";
		//构造随机数种子
		SecureRandom random = new SecureRandom();
		try {
			DESKeySpec keySpec=new DESKeySpec(password.getBytes());
			//生成秘钥工厂
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			//生成秘钥
			SecretKey key = factory.generateSecret(keySpec);
			//加密对象初始化
			Cipher cipher=Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, key, random);
			//返回base64格式的密文
			String result = Base64.getEncoder().encodeToString(cipher.doFinal(message.getBytes()));
			return result;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static String decrypt(String result) {
		String password="12345678";
		SecureRandom random = new SecureRandom();
		try {
			DESKeySpec keySpec=new DESKeySpec(password.getBytes());
			SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
			SecretKey key = factory.generateSecret(keySpec);
			
			Cipher cipher=Cipher.getInstance("DES");
			cipher.init(Cipher.DECRYPT_MODE, key, random);
			String message=new String(cipher.doFinal(Base64.getDecoder().decode(result)));
			return message;
		} catch (Exception e) {
			return null;
		}
	}

}
