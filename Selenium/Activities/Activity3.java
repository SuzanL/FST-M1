package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");

        //title of the page
        String title =driver.getTitle();
        System.out.println ("Title of the page is :" + title);

        //Use findElement() with name() to find the text fields - firstname and lastname.
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));

        //Use WebElement.sendKeys() to type in those text fields.
        firstName.sendKeys("Suzan");
        lastName.sendKeys("Lasrado");

        //Email
        driver.findElement(By.id("email")).sendKeys("suzan@example.com");

        //Contact
        driver.findElement(By.id("number")).sendKeys("9999999999");

        //Click Submit
        driver.findElement(By.cssSelector(".ui.green.button")).click();

        driver.close();
    }
}
