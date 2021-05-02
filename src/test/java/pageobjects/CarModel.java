package pageobjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;

public class CarModel extends BaseClass {

    WebDriverWait wait = new WebDriverWait (driver, 10);

     By ListOfAllModels= By.cssSelector("a[href='/overall'] img");
     By BrandName  = By.cssSelector(".navbar-brand");
     By CarsTable = By.xpath("//table");
     By RandomCarModel = By.xpath("//table/tbody/tr[2]/td[3]/a");
     By Comment = By.cssSelector("textarea[id='comment']");
     By Vote = By.cssSelector(".btn-success");
     By Votesuccessmsg = By.cssSelector(".card-block p");
     String Testcomment = "Random comments " + RandomStringUtils.randomAlphabetic(3);
     public String thankyoutext;


    public void goToListOfAllModelsAndVote()
    {
        driver.findElement(BrandName).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ListOfAllModels));
        driver.findElement(ListOfAllModels).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(CarsTable));
        driver.findElement(RandomCarModel).click();
        wait.until(ExpectedConditions.elementToBeClickable(Comment));
        driver.findElement(Comment).sendKeys(Testcomment);
        driver.findElement(Vote).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Votesuccessmsg));
        thankyoutext = driver.findElement(Votesuccessmsg).getText();
    }

}
