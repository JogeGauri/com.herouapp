package venntro.test;

import Utils.WebUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Gauri on 22/02/2017.
 */
public class SecureAreaPage extends BaseMain {
    WebUtils utils = new WebUtils();

    @FindBy(css = "div[id='flash-messages'] div[id='flash']")
    private WebElement loginStutusMessage;

    public boolean veiwLoginSuccessMessage() {

        loginStutusMessage.getText().contains("You logged into a secure area!");
        return true;
    }
}
