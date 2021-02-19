package com.xworkz.crop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringServiceTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("fw/springhibernate.xml");
		CropService service=container.getBean(CropService.class);
		service.validation(new CropEntity("banana", CropType.RABI, 25, CropSeason.RAINY, true, 1));

	}

}
