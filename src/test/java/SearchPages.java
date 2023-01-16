import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class SearchPages {

    private final ElementsCollection articleTitles = $$("//h2//a");

    /**
     * returns href from first article
     * @return
     */
    public String getHrefFirstArticle(){
       return articleTitles.first().getAttribute("href");
    }
}
