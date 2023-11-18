package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.StartPage;

import static com.codeborne.selenide.Selenide.sleep;

public class CheckBurgerMenuTest extends TestBase{
    StartPage startPage = new StartPage();
    TestData data = new TestData();

    @Test
    @DisplayName("Проверка содержания бокового меню")
    @Tag("Critical")
    void checkBurgerMenuTest() {
        startPage.openPage();
        sleep(2000);
        startPage.setButtonMenu();
        startPage.menuList(data.menuList);

    }

}
