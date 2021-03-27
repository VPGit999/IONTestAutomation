package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadNWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		FileInputStream inputstream=new FileInputStream("C:\\git\\Selenium\\RWFileTestcase\\src\\test\\resources\\properties\\Testdata.properties");
		properties.load(inputstream);
		String var1=properties.getProperty("browser");
		String var2= properties.getProperty("url");
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(properties.getProperty("hostname"));
		FileOutputStream outputstream=new FileOutputStream("C:\\git\\Selenium\\RWFileTestcase\\src\\test\\resources\\properties\\Testdata.properties");
		properties.setProperty("hostname", "localhost");
		properties.store(outputstream, "");
	}

}
