package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        // get the window handle of the parent window
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        //get windows handles of all the windows that have been open

        Set<String> windowHandles = driver.getWindowHandles();
        // print all the window handles

        for (String wh : windowHandles) {
            //System.out.println(windowHandle);
            driver.switchTo().window(wh);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help"));
            break;

        }
        //To verify we switched to the right window
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindow);
    }
}
