package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;

public class Registeration extends BaseClass {

    WebDriverWait wait = new WebDriverWait (driver, 10);
    By Login = By.cssSelector("input[id='username']");
    By FirstName = By.cssSelector("input[id='firstName']");
    By LastName = By.cssSelector("input[id='lastName']");
    By Password = By.cssSelector("input[id='password']");
    By ConfirmPassword = By.cssSelector("input[id='confirmPassword']");
    By SubmitDetails = By.xpath("//button[text()='Register']");
    By LinkToRegister = By.xpath("//a[text()='Register']");
    By RegisterationSuccessAlert = By.cssSelector(".alert-success");



    public void clickRegister()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LinkToRegister));
        driver.findElement(LinkToRegister).click();
    }

    public void register(String uname, String fname, String lname, String pwd, String cpwd)
    {
        driver.findElement(Login).clear();
        driver.findElement(Login).sendKeys(uname);
        driver.findElement(FirstName).clear();
        driver.findElement(FirstName).sendKeys(fname);
        driver.findElement(LastName).clear();
        driver.findElement(LastName).sendKeys(lname);
        driver.findElement(Password).clear();
        driver.findElement(Password).sendKeys(pwd);
        driver.findElement(ConfirmPassword).clear();
        driver.findElement(ConfirmPassword).sendKeys(cpwd);
        driver.findElement(SubmitDetails).click();

    }

    public boolean registerationSuccessaAlertIsDisplayed()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RegisterationSuccessAlert));
        return driver.findElement(RegisterationSuccessAlert).isDisplayed();
    }

}
