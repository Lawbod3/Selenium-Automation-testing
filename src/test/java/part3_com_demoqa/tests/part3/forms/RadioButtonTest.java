package part3_com_demoqa.tests.part3.forms;

import org.testng.annotations.Test;
import part3_com_demoqa.base.BaseTest;

import static org.testng.AssertJUnit.*;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleRadioButtonSelected();
        assertTrue(isFemaleRadioButtonSelected);
    }
}
