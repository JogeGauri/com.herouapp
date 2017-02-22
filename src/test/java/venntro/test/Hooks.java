package venntro.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * Created by Gauri on 22/02/2017.
 */
public class Hooks {

    BaseMain baseMain = new BaseMain();

    @Before
    public void setUp() throws IOException {
        baseMain.openBrowser();
    }

    @After
    public void tearDown() {
        baseMain.closeBrowser();

    }
}
