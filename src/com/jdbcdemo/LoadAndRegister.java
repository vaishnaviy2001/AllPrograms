package com.jdbcdemo;

public class LoadAndRegister {
	
	public static void main(String[] args) throws ClassNotFoundException{
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   System.out.println("Driver registered suceessfully.");
	}

}
