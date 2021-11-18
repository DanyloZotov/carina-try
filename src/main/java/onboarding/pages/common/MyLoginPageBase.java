package onboarding.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MyLoginPageBase extends AbstractPage {

    public MyLoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isLoginBtnActive();

    public abstract boolean isLoginBtnPresent();

    public abstract boolean isRadioMaleBtnPresent();

    public abstract boolean isRadioFemaleBtnPresent();

    public abstract boolean isAgreeCheckboxPresent();

    public abstract boolean isNameFieldPresent();

    public abstract boolean isPasswordFieldPresent();

    public abstract boolean isRadioMaleBtnChecked();

    public abstract boolean isRadioFemaleBtnChecked();

    public abstract boolean isAgreeCheckboxChecked();

    public abstract void typeName(String name);

    public abstract void typePassword(String password);

    public abstract boolean isNameTyped();

    public abstract boolean isPasswordTyped();

    public abstract void chooseMaleRadioBtn();

    public abstract void checkAgreeForTerms();

    public abstract MyCarinaDescriptionPageBase clickLoginBtn();

    public abstract MyCarinaDescriptionPageBase login(String name, String password);
}
