package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeClass
    public void beforeMethod(){
        //create a driver instance for FirefoxDriver
        driver=new FirefoxDriver();
        //open the browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void testCase1(){
        //get the title of the page.
        String title = driver.getTitle();
        System.out.println("Title Of the page is " +title);
        //assert the title of the page
        Assert.assertEquals(title,"Target Practice");
    }
    @Test
    public void testCase2(){
        //look for the black button.
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));

        //Make an incorrect assertion
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }
    @Test(enabled = false)
    public void testcase3()
    {
        //This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }

    @Test
    public void testCase4(){
        //This test will be skipped and will be  shown as skipped
        throw new SkipException("Skipping test case");
    }
    @AfterClass
    public void afterMethod(){
        //close the browser
        driver.close();

    }


}
