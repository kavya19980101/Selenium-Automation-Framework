package TestScripts;

import org.testng.annotations.Test;

public class TestScripts01 {
	
	@Test
	public void TC01()
	{
		
		String url=System.getProperty("url", "https://www.google.com");
		String browser=System.getProperty("browser","chrome");
		String usn=System.getProperty("usn","kavya");
		String pwd=System.getProperty("pwd","k");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(usn);
		System.out.println(pwd);
		System.out.println("My first testcase");
	}
	
	@Test
	public void TestCase02()
	{
		System.out.println("My Second testcase");
	}
	
	public void TestCase03()
	{
		System.out.println("My fifth testcase");
	}

}
