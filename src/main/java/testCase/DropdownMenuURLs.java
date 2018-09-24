package testCase;

import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObject.Dropdown;

public class DropdownMenuURLs {

    public void checkingURL(WebDriver driver) {

        Dropdown.mainPage(driver);
        Dropdown dropdown = new Dropdown(driver);
        for (String link : Constants.links) {
            Dropdown.moveTo(driver);
            WebElement element = dropdown.getElementByLinkPart(link);
            Actions action = new Actions(driver);
            action.moveToElement(element).build().perform();
            String s = element.getText();
            element.click();
            Assert.assertEquals(s, driver.findElement(By.xpath(Constants.headers)).getText());
        }

    }
}
