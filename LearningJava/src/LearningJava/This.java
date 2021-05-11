package LearningJava;

public class This {
	
public int id;
public String name;

This(int id,String name){
	this.id=id;
	this.name=name;
}

public void display()
{
System.out.println(id+" "+name);	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This t=new This(12, "Vasu");
		t.display();

	}

}
