package com.demoqa.page.Elements;

import com.demoqa.page.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");

    public WebTablesPage clickWebTables () {
        click(webTablesMenuItem);
        return new WebTablesPage();
    }
}
