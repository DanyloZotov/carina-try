package onboarding.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.utils.TimeConstants;
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
        return isPageOpened(TimeConstants.EXPLICIT_TIMEOUT);
    }

    @Override
    public boolean isPageOpened(long timeout) {
        return loginButton.isElementPresent(timeout);
    }

    @Override
    public boolean isLoginBtnActive() {
        return loginButton.isClickable(TimeConstants.WAIT_INTERVAL);
    }

    @Override
    public boolean isLoginBtnPresent(){
        return loginButton.isElementPresent(TimeConstants.WAIT_INTERVAL);
    }

    @Override
    public boolean isRadioMaleBtnPresent() {
        return radioMale.isElementPresent(TimeConstants.WAIT_INTERVAL);
    }

    @Override
    public boolean isRadioFemaleBtnPresent() {
        return radioFemale.isElementPresent(TimeConstants.WAIT_INTERVAL);
    }

    @Override
    public boolean isAgreeCheckboxPresent() {
        return agreeForTermsCheckbox.isElementPresent(TimeConstants.WAIT_INTERVAL);
    }

    @Override
    public boolean isNameFieldPresent() {
        return nameField.isElementPresent(TimeConstants.WAIT_INTERVAL);
    }

    @Override
    public boolean isPasswordFieldPresent() {
        return passwordField.isElementPresent(TimeConstants.WAIT_INTERVAL);
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
    public boolean isNameTypedCorrectly(String name){
        return nameField.getText().equals(name);
    }

    @Override
    public boolean isPasswordTypedCorrectly(String password){
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
        radioMale.click(TimeConstants.WAIT_INTERVAL);
    }

    @Override
    public void checkAgreeForTerms() {
        agreeForTermsCheckbox.click(TimeConstants.WAIT_INTERVAL);
    }

    @Override
    public MyCarinaDescriptionPageBase clickLoginBtn() {
        loginButton.click(TimeConstants.WAIT_INTERVAL);
        return initPage(getDriver(), MyCarinaDescriptionPageBase.class);
    }

    @Override
    public MyCarinaDescriptionPageBase login(String name, String password) {
        nameField.type(name);
        passwordField.type(password);
        radioMale.click(TimeConstants.WAIT_INTERVAL);
        agreeForTermsCheckbox.click(TimeConstants.WAIT_INTERVAL);
        loginButton.click(TimeConstants.WAIT_INTERVAL);
        return initPage(getDriver(), MyCarinaDescriptionPageBase.class);
    }

}
