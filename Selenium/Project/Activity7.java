package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
    private WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void postJob() {
    //Locate the navigation menu and click the menu item that says “Post a Job

        driver.findElement(By.id("menu-item-26")).click();

        //Fill in the necessary details

        WebElement yourEmail = driver.findElement(By.id("create_account_email"));
        yourEmail.sendKeys("Example123456@example.com");

        WebElement jobTitle = driver.findElement(By.id("job_title"));
        jobTitle.sendKeys("Test Specialist");

        WebElement jobLoc = driver.findElement(By.id("job_location"));
        jobLoc.sendKeys("Sweden");

       // WebElement jobType = driver.findElement(By.id("job_type"));
       // jobType.sendKeys("Full Time");

        WebElement jobDesc = driver.findElement(By.id("job_description_ifr"));
        jobDesc.sendKeys("Test Specialist");

        WebElement Email = driver.findElement(By.id("application"));
        Email.sendKeys("Example123456@example.com");

        WebElement companyName = driver.findElement(By.id("company_name"));
        companyName.sendKeys("IBM");

        // click the button that says “Preview”
        driver.findElement(By.xpath("//input[@value='Preview']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Submit Listing']")));

        //Click on the button that says “Submit Listing”.

        driver.findElement(By.xpath("//input[@value='Submit Listing']")).click();

        //Verify that the job listing was posted by visiting the jobs page.
        driver.findElement(By.xpath("//a[text()='click here']")).click();

        //Assert Message
        String role = driver.findElement(By.xpath("//h1[contains(@class,'entry-title')]")).getText();
        Assert.assertEquals(role, "Test Specialist");



    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }


}