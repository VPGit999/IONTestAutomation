package LearningJava;

import java.lang.reflect.Method;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main method is a static method
		
		MethodsDemo method=new MethodsDemo();
		method.logout();
		

	}

	public long getuserid(){
		return 123456;
	}
	
	public String doLogin(){
		return "logged-in successfully";
	}
	public  void logout(){
		System.out.println("Logout successfully");
	}
}
