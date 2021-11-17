package onboarding.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.solvd.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyWelcomePageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyWelcomePageBase.class)
public class MyWelcomePage extends MyWelcomePageBase {

    private static final String THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID = "This method is not yet implemented for iOS";

    public MyWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MyLoginPageBase clickNextBtn() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }
}
