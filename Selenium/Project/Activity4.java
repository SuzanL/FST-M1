package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
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
        // Get the second heading on the page.
        String secondHeading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/h2")).getText();

        //Print the second heading of the page
        System.out.println("Page heading is: " + secondHeading);

        //Assertion for page heading
        Assert.assertEquals(secondHeading, "Quia quis non");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}

