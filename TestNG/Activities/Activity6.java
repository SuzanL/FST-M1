package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        //create a driver instance for FirefoxDriver
        driver= new FirefoxDriver();

        //use the get() method to open the browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username","password"})
    public void testMethod(String username, String password){
        // Find username and password fields
        WebElement username1= driver.findElement(By.id("username"));
        WebElement password1= driver.findElement(By.id("password"));

        //Enter values
        username1.sendKeys(username);
        password1.sendKeys(password);

        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //Assertion
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");

    }

    @AfterClass
    public void afterClass(){
        //close the browser
        driver.close();
    }
}
