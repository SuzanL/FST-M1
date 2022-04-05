package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeClass (alwaysRun = true)
    public void BeforeClass(){
        // create a driver instance for FirefoxDriver
        driver = new FirefoxDriver();

        //open the browser
        driver.get("https://www.training-support.net/selenium/target-practice");

    }

    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void titleTest(){
        //Checking the page title
        String title = driver.getTitle();
        System.out.println("Title of the Page is " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test (dependsOnMethods = {"titleTest"}, groups = {"HeaderTests"})
    public void headerTest1(){
        //Find the third header
        WebElement thirdHeader = driver.findElement(By.cssSelector("h3#third-header"));
        //Assert the text in the h3 tag.
        Assert.assertEquals(thirdHeader.getText(), "third-header");
        //Find and assert the colour of the fifth header tag element
    }

    @Test (dependsOnMethods = {"titleTest"}, groups = {"HeaderTests"})
    public void headerTest2(){
        //Find  the colour of the fifth header tag element
        WebElement fifthHeader = driver.findElement(By.cssSelector("h5.ui.green.header"));
        //assert the colour of the fifth header tag element.
        Assert.assertEquals(fifthHeader.getCssValue("color"), "rgb(251, 189, 8)");
    }

    @Test (dependsOnMethods = {"titleTest"}, groups = {"ButtonTests"})
    public void buttonTest1(){
        //Find the button with the class olive
        WebElement oliveButton = driver.findElement(By.cssSelector("button.olive"));
        //Find the button with the class olive and assert it text.
        Assert.assertEquals(oliveButton.getText(), "Olive");
    }

    @Test (dependsOnMethods = {"titleTest"}, groups = {"ButtonTests"})
    public void buttonTest2(){
        //Find and assert the colour of the first button in the third row.
        WebElement firstButtonInThirdRow = driver.findElement(By.cssSelector("button.brown"));
        //assert the colour of the first button in the third row.
        Assert.assertEquals(firstButtonInThirdRow.getText(), "Brown");
    }

    @AfterClass (alwaysRun = true)
    public void AfterClass(){
        //close the browser
        driver.close();

    }
}
