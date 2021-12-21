package hooks;

import drivers.AndroidDriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHooks {
    @Before
    public void beforeScenario(){
        AndroidDriverInit.initialize();
    }

    @After
    public void afterScenario(){
        AndroidDriverInit.quit();
    }
}
