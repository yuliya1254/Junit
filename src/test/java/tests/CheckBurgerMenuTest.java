package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.StartPage;
import testData.TestData;

import static com.codeborne.selenide.Selenide.sleep;

public class CheckBurgerMenuTest extends TestBase {
    StartPage startPage = new StartPage();
    TestData data = new TestData();


    @Test
    @Feature("Главная страница")
    @DisplayName("Проверка содержания бокового меню")
    @Tag("MainPage")
    void checkBurgerMenuTest() {
        startPage.openPage();
        //sleep(2000);
        startPage.clickButtonMenu();
        startPage.checkMenuList(data.menuList);

    }

}
