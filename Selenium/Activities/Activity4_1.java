package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");

        //get the title of the page
        String title =driver.getTitle();
        System.out.println ("Title of the page is :" + title);

        //Use findElement() with xpath() to find and click the "About Us" link on the page.
        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();

        //Print the title of the new page that open when the link is clicked.
        String title1 =driver.getTitle();
        System.out.println ("Title of the new page is :" + title1);
        driver.close();
    }
}