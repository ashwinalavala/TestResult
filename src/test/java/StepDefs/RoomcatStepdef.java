package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by Ashwin on 6/16/2017.
 */
public class RoomcatStepdef extends BaseStep{
    Random ran = new Random();

    @Given("^i logged in with \"([^\"]*)\" ,\"([^\"]*)\"$")
    public void iLoggedInWith(String arg0, String arg1) throws Throwable {

        loginpage.login();
        loginpage.username(arg0);
        loginpage.password(arg1);
        loginpage.submit();
        assertTrue(driver.getTitle().contains("ex-plor"));

        homepage.clickHolidayMenu();

    }

    @When("^i enter text on search field$")
    public void iEnterTextOnSearchField() throws Throwable {

      roompage.typesearchfield();
    }

    @And("^i click on post button$")
    public void iClickOnPostButton() throws Throwable {
        roompage.clickpost();
    }

    @Then("^i should see the comment i posted$")
    public void iShouldSeeTheCommentIPosted() throws Throwable {
      // roompage.waitForTitleToBeAvailable(roompage.getPostedText());
        Thread.sleep(4000);
        assertTrue(roompage.getPostedText().contains(roompage.generatedString));
    }

    @And("^i click on edit link and amend the text$")
    public void iClickOnEditLinkAndAmendTheText() throws Throwable {
       roompage.clickedit();
    }

    @And("^i click on update button$")
    public void iClickOnUpdateButton() throws Throwable {
       roompage.clickupdatebutton();
    }

    @Then("^i should see the text updated$")
    public void iShouldSeeTheTextUpdated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^i click on like text link$")
    public void iClickOnLikeTextLink() throws Throwable {
       roompage.clickLikelink();
    }

    @And("^i click on reply button$")
    public void iClickOnReplyButton() throws Throwable {
       roompage.clickreply();
    }

    @And("^i enter text on the reply search field$")
    public void iEnterTextOnTheReplySearchField() throws Throwable {
     roompage.typereplysearchfield();
    }

    @And("^i click on post button on reply comment$")
    public void iClickOnPostButtonOnReplyComment() throws Throwable {
      roompage.clickreplypostbutton();
    }


    @And("^i click on delete link on reply comment$")
    public void iClickOnDeleteLinkOnReplyComment() throws Throwable {
     Thread.sleep(5000);
     roompage.clickDeleteReplyPost();
        driver.switchTo().alert().accept();
    }


    @Given("^i am on room page$")
    public void iAmOnRoomPage(String arg0 , String arg1) throws Throwable {
        loginpage.login();
        loginpage.username(arg0);
        loginpage.password(arg1);
        loginpage.submit();
        assertTrue(driver.getTitle().contains("ex-plor"));

        homepage.clickHolidayMenu();

    }

    @When("^i click on \"([^\"]*)\" link$")
    public void iClickOnLink(String arg0) throws Throwable {
         roompage.whatwouldbedreamholiday();
    }

    @And("^i enter text on dhp search field$")
    public void iEnterTextOnDhpSearchField() throws Throwable {

    }

    @And("^i click on dhp post button$")
    public void iClickOnDhpPostButton() throws Throwable {

    }

    @Then("^i should see the comment i posted on dhp$")
    public void iShouldSeeTheCommentIPostedOnDhp() throws Throwable {

    }

    @And("^i click on edit link and amend the text on dhp$")
    public void iClickOnEditLinkAndAmendTheTextOnDhp() throws Throwable {

    }

    @And("^i click on update button on dhp$")
    public void iClickOnUpdateButtonOnDhp() throws Throwable {

    }

    @And("^i click on like text link on dhp$")
    public void iClickOnLikeTextLinkOnDhp() throws Throwable {

    }

    @And("^i click on reply button on dhp$")
    public void iClickOnReplyButtonOnDhp() throws Throwable {

    }

    @And("^i enter text on the reply search field on dph$")
    public void iEnterTextOnTheReplySearchFieldOnDph() throws Throwable {

    }

    @And("^i click on post button on dph$")
    public void iClickOnPostButtonOnDph() throws Throwable {

    }

    @Then("^i should see the reply comment posted on dph$")
    public void iShouldSeeTheReplyCommentPostedOnDph() throws Throwable {

    }

    @And("^i click on delete link on reply comment on dph$")
    public void iClickOnDeleteLinkOnReplyCommentOnDph() throws Throwable {

    }

    @And("^click on \"([^\"]*)\"$")
    public void clickOn(String link) throws Throwable {
       driver.findElement(By.xpath("//a[contains(text(), '"+link+"')]")).click();
    }
}
