import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employeeedelete 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			PreparedStatement prepareStatement = connection.prepareStatement("delete from emptable where id=?");
			prepareStatement.setInt(1, 106);
			prepareStatement.execute();
			connection.close();
			System.out.println("data deleted");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
