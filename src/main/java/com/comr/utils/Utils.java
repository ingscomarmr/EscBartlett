package com.comr.utils;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Utils {
	public static String TimestampStr(Timestamp t){
		if(t == null)
			return "";
		
		String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(t);
		return s;
	}
	
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
	
	public static String formatFolio(double v){
		DecimalFormat format = new DecimalFormat("00000000");
		return format.format(v);
	}
	
	public static String strToHtmlCode(String str){
		return str
				.replace("ó", "&oacute;").replace("Ó", "&Oacute;")
				.replace("á", "&aacute;").replace("Á", "&Aacute;")
				.replace("é", "&eacute;").replace("É", "&Eacute;")
				.replace("í", "&icute;").replace("Í", "&Íacute;")
				.replace("ú", "&uacute;").replace("Ú", "&Uacute;")
				.replace("ñ", "&ntilde;").replace("Ñ", "&Ntilde;");
	}
}
