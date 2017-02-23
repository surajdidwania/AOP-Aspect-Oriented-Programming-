package org.suraj.javaStyle;

import javax.naming.Context;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.suraj.javaStyle.services.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ctx.registerShutdownHook();
		ShapeService shapeservice = (ShapeService) ctx.getBean("ShapeService",ShapeService.class);
		System.out.println(shapeservice.getCircle().getName());
		
	}

}
