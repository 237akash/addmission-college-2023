

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class studcontrol
 */
@WebServlet("/studcontrol")
public class studcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studcontrol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
	   int contact=Integer.parseInt(request.getParameter("contact"));
		String dob=request.getParameter("dob");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		
		
		
		out.println(name);
		out.println(contact);
		out.println(dob);
		out.println(city);
		out.println(email);
		
		out.println("successfully submit");
		
		 response.setHeader("Cache-Control", "no-cache, no-store");
		    response.setHeader("Pragma", "no-cache");

		    request.getSession().invalidate();
		     RequestDispatcher rd = request.getRequestDispatcher("thank.html");
		        rd.forward(request, response);
		
		studbean std=new studbean();
		std.setName(name);
		std.setContact(contact);
		std.setDob(dob);
		std.setCity(city);
		std.setEmail(email);
		
		
		studdao_1 sdao=new studdao_1();
		
		try {
			sdao.insertDetails(std);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
	}

}
