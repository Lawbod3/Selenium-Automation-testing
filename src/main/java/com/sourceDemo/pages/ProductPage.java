package com.sourceDemo.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    private By productsHeader = By.xpath("//div[text()='Products']");

    public boolean isProductsDisplayed(){
        return find(productsHeader).isDisplayed();
    }
}
