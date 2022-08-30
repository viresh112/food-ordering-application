package com.dao;

public class Id {

	public static String getid(){
		int rno=(int)(Math.random()*9000)+1000;
		String idno = String.valueOf(rno);		
		return idno;
	}
	public static void main(String arg[]) {
		String idn=getid();
		System.out.println(idn);
	}
}
