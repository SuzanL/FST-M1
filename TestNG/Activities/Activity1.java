package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();

        driver.get("https://training-support.net");

    }

    @Test
    public void testPageTitle(){
        //check page tile
        String title = driver.getTitle();

        //Print the title
        System.out.println("Title of the page is " + title);
        Assert.assertEquals(title,"Training Support");

        //Find the button and click it
        driver.findElement(By.id("about-link")).click();

        //Print the new title
        System.out.println("New page title is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"About Training Support");

    }

    @AfterClass
    public void teardown(){
        driver.close();
    }

}
