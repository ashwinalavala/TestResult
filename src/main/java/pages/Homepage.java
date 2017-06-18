package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ashwin on 6/14/2017.
 */
public class Homepage extends BasePage {

    public Homepage(WebDriver driver){
        super(driver);
    }

    By roomMenuItem = By.cssSelector(".rooms-dropdown");

    By holidaySubMenu = By.linkText("It's a Holi-Holiday!");


    public void clickHolidayMenu() throws InterruptedException {
       performActions(roomMenuItem);
        waitForElementToBeClickable(holidaySubMenu);
        click(holidaySubMenu);
    }

}
