package daemonSolutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyConnection {
	// created an empty constructer
	MyConnection() {
	}

	// Establish a mysql connection
	public Connection startConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/daemon_solutions", "root", "");
		} catch (Exception ex) {
			System.out.println("Failed to connect to the database. \n" + ex.getMessage());
		}
		return con;
	}

	// Creating a public method to insert the test result in the database
	public void createRecord(String type, String Name, String Result) {

		try {
//            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//            Date date = new Date();
			Statement st = startConnection().createStatement();

			// Creating record in the database
			st.execute("INSERT INTO selenium_test_result (Start_time, Type, Test_Name, Test_Result) VALUES(NOW(),'"
					+ type + "','" + Name + "','" + Result + "')");
		} catch (Exception ex) {
			System.out.println("Failed to create record in the database. \n " + ex.getMessage());
		}

	}

	public void closeConnection() {

		try {
			startConnection().close();
			System.out.println("Connection closed successfully.");
		} catch (Exception ex) {
			System.out.println("Failed to close the connection. \n" + ex.getMessage());
		}
	}
}