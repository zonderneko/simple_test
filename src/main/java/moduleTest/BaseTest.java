package moduleTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testCase.Autorization;

public class BaseTest {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Autorization.testLogin(driver);

    }
}
