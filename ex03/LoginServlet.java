package sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {
	   private static final long serialVersionUID = 1L;
	   
	   public void init(ServletConfig config) throws ServletException {
	      System.out.print("init 메서드 호출");
	   }

	   public void destroy() {
	      // TODO Auto-generated method stub
	      System.out.print("destroy 메서드 호출");
	   }

	   
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      // TODO Auto-generated method stub
	     /* request.setCharacterEncoding("utf-8");*/
	     //  response.setContentType("text/html;charset=utf-8");
	       PrintWriter out = response.getWriter();
	       
	       String user_name = request.getParameter("user_name");
	       String user_pw = request.getParameter("user_pw");

	       String data="안녕하세요!<br> " +user_name+"님 환영합니다 <br><br>";
	       data+="<html><body>";
	       data+="아이디 : " +user_name;
	       data+="<br>";
	       data+="패스워드 : " +user_pw;

	       data+="<br>";
	       data+="</body></html>";
	       out.print(data);
	   }

	}