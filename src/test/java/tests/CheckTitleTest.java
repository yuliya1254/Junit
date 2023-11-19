package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.StartPage;
import testData.TestData;

public class CheckTitleTest extends TestBase{
    StartPage startPage = new StartPage();
    TestData data = new TestData();

    @Test
    @DisplayName("Проверка содержания заголовка сайта")
    @Feature("Главная страница")
    @Tag("MainPage")
    void checkTitleTest() {
        startPage.openPage();
       startPage.setTitle(data.title);

    }

}
