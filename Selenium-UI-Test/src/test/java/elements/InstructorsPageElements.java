package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;


public class InstructorsPageElements {

    public InstructorsPageElements() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = ".instructors > div")
    public List<WebElement> instructorDivs;

    @FindBy(css = "div[class='page-title'] div:nth-child(1)")
    public WebElement instructortxt;


    }
