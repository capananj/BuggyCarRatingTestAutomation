package definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import pageobjects.Homepage;
import pageobjects.CarModel;
import pageobjects.Profile;
import pageobjects.Registeration;
import utilities.BaseClass;

public class BuggyCarRatingsTestStepsDefinitions extends BaseClass {

    private static final String randomlogin = "RANDOM" + RandomStringUtils.randomAlphabetic(3);
    private static final String randomfname = "RANDOM" + RandomStringUtils.randomAlphabetic(3);
    private static final String randomlname = "RANDOM" + RandomStringUtils.randomAlphabetic(3);
    private static final String randompassword = "Testuser@123";

    Registeration registeration;
    Homepage hmpage;
    CarModel carModel;
    Profile profile;


    @Before
    public void setUpBrowser()
    {
        createDriver();
    }

    @Given("^I am able to navigate to BuggyCarRating website$")
    public void navigateToBuggyCarRating()
    {
        navigateToURL("https://buggy.justtestit.org/");
        Assert.assertEquals(driver.getTitle(), "Buggy Cars Rating");
    }

    @And("^I am able to Register$")
    public void registerFeatureTest()
    {
        registeration = new Registeration();
        registeration.clickRegister();
        registeration.register(randomlogin, randomfname, randomlname,randompassword,randompassword);
        Assert.assertEquals(registeration.registerationSuccessaAlertIsDisplayed(), true);
    }

    @And("^I am able to login$")
    public void loginFeatureTest()
    {
        hmpage = new Homepage();
        hmpage.login(randomlogin, randompassword);
        Assert.assertTrue((hmpage.userNameExpected()).contains(randomfname));
    }

    @And("^I am able to vote$")
    public void ableToVote()
    {
        carModel = new CarModel();
        carModel.goToListOfAllModelsAndVote();
        Assert.assertEquals(carModel.thankyoutext, "Thank you for your vote!");
    }

    @And("^I am able to view my profile$")
    public void viewProfile()
    {
        profile = new Profile();
        profile.viewProfile();
        Assert.assertTrue(profile.LoginName.isDisplayed());
        Assert.assertTrue(profile.FirstName.isDisplayed());
        Assert.assertTrue(profile.LastName.isDisplayed());
    }

    @And("^I am able to Logout$")
    public void logOut()
    {
        profile.logOut();
    }

    @After
    public void closeBrowser()
    {
        quitDriver();
    }

}
