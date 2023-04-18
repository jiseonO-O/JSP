package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/first/*")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    String context = request.getContextPath();
	    String url = request.getRequestURL().toString();
	    String mapping = request.getServletPath();
	    String uri = request.getRequestURI();
	    
	    
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Test Servlet1</title>");
	    out.println("</head>");
	    out.println("<body bgcolor = 'yellow'>");
	    out.println("<b>TextServlet2입니다. </b><br>");
	    out.println("<b>컨텍스트 이름: " +url+"<b><br>");
	    out.println("<b>전체경로 :" + url +"<b><br>");
	    out.println("<b>매핑이름 :" + url +"<b><br>");
	    out.println("<b>URI" + uri +"<b>");
	    out.println("</body>");
	    out.close();
	}

}
