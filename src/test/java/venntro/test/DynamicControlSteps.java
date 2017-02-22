package venntro.test;

import Utils.WebUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Gauri on 22/02/2017.
 */
public class DynamicControlSteps {
    WebUtils utils = new WebUtils();
    BaseMain baseMain = new BaseMain();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DynamicControls dynamicControls = new DynamicControls();

    @When("^user click on form Dynamic Controls$")
    public void userClickOnFormDynamicControls() throws Throwable {

        homePage.clickDynamicControls();
    }

    @Then("^he should be directed to the Dymanic Controls Page$")
    public void heShouldBeDirectedToTheDymanicControlsPage() throws Throwable {

        Assert.assertEquals("Dynamic Controls", dynamicControls.onDynamicControlsPage());
        System.out.println("\n");
        System.out.println("=========== This is to confirm that user is on ==============");
        System.out.println("\n");
        System.out.println("================= " + dynamicControls.onDynamicControlsPage() + " ==================");
        System.out.println("\n");
        System.out.println("==============================================================");

    }

    @And("^he should be able to remove checkbox tag$")
    public void heShouldBeAbleToRemoveCheckboxTag() throws Throwable {
        dynamicControls.checkCheckBoxStatus();
    }

    @And("^he should see a success message \"([^\"]*)\"$")
    public void heShouldSeeASuccessMessage(String statusMessage)  {
        dynamicControls.checkCheckTheSuccessStatus(statusMessage);
        Assert.assertTrue(statusMessage, dynamicControls.checkCheckTheSuccessStatus(statusMessage));
        System.out.println("\n");
        System.out.println("<<< This confirms that boolean condition is  >>> " + dynamicControls.checkCheckTheSuccessStatus(statusMessage) + " <<< and user can see >>>" + statusMessage);
    }

    @And("^he should be able to add the checkbox again$")
    public void heShouldBeAbleToAddTheCheckboxAgain() throws Throwable {
        dynamicControls.checkCheckBoxStatus();
    }

    @And("^he should see a message \"([^\"]*)\"$")
    public void heSahouldSeeAMessage(String statusMessage) throws Throwable {
        dynamicControls.checkCheckTheSuccessStatus(statusMessage);
        Assert.assertTrue(statusMessage, dynamicControls.checkCheckTheSuccessStatus(statusMessage));
        System.out.println("\n");
        System.out.println("<<< This confirms that boolean condition is  >>> " + dynamicControls.checkCheckTheSuccessStatus(statusMessage) + " <<< and user can see >>>" + statusMessage);
    }
}
