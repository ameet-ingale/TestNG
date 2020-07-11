package annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebSeries {
	
	@Test@Parameters({"username", "password"})
	public void suits(String username, int password)
	{  System.out.println("Username is:"+ username + "\n Password is:"+ password);  }
	
	@Test(timeOut=4000)
	public void gameOfThrones()
	{  System.out.println("GameOfThrones Season2");  }
	
	@Test
	public void sherlockHolms()
	{  System.out.println("Sherlock Holms ");  }
		
}
