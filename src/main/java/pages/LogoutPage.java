package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashwin on 6/16/2017.
 */
public class LogoutPage extends BasePage {
    By settingicon = By.id("dropdown-navigation");
    //By settingicon = By.cssSelector("a[class='dropdown-toggle collapsed-navigation']");
   By logout = By.cssSelector("a[href*='/logout']");

    public LogoutPage(WebDriver driver){
        super(driver);
    }

    public void settingiconbutton() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id("dropdown-navigation")).click();

    }

    public void clicklogout(){
        List<WebElement> arrayList = driver.findElement(By.id("dropdown-navigation")).findElements(By.tagName("a"));
        for (WebElement ele : arrayList) {
            if(ele.getText().equalsIgnoreCase("LOGOUT"))
            {
                ele.click();
            }
        }
        }
    }

