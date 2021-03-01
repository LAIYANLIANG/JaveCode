package com.atguigu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc2 {
	private Connection conn;

	public static void main(String[] args) throws Exception {
		jdbc2 s1 = new jdbc2();
		s1.createconn();

	}

	public void createconn() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String urlstr = "jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=p@ssw0rd;";
		conn = DriverManager.getConnection(urlstr);
		boolean status = !conn.isClosed();
		System.out.println("Connection Open status 開啟狀態:" + status);
	}

}
