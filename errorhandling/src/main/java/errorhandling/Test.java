package errorhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Test {

	public void getMsg() {
		
		try {
		FileInputStream f=new FileInputStream("Test.txt");
		}catch (Exception e) {
			// TODO: handle exception
		}
		try {
		java.sql.Connection c=DriverManager.getConnection("");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void getMsg1() {
		try {
		FileInputStream f=new FileInputStream("Test.txt");
		java.sql.Connection c=DriverManager.getConnection("");
		}catch (IOException e) {
			// TODO: handle exception
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
