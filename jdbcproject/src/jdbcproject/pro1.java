package jdbcproject;

import java.sql.*;

public class pro1 {

	public static void main(String[] args) {
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdeveloper","root","Zainab@123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from customers");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
		}
		}
		catch(Exception e)
		{
		System.out.println(e.toString());
		}


	}

}
