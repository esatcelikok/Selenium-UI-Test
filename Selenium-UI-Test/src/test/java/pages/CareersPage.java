package pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class CareersPage extends PageBase{

    public List<Map<String, String>> CountryCapitalMatch() {

        scrollToElementCenter(getElementLibrary().getCareersPageElements().
                cards.get(0));

        List<Map<String, String>> CountyCapitalMatch = new ArrayList<>();
        int cardsize = getElementLibrary().getCareersPageElements().cards.size();
        IntStream.range(0, cardsize).forEach(i -> {
            Map<String, String> Cardcheckmap = new LinkedHashMap<>();
            Cardcheckmap.put(getElementLibrary().
                    getCareersPageElements().cardsCapital.get(i).getText(), getElementLibrary().
                    getCareersPageElements().cardsCountry.get(i).getText());

            hoverOver(getElementLibrary().getCareersPageElements().cards.get(i),
                    800);
            CountyCapitalMatch.add(Cardcheckmap);
            clickElement(getElementLibrary().
                    getCareersPageElements().nextbottun);
        });
        return CountyCapitalMatch;

    }



}
