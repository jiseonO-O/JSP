package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 메서드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    String user_id = request.getParameter("user_id");
	    String user_pw = request.getParameter("user_pw");
        String user_address = request.getParameter("user_address");
        
        out.println("<html><body>");
        if(user_id != null && user_id.length()!=0) {
        	out.println("이미 로그인 상태입니다!<br><br>");
        	out.println("첫번째 서블릿에서 넘겨준 아이디 : " + user_id+"<br>");
        	out.println("첫번째 서블릿에서 넘겨준 비밀번호 : " + user_pw+"<br>");
        	out.println("첫번째 서블릿에서 넘겨준 주소 : " + user_address+"<br>");
        	out.println("</body></html>");
        }
	}

}
