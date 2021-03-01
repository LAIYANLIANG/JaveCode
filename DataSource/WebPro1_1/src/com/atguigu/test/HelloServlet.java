package com.atguigu.test;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.swing.SpringLayout.Constraints;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloServlet implements Servlet {

	public HelloServlet() {
		System.out.println("1構造器方法");
	}

	/**
	 * service方法是專門用來處理請求和響應的!!!
	 */
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("3 service 方法");
//類型轉換(因為他有getMethod()方法)
		HttpServletRequest httpServletRequest = (HttpServletRequest) req;
		// 獲取請求的方式
		String method = httpServletRequest.getMethod();
		System.out.println(method);

		if ("GET".equals(method)) {
			doGet();
		} else if ("POST".equals(method)) {
			doPost();
		}
	}

	public void doGet() {
		System.out.println("get請求");

	}

	public void doPost() {
		System.out.println("post請求");

	}

	@Override
	public void destroy() {
		System.out.println("4 destroy 方法");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		//1、可獲取servlet程序的別名servlet_name的值
		//2、獲初始化參數init-param
		//3、獲取servletContext對像
		//1、
		System.out.println("helloServlet程序名是："+config.getServletName());
		//2、
		System.out.println("helloServlet的初始化參數username值是："+config.getInitParameter("username"));
		System.out.println("helloServlet的初始化參數url值是："+config.getInitParameter("url"));
		
		System.out.println("2 init 初始化方法");

	}

}
