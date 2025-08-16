package part3_com_demoqa.tests.part3.Elements;

import org.testng.annotations.Test;
import part3_com_demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {
    @Test
    public void testWebTable() {
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit("alden@example.com");
        webTablePage.setAge("34");
        webTablePage.setSubmitButton();
    }
}
