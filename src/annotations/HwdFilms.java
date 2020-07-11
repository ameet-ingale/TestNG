package annotations;

import org.testng.annotations.*;

public class HwdFilms {
	
	@BeforeMethod
	 public void bfMethod()
	 {
		System.out.println("Before Test Method annotation");
	 }
		@Test
		public void Titanic()
			{ 	System.out.println("Titanic movie");  }
		    
		@Test
		public void Thor()
			{	System.out.println("Thor movie");  	}
		 
		@Test
		public void Avengers()
		{	System.out.println("Avengers movie");  }
		
	@AfterMethod
	public void afMethod()
	{
		System.out.println("After Test Method annotation");
	}
}
