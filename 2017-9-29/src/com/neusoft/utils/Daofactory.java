package com.neusoft.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * π§æﬂ¿‡
 * */
public class Daofactory {

private Daofactory(){};
	
	private static Properties ps =new Properties();
	static{
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("dao.properties");
		try {
			ps.load(is);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	@SuppressWarnings("unchecked")
	public static <T> T getInstance(String daoName,Class<T> cls){
		T t= null;
		
		if(null == daoName||"".equals(daoName)){
			return t;
		}
		String className = ps.getProperty(daoName);
		if(className==null||"".equals(daoName)){
			return t;
		}
		try {
			Class<?> clazz = Class.forName(className);
			t=(T) clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return t;
	}
	
}
