package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet  {

	//서블릿 객체 생성시 = 최초요청시
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServlet의 init() 호출");
	}
	
	//클라이언트로부터 요청시, 서비스내용 구현
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("FirstServlet의 service() 호출");
		}
	
	//서블릿 객체 삭제시 = 서버 중지시.. 자원 해제 정도 
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
