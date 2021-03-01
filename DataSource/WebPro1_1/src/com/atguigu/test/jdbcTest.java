package com.atguigu.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcTest {

	public static Connection main(String[] args) {
		String dataBaseName = "MyDB";
		Connection con = null;
		String DbDriver = "com.microsoft.jdbc.sqlserver.SQLServerDrive";
		String URL ="jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=p@ssw0rd;";
	    //String url="jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=p@ssw0rd;";
		try {
			Class.forName(DbDriver);
			con = DriverManager.getConnection(URL);
			if (con != null) {
				System.out.println("連線成功");
			} else {
				System.out.println("連線失敗");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
