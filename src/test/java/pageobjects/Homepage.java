package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;

public class Homepage extends BaseClass {

    WebDriverWait wait = new WebDriverWait (driver, 10);

    By LoginField = By.cssSelector("input[name='login']");
    By PasswordField = By.cssSelector("input[name='password']");
    By SubmitButton = By.cssSelector("button[type='submit']");
    By UserName = By.cssSelector(".pull-xs-right li");

    public void login(String username, String password)
    {
        driver.findElement(LoginField).sendKeys(username);
        driver.findElement(PasswordField).sendKeys(password);
        driver.findElement(SubmitButton).click();
    }

    public String userNameExpected(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserName));
       return driver.findElement(UserName).getText();
    }


}
