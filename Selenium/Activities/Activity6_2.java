package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get(" https://training-support.net/selenium/ajax");

        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is :" + title);

        //click the "Change content"
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button")).click();

        //Wait for the text to say "HELLO!" and print
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
        String ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);

        //Wait for the text to change to contain "I'm late!"
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

        //Get late text and print it
        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(lateText);


        //close the browser
        driver.close();
    }
}
