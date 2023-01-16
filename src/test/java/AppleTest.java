import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AppleTest extends BaseTest{

    private final static String BASE_URL = "https://appleinsider.ru";
    private final static String SEARCH_STRING = "Что не так с iPhone 13?";
    private final static String EXPECTED_WORD = "Что не так с iPhone 13?";

    @Test
    public void chackHref() {
        Assert.assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFirstArticle().contains(EXPECTED_WORD));
    }
}
