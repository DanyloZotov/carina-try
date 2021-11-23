package onboarding.pages.ios;

import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import onboarding.gui.components.compare.MenuItem;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyMapPageBase;
import org.openqa.selenium.WebDriver;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyCarinaDescriptionPageBase.class)
public class MyCarinaDescriptionPage extends MyCarinaDescriptionPageBase {

    public MyCarinaDescriptionPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openMenu() {
        throw new NotImplementedException();
    }

    @Override
    public List<MenuItem> getMenuItems() {
        throw new NotImplementedException();
    }

    @Override
    public String getMenuItemNameByOrder(int index) {
        throw new NotImplementedException();
    }

    @Override
    public MyMapPageBase clickMapMenuItem() {
        throw new NotImplementedException();
    }

    @Override
    public ExtendedWebElement getMenuElementByName(String name) {
        throw new NotImplementedException();
    }

}
