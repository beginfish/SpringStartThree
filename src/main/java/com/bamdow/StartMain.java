package com.bamdow;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bamdow.service.Student;

@SuppressWarnings("unused")
public class StartMain {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new  FileSystemXmlApplicationContext();
		context.setConfigLocation("file:src/main/resources/applicationContext.xml");
		//开启包扫描
		context.afterPropertiesSet();
		Student stu = context.getBean(Student.class);
		stu.setAge(13);
		stu.setName("bamdow");
		System.out.println(stu);
	}
}
