package com.demoqa.page;

import com.demoqa.page.Elements.ElementsPage;
import com.demoqa.page.Forms.FormsPage;
import com.BasePage.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJs;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementCard = By.xpath("//div[@id='app']//h5[text()='Elements']");

    public FormsPage goToForms(){
        scrollToElementJs(formsCard);
        click(formsCard);
        return  new FormsPage();
    }

    public ElementsPage goToElements (){
        scrollToElementJs(elementCard);
        click(elementCard);
        return  new ElementsPage();
    }
}
