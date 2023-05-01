import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveEmployee 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			
		PreparedStatement prepareStatement = connection.prepareStatement("insert into emptable values(?,?)");
		prepareStatement.setInt(1, 106);
		prepareStatement.setString(2, "Bhuvi");
			prepareStatement.execute();
			connection.close();
			System.out.println("data saved");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
