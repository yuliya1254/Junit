package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.StartPage;
import testData.TestData;

import static com.codeborne.selenide.Selenide.open;


public class CheckTextOnButtonPhotoTest extends TestBase {

    StartPage startPage = new StartPage();
    TestData data = new TestData();

    @Test
    @Feature("Главная страница")
    @DisplayName("Отображение всплывающей подсказки при наведение на кнопку Фотоаппарата")
    @Tag("MainPage")
    void checkBurgerMenuTest() {
        open("https://www.wildberries.ru");
        startPage //.openPage()
                .checkForPhoto(data.searchForPhotoText);


    }
}
