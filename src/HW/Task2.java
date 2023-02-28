package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //initiate the instance of the Webdriver
        WebDriver driver = new ChromeDriver();
        //open google.com
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //driver.findElements(By.className("class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\""))
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Slava");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Friz");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("German4Life@Syntax.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("German4Life@Syntax.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("=RussianMafia=");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_month")).sendKeys("Jan");
        driver.findElement(By.name("birthday_day")).sendKeys("20");
        driver.findElement(By.name("birthday_year")).sendKeys("1989");
        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();//for male
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        driver.close();//close the tab only
        driver.quit();//close the browser

    }
}
