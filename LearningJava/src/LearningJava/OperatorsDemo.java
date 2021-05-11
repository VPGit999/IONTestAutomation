package LearningJava;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mynumber=10;
		String str="strng demo";
		
		int number1=10;
		int number2=20;
	    //number1++;
		//number1--;
		
		boolean bool= !true;
		if(number1<=number2){
			System.out.println("numbers are equal");
		}else{
			System.out.println("numbers are not equal");
		}
		
		if((number1==10) &&(number2==20))
		{
			System.out.println("This is condtional  and operator");
		}
		
        if((number1==10) ||(number2==20))
        {
        	System.out.println("this is conditional OR opertor");
        }
	    System.out.println(bool);
       //System.out.println(number1--);
       //System.out.println(number1+number2);
       System.out.println(number2+str);
       
	}

}
