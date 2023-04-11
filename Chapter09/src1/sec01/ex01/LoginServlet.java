package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")

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
	      request.setCharacterEncoding("utf-8");
	       response.setContentType("text/html;charset=utf-8");
	       PrintWriter out = response.getWriter();
	       String user_id = request.getParameter("user_id");
	       String user_pw = request.getParameter("user_pw");
	       String user_address = request.getParameter("user_address");
	       String user_email = request.getParameter("user_email");
	       String user_hp = request.getParameter("user_hp");
	       
	       String data="안녕하세요!<br> 로그인하셨습니다.<br><br>";
	       data+="<html><body>";
	       data+="아이디 : " +user_id;
	       data+="<br>";
	       data+="패스워드 : " +user_pw;
	       data+="<br>";
	       data+="주소 : " +user_address;
	       data+="<br>";
	       data+="이메일 : " +user_email;
	       data+="<br>";
	       data+="휴대전화 : " +user_hp;
	       data+="<br>";
	       data+="</body></html>";
	       out.print(data);
	   }

	}