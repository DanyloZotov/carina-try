package onboarding.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyCarinaDescriptionPageBase.class)
public class MyCarinaDescriptionPage extends MyCarinaDescriptionPageBase {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private ExtendedWebElement leftMenu;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text = 'Map']")
    private ExtendedWebElement mapLink;

    public MyCarinaDescriptionPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isPageOpened(20);
    }

    @Override
    public boolean isPageOpened(long timeout) {
        return leftMenu.isElementPresent(timeout);
    }


}
