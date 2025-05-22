package project;
import org.testng.Assert;
import org.testng.annotations.Test;

import pkg.app;
public class apptest {
@Test
public void testlogin1()
{
app myapp=new app();
Assert.assertEquals(0, myapp.userLogin("abc", "abc123"));
}
@Test
public void testlogin2()
{

app myapp=new app();
Assert.assertEquals(1, myapp.userLogin("abc", "abc@123"));

}
}
