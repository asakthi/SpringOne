package com.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class welcome {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("application-context.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
         Student  s = (Student) factory.getBean("student1");
         s.display();  
        // System.out.println(s.display());
         
	}

}

