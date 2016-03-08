package testSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {
	private static final String DB_PASSWORD = "";
	private static final String DB_USER = "localhost";
	private static final String DATABASE = "test";
	private static final String DB_HOST = "localhost";

	private static DBConnection connectionInstance = null;
	private static Connection connection = null;

	private DBConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://" + DB_HOST + "/" + DATABASE, DB_USER,
					DB_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static DBConnection getInstance() throws SQLException {
		synchronized (DBConnection.class) {
			if (connectionInstance == null) {
				connectionInstance = new DBConnection();
			}
		}
		return connectionInstance;
	}

	public static Connection getConnection() {
		return connection;
	}

}
