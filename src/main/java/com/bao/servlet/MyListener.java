package com.bao.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("===========================MyServletContextListener销毁");
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("===========================MyServletContextListener初始化");
        System.out.println(arg0.getServletContext().getServerInfo());
		
	}
	
}
