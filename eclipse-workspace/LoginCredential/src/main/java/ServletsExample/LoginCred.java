package ServletsExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginCred extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		resp.sendRedirect("Login.html");
		
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		 if(username.equals("admin") && password.equals("1234")) {
	            // Forward to success.jsp on successful login
	            req.setAttribute("username", username);
	            req.getRequestDispatcher("success.jsp").forward(req, resp);
	        } else {
	            // Display error and show login form again
	            out.println("<h3 style='color:red;'>Invalid Username or Password!</h3>");
	            req.getRequestDispatcher("login.html").include(req, resp);
	        }
		
	}
}
