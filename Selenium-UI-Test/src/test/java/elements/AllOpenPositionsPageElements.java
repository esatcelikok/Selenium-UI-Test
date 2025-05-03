package elements;

import org.openqa.selenium.support.PageFactory;
import utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AllOpenPositionsPageElements {

    public AllOpenPositionsPageElements() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/span[1]/span[1]/span[1]/span[2]")
    public WebElement ComboboxLocation;

    @FindBy(css = "#filter-by-location > option.job-location.istanbul-turkiye")
    public WebElement Locationİstanbul;

    @FindBy(xpath = "//span[@id='select2-filter-by-department-container']")
    public WebElement ComboboxDepartment;

    @FindBy(xpath= "//ul[@id='select2-filter-by-department-results']/li[16]")
    public WebElement DepartmentQuality;

    @FindBy(css= "#select2-filter-by-location-container")
    public WebElement SelectionLocation;

    @FindBy(css= "#select2-filter-by-department-container")
    public WebElement SelectionDepermant;


    @FindBy(xpath = "//section[@id='career-position-list']//div[@class='row']//div[1]//div[1]//a[1]")
    public WebElement ViewRoleBtn;

    @FindBy(css= "#select2-filter-by-location-results")
    public WebElement selectresultoptions;

    @FindBy(css = "#jobs-list >div")
    public List<WebElement> jobCards;

    @FindBy(xpath = "//h3[contains(text(),'Browse')]")
    public WebElement ScrollBrowse;



}
