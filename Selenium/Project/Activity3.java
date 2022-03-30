package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void exampleTestCase() {
        // Get the url of the header image.
        WebElement url =driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/div/img"));

        //Print the url to the console.
        System.out.println("URL is : "+ url.getAttribute("src"));



    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}