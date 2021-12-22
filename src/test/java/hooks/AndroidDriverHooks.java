package hooks;

import drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHooks {
    @Before(value = "@android")
    public void beforeScenario(){
        AndroidDriverInit.initialize();
    }

    @After(value = "@android")
    public void afterScenario(){
        AndroidDriverInit.quit();
    }
}
