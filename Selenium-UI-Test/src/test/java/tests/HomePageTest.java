package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;
import utility.Driver;
import utility.library.FlowsLibrary;


public class HomePageTest extends TestBase {

    @Test()
public void verifycareerbtnTest () {

    String webSiteUrl = ConfigReader.getProperty("URL");

    getFlowsLibrary().navigateToUrl(webSiteUrl);

        getPageLibrary().getHomePage().clickCareerButton();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().
                contains("https://useinsider.com/careers/?"));


}


}
