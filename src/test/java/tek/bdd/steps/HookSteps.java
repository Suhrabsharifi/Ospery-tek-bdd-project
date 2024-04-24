package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.zh_tw.並且;
import tek.bdd.utility.SeleniumUtilities;

public class HookSteps extends SeleniumUtilities {
    @Before
    public void initiateTes(){
        OpenBrowser();

    }
    @After
    public void colesingTest(){
        getDriver().quit();
    }
}
