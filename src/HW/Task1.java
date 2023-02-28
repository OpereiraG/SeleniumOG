package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of the Webdriver
        WebDriver driver = new ChromeDriver();
        //open google.com
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.close();
    }

}
