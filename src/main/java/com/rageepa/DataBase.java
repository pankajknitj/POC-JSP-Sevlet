package com.rageepa;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	static private Map<String,User> map = new HashMap<>();
	public static Map<String,User> getUsers(){
		return map;
	}
	
	public static boolean addUser(User user) {
		map.put(user.getUserName(), user);
		return true;
	}
}
