package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ConfigReader;
import utility.Driver;

public class QualityAssurancePageTest extends TestBase {

    @Test()
  public void verifySeeQAlljobsClickTest(){


        String webSiteUrl = ConfigReader.getProperty("URL3");
        getFlowsLibrary().navigateToUrl(webSiteUrl);
        Assert.assertTrue(isPageLoaded(85),
                "Career sayfası doğru şekilde yüklenmedi.");

        getPageLibrary().getQualityAssurancePage().clickSeeAllQAjobsBtn();

Assert.assertTrue(Driver.getDriver().getCurrentUrl().
        contains("careers/open-positions/?department=qualityassurance"));
    }
}
