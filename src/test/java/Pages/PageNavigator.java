package Pages;

import Utils.Config;

public class PageNavigator extends Config {

    public HomePage openHomePage() {
        driver.get("Http:automationpractice.com/index.php");
        return new HomePage();
    }
}
