package com.xworkz.crop;

import java.util.Arrays;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
	ApplicationContext container=new ClassPathXmlApplicationContext("fw/springhibernate.xml");
	 SessionFactory factory=container.getBean(SessionFactory.class);
	 System.out.println(factory);
	 System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
	 CropEntity cropEntity=new CropEntity("banana", CropType.KHARIF, 35, CropSeason.RAINY, true, 5);
	 CropDAO cropDAOimpl=container.getBean(CropDAO.class);
	 cropDAOimpl.saveCrop(cropEntity);

	}

}
