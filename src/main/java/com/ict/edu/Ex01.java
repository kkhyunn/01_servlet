package com.ict.edu;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 : 자바를 가지고 웹 페이지를 표현한 기법
//			자바에서 HTML, CSS, JavaScript 등을 표현해서 웹 페이지로 만들어 표시한다.
//			main 메소드 없이 실행한다.

// URL mapping : 해당 페이지를 웹에서 접근할 수 있는 주소
//				 localhost:8090/프로젝트 이름/URL mapping 주소("Ex01")

@WebServlet("/Ex01")
public class Ex01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex01() {
        super();
        // 콘솔창에 출력된다. (웹 페이지에는 출력되지 않는다.)
        System.out.println("생성자");
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	public void destroy() {
		System.out.println("destroy");
	}
}
