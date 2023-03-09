package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CSSselector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //max window
        driver.manage().window().maximize();

        //go to facebook.com

        driver.get("https://www.facebook.com/");

        //click on the button create account using the CSS selector
       //List<WebElement> createNewBtn = driver.findElements(By.cssSelector("a[data-testid='open-registration-form-button']"));
        WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewBtn.click();
        Thread.sleep(1000);
       // fill in the first name
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("abracadbara");


    }
}
