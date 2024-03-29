package sec04.ex01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet5
 */
public class LoginServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메소드 호출");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메소드 호출");
		doHandle(request,response);
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메소드 호출");
		doHandle(request,response);
	}
	
	
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doHandle 메소드 호출");

		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();

		String id = request.getParameter("user_id");

		String pw = request.getParameter("user_pw");
		
		String user_addr = request.getParameter("user_address");


		String data ="<html>";

		data +="<body>";

		data += " 아이디 :"+ id;

		data += "<br>";

		data += " 비밀번호 :"+ pw;
		
		data += "<br>";

		data += " 주소 :"+ user_addr;

		data += "</body>";

		data += "</html>";


		out.print(data);
	}

}
