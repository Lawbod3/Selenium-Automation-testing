package com.demoqa.page.Forms;

import com.demoqa.page.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJs;

public class FormsPage extends HomePage {

    private By practiseFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public  PracticeFormPage clickPracticeForm(){
        scrollToElementJs(practiseFormMenuItem);
        click(practiseFormMenuItem);
        return  new PracticeFormPage();
    }
}
