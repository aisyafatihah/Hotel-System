package Hotel;
import java.sql.*;

public class DatabaseConnection {

	private String databaseName = "hoteloop";
	private String username = "root";
	
	private String connectionPath = "jdbc:mysql://localhost/" + databaseName + "?" + "user=" + username;
			
	
	/**
	 * This method establish connection to RDBMS
	 * @return connection object
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection getConnection()throws ClassNotFoundException, SQLException { 
		// Load database driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connection=DriverManager.getConnection("jdbc:mysql://localhost/hoteloop","root","" );
		
		// Get connection object from the database
		Connection connection = DriverManager.getConnection(connectionPath);
		
	return connection;
		
	}
}
	
	
