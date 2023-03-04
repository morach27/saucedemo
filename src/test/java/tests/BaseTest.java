package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import steps.LoginSteps;
import utils.Browser;
import utils.DriverFactory;

import java.time.Duration;

public class BaseTest {
    private static WebDriver driver;

    protected WebDriverWait wait;

    LoginSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void beforeClass() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        steps = new LoginSteps();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @DataProvider(name = "loginSuccess")
    public Object[][] loginSuccessData() {
        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"}
        };
    }

    @DataProvider(name = "loginFailed")
    public Object[][] loginFailedData() {
        return new Object[][] {
                {"",""},
                {"standard_user",""},
                {"","Test123"},
                {"standard_user","t111"}
        };
    }
}
