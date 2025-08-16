package com.sourceDemo.pages;

import com.BasePage.BasePage;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private By productsHeader = By.xpath("//span[@class='title' and text()='Products']");

    public boolean isProductsDisplayed(){
        return find(productsHeader).isDisplayed();
    }
}
