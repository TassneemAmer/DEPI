package tests;

import base.Test_Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login_Page;

public class Login_Test_Optimized extends Test_Base {

    Login_Page loginPage;

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", true},
                {"locked_out_user", "secret_sauce", true},
                {"problem_user", "secret_sauce", true},
                {"performance_glitch_user", "secret_sauce", true},
                {"error_user", "secret_sauce", true},
                {"visual_user", "secret_sauce", true},
                {"standard_user", "password", false},
                {"locked_out_user", "password", false},
                {"problem_user", "password", false},
                {"performance_glitch_user", "password", false},
                {"error_user", "password", false},
                {"visual_user", "password", false},
                {"username", "secret_sauce", false},
                {"username", "password", false}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password, boolean shouldPass) {
        loginPage = new Login_Page(driver);
        long startTime = System.currentTimeMillis();

        loginPage.navigate();
        loginPage.setUsernamefield(username);
        loginPage.setPasswordfield(password);
        loginPage.pushbutton();

        if (shouldPass) {
            loginPage.passresult();
        } else {
            loginPage.failresult();
        }

        long endTime = System.currentTimeMillis();
        loginPage.timing(startTime, endTime);
    }
}
