


package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class QualityAssurancePageElements {

    public QualityAssurancePageElements()

    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".button-group.d-flex.flex-row a[href]")
    public WebElement SeeAllQAJobsBtn;

    @FindBy(xpath = "//div[@class='cli-bar-btn_container']//a[3]")
    public WebElement declinebottun;

    }

