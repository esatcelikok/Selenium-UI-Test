package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;
import utility.Driver;

public class AllOpenPositionsPageTest extends TestBase {

    @Test
    public void CheckFilterAndDepartmentTest(){

        String webSiteUrl = ConfigReader.getProperty("URL4");
        getFlowsLibrary().navigateToUrl(webSiteUrl);


    getPageLibrary().getAllOpenPositionsPage().FilterLocationAndDepertmant();
       Assert.assertEquals(getElementLibrary().getAllOpenPositionsPageElements().
               SelectionLocation.getAttribute("title"),
               "Istanbul, Turkiye");

       Assert.assertEquals(getElementLibrary().getAllOpenPositionsPageElements().
               SelectionDepermant.getAttribute("title"),"Quality Assurance");




}

@Test
public void CheckJobsCardsTest(){
    Assert.assertEquals(getElementLibrary().
            getAllOpenPositionsPageElements().jobCards.size(),3);

    for (int i = 0; i < getElementLibrary().
            getAllOpenPositionsPageElements().jobCards.size(); i++) {

        Assert.assertTrue(getElementLibrary().getAllOpenPositionsPageElements().
                jobCards.get(i).getAttribute("data-location").
                contains("istanbul-turkiye"));

        Assert.assertTrue(getElementLibrary().getAllOpenPositionsPageElements().
                jobCards.get(i).getAttribute("data-team").
                contains("qualityassurance"));

    }

    }

    @Test
    public void VerifyClickViewRoleBtn(){

getPageLibrary().getAllOpenPositionsPage().ClickViewRoleBtn();

        switchToNewWindow();

System.out.println(Driver.getDriver().getCurrentUrl());

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().
                contains("https://jobs.lever.co/useinsider"));

    }


}
