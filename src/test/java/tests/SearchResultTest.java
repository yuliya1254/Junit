package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.ResultSearchPage;
import pages.StartPage;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchResultTest extends TestBase {

    StartPage startPage = new StartPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();

    @ValueSource(strings = {"Куртка", "Гель", "Майка"})
    @Feature("Страница поиска")
    @DisplayName("Соответсвие результатов поиска дааным ввода")
    @ParameterizedTest
    @Tag("SearchPage")
    void checkVisibleTest(String world) {
        startPage.openPage();
        sleep(2000);
        startPage.inputSearch(world);
        resultSearchPage.checkSearch(world);

    }
}
