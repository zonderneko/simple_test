package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login {
    private static WebDriver driver = null;
    WebElement login = driver.findElement(By.id("log"));

    public void setLogin(WebElement login) {
        this.login = login;
        login.sendKeys("testlogin");
    }

    WebElement password = driver.findElement(By.id("pwd"));

    public void setPassword(WebElement password) {
        this.password = password;
        password.sendKeys("testpwd");
    }

    WebElement loginBtn = driver.findElement(By.id("login"));

    public void setLoginBtn(WebElement loginBtn) {
        this.loginBtn = loginBtn;
        loginBtn.click();
    }
}
