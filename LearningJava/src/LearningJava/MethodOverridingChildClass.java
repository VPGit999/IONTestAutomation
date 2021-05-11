package LearningJava;

public class MethodOverridingChildClass  extends MethodOverriding {
	
	public void login(){
		System.out.println("I did lognin with my mobile number password");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingChildClass mvc=new MethodOverridingChildClass();
		mvc.login();

	}

}
