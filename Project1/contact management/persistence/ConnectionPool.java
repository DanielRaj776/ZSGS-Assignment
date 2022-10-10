package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
//    static {
//	loadDriver();
//    }
//    private static void loadDriver () {
//	try {
//	    Class.forName("com.mysql.cj.jdbc.Driver");
//	} catch (ClassNotFoundException e) {
//	    e.printStackTrace();
//	}	
//    } 
    public Connection getConnection () {
	String connectionURL = "jdbc:mysql://localhost:3306/contact_db";
	Connection connection = null;
	try {
	    connection = DriverManager.getConnection(connectionURL, "root", "LetItGo");
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return connection;
    }
    
}
