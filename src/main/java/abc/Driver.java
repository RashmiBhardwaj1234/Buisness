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
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=servletDb","sa","Mharcet123@");  
			Statement stmt=con.createStatement();
			System.out.println("hello");
			ResultSet rs=stmt.executeQuery("select * from info");
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				con.close();  
				
					
		}catch(Exception e)
		{
			 e.printStackTrace();
		}
	}

	
	
}
