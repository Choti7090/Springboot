import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployyeEx 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("update  emptable set name=? where id=?");
			prepareStatement.setString(1, "Bhuvi");
			prepareStatement.setInt(2, 106);
			prepareStatement.execute();
			connection.close();
			System.out.println("data updated");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
