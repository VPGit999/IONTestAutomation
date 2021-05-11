	package LearningJava;

public class Encapsulation {
	//which controls the class attributes and methods in a single unit
	private int id;//private = restricted access
	private String name;
	
	
	public int getID(){
		return id; 
	}
	public String getName(){
		return name;
	}
	
	
	public void setID(int id ){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	

}
