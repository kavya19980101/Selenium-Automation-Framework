package TestScripts;

import org.testng.annotations.Test;

public class TestScripts01 {
	
	@Test
	public void TC01()
	{
		
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String usn=System.getProperty("usn");
		String pwd=System.getProperty("pwd");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(usn);
		System.out.println(pwd);
		System.out.println("My first testcase");
	}
	
	@Test
	public void TC02()
	{
		System.out.println("My Second testcase");
	}

}
