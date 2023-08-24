import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class studdao_1 {

	
	void insertDetails(studbean st) throws ClassNotFoundException ,SQLException 
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ project_3", "root", "root");
	
	String query="insert into student value(?,?,?,?,?)";
	
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, st.getName());
	ps.setInt(2, st.getContact());
	ps.setString(3, st.getDob());
	ps.setString(4, st.getCity());
	ps.setString(5, st.getEmail());
	
	
	
	ps.execute();
	con.close();
}
}
