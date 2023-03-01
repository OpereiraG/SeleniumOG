package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //max window
        driver.manage().window().maximize();


        //open smart bear
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");


        //find the username
        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));

        username.sendKeys("Tester");

        //Find password field
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

        // clear the username text box using the method clear
        username.clear();

        //to get the text username which is beside the username text box
        WebElement unsernameText = driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(unsernameText.getText());

        // get the text password which is beside the password text box
        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        System.out.println(passwordText.getText());





    }
}
