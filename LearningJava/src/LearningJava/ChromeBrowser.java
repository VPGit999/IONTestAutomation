package LearningJava;

public class ChromeBrowser extends WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeBrowser cb=new ChromeBrowser();
		cb.get(null);
		cb.getTitle();

	}

	//@Override//This Annotation shows you that this is the overriden method from the parent class
	

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		System.out.println("webpage title");
		return "tittle";
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("Open webpage");
		
	}

}
