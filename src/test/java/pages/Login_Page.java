package pages;

//import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Login_Page {

    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    WebDriverWait wait ;
    public Login_Page (WebDriver driver){
        this.driver= driver;
        wait = new WebDriverWait(driver , Duration.ofSeconds(10));

    }

    //Locators
    private final By usernamefield = By.id("user-name");
    private final By passwordfield = By.name("password");
    private final By loginbutton = By.name("login-button");
    private final By headertext = By.cssSelector("#header_container > div.primary_header > div.header_label > div");


    //Actions
    public void navigate() {
        driver.get("https://www.saucedemo.com/");
    }

    public void setUsernamefield(String username) {
        driver.findElement(usernamefield).sendKeys(username);
    }

    public void setPasswordfield(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }

    public void pushbutton(){
        driver.findElement(loginbutton).click();
    }

    public void passresult(){
        Assert.assertTrue(driver.findElement(headertext).isDisplayed(), "Header is not displayed!");
        Assert.assertEquals(driver.findElement(headertext).getText(), "Swag Labs");
       // BrowserActions.acceptAlert(driver);


    }

    public void failresult(){

        Assert.assertTrue(driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")).isDisplayed(), "Header is not displayed!");
    }

    public void timing(long startTime, long endTime) {
        System.out.println("Execution times: " + (endTime - startTime));
        long Execution_time = endTime - startTime;
        if (Execution_time < 3000){
            System.out.println("The login process doesn't have a delay glitch");
        } else{
            System.out.println("The login process has a delay glitch");
        }
    }

//    public void validateAlertMessage(String message)
//    {
//        softAssert.assertEquals(BrowserActions.getAlertText(driver) , message);
//        BrowserActions.acceptAlert(driver);
//        softAssert.assertAll();
//    }

}
