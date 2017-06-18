package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ashwin on 6/14/2017.
 */
public class Loginpage extends BasePage {

    By login = By.id("login");
    By username = By.id("user_session_login");
    By password = By.id("user_session_password");
    By submit = By.id("user_session_submit");

    public Loginpage(WebDriver driver){
        super(driver);
    }


   public void login(){
       waitForElementToBeClickable(login);
       click(login);
   }

   public void username(String userName){
       driver.findElement(username).sendKeys(userName);
   }

   public void password(String passWord){
       driver.findElement(password).sendKeys(passWord);
   }

   public void submit(){
       click(submit);
   }



    }

