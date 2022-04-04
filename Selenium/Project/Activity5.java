package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
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
        // Navigate to the “Jobs” page on the site
        driver.findElement(By.xpath("//li[1]/a")).click();

        //Print the title of the page
        String title = driver.getTitle();

        System.out.println("Page title is: " + title);

        //Assertion for page title
        //Read the page title and verify that you are on the correct page.
        Assert.assertEquals(title, "Jobs – Alchemy Jobs");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}