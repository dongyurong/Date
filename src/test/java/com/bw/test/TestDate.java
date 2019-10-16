package com.bw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bw.utils.DateUtils;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		
		//定义
		String str = "2019-09-19";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		//进行日期转换
		Date parse = sdf.parse(str);
		//1.计算年龄
		System.out.println("========1.计算年龄=======");
		int age = DateUtils.getAge(str);
		System.out.println(age);
//		4.求未来日期离今天还剩的天数
		System.out.println("======4.求未来日期离今天还剩的天数=======");
		int futureDays = DateUtils.getFutureDays(str);
		System.out.println(futureDays);
		
		//判断是否是今天
		boolean today = DateUtils.isToday(str);
		System.out.println(today);
		
	}
}
