package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**

* Servlet implementation class LoginServlet2

*/

@WebServlet("/Login3")

public class LoginServlet3 extends HttpServlet {

private static final long serialVersionUID = 1L;

/**

* @see Servlet#init(ServletConfig)

*/

public void init(ServletConfig config) throws ServletException {

// TODO Auto-generated method stub

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

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

System.out.println("init 메소드 호출");

request.setCharacterEncoding("utf-8");

response.setContentType("text/html; charset=utf-8");

PrintWriter out = response.getWriter();

String id = request.getParameter("user_id");

String pw = request.getParameter("user_pw");


String data ="<html>";

data +="<body>";

data += " 아이디 :"+ id;

data += "<br>";

data += " 비밀번호 :"+ pw;

data += "</body>";

data += "</html>";


out.print(data);




}

}
