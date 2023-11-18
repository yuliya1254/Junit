package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StartPage {


    SelenideElement
            currency = $(".simple-menu__currency"),
            setCurrency = $(".popup__form"),
            search = $("#searchInput"),
            buttonMenu = $("[data-wba-header-name = Catalog]"),
            menuList = $(".menu-burger__main-list"),
            title = $(".header__top"),

            currencyInCard = $(".main-page__content"),
            searchForPhoto = $("#searchByImageContainer");



    public StartPage checkSearch(String value) {

        currencyInCard.shouldHave(text(value));
        return this;
    }



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

    public StartPage setButtonMenu() {
        buttonMenu.click();
        return this;
    }

    public StartPage menuList(String value) {
        menuList.shouldHave(text(value));
        return this;
    }

    public StartPage setTitle (String value ){
        title.shouldHave(text(value));
        return this;
    }

    public StartPage searchForPhoto (String value){
        searchForPhoto.hover().shouldHave(text(value));
        return this;
    }


}



