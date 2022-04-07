package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is :" + title);

        //Find the username and password input fields
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
        //username: admin
        username.sendKeys("admin");
        //password: password
        password.sendKeys("password");

        //login
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

        //Wait for login message to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        // print the login message to the console
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);

        //close the browser.
        driver.close();
    }
}
