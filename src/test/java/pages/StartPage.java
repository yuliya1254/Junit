package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StartPage {


    SelenideElement
            currency = $(".simple-menu__currency"),
            setCurrency = $(".popup__form"),
            search = $("#searchInput");


    public StartPage openPage() {
        open("/");
        return this;
    }


    public StartPage setCurrency(String value) {
        currency.click();
        setCurrency.$(byText(value)).click();
        return this;
    }

    public StartPage setSearch(String value) {
        search.setValue(value).pressEnter();
        return this;
    }


}



