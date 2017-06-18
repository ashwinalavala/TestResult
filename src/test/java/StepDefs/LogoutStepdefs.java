package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Ashwin on 6/16/2017.
 */
public class LogoutStepdefs extends BaseStep{

    @Given("^i sign in with \"([^\"]*)\" ,\"([^\"]*)\"$")
    public void iSignInWith(String arg0, String arg1) throws Throwable {

        loginpage.login();
        loginpage.username(arg0);
        loginpage.password(arg1);
        loginpage.submit();
    }

    @When("^i click on settings icon$")
    public void iClickOnSettingsIcon() throws Throwable {
        logoutPage.settingiconbutton();
    }

    @And("^i click on logout link$")
    public void iClickOnLogoutLink() throws Throwable {
        logoutPage.clicklogout();
    }

    @Then("^i should logout and redirected to login page$")
    public void iShouldLogoutAndRedirectedToLoginPage() throws Throwable {

        driver.getPageSource().contains("Welcome to ");

               
    }
}
