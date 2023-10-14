package tests;

import org.junit.jupiter.api.Test;
import pages.ResultSearchPage;
import pages.StartPage;


public class WildberriesCurrency extends TestBase {

    TestData testData = new TestData();
    StartPage startPage = new StartPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();

    @Test
    void CheckCurrency(){
        startPage.openPage()
                 .setCurrency("Казахстанский тенге")
                .setSearch(testData.searchValue);

        resultSearchPage.checkSearch("тг.");


        try {
            Thread.sleep(4999);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
