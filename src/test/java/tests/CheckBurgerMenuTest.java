package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.StartPage;
import testData.TestData;

import static com.codeborne.selenide.Selenide.sleep;

public class CheckBurgerMenuTest extends TestBase{
    StartPage startPage = new StartPage();
    TestData data = new TestData();

    @Test
    @DisplayName("Проверка содержания бокового меню")
    @Tag("MainPage")
    void checkBurgerMenuTest() {
        startPage.openPage();
        sleep(2000);
        startPage.setButtonMenu();
        startPage.menuList(data.menuList);

    }

}
