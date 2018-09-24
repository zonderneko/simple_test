package pageObject;

import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class LoginPage {


    public static void goToPage(WebDriver driver) {

        driver.get("http://store.demoqa.com/products-page/your-account/");

    }
    public static void returnToMain(WebDriver driver) {

        driver.get("http://store.demoqa.com/");

    }
    public static void setLogin(WebDriver driver) {
        WebElement loginField = driver.findElement(By.id("log"));
        loginField.sendKeys(Constants.login);
    }

    public static void setPassword(WebDriver driver) {
        WebElement passwordField = driver.findElement(By.id("pwd"));
        passwordField.sendKeys(Constants.password);
    }

    public static void setLoginBtn(WebDriver driver) {
        WebElement loginBtn = driver.findElement(By.id("login"));
        loginBtn.click();
    }
    public static void setChkBox(WebDriver driver) {
        WebElement chkBox = driver.findElement(By.id("rememberme"));
        chkBox.click();
    }
    public static void loginchk (WebDriver driver) {
        WebElement name = driver.findElement(By.xpath("/html/body/div[3]/div/ul[2]/li[2]/a/span"));
        Assert.assertEquals(name.getText(), Constants.login);
    }
}