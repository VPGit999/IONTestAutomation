package LearningJava;

public class DefaultConstructor {
	public int id;
	public String name;
	
	public void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor d=new DefaultConstructor();
		d.display();

	}

}
