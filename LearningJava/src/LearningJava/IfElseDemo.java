package LearningJava;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number1=10;
       int number2=20;
       if(number1>=number2){
    	   
         System.out.println("number1 is greaterthan eual to number2");
       }
       else if(number1==number2)
       {
    	   System.out.println("number1 and number2 are euqual");
       }
       else if(number1<=number2)
       {
    	   System.out.println("number1 is lessthan are equal to number2");
       }
       else {
    	   System.out.println("This is a final block");
       }
	}

}
