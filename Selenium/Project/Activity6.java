package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");

        //navigate to the Jobs page
        driver.findElement(By.xpath("//li[1]/a")).click();
    }

    @Test
    public void applyJobTestCase() throws InterruptedException {
        // Search for a particular job and wait for listings to show.
        driver.findElement(By.id("search_keywords")).sendKeys("Banking");

        //Click and open any one of the jobs listed.
        driver.findElement(By.xpath("//div[@class='search_submit']/input")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]")));
        WebElement jobList = driver.findElement(By.xpath("//h3"));

        jobList.click();
        //  Click the apply button
        driver.findElement(By.xpath("//input[starts-with(@class,'application_button')]")).click();

      // print the email to the console.
        String email = driver.findElement(By.xpath("//a[contains(@class,'job_application_email')]")).getText();

        System.out.println("Email is "+ email);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}