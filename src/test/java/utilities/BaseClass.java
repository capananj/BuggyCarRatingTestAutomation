package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public void createDriver()
    {
        System.setProperty("webdriver.chrome.driver","/Users/sachdd/working/drivers/chromedriver_3");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void navigateToURL(String URL)
    {
        driver.get(URL);
    }

    public void quitDriver()
    {
        driver.quit();
    }
}
