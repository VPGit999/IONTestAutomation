package com.PackagesExamples;

public class AccessModifiers {
	public int publicvariable=1;
	int defaultvariable=2;
	private int privatevariable=3;
	protected int protectedvariable=4;
	//public is an access specifiers and public variables or methods which can access in same class and otherclass
	//private is also an access specifier which can be used only inside of the class
	//protected method or variable can be used only inside of the package class
	//defeault method ''
public static void main(String[] args) {
	// TODO Auto-generated method stub
		AccessModifiers am=new AccessModifiers();
		am.defaultMethod();
} 
	


public void publicMethod(){
	System.out.println("This is a public method");
}
void defaultMethod(){
	System.out.println("This a default method");
}
private void privateMethod(){
	System.out.println("private method");
}
protected void protectedMthod(){
	System.out.println("protected method");
}


}
