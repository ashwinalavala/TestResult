package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Ashwin on 6/15/2017.
 */
public class HomeStepdef extends BaseStep{


    @cucumber.api.java.After
    public void teardown(){
        driver.quit();
    }

    @Given("^i logged in with \"([^\"]*)\" , \"([^\"]*)\"$")
    public void iLoggedInWith(String arg0, String arg1) throws Throwable {
        loginpage.login();
        loginpage.username(arg0);
        loginpage.password(arg1);
        loginpage.submit();
        assertTrue(driver.getTitle().contains("ex-plor"));
    }

    @When("^i click on room category link$")
    public void iClickOnRoomCategoryLink() throws Throwable {
        homepage.clickHolidayMenu();

    }

    @Then("^i should land on the rooms category page$")
    public void iShouldLandOnTheRoomsCategoryPage() throws Throwable {
        assertTrue(driver.findElement(By.xpath(".//*[@id='room']/div[3]/div[1]/h3")).getText().matches("Holiday commercials"));

    }


}
