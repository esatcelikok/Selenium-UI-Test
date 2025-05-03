

package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Driver;

import java.time.chrono.ChronoLocalDate;

public class QualityAssurancePage  extends PageBase {

    public void clickSeeAllQAjobsBtn (){

   clickElementWithWait(getElementLibrary().
           getQualityAssurancePageElements().SeeAllQAJobsBtn);

        System.out.println( Driver.getDriver().getCurrentUrl());
    }


}
