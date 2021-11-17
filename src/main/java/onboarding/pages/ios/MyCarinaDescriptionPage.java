package onboarding.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyLoginPageBase.class)
public class MyCarinaDescriptionPage extends MyCarinaDescriptionPageBase {

    public MyCarinaDescriptionPage(WebDriver driver) {
        super(driver);
    }


}
