

package pages;


import org.testng.Assert;
import utility.Driver;

public class HomePage extends PageBase {

    public void clickCareerButton (){

        clickElementWithWait(getElementLibrary().
                getHomepageElements().CompanyButton);

        clickElementWithWait(getElementLibrary().
                getHomepageElements().CareerLink);
        Assert.assertTrue(isPageLoaded(95),
                "İnstructorsPage sucsess loding");

       clickElementWithWait(getElementLibrary().getCareersPageElements().declinebottun);


   }


}
