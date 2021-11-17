package onboarding.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyLoginPageBase.class)
public class MyLoginPage extends MyLoginPageBase {

    @FindBy(id = "login_button")
    ExtendedWebElement loginButton;

    @FindBy(id = "name")
    ExtendedWebElement nameField;

    @FindBy(id = "password")
    ExtendedWebElement passwordField;

    @FindBy(id = "radio_male")
    ExtendedWebElement radioMale;

    @FindBy(id = "radio_female")
    ExtendedWebElement radioFemale;

    @FindBy(id = "checkbox")
    ExtendedWebElement agreeForTermsCheckbox;

    public MyLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isPageOpened(20);
    }

    @Override
    public boolean isPageOpened(long timeout) {
        return loginButton.isElementPresent(timeout);
    }

    @Override
    public boolean isLoginBtnActive(long timeout) {
        return loginButton.isClickable(timeout);
    }

    @Override
    public boolean isLoginBtnPresent(long timeout){
        return loginButton.isElementPresent(timeout);
    }

    @Override
    public boolean isRadioMaleBtnPresent(long timeout) {
        return radioMale.isElementPresent(timeout);
    }

    @Override
    public boolean isRadioFemaleBtnPresent(long timeout) {
        return radioFemale.isElementPresent(timeout);
    }

    @Override
    public boolean isAgreeCheckboxPresent(long timeout) {
        return agreeForTermsCheckbox.isElementPresent(timeout);
    }

    @Override
    public boolean isNameFieldPresent(long timeout) {
        return nameField.isElementPresent(timeout);
    }

    @Override
    public boolean isPasswordFieldPresent(long timeout) {
        return passwordField.isElementPresent(timeout);
    }

    @Override
    public boolean isRadioMaleBtnChecked(){
        return radioMale.isChecked();
    }

    @Override
    public boolean isRadioFemaleBtnChecked(){
        return radioFemale.isChecked();
    }

    @Override
    public boolean isAgreeCheckboxChecked(){
        return agreeForTermsCheckbox.isChecked();
    }

    @Override
    public boolean isNameTyped(String name){
        return nameField.getText().equals(name);
    }

    @Override
    public boolean isPasswordTyped(String password){
        return passwordField.getText().equals(password);
    }

    @Override
    public void typeName(String text) {
        nameField.type(text);
    }

    @Override
    public void typePassword(String text) {
        passwordField.type(text);
    }

    @Override
    public void chooseMaleRadioBtn() {
        radioMale.click();
    }

    @Override
    public void checkAgreeForTerms() {
        agreeForTermsCheckbox.click();
    }

    @Override
    public MyCarinaDescriptionPageBase clickLoginBtn() {
        loginButton.click();
        return initPage(getDriver(), MyCarinaDescriptionPageBase.class);
    }

    @Override
    public boolean isLoginBtnActive() {
        return false;
    }

    @Override
    public MyCarinaDescriptionPageBase login(String name, String password) {
        nameField.type(name);
        passwordField.type(password);
        radioMale.click();
        agreeForTermsCheckbox.click();
        loginButton.click();
        return initPage(getDriver(), MyCarinaDescriptionPageBase.class);
    }

}
