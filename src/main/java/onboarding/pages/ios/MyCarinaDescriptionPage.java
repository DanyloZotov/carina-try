package onboarding.pages.ios;

import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import onboarding.gui.components.compare.MenuItem;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import org.openqa.selenium.WebDriver;

import java.util.List;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyLoginPageBase.class)
public class MyCarinaDescriptionPage extends MyCarinaDescriptionPageBase {

    public MyCarinaDescriptionPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openMenu(){ throw new NotImplementedException(); }

    @Override
    public List<MenuItem> getMenuItems(){
        throw new NotImplementedException();
    }

    @Override
    public String getMenuItemNameByOrder(int order){
        throw new NotImplementedException();
    }


}
