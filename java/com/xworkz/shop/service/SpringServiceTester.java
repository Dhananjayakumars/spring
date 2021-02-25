package com.xworkz.shop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.shop.entity.ShopEntity;

public class SpringServiceTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("fw/springhibernate.xml");
		ShopService shopService=container.getBean(ShopService.class);
		shopService.validation(new ShopEntity("riceshop", "bengaluru", "dhananjaya", true));
	}

}
