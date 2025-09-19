package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePage extends BasePage{

    By addUserButton = By.xpath("/html/body/table/thead/tr[2]/td/button");


    public void navigateToPage() {
        Driver.get().get(ConfigurationReader.get("url")); //Read URL from configFile.
        String expectedUrl = "https://www.way2automation.com/angularjs-protractor/webtables/";
        Assert.assertEquals(Driver.get().getCurrentUrl(), expectedUrl);
    }
    public void clickAddUserButton() {
        Driver.get().findElement(addUserButton).click();
        BrowserUtils.waitFor(5);
    }
}
