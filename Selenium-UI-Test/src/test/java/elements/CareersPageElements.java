package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class CareersPageElements {

    public CareersPageElements()

    {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//p[@class='mt-5 mb-0 mt-lg-0 mx-auto pl-0']")
    public WebElement LocationsContext;

    @FindBy(css = ".category-title-media.ml-0")
    public WebElement LocationsContexttitle;

    @FindBy(css = "section[id='page-head'] div[class='container']")
    public WebElement ReadyTitle ;

    @FindBy(xpath = "//div[@class='elementor elementor-22610']//li")
    public List<WebElement> cards;

    @FindBy(xpath = "//div[@class='elementor elementor-22610']//li//img image")
    public List<WebElement> cardsİmages;

    @FindBy(xpath = "//div[@class='elementor elementor-22610']//li//div[2]/p")
    public List<WebElement> cardsCapital;

    @FindBy(xpath = "//div[@class='elementor elementor-22610']//li//div[2]//span[1]")
    public List<WebElement> cardsCountry;

    @FindBy(xpath = "//div[@class='elementor elementor-22610']//li//div[2]//span[2]")
    public List<WebElement> cardsCapitaltime;

    @FindBy(xpath = "//i[@class='icon-arrow-right location-slider-next ml-4 text-xsmall text-dark']")
    public WebElement nextbottun;


    @FindBy(xpath = "//div[@class='cli-bar-btn_container']//a[3]")
    public WebElement declinebottun;


    @FindBy(css = ".btn.btn-info.rounded.mr-0.mr-md-4.py-3")
    public WebElement dreamjobButton;

    @FindBy(css = ".swiper-wrapper")
    public WebElement swiperwrapper;

    @FindBy(xpath = "//div[@class='swiper-wrapper']")
    public WebElement swiperwrap;

    @FindBy(xpath = "//div[@class='swiper-wrapper']/div']")
    public List<WebElement> swiperslide;

    @FindBy(css = ".swiper-slide.swiper-slide-active")
    public WebElement activeslide;

    @FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']/div")
    public WebElement activeslideimage;

    @FindBy(xpath = "//h3[normalize-space()='Our Locations']")
    public WebElement Locationtitle;

    @FindBy(xpath = "//h2[normalize-space()='Life at Insider']")
    public WebElement LifeatInsiderblokTitle;

    @FindBy(xpath = "//p[contains(text(),'We’re here to grow and drive growth—as none of us ')]")
    public WebElement LifeatInsiderblokContextext;

    @FindBy(css = ".swiper-wrapper >img")
    public List<WebElement> Swiperslide;

}
