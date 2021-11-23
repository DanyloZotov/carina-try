package onboarding.pages.common;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import onboarding.gui.components.compare.MenuItem;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class MyCarinaDescriptionPageBase extends AbstractPage {

    public MyCarinaDescriptionPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void openMenu();

    public abstract List<MenuItem> getMenuItems();
    public abstract String getMenuItemNameByOrder(int index);
    public abstract MyMapPageBase clickMapMenuItem();
    public abstract ExtendedWebElement getMenuElementByName(String name);
}
