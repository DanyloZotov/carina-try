package onboarding.pages.android;

import com.mongodb.util.TimeConstants;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyWelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyWelcomePageBase.class)
public class MyWelcomePage extends MyWelcomePageBase {

    @FindBy(id = "carina_logo")
    private ExtendedWebElement title;

    @FindBy(id = "next_button")
    private ExtendedWebElement nextButton;

    public MyWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isPageOpened(20);
    }

    @Override
    public boolean isPageOpened(long timeout) {
        return title.isElementPresent(timeout);
    }

    public MyLoginPageBase clickNextBtn() {
        nextButton.click();
        return initPage(getDriver(), MyLoginPageBase.class);
    }
}
