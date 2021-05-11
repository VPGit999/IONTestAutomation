package LearningJava;

public class ChildChromeDriver implements WebDriverInteface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildChromeDriver cd=new ChildChromeDriver();
		cd.getwindowHandle();
		cd.get(null);

	}

	@Override
	public String get(String url) {
		// TODO Auto-generated method stub
		System.out.println("Show the launching URL details here");
		return null;
	}

	@Override
	public void getwindowHandle() {
		// TODO Auto-generated method stub
		System.out.println("Handles the window");
		
	}

}
