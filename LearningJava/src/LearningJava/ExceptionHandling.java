package LearningJava;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int i=10;
		System.out.println("Before division");
		System.out.println(i/0);
		}
		catch(Throwable t){
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			}
		
		finally{
			System.out.println("This is a final block");
		}
		System.out.println("After division");

	}

}
