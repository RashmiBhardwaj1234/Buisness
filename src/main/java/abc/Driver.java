package abc;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Driver extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Driver() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection myConn=DriverManager.getConnection("jdbc.mysql://localhost/sampledb","root","admin");
			Statement stmt=myConn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from info");		
					
		}catch(Exception e)
		{
			
		}
	}

	
	
}
