package onboarding.pages.ios;

import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyMapPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyMapPageBase.class)
public class MyMapPage extends MyMapPageBase {
    public MyMapPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isMapPresent() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isZoomInBtnPresent() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isZoomOutBtnPresent() {
        throw new NotImplementedException();
    }

    @Override
    public boolean verifyZoomInDirectlyAboveZoomOut() {
        throw new NotImplementedException();
    }
}
