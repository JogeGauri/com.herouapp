package venntro.test;

import Utils.WebUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Gauri on 22/02/2017.
 */
public class LoginPage extends BaseMain {
    WebUtils utils = new WebUtils();

    HomePage homePage = new HomePage();

    @FindBy(css = "div[class='example'] h2")
    private WebElement loginPageStatusMessage;

    @FindBy(id = "username")
    private WebElement userNameField;

    @FindBy(id = "password")
    private WebElement userPasswordField;

    @FindBy(css = "button[class='radius'] i")
    private WebElement loginButton;

    public String onLoginPage() {

        return loginPageStatusMessage.getText();
    }

    public void enterCredentials(String userName, String password) {

        userNameField.sendKeys(userName);
        utils.waitForSeconds(2);
        userPasswordField.sendKeys(password);
        utils.waitForSeconds(2);
    }

    public void clickLoginButton(){

        loginButton.click();
        utils.waitForSeconds(1);
    }

}
