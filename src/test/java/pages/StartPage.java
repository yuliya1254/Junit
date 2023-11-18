package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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


    @Step("Проверка отображаемой валюты")
    public StartPage checkSearch(String value) {

        currencyInCard.shouldHave(text(value));
        return this;
    }


    @Step("Открыть страницу")
    public StartPage openPage() {
        open("/");
        return this;
    }

    @Step("Выбрать валюту")
    public StartPage setCurrency(String value) {
        currency.click();
        setCurrency.$(byText(value)).click();
        return this;
    }
    @Step("Ввести в поле поиска слово {value}")
    public StartPage setSearch(String value) {
        search.setValue(value).pressEnter();
        return this;
    }
    @Step("Ввести в поле поиска слово {value}")
    public StartPage setButtonMenu() {
        buttonMenu.click();
        return this;
    }
    @Step("Проверка разделов в боковом меню")
    public StartPage menuList(String value) {
        menuList.shouldHave(text(value));
        return this;
    }
    @Step("Проверка текста в заголовке страницы")
    public StartPage setTitle (String value ){
        title.shouldHave(text(value));
        return this;
    }
    @Step("Проверка всплывающего текста, при наведении на значок фотоаппарата")
    public StartPage searchForPhoto (String value){
        searchForPhoto.hover().shouldHave(text(value));
        return this;
    }


}



