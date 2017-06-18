package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by Ashwin on 6/14/2017.
 */
public class BasePage {


    public WebDriver driver = null;
    WebDriverWait wait;
    private static final long DRIVER_WAIT_TIME = 10;




    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public void waitForElementToBeClickable(By by){
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitForTitleToBeAvailable(String string){
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleContains(string));
    }

    public void performActions(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void performActionsClick(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click();
    }

    public void selectBytext(String text, WebElement ele){
        Select select = new Select(ele);
        select.selectByVisibleText(text);
    }

    public void click(By by){
        driver.findElement(by).click();
    }

    public String randomCharacters(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;

        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }

    public WebElement waitForExpectedElement(final By by) {
        this.wait = new WebDriverWait(driver,DRIVER_WAIT_TIME);
        return wait.until(visibilityOfElementLocated(by));
    }


    public ExpectedCondition<WebElement> visibilityOfElementLocated(final By by) throws NoSuchElementException {
        return driver -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            WebElement element = driver.findElement(by);

            return element.isDisplayed() ? element : null;
        };
    }


    @cucumber.api.java.After
    public void tearDown(){
        driver.quit();
    }

    }


