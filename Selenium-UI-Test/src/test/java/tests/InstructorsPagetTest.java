package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;

public class InstructorsPagetTest  extends TestBase  {

    @Test()
    public void verifyOpenHomePageTest () {

 int insructorsnumber =getPageLibrary().getInstructorsPage().InsructorsAcount();

 Assert.assertEquals(8,insructorsnumber);
    }

}
