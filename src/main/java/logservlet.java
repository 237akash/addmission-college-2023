

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class logservlet
 */
@WebServlet("/logservlet")
public class logservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
			try {
				PrintWriter out=response.getWriter();
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Akash","root","root");
				String n=request.getParameter("uname");
				String m=request.getParameter("password");
                
				PreparedStatement ps=conn.prepareStatement("select username from login where username=? and  password=?");
				ps.setString(1, n);
				ps.setString(2, m);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
					rd.forward(request, response);
				}
				else
				{
					out.println("<font color+red size=18>login Failed !!<br>");
					out.println("<a href=th.jsp> TRY AGAIN !!</a>");
				}
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}
		
		
	}

}
