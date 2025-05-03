
package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class HomePageElements {

    public HomePageElements()

    {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[contains(text(),'Eğitmenler')]")
    public WebElement instructorsButton;

    @FindBy(css = ".instructors > div")
    public List<WebElement> instructorDivs2;

    @FindBy(css= "body > nav:nth-child(5) > div:nth-child(2) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)")
    public WebElement CompanyButton;

    @FindBy(xpath = "//a[normalize-space()='Careers']")
    public WebElement CareerLink;





}
