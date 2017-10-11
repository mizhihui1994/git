package com.neusoft.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 获取数据库连接
 * 连接池
 * */
public class ConnectionFactory {
	static Properties ps = new Properties();
	static{
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");
		try {
			ps.load(is);
			Class.forName(ps.getProperty("driver"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		Connection conn = null;
		conn = DriverManager.getConnection(ps.getProperty("url"), ps.getProperty("user"), ps.getProperty("password"));
		return conn;
		
	}
	
}
