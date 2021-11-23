package onboarding;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyWelcomePageBase;
import onboarding.utils.TimeConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginVerificationTest extends BaseTest {

    private static final String NAME = "Danylo";
    private static final String PASSWORD = "{crypt:dgcy+aVh3mVD7T7LrBocfA==}";

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testLoginFeature(){
        SoftAssert softAssert = new SoftAssert();
        MyWelcomePageBase welcomePage = initPage(getDriver(), MyWelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(TimeConstants.FIVE_SECONDS), "Welcome Page isn't opened");
        MyLoginPageBase loginPage = welcomePage.clickNextBtn();
        Assert.assertTrue(loginPage.isPageOpened(TimeConstants.FIVE_SECONDS), "Login Page isn't opened");
        softAssert.assertTrue(loginPage.isLoginBtnPresent(), "Login button isn't present");
        softAssert.assertTrue(loginPage.isNameFieldPresent(), "Name field isn't present");
        softAssert.assertTrue(loginPage.isPasswordFieldPresent(), "Password field isn't present");
        softAssert.assertTrue(loginPage.isRadioMaleBtnPresent(), "Radio Male isn't present");
        softAssert.assertTrue(loginPage.isRadioFemaleBtnPresent(), "Radio Female isn't present");
        softAssert.assertTrue(loginPage.isAgreeCheckboxPresent(),
                "Agree for terms checkbox isn't present");
        softAssert.assertFalse(loginPage.isRadioMaleBtnChecked(),
                "Radio Male is checked when it shouldn't be");
        softAssert.assertFalse(loginPage.isRadioFemaleBtnChecked(),
                "Radio Female is checked when it shouldn't be");
        softAssert.assertFalse(loginPage.isAgreeCheckboxChecked(),
                "Agree Checkbox is checked when it shouldn't be");
        loginPage.typeName(NAME);
        loginPage.typePassword(PASSWORD);
        softAssert.assertTrue(loginPage.isNameTyped(), "Name isn't typed correctly");
        softAssert.assertTrue(loginPage.isPasswordTyped(), "Password isn't typed correctly");
        loginPage.chooseMaleRadioBtn();
        softAssert.assertTrue(loginPage.isRadioMaleBtnChecked(),
                "Radio male isn't checked when it should be");
        loginPage.checkAgreeForTerms();
        softAssert.assertTrue(loginPage.isAgreeCheckboxChecked(),
                "Agree Checkbox isn't checked when it should be");
        MyCarinaDescriptionPageBase carinaDescriptionPage = loginPage.clickLoginBtn();
        Assert.assertTrue(carinaDescriptionPage.isPageOpened(TimeConstants.FIVE_SECONDS),
                "Carina description page isn't opened");
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void loginServiceVerification(){
        SoftAssert softAssert = new SoftAssert();
        MyWelcomePageBase welcomePage = initPage(getDriver(), MyWelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(TimeConstants.FIVE_SECONDS), "Welcome Page isn't opened");
        welcomePage.clickNextBtn();
        MyCarinaDescriptionPageBase carinaDescriptionPage = loginService.login();
        Assert.assertTrue(carinaDescriptionPage.isPageOpened(TimeConstants.FIVE_SECONDS),
                "Carina description page isn't opened (first login)");
        MyLoginPageBase loginPage = loginService.logout();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page isn't opened (first logout)");
        loginService.clearFields();
        softAssert.assertFalse(loginPage.isAgreeCheckboxChecked(),
                "Agree Checkbox is checked when it shouldn't be");
        softAssert.assertFalse(loginPage.isAgreeCheckboxChecked(),
                "Agree Checkbox is checked when it shouldn't be");
        carinaDescriptionPage = loginService.login(NAME, PASSWORD);
        Assert.assertTrue(carinaDescriptionPage.isPageOpened(TimeConstants.FIVE_SECONDS),
                "Carina description page isn't opened (second login)");
        loginPage = loginService.logout();
        Assert.assertTrue(loginPage.isPageOpened(TimeConstants.FIVE_SECONDS),
                "Login page isn't opened (second logout)");
        loginService.clearFields();
        softAssert.assertFalse(loginPage.isAgreeCheckboxChecked(),
                "Agree Checkbox is checked when it shouldn't be");
        carinaDescriptionPage = loginService.login(users.get(0));
        Assert.assertTrue(carinaDescriptionPage.isPageOpened(TimeConstants.FIVE_SECONDS),
                "Carina description page isn't opened (third login)");
        softAssert.assertAll();
    }

}
