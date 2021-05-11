package LearningJava;

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation ep=new Encapsulation();
	   ep.setID(123);//To access the impleneted methods in external classes we will use encapsulation conceptthe programmer can change one part of the code without affecting other parts
	   //Increased security of data

	   ep.setName("vasu");
	   System.out.println("ID:"+ep.getID() + "Name:"+ep.getName());
		

	}

}
