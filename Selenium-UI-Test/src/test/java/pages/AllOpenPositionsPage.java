
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Driver;

import java.time.Duration;
import java.util.List;

public class AllOpenPositionsPage extends PageBase {

    public void FilterLocationAndDepertmant(){

isPageLoaded(5);

            clickElement(getElementLibrary().getAllOpenPositionsPageElements().
                    ComboboxLocation);
           clickElement(getElementLibrary().
                    getAllOpenPositionsPageElements().Locationİstanbul);
        clickElementWithWait(getElementLibrary().
           getAllOpenPositionsPageElements().ComboboxDepartment);
        clickElementWithWait(getElementLibrary().
            getAllOpenPositionsPageElements().DepartmentQuality);

        slepp(8000);
        scrollTo(getElementLibrary().getAllOpenPositionsPageElements().ScrollBrowse);

    }

    public void ClickViewRoleBtn(){

        hoverOver(getElementLibrary().getAllOpenPositionsPageElements().
                jobCards.get(0),10);

        clickElementWithWait(getElementLibrary().
        getAllOpenPositionsPageElements().ViewRoleBtn);

        slepp(15000);
isPageLoaded(20);



    }
}
