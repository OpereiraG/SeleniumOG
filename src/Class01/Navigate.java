package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        //Connect to the webdriver

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of the Webdriver
        WebDriver driver = new ChromeDriver();
        //open google.com
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        // now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        //navigate allows us to go back to google
        driver.navigate().back();
        Thread.sleep(2000);
        //go forward again to facebook
        driver.navigate().forward();
        //refresh the page
        Thread.sleep(2000);
        driver.navigate().refresh();
        //close the browser
        driver.close();





    }
}
