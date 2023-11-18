package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.StartPage;
import testData.TestData;

public class CheckTitleTest extends TestBase{
    StartPage startPage = new StartPage();
    TestData data = new TestData();

    @DisplayName("Проверка содержания заголовка сайта")
    @Test
    @Tag("MainPage")
    void checkTitleTest() {
        startPage.openPage();
       startPage.setTitle(data.title);

    }

}
