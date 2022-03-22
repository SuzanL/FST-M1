package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/target-practice");

        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is :" + title);

        //Find the third header on the page.

        String thirdHeader = String.valueOf(driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText());
        System.out.println("Third header text is: " + thirdHeader);


        //Find the fifth header on the page and get it's 'colour' CSS Property
        String fifthHeader = String.valueOf(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getText());
        String fifthHeaderColour = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
        System.out.println("Fifth header is: " + fifthHeader);
        System.out.println("Fifth header's colour is: " + fifthHeaderColour);

        //Find the violet button on the page and print all the class attribute values.
        String violetButtonClasses = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");

        System.out.println("Violet button's classes are: " + violetButtonClasses);

        //Find the grey button on the page with Absolute XPath.
        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);

        driver.close();
    }

}
