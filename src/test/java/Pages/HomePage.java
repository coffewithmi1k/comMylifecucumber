package Pages;

import Utils.Config;
import org.junit.Assert;

public class HomePage extends Config {

    public void verifyHomePageOpened() {
        Assert.assertTrue(driver.getTitle().contains("Automatically align columns in Cucumber examples – IDEs Support (IntelliJ Platform) | JetBrains"));
    }

}
