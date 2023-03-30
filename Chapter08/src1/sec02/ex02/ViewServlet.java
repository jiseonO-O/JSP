package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/viewMembers")
public class ViewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		List memberList = (List) request.getAttribute("memberList");
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen' > ");
		out.print("<td>아이디</td> <td>비밀번호</td> <td>이름</td> <td>이메일</td> <td>가입일</td> <td>삭제</td>");
		
		for (int i = 0; i<memberList.size(); i++) {
			MemberVO membervo = (MemberVO)memberList.get(i);
			String id = membervo.getId();
			String pwd = membervo.getPwd();
			String name = membervo.getName();
			String email = membervo.getEmail();
			Date joinDate = membervo.getJoinDate();
			out.print("<tr><td>"+id+"</td><td>"+pwd+"</td><td>"+name+"</td><td>"+email+"</td><td>"+joinDate+"</td><td>"+"<a href='/chapter08/Member?command=delMemver&id="+id+"'>삭제</a></td></tr>");
			
		}
		out.print("</body></html>");
		out.print("<a href='/Chapter8/memberform.html'>새 회원 등록하기</a");
	}
       
    
}
