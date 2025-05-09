package tests;

import base.Test_Base;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.Login_Page;


@Epic("Login Feature")

public class Login_Test_Detailed extends Test_Base {

    Login_Page loginPage;


    @Test(description = "Login with locked_out_user - known bug")
    @Story("TC_01 - standard_user login")
    @Severity(SeverityLevel.CRITICAL)
    @Description("User logs in with correct username and password")
    //VALID username & VALID password
    public void TC_01(){

        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("standard_user");
        loginPage.setPasswordfield("secret_sauce");
        loginPage.pushbutton();
        loginPage.passresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);
    }

    @Test(description = "Login with locked_out_user - known bug")
    @Story("TC_02 - locked_out_user login")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Login attempt with locked_out_user. Known issue present.")
    public void TC_02(){
        //Bug
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("locked_out_user");
        loginPage.setPasswordfield("secret_sauce");
        loginPage.pushbutton();
        loginPage.passresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }


    @Test(description = "Login with problem_user")
    @Story("TC_03 - problem_user login")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test login using problem_user credentials")
    public void TC_03(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("problem_user");
        loginPage.setPasswordfield("secret_sauce");
        loginPage.pushbutton();
        loginPage.passresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }

    @Test(description = "Login with performance_glitch_user")
    @Story("TC_04 - performance_glitch_user login")
    @Severity(SeverityLevel.NORMAL)
    @Description("Check login with user who triggers performance issues")
    public void TC_04(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("performance_glitch_user");
        loginPage.setPasswordfield("secret_sauce");
        loginPage.pushbutton();
        loginPage.passresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);
    }

    @Test(description = "Login with error_user")
    @Story("TC_05 - error_user login")
    @Severity(SeverityLevel.NORMAL)
    @Description("Login attempt with error_user credentials")
    public void TC_05(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("error_user");
        loginPage.setPasswordfield("secret_sauce");
        loginPage.pushbutton();
        loginPage.passresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }

    @Test(description = "Login with visual_user")
    @Story("TC_06 - visual_user login")
    @Severity(SeverityLevel.MINOR)
    @Description("Login using visual_user to check for UI issues")
    public void TC_06(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("visual_user");
        loginPage.setPasswordfield("secret_sauce");
        loginPage.pushbutton();
        loginPage.passresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }

    @Test(description = "Login with correct username but wrong password")
    @Story("TC_07 - Wrong password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test login with valid username and wrong password")
    public void TC_07(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("standard_user");
        loginPage.setPasswordfield("password");
        loginPage.pushbutton();
        loginPage.failresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }

    @Test(description = "Login with locked_out_user and wrong password")
    @Story("TC_08 - locked_out_user wrong password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test login failure with locked_out_user and wrong password")
    public void TC_08(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("locked_out_user");
        loginPage.setPasswordfield("password");
        loginPage.pushbutton();
        loginPage.failresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }

    @Test(description = "Login with problem_user and wrong password")
    @Story("TC_09 - problem_user wrong password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login failure with problem_user and invalid password")
    public void TC_09(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("problem_user");
        loginPage.setPasswordfield("password");
        loginPage.pushbutton();
        loginPage.failresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }

    @Test(description = "Login with performance_glitch_user and wrong password")
    @Story("TC_10 - performance_glitch_user wrong password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login attempt with performance_glitch_user and wrong password")
    public void TC_10(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("performance_glitch_user");
        loginPage.setPasswordfield("password");
        loginPage.pushbutton();
        loginPage.failresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);
    }

    @Test(description = "Login with error_user and wrong password")
    @Story("TC_11 - error_user wrong password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login attempt with error_user and incorrect password")
    public void TC_11(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("error_user");
        loginPage.setPasswordfield("password");
        loginPage.pushbutton();
        loginPage.failresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }

    @Test(description = "Login with visual_user and wrong password")
    @Story("TC_12 - visual_user wrong password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login attempt with visual_user and wrong password")
    public void TC_12(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("visual_user");
        loginPage.setPasswordfield("password");
        loginPage.pushbutton();
        loginPage.failresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }

    @Test(description = "Login with wrong username and correct password")
    @Story("TC_13 - Wrong username")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test login failure with incorrect username and correct password")
    public void TC_13(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("username");
        loginPage.setPasswordfield("secret_sauce");
        loginPage.pushbutton();
        loginPage.failresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }

    @Test(description = "Login with wrong username and wrong password")
    @Story("TC_14 - Wrong username and password")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login with incorrect credentials on both username and password")
    public void TC_14(){
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();
        loginPage.navigate();
        loginPage.setUsernamefield("username");
        loginPage.setPasswordfield("password");
        loginPage.pushbutton();
        loginPage.failresult();
        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime,endTime);

    }
}
