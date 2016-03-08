package testSQL;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class demo {

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Connection con = DBConnection.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO user values(null,?,?,?)");
			ps.setString(1,"Ivailo");
			ps.setString(2,"gergerer");
			ps.setInt(3, 1);
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
