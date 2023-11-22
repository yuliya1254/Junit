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

    currencyInCard = $(".product-card__wrapper"),
            searchForPhoto = $("#searchByImageContainer");


    @Step("Проверка отображаемой валюты")
    public StartPage checkCurrency(String value) {
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
        currency.hover();
        setCurrency.$(byText(value)).click();
        return this;
    }

    @Step("Ввести в поле поиска слово {value}")
    public StartPage inputSearch(String value) {
        search.setValue(value).pressEnter();
        return this;
    }

    @Step("Нажать на кнопку 'Бургер-меню'")
    public StartPage clickButtonMenu() {
        buttonMenu.click();
        return this;
    }

    @Step("Проверка разделов в боковом меню")
    public StartPage checkMenuList(String value) {
        menuList.shouldHave(text(value));
        return this;
    }

    @Step("Проверка текста в заголовке страницы")
    public StartPage setTitle(String value) {
        title.shouldHave(text(value));
        return this;
    }

    @Step("Проверка всплывающего текста, при наведении на значок фотоаппарата")
    public StartPage checkForPhoto(String value) {
        searchForPhoto.hover().shouldHave(text(value));
        return this;
    }


}



