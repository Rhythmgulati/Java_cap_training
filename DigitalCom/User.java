package DigitalCom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User implements IValidate {
	private String userId;
	private String password;
	
	
	static Map<String,String> uMap = new HashMap<>();
	
	public User() {
		// TODO Auto-generated constructor stub
		this.userId="";
		this.password="";	
	}
	
	public User(String userid,String password) {
		// TODO Auto-generated constructor stub
		this.userId=userid;
		this.password=password;
				
	}
	
	public void addUser(String userId , String password) {
		
		this.userId=userId;
		this.password=password;
		uMap.put(userId, password);
	}
	
	
	public void getAllUser() {
		for (Map.Entry<String, String> entry : uMap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key + val);
		}
	}
	
	
	@Override
	public boolean IsAuthenticated(String userId, String password) {
		
		 if(uMap.containsKey(userId)) {
	            String storedPwd = uMap.get(userId);
	            return storedPwd.equals(password);
	        }
	      return false;
	}
	
	
	
}
