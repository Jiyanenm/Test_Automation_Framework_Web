package pages;

import org.openqa.selenium.By;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegisterUserPage extends BasePage{

    By firstName = By.name("FirstName");
    By lastName = By.name("LastName");
    By username = By.name("UserName");
    By password = By.name("Password");
    By customerType = By.name("optionsRadios");
    By roleType = By.name("RoleId");
    By email = By.name("Email");
    By cellPhone = By.name("Mobilephone");
    By btnSave = By.xpath("//*[text()='Save']");
    By validateUser = By.xpath("//*[text()='Nkosinathi']");
    By editButton = By.xpath("//*[text()='Edit']");
    By btnClose = By.xpath("//*[text()='Close']");
    By editSearch = By.xpath("/html/body/table/thead/tr[1]/td/input");
    public void enterFirstName(String fname) {
        Driver.get().findElement(firstName).sendKeys(fname);
    }
    public void enterLastName(String lname) {
        BrowserUtils.waitFor(2);
        Driver.get().findElement(lastName).sendKeys(lname);
    }
    public void enterUserName(String uname) {
        BrowserUtils.waitFor(2);
        Driver.get().findElement(username).sendKeys(uname);
    }
    public void enterPassword(String pass) {
        BrowserUtils.waitFor(2);
        Driver.get().findElement(password).sendKeys(pass);
    }
    public void selectCustomerType(String custType) {
        BrowserUtils.waitFor(2);
        Driver.get().findElement(customerType).click();
    }
    public void enterRole(String role) {
        BrowserUtils.waitFor(2);
        Driver.get().findElement(roleType).sendKeys(role);
    }
    public void enterEmailAddress(String emaillAdd) {
        BrowserUtils.waitFor(2);
        Driver.get().findElement(email).sendKeys(emaillAdd);
    }
    public void enterCellPhone(String cellNo) {

        Driver.get().findElement(cellPhone).sendKeys(cellNo);
        BrowserUtils.waitFor(5);
    }
    public void clickButtonSave()
    {
        Driver.get().findElement(btnSave).click();
        BrowserUtils.waitFor(5);
    }
    public void checkIfTheRecordIsAdded()
    {
        Driver.get().findElement(validateUser).isDisplayed();
    }
    public void clickEditButton()
    {
        Driver.get().findElement(editButton).click();
        BrowserUtils.waitFor(5);
    }
    public void clickCloseButton()
    {
        Driver.get().findElement(btnClose).click();
        BrowserUtils.waitFor(5);
    }
    public void enterSearchKeyWord() {

        //We are reading the search key from the config files. This is for testing purpose.
        Driver.get().findElement(editSearch).sendKeys(ConfigurationReader.get("editSearch"));
        System.out.println("Search " + ConfigurationReader.get("editSearch"));
        BrowserUtils.waitFor(5);
    }
}