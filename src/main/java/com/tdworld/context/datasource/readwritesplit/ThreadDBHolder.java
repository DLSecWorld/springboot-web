package com.tdworld.context.datasource.readwritesplit;


public class ThreadDBHolder {
	
	private static ThreadLocal<String> dbNames = new ThreadLocal<String>();
	
	public static void set(String name) {
		dbNames.set(name);
	}
	
	public static String get() {
		 String name = dbNames.get();
		 return name;
	}
	
	public static void clear() {
		dbNames.remove();
	}

}
