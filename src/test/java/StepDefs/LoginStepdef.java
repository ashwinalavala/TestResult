package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Loginpage;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Ashwin on 6/14/2017.
 */
public class LoginStepdef extends BaseStep {



    @cucumber.api.java.After
    public void teardown(){
        driver.quit();
    }

    @Given("^i navigate to \"([^\"]*)\" home page$")
    public void iNavigateToHomePage(String arg0) throws Throwable {



    }

    @When("^i click on login button$")
    public void iClickOnLoginButton() throws Throwable {
         loginpage.login();

    }

    @And("^enter \"([^\"]*)\" , \"([^\"]*)\"$")
    public void enter(String arg0, String arg1) throws Throwable {

        loginpage.username(arg0);
        loginpage.password(arg1);
    }

    @And("^click submit$")
    public void clickSubmit() throws Throwable {
        loginpage.submit();
    }

    @Then("^i should be logged in$")
    public void iShouldBeLoggedIn() throws Throwable {

        assertTrue(driver.getTitle().contains("ex-plor"));
    }


}