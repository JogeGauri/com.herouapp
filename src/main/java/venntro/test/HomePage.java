package venntro.test;

import Utils.WebUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Gauri on 22/02/2017.
 */
public class HomePage extends BaseMain {

    WebUtils utils = new WebUtils();

@FindBy(css = "div[id='content'] h1")
private WebElement checkHomePageStatus;

@FindBy(css = "div[id='content'] h2")
private WebElement availableExamples;

@FindBy(css = "div[id='content'] ul li a")
private WebElement listOfAvialableExamples;

@FindBy(css = "div[id='content'] ul li a[href='/login']")
private WebElement formAuthintication;

@FindBy(css = "div[id='content'] ul li a[href='/dynamic_controls']")
private WebElement dynamicControls;

    public String onHomepage(){

      return  checkHomePageStatus.getText();
    }

    public String onHomepageAvailableExamples(){

        return  availableExamples.getText();
    }

    public void viewListOfAvailableExamples(){

        List<WebElement> appearedList = driver.findElements(By.cssSelector("div[id='content'] ul li a"));
        System.out.println(" There are total " + "(" + appearedList.size() + ")" +  " Available Examples seen as below ");
        System.out.println("\n");

        for (int i=0; i <appearedList.size();i++){

            WebElement nameOfList = appearedList.get(i);
            String namesOfExamplesAppeared = nameOfList.getAttribute("innerHTML");
            System.out.println("The available examples are " + "(" + namesOfExamplesAppeared + ")" );
            utils.waitForSeconds(3);
        }
    }

    public void clickFormAuthintocation(){
      formAuthintication.click();
      utils.waitForSeconds(2);
    }
    public void clickDynamicControls(){
        dynamicControls.click();
        utils.waitForSeconds(2);
    }
}
