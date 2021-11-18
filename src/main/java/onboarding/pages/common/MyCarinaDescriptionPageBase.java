package onboarding.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import onboarding.gui.components.compare.MenuItem;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class MyCarinaDescriptionPageBase extends AbstractPage {

    public MyCarinaDescriptionPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract List<MenuItem> getMenuItems();

}
