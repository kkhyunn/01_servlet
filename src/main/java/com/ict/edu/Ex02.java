package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class Ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서블릿 : java 코드와 HTML, CSS, JavaScript를 섞어서 사용
		// JSP : HTML, CSS, JavaScript에 자바코드를 섞어서 사용
		
		// 응답을 위한 한글처리
		// ContentType => 해당 문서 타입을 말한다.
		response.setContentType("text/html; charset=utf8");
		// 화면(브라우저)에 출력하기 위한 설정
		PrintWriter out = response.getWriter();
	}
}
