package com.comr.utils;


public class Utils {
	
	public static boolean isNullOrEmpty(String str){
		try{
			if(str != null){
				str = str.trim();
				if(str != ""){
					return false;
				}
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
			throw e;
		}
		return true;
	}
	
	public static String strLikeSql(String v){
		if(isNullOrEmpty(v)){
			return "";
		}
		else
			return "%" + v + "%";
	}
}
