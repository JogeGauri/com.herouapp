package venntro.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Gauri on 22/02/2017.
 */
public class BaseMain {

    public BaseMain(){
        PageFactory.initElements(driver,this);
    }

    public static WebDriver driver;

    public void openBrowser() throws IOException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
        properties.load(fileInputStream);

        System.setProperty("webdriver.chromedriver.driver", "cromedriver.exe");
        System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");

        String url = properties.getProperty("url");
        String browser = properties.getProperty("browser");


        if ("chrome".matches(browser)) {
            driver = new ChromeDriver();
        }
        else if ("firefox".matches(browser))
        {
            driver = new FirefoxDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void closeBrowser(){
        driver.quit();
    }
}
