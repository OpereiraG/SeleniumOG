package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {


        // tell your project where the webdriver is located
        //for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
// create an instance of WebDriver
        //navigate to the website
        driver.manage().window().maximize();
        //got to Amazon.com
        driver.get("https://www.amazon.com/");

        //print all the links in Amazon.com
        String tagNames= driver.findElements(By.tagName("a")).toString();
        System.out.println(tagNames);






    }

}
