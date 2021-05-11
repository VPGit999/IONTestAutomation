package LearningJava;

public class StringLiteralVsObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Vasu"; //In String literal when you create an object which stores in heap memory
	    String str3="Vasu";//If there is a vraibale exist in same location then It does not create a seprate memory
		String str2=new String("Vasu");//To this object value stored in diffrent memory located and memory location will happen while using new keyword
		System.out.println(str1==str3);
	    System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

	}

}
