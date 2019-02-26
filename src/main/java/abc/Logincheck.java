package abc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Logincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Logincheck() {
     
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String uname=request.getParameter("uname");
		  String password=request.getParameter("psw");
		  System.out.println("hello java");
		  if(uname.equals("rashmi")&& password.equals("rashmi123"))
		  {
			  System.out.println("correct");
			 response.sendRedirect("success.jsp"); 
		  }
		  else {
			  System.out.println("incorrect");
			  response.sendRedirect("error.jsp");
		  }	
	}

}
