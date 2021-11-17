package onboarding.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import org.openqa.selenium.WebDriver;

public abstract class MyLoginPageBase extends AbstractPage {

    public MyLoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isLoginBtnActive(long timeout);

    public abstract boolean isLoginBtnPresent(long timeout);

    public abstract boolean isRadioMaleBtnPresent(long timeout);

    public abstract boolean isRadioFemaleBtnPresent(long timeout);

    public abstract boolean isAgreeCheckboxPresent(long timeout);

    public abstract boolean isNameFieldPresent(long timeout);

    public abstract boolean isPasswordFieldPresent(long timeout);

    public abstract boolean isRadioMaleBtnChecked();

    public abstract boolean isRadioFemaleBtnChecked();

    public abstract boolean isAgreeCheckboxChecked();

    public abstract void typeName(String name);

    public abstract void typePassword(String password);

    public abstract boolean isNameTyped(String name);

    public abstract boolean isPasswordTyped(String password);

    public abstract void chooseMaleRadioBtn();

    public abstract void checkAgreeForTerms();

    public abstract MyCarinaDescriptionPageBase clickLoginBtn();

    public abstract boolean isLoginBtnActive();

    public abstract MyCarinaDescriptionPageBase login(String name, String password);
}
