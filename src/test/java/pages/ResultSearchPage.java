package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultSearchPage {

    SelenideElement
            currencyInCard = $(".product-card-list");


    public ResultSearchPage checkSearch(String value) {

        currencyInCard.shouldHave(text(value));
        return this;
    }
}
