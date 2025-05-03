package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class CareersPageTest extends TestBase {

    @Test()
    public void LocationsCardsCheck(){

        List<Map<String, String>> expectedData = ExpectedData.CountryCapitalData();
        List<Map<String, String>> resultData = getPageLibrary().
                getCareersPage().CountryCapitalMatch();

        Assert.assertEquals(getElementLibrary().getCareersPageElements().
                cards.size(), 25);
        Assert.assertEquals(resultData,expectedData,
                "ülke şehir eşleşemedi");

        Assert.assertEquals(getElementLibrary().getCareersPageElements().Locationtitle.getText(),
                "Our Locations");

        Assert.assertEquals(getElementLibrary().getCareersPageElements().LocationsContext.getText(),
                "28 offices across 6 continents, home to 1100+ Insiders" );

        scrollToElementCenter(getElementLibrary().
                getCareersPageElements().LifeatInsiderblokContextext);

        Assert.assertEquals(getElementLibrary().getCareersPageElements().
                LifeatInsiderblokTitle.getText(),"Life at Insider");

        Assert.assertEquals(getElementLibrary().getCareersPageElements().
                LifeatInsiderblokContextext.getText(),"We’re here to grow and drive growth—as none of us did before. " +
                "Together, we’re building a culture that inspires us to create our life’s work—and creates a bold(er) impact. " +
                "We know that we’re smarter as a group than we are alone. " +
                "Become one of us if you dare to play bigger.");
       // Assert.assertEquals(getElementLibrary().getCareersPageElements().
            //    Swiperslide.size(),8);
    }

}
