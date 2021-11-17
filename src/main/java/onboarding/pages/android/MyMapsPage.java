package onboarding.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MyMapsPage extends AbstractPage {

    @FindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]")
    private ExtendedWebElement googleMap;

    public MyMapsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened(){
        return googleMap.isElementPresent();
    }

    public boolean checkGoogleMap(){
        return googleMap.isVisible();
    }
}
