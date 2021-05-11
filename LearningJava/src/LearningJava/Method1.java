package LearningJava;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //What static method does is,that particular method belongs to the class instead of the object
	//When we do not specify the static key word to the method that method belongs to object of that particular class and we have to create an object of class before accessing that particular method 
	doLogin();
	Method1 m1=new Method1();
	m1.logout();
	System.out.println(m1.sum(1, 2));
	m1.diffparameter("QATesting", 6699, (float) 23.0);
	}

	public static void doLogin(){
		System.out.println("logged-in successfully");
		System.out.println("========================");
	}
	public void logout(){
		System.out.println("Successfully logged-out");
		System.out.println("===========================");
	}
	
	public int sum(int x, int y){
		int z=x+y;
		return z;
		
	}
	public void diffparameter(String s,int i, float f){
		System.out.println("================================");
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
	}
}
