package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import pages.ResultSearchPage;
import pages.StartPage;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.sleep;


public class WildberriesCurrency extends TestBase {

    TestData testData = new TestData();
    StartPage startPage = new StartPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();


    ///MethodSource
    static Stream<Arguments> CheckCurrencyMethodSource() {
        return Stream.of(
                Arguments.of(Currency.KZT, "тг."),
                Arguments.of(Currency.RUB, "₽"),
                Arguments.of(Currency.BYN, "р."),
                Arguments.of(Currency.AMD, "драм"),
                Arguments.of(Currency.KGS, "сом"),
                Arguments.of(Currency.UZS, "сум")
        );
    }

    @MethodSource
    @ParameterizedTest(name = "При выборе валюты {0} цена должна отображаться в {1}")
    @Tag("Minor")
    void CheckCurrencyMethodSource(Currency currency, String note) {
        startPage.openPage()
                .setCurrency(String.valueOf(currency))
                .setSearch(testData.searchValue);
        resultSearchPage.checkSearch(note);

    }


    ///ValueSource
    @ValueSource(strings = {"Куртка", "Гель", "Майка"})
    @DisplayName("Соответсвие результатов поисков дааным ввода")
    @ParameterizedTest
    @Tag("Critical")
    void CheckVisible(String world) {
        startPage.openPage();
        sleep(2000); // Костыль, так как, пока страница полностью не прогрузится, поиск не производится
        startPage.setSearch(world);
        resultSearchPage.checkSearch(world);

    }


    @CsvSource(value = {
            "KZT + тг",
            "RUB + ₽",
            "BYN + р",
            "AMD + драм",
            "KGS + сом"

    },
            delimiterString = "+")
    @ParameterizedTest(name = "При выборе валюты {0} цена должна отображаться в {1}")
    @Tag("Double")
    void CheckCurrencyCsvSource(Currency currency, String note) {
        startPage.openPage()
                .setCurrency(String.valueOf(currency))
                .setSearch(testData.searchValue);
        resultSearchPage.checkSearch(note);

    }


}





