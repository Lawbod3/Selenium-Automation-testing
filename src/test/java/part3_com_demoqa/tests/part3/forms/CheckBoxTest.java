package part3_com_demoqa.tests.part3.forms;

import org.testng.annotations.Test;
import part3_com_demoqa.base.BaseTest;

import static org.testng.AssertJUnit.assertFalse;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckBox();
        formsPage.clickReadingHobbyCheckBox();
        formsPage.clickMusicHobbyCheckBox();
        formsPage.unClickReadingHobbyCheckBox();

        boolean isReadingCheckBoxSelected = formsPage.isReadingHobbyCheckBoxSelected();
        assertFalse(isReadingCheckBoxSelected);
    }
}
