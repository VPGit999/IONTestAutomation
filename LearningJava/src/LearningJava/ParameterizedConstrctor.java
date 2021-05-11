package LearningJava;

public class ParameterizedConstrctor {
	int id;
	String name;
	ParameterizedConstrctor(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstrctor pc=new ParameterizedConstrctor(123, "Vasu");
		pc.display();

	}

}
