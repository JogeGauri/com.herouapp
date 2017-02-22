package venntro.test;

import Utils.WebUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Gauri on 22/02/2017.
 */
public class DynamicControls extends BaseMain {

    WebUtils utils = new WebUtils();

    @FindBy(css = "div[class='example'] h4")
    private WebElement checkDynamicControls;

    @FindBy(css = "div[class='example'] form button")
    private WebElement clickDynamicButton;

    @FindBy(css = "form p[id='message']")
    private WebElement checkButtonRemoved;

    @FindBy(css = "div[class='example'] form button[id='btn']")
    private WebElement addButton;

    @FindBy(css = "input[type=\"checkbox\"][id=\"checkbox\"]")
    private WebElement checkBoxStatus;

    public String onDynamicControlsPage() {
        return checkDynamicControls.getText();
    }

    public void checkCheckBoxStatus() {

        utils.waitForSeconds(3);

        if (!checkBoxStatus.isSelected()) {
            System.out.println("--->>> THE CURRENT STATUS OF CHECKBOX IS UNCHECKED <<-----");
            System.out.println("\n");

            try {
                checkBoxStatus.click();
                System.out.println("-->> THE CHECKBOX IS NOW CHECKED <<--");
                utils.waitForSeconds(2);
                clickDynamicButton.click();
                System.out.println("-->> AND REMOVE BUTTON IS NOW CLICKED  <<--");
                utils.waitForSeconds(5);
                clickDynamicButton.click();
                utils.waitForSeconds(5);

            } catch (Exception e) {
                System.out.println("THE CHECK BOX IS DISABLED ELEMENT");
            }
        } else if (!checkBoxStatus.isDisplayed()){
            System.out.println(" THERE IS NO CURRENT STATUS OF CHECKBOX ");

            clickDynamicButton.click();
            utils.waitForSeconds(5);

            System.out.println(" NOW THE REMOVE or ADD BUTTON IS CLICKED ");

        }

    }


    public boolean checkCheckTheSuccessStatus(String statusMessage) {
        utils.waitForSeconds(3);
        clickDynamicButton.getText().contains(statusMessage);
        return true;
    }

    public void clickAddButton() {
        addButton.click();
    }
}
