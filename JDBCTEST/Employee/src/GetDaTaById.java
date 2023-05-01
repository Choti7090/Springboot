import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetDaTaById 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			
		PreparedStatement prepareStatement = connection.prepareStatement("select * from emptable where id=?");
		prepareStatement.setInt(1, 104);
			ResultSet  resultset = prepareStatement.executeQuery();
			while(resultset.next())
			{
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
			}
			connection.close();
			System.out.println("get Id");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
