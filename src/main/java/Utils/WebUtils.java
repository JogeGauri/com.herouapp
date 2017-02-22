package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import venntro.test.BaseMain;

/**
 * Created by Tushar & Gauri on 22/02/2017.
 */
public class WebUtils {
    private WebDriverWait wait;

    BaseMain baseMain = new BaseMain();

    public WebDriverWait waitFor() {
        return wait;
    }

    public void waitForSeconds(double seconds) {
        try {
            Thread.sleep(new Double((seconds * 1000)).longValue());
        } catch (InterruptedException e) {
            handleException(e, "Wait got interrupted");
        }
    }

    public WebElement waitUntilElementIsClickable(WebElement element) {
        return waitFor().until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitUntilElementIsVisible(WebElement element) {
        return waitFor().until(ExpectedConditions.visibilityOf(element));
    }



    public void handleException(Exception e, String message)
    {

    }

}
