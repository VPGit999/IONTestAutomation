package LearningJava;

public class Child extends Parent{
	int id=22;
	String name="AQ";
	
	public void displayEMPdetails(){
		/*System.out.println(id);
		System.out.println(name);}*/
		super.displayEMPdetails();}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		
		c.displayEMPdetails();

	}

}
