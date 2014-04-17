package exmpl.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import exmpl.spring.data.Greeting;

public class GreetingDao {

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		
	}
	
	public Greeting findById(int i) {
		
		Greeting greeting = new Greeting();
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			PreparedStatement pstmt = connection.prepareStatement("select * from helloworld where ID=?");
			pstmt.setInt(1, i);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				greeting.setGreeting(rs.getString(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return greeting;
	}

}
