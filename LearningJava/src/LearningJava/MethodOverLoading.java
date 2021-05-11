package LearningJava;

public class MethodOverLoading {
	
	public static int add(int a, int b){
		int c=a+b;
		return c;
	}
	
	public static int add(int a,int b, int c){
		int d=a+b+c;
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mv=new MethodOverLoading();
		System.out.println(mv.add(1, 2));
		System.out.println(mv.add(1, 2, 3));
		

	}

}