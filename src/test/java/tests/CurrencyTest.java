package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.StartPage;
import testData.Currency;
import testData.TestData;

import java.util.stream.Stream;


public class CurrencyTest extends TestBase {

    TestData testData = new TestData();
    StartPage startPage = new StartPage();


    static Stream<Arguments> checkCurrencyMethodSourceTest() {
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
    @Tag("MainPage")
    void checkCurrencyMethodSourceTest(Currency currency, String note) {
        startPage.openPage()
                .setCurrency(String.valueOf(currency))
                .checkSearch(note);

    }


}





