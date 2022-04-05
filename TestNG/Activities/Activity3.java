package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        //create a driver instance
        driver = new FirefoxDriver();
        //open the browser
        driver.get("https://www.training-support.net/selenium/login-form");


    }

    @Test
    public void testLogin() {

        //Find the username and password fields
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        //Enter the credentials
        username.sendKeys("admin");
        password.sendKeys("password");

        //click the "Log in" button.
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //read login Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
    }

    @AfterClass
    public void afterMethod() {
        //close the browser
        driver.close();

    }
}