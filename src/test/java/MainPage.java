import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Main appleinsider page
**/

public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * Using search an website and press Enter button
     * @param searchString search string
     */
    public SearchPages search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPages();
    }
}
