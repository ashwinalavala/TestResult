package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;

/**
 * Created by Ashwin on 6/16/2017.
 */
public class RoomPage extends BasePage{

   public String generatedString = randomCharacters();
   public   int clickDeleteReplyPostSize;

    By searchfield = By.id("topic_answer_body");
    By post = By.id("topic_answer_submit");
    By edit = By.linkText("Edit");
    By editsearchfield = By.cssSelector("a[class*='edit_editable']");
    By update = By.xpath("//button[@type='submit']");
    By link = By.linkText("Like");
    By reply = By.linkText("Reply");
    By replysearchfield = By.xpath("(//textarea[@id='topic_answer_body'])[2]");
    By replypost = By.xpath("(//*[@id='topic_answer_submit'])[2]");
    By deletereplypost = By.xpath("");
    By postedComment = By.cssSelector(".b-user.comment > div[id*='editable_post'] >p");
    By dreamholidaybe = By.cssSelector("a[href='/groups/4/topics/14']");





    public RoomPage(WebDriver driver){
        super(driver);
    }


    public void typesearchfield(){
        WebElement searchField = driver.findElement(searchfield);
        searchField.sendKeys(generatedString);
    }

    public void clickpost(){

          WebElement clickPost = driver.findElement(post);
        clickPost.click();
    }

    public void clickedit(){
        WebElement clickEdit = driver.findElement(edit);
        clickEdit.click();

    }

    public void typeeditsearchfield(){
        WebElement typeeditsearchfield = driver.findElement(editsearchfield);
        typeeditsearchfield.click();
    }

    public void clickupdatebutton(){

        WebElement clickupdatebutton = driver.findElement(update);
        clickupdatebutton.click();
    }

    public WebElement clickLikelink(){
        return waitForExpectedElement(link);
    }

    public WebElement searchField(){
        return waitForExpectedElement(replysearchfield);
    }


    public void clickreply(){

        WebElement clickreply = driver.findElement(reply);
        clickreply.click();
    }

    public void typereplysearchfield() throws InterruptedException {
                Thread.sleep(4000);
        searchField().click();
        searchField().sendKeys(generatedString);
    }
    public  void clickreplypostbutton(){
        WebElement clickdeletereplypost = driver.findElement(replypost);
        clickdeletereplypost.click();
    }


    public void clickDeleteReplyPost(){
        List<WebElement> deleteReplyPost =  driver.findElements(By.cssSelector(".delete"));
        int clickDeleteReplyPost = deleteReplyPost.size();

        WebElement deletePost = driver.findElement(By.xpath("(//a[@title='Delete this comment'])[2]"));
        deletePost.click();

    }

    public String getPostedText(){
        return driver.findElement(postedComment).getText();
    }

    public void whatwouldbedreamholiday() {

        WebElement whatwouldbedreamholiday = driver.findElement(dreamholidaybe);
        whatwouldbedreamholiday.click();
    }
}
