package package1.MavenProject;
//"Assignment 167Create Maven Project Open browser in Headless mode.
//Print all the link and Link text from google.com
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Asgn167_AllLinks_Google 
{
	public static void main(String[] args) throws IOException  
	{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless=new");
		
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
		
	List<WebElement> alllinks =driver.findElements(By.tagName("a"));
	
	int count =alllinks.size();
	System.out.println(count);
	
		for(int i=0; i<count; i++)
		{
			WebElement e1= alllinks.get(i);
			String linkname = e1.getAttribute("href");
			String text = e1.getText();
//			System.out.println(linkname);
//			System.out.println(text);
			verifylinks(linkname, text);
		}
	}
	
static void verifylinks (String linkname, String text) throws IOException
	{ try
	 {	URL u1 = new URL(linkname);
		HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();
		{
		if(h1.getResponseCode()==200 || h1.getResponseCode()==201)
		{
		System.out.println("Valid link " + linkname +" "+text + " "+ h1.getResponseCode() +" "+ h1.getResponseMessage());
//		System.out.println(h1.getResponseCode());
//		System.out.println(h1.getResponseMessage());
		}
		else
		{
		System.out.println("Invalid link: " + h1.getResponseCode());
		}
		
		}
	}
	catch(MalformedURLException m1)
	{
		System.out.println("handled exception m1"+m1.getLocalizedMessage()+linkname+text);
	}
	catch(NullPointerException m2)
	{
		System.out.println("handled exception m2"+m2.getLocalizedMessage()+linkname+text);
	}
	
}
}