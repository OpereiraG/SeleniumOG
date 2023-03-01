package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //max window
        driver.manage().window().maximize();

//Go to Amazon.com
        driver.get("https://www.amazon.com/");

        //Get all the links
        //We know that all links are in tag <a> which is also called anchor
        // tag lets use the locator by Tagname for this purpose

        List<WebElement> tags = driver.findElements(By.tagName("a"));
        // in order ro print
        //we need to iterate

        for (WebElement tag : tags) {
            String link = tag.getAttribute("href");
            System.out.println(link);
        }

        //




    }
}
