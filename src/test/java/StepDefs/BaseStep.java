package StepDefs;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Homepage;
import pages.Loginpage;
import pages.LogoutPage;
import pages.RoomPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ashwin on 6/15/2017.
 */
public class BaseStep {

    WebDriver driver = null;
    Loginpage loginpage;
    Homepage homepage;
    RoomPage roompage;
    LogoutPage logoutPage;



    public BaseStep() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/ExternalSources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.staging-ex-plor.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginpage = new Loginpage(driver);
        homepage = new Homepage(driver);
        roompage = new RoomPage(driver);
        logoutPage = new LogoutPage(driver);

    }



}
