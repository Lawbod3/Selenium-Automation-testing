package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://olabode123-trials718.orangehrmlive.com/auth/seamlessLogin");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000);
     WebElement username = driver.findElement(By.name("txtUsername"));
     username.sendKeys("admin");

     var password = driver.findElement(By.name("txtPassword"));
     password.sendKeys("U@2XJof6Cq");

     driver.findElement(By.tagName("button")).click();
    }
}
