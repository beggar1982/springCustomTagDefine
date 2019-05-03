package com.xxz.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxz.demo.bean.User;

public class MainBootStrap {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
		User bean = (User) ctx.getBean("testBean");
		System.out.println(bean.getName()+","+bean.getAddress());
		
	}

}
