package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        // tell your project where the webdriver is located
        //for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
// create an instance of WebDriver
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
//send in the username
        driver.findElement(By.id("email")).sendKeys("nelper69@gmail.com");
        //send the password
        driver.findElement(By.id("pass")).sendKeys("Ninja1988*");
        //click on the button create New Account
        //driver.findElement(By.linkText("Create new account")).click();
        //click on the forgotten password
        driver.findElement(By.partialLinkText("password")).click();
        driver.quit();


    }
}
