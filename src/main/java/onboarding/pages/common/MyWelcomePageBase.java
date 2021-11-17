package onboarding.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;

public abstract class MyWelcomePageBase extends AbstractPage {

    public MyWelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract MyLoginPageBase clickNextBtn();
}
