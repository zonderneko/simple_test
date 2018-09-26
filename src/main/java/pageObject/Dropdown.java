package pageObject;

import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class Dropdown {

    private WebDriver driver;

    public Dropdown(WebDriver driver) {

        this.driver = driver;
    }

    public static void mainPage(WebDriver driver) {

        driver.get(Constants.main);
    }

    private static void moveTo(WebDriver driver) {

        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(By.xpath("/html/body/div[2]/div/div/header/nav/ul/li[2]/a"));
        action.moveToElement(menu).build().perform();
    }


    private WebElement getElementByLinkPart(String linkPart) {

        return driver.findElement(By.partialLinkText(linkPart));
    }

    public void assertChilds() {

        for (String link : Constants.links) {
            Dropdown.moveTo(driver);
            WebElement child = this.getElementByLinkPart(link);
            moveToChild(child);
            String childText = child.getText();
            child.click();
            Assert.assertEquals(childText, driver.findElement(By.xpath(Constants.headers)).getText());
        }
    }

    private void moveToChild(WebElement child) {

        Actions action = new Actions(driver);
        action.moveToElement(child).build().perform();
    }

}
