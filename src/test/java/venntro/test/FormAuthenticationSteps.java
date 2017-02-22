package venntro.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Gauri on 22/02/2017.
 */
public class FormAuthenticationSteps {

    BaseMain baseMain = new BaseMain();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SecureAreaPage secureAreaPage = new SecureAreaPage();

    @Given("^user is on HomePage$")
    public void userisonHomePage() throws Throwable {

        Assert.assertEquals("Welcome to the Internet", homePage.onHomepage());
        System.out.println("\n");
        System.out.println("=========== This is to confirm that user is on ==============");
        System.out.println("\n");
        System.out.println("================= " + homePage.onHomepage() + " ==================");
        System.out.println("\n");
        System.out.println("==============================================================");
    }


    @And("^several available examples are seen on the landing page$")
    public void severalAvailableExamplesAreSeenOnTheLandingPage() throws Throwable {

        Assert.assertEquals("Available Examples", homePage.onHomepageAvailableExamples());
        System.out.println("\n");
        System.out.println("=========== This is to confirm that user can see ==============");
        System.out.println("\n");
        System.out.println("================= " + homePage.onHomepageAvailableExamples() + " ==================");
        System.out.println("\n");
        System.out.println("==============================================================");
        homePage.viewListOfAvailableExamples();
    }

    @When("^user click on form Authentication Link$")
    public void userClickOnFormAuthenticationLink() throws Throwable {
        homePage.clickFormAuthintocation();
    }

    @Then("^user should be directed to Login page$")
    public void userShouldBeDirectedToLoginPage() throws Throwable {
        Assert.assertEquals("Login Page", loginPage.onLoginPage());
        System.out.println("The TEXT SEEN ON THE PAGE CONFIRMS THAT USER IS ON -->> " + loginPage.onLoginPage());
        System.out.println("\n");
    }

    //Scenario :-   Check a success message is shown when you log in correctly

    @And("^should be able to login successfully with valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void shouldBeAbleToLoginSuccessfullyWithValidAnd(String userName, String password) throws Throwable {

        loginPage.enterCredentials("tomsmith", "SuperSecretPassword!");
        loginPage.clickLoginButton();
    }

    @And("^user should veiw login success message \"([^\"]*)\"$")
    public void userShouldVeiwLoginSuccessMessage(String loginSuccessMessage) throws Throwable {
        Assert.assertTrue(loginSuccessMessage, secureAreaPage.veiwLoginSuccessMessage());
        System.out.println("The Assertion successfully confirms that the text message status is" + "(" + secureAreaPage.veiwLoginSuccessMessage() + ")");
        System.out.println("That means user can see --->>" + loginSuccessMessage);
    }

    // Scenario 2 :- And should not be able to login with invalid "UserName" and "Password"

    @And("^should not be able to login with invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void shouldNotAbleToLoginWithInvalidAnd(String userName, String password) throws Throwable {

        loginPage.enterCredentials ("tomsmith","SuperSecretPa");
        loginPage.clickLoginButton();
    }

    @And("^user should veiw login error message \"([^\"]*)\"$")
    public void userShouldVeiwLoginErrorMessage(String errorMessage) throws Throwable {
        Assert.assertTrue(errorMessage, secureAreaPage.veiwLoginSuccessMessage());
        System.out.println(" The Assertion is successfully that the boolean status is" + "(" + secureAreaPage.veiwLoginSuccessMessage() + ")");
        System.out.println(" And the Error Message seen is  --->> " + errorMessage);

    }
}
