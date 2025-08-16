package com.demoqa.page.Elements;

import org.openqa.selenium.By;

import javax.lang.model.util.Elements;

public class WebTablesPage extends ElementsPage{

    private  By registrationAge = By.id("age");
    private  By submitButton = By.id("submit");

    public void clickEdit(String email){
        By edit = By.xpath("//div[text()='"+ email +"']//following::span[@title='Edit']");
        click(edit);
    }

    public void setAge(String age){
        set(registrationAge, age);
    }

    public void setSubmitButton(){
        click(submitButton);
    }
}
