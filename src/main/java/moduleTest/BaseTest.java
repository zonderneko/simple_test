package moduleTest;

import java.util.concurrent.TimeUnit;

import interfaces.IBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testCase.Autorization;


public class BaseTest implements IBase {
    private static WebDriver driver = null;

    @BeforeTest
    public void init() {
        driver = new FirefoxDriver();
    }

    @Test
    public void auth() {
        auth.testLogin(driver);
    }

    @AfterTest
    public void exit() {
        driver.quit();
    }
}
