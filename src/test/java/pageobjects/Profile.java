package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;

public class Profile extends BaseClass
{

    WebDriverWait wait = new WebDriverWait (driver, 10);
    By ProfileTab = By.xpath("//a[text()='Profile']");
    By LogOutTab = By.xpath("//a[text()='Logout']");
    By ProfileCard = By.className("card-block");
    By UserNameOnProfile = By.cssSelector("input[id='username']");
    By FirstNameOnProfile = By.cssSelector("input[id='firstName']");
    By LastNameOnProfile = By.cssSelector("input[id='lastName']");
    public WebElement LoginName;
    public WebElement FirstName;
    public WebElement LastName;

    public void viewProfile()
    {
        driver.findElement(ProfileTab).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProfileCard)); //add wait here
        LoginName = driver.findElement(UserNameOnProfile);
        FirstName = driver.findElement(FirstNameOnProfile);
        LastName = driver.findElement(LastNameOnProfile);
    }

    public void logOut()
    {
        driver.findElement(LogOutTab).click();
    }
}
