package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StartPage {


    private SelenideElement
            currency = $(".profile-menu__currency"),
            setCurrency = $(".popup__content"),
            search = $("#searchInput"),
            buttonMenu = $("[data-wba-header-name = Catalog]"),
            menuList = $(".menu-burger__main-list"),
            title = $(".header__top"),
            currencyInCard = $(".product-card__wrapper"),
            searchForPhoto = $("#searchByImageContainer"),
            pointLogin = $("[data-wba-header-name=Login]"),
            banners = $(".swiper-container"),
            iconAddress = $("[data-wba-header-name=Pick_up_points]");


    @Step("Проверка отображаемой валюты")
    public StartPage checkCurrency(String value) {
        currencyInCard.shouldHave(text(value));
        return this;
    }


    @Step("Открыть страницу")
    public StartPage openPage() {
        open("/");
        banners.should(exist);
        return this;
    }


    @Step("Выбрать валюту")
    public StartPage setCurrency(String value) {
        pointLogin.hover();
        currency.click();
        setCurrency.$(byText(value)).click();
        return this;
    }

    @Step("Ввести в поле поиска слово {value}")
    public StartPage inputSearch(String value) {
        search.setValue(value).pressEnter();
        return this;
    }

    @Step("Нажать на кнопку 'Войти'")
    public StartPage clickLogin() {
        pointLogin.click();
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
    public StartPage checkTitle(String value) {
        title.shouldHave(text(value));
        return this;
    }

    @Step("Проверка всплывающего текста, при наведении на значок фотоаппарата")
    public StartPage checkForPhoto(String value) {
        searchForPhoto.hover().shouldHave(text(value));
        return this;
    }

    @Step("Нажать на кнопку 'Адрес'")
    public StartPage clickAddress() {
        iconAddress.click();
        return this;
    }


}



