import org.testng.Assert;

import mainjava.App;

public class csd {
	public void test1() {
		App myapp=new App();
		Assert.assertEquals(1,myapp.userLogin("Zoro","1piece"));
		
	}
	public void test2() {
		App myapp2=new App();
		Assert.assertEquals(1,myapp2.userLogin("Zoro","1piece"));
		
	}
}
