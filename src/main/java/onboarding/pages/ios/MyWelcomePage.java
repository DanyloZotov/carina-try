package onboarding.pages.ios;

import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyWelcomePageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyWelcomePageBase.class)
public class MyWelcomePage extends MyWelcomePageBase {


    public MyWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MyLoginPageBase clickNextBtn() {
        throw new NotImplementedException();
    }
}
