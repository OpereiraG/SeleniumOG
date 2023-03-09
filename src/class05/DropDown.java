package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //max window
        driver.manage().window().maximize();

        //

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        //locate the webElement

       WebElement dropDown =  driver.findElement(By.xpath("//select[@id='select-demo']"));

       // use select class because this drop down has a select tag
        Select select = new Select(dropDown);
        //using select class we have different methods to select the desired class
        select.selectByIndex(2);
        Thread.sleep(2000);

        //select by value
        select.selectByValue("Tuesday");
        //select by visible text
        Thread.sleep(2000);

        select.selectByVisibleText("Friday");
    }
}
