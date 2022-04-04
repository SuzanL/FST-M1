package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {

    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void backendLogin() {

        //Find the username field of the login form and enter the username into that field.
        driver.findElement(By.id("user_login")).sendKeys("root");

        //Find the password field of the login form and enter the password into that field.
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");

        //Find the login button and click it.
        driver.findElement(By.id("wp-submit")).click();


        System.out.println("New page title is: " + driver.getTitle());

        //Verify that you have logged in.
        Assert.assertEquals(driver.getTitle(), "Dashboard ‹ Alchemy Jobs — WordPress");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }


}