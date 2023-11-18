package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.StartPage;


public class CheckTextOnButtonPhotoTest extends TestBase{

    StartPage startPage = new StartPage();
    TestData data = new TestData();

    @Test
    @DisplayName("Отображение всплывающего окна при наведение на кнопку Фотоаппарата")
    @Tag("Critical")
    void checkBurgerMenuTest() {
        startPage.openPage()
                 .searchForPhoto(data.searchForPhotoText);





    }
}
