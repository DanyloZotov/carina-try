package onboarding.pages.ios;

import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyLoginPageBase.class)
public class MyLoginPage extends MyLoginPageBase {

    public MyLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isLoginBtnPresent() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isRadioMaleBtnPresent() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isRadioFemaleBtnPresent() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isAgreeCheckboxPresent() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isNameFieldPresent() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isPasswordFieldPresent() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isRadioMaleBtnChecked() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isRadioFemaleBtnChecked() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isAgreeCheckboxChecked() {
        throw new NotImplementedException();
    }

    @Override
    public void typeName(String name) {
        throw new NotImplementedException();
    }

    @Override
    public void typePassword(String password) {
        throw new NotImplementedException();
    }

    @Override
    public boolean isNameTyped() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isPasswordTyped() {
        throw new NotImplementedException();
    }

    @Override
    public void chooseMaleRadioBtn() {
        throw new NotImplementedException();
    }

    @Override
    public void checkAgreeForTerms() {
        throw new NotImplementedException();
    }

    @Override
    public MyCarinaDescriptionPageBase clickLoginBtn() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isLoginBtnActive() {
        throw new NotImplementedException();
    }

    @Override
    public MyCarinaDescriptionPageBase login(String name, String password) {
        throw new NotImplementedException();
    }
}
