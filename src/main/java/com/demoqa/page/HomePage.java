package com.demoqa.page;

import com.demoqa.page.Forms.FormsPage;
import com.BasePage.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJs;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms(){
        scrollToElementJs(formsCard);
        click(formsCard);
        return  new FormsPage();
    }
}
