package onboarding.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyWelcomePageBase;
import onboarding.utils.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

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
        return isPageOpened(TimeConstants.EXPLICIT_TIMEOUT);
    }
    @Override
    public boolean isPageOpened(long timeout) {
        return title.isElementPresent(timeout);
    }

    public MyLoginPageBase clickNextBtn() {
        nextButton.click(TimeConstants.ONE_SECOND);
        return initPage(getDriver(), MyLoginPageBase.class);
    }
}
