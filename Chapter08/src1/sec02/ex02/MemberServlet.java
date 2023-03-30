package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Member")
public class MemberServlet extends HttpServlet 
{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}
	


   protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
	  request.setCharacterEncoding("utf-8");
	  response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      MemberDAO DAO = new MemberDAO();
      List memberList=DAO.listMembers();
      request.setAttribute("memberList", memberList);
      RequestDispatcher dispatch = request.getRequestDispatcher("viewMembers");
      dispatch.forward(request, response);
     
      
   
      
     
   }


}