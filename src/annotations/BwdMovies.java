package annotations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BwdMovies {
	
	
	public static void getData(String value) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\EAG_Synechron\\TestNGPractise\\src\\setValues.properties");
		prop.load(fis);
		System.out.println(prop.getProperty(value));		
	}
	
	
	@Test
	public void airLift() throws IOException
	{  System.out.println("AirLift movie is good");
	getData("browser");  }
	
	@Test(enabled=false)
	public void piku()
	{  System.out.println("Piku movie is good");  }
	
	@Test(enabled=false)
	public void kesari()
	{  System.out.println("Kesari movie is good");  }
	
	@Test(dataProvider="testDataPro")
	public void race(String name, int rollId)
	{  System.out.println("Name and RollId of studetns are as below");
		System.out.println(rollId +"\t\t"+ name);  }
	
	@DataProvider
	public Object[][] testDataPro()
	{
		return new Object[][] {{"ameet", 7009}, {"amol", 7004}};
	}
	
}
