package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBts {


        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            //max window
            driver.manage().window().maximize();

            //go to facebook.com

            driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

            WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
            //check to see if the radio button is enabled
            boolean isEnabledMale= maleBtn.isEnabled();
            System.out.println("the radio button make is enabled "+ isEnabledMale);
            // //check to see if the radio button is displayed
            boolean isDisplayedMale = maleBtn.isDisplayed();
            System.out.println("the radio button make is displayed "+isDisplayedMale);
            boolean isSelectedMale = maleBtn.isSelected();
            System.out.println("the radio button make is selected "+isSelectedMale);
            // if the radio button is not selected click on it
            if (!isSelectedMale){
                maleBtn.click();
            }

            //check if the radio button is selected after the click
            isSelectedMale=maleBtn.isSelected();
            System.out.println("the status of the selection is "+isSelectedMale);

    }
}
