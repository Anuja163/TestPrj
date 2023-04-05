package task5;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] ="mngr490814";
		data[0][1] ="gAdeseb";
		
		data[1][0] ="mngr490814";
		data[1][1] ="gAdeseb";
		
		data[2][0] ="mngr490814";
		data[2][1] ="gAdeseb";
		
		
		return data;
		
	}

}
