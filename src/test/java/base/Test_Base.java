package base;

//import Utilities.ScreenShot;
import Utilities.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.time.Duration;

public class Test_Base {
    public WebDriver driver;
    @Parameters("browser")
    @BeforeClass
    public void preconditions(@Optional("chrome") String browser) {
        if(browser.equalsIgnoreCase("chrome"))
        {
            // Disable Chrome password manager and breach popup
            final Map<String, Object> chromePrefs = new HashMap<>();
            chromePrefs.put("credentials_enable_service", false);
            chromePrefs.put("profile.password_manager_enabled", false);
            chromePrefs.put("profile.password_manager_leak_detection", false); // ✅ Key line

            final ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("prefs", chromePrefs);

            driver = new ChromeDriver(chromeOptions); // Apply options
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    @Parameters("browser")
    @AfterMethod
    public void takeScreenShot(ITestResult testResult , @Optional("chrome") String browser)
    {
        if(ITestResult.FAILURE == testResult.getStatus())
        {
            ScreenShot.takeScreenShot(driver , testResult.getName() , browser);
        }
    }

    @AfterClass
    public void after(){
        driver.quit();
    }

}

