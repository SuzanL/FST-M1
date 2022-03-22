package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");

        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is :" + title);

        //Use findElement() with xpath() to find all the input fields on the page.
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement number = driver.findElement(By.xpath("//*[@id=\"number\"]"));
        WebElement message = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea"));

        //Fill in the details in the fields using the sendKeys() method.
        firstName.sendKeys("Suzan");
        lastName.sendKeys("Lasrado");
        email.sendKeys("Suzan@example.com");
        number.sendKeys("9999999999");
        message.sendKeys("Hello Suzan!");

        //Click the submit button at the end of the form to submit the form.
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
        driver.close();
    }
}