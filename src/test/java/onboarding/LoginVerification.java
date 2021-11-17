package onboarding;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.crypto.CryptoConsole;
import com.qaprosoft.carina.core.foundation.crypto.CryptoTool;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyWelcomePageBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginVerification implements IAbstractTest, IMobileUtils {

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    @Parameters({"timeout", "name", "password"})
    public void TestLoginFeature(long timeout, String name, String password){
        SoftAssert softAssert = new SoftAssert();
        CryptoTool cryptoTool = new CryptoTool();
        password = cryptoTool.decrypt(password);
        MyWelcomePageBase welcomePage = initPage(getDriver(), MyWelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(timeout), "Welcome Page isn't opened");
        MyLoginPageBase loginPage = welcomePage.clickNextBtn();
        Assert.assertTrue(loginPage.isPageOpened(timeout), "Login Page isn't opened");
        softAssert.assertTrue(loginPage.isLoginBtnPresent(timeout), "Login button isn't present");
        softAssert.assertTrue(loginPage.isNameFieldPresent(timeout), "Name field isn't present");
        softAssert.assertTrue(loginPage.isPasswordFieldPresent(timeout), "Password field isn't present");
        softAssert.assertTrue(loginPage.isRadioMaleBtnPresent(timeout), "Radio Male isn't present");
        softAssert.assertTrue(loginPage.isRadioFemaleBtnPresent(timeout), "Radio Female isn't present");
        softAssert.assertTrue(loginPage.isAgreeCheckboxPresent(timeout),
                "Agree for terms checkbox isn't present");
        softAssert.assertFalse(loginPage.isRadioMaleBtnChecked(),
                "Radio Male is checked when it shouldn't be");
        softAssert.assertFalse(loginPage.isRadioFemaleBtnChecked(),
                "Radio Female is checked when it shouldn't be");
        softAssert.assertFalse(loginPage.isAgreeCheckboxChecked(),
                "Agree Checkbox is checked when it shouldn't be");
        softAssert.assertAll();
        loginPage.typeName(name);
        loginPage.typePassword(password);
        softAssert.assertTrue(loginPage.isNameTyped(name), "Name isn't typed correctly");
        softAssert.assertTrue(loginPage.isPasswordTyped(password), "Password isn't typed correctly");
        loginPage.chooseMaleRadioBtn();
        softAssert.assertTrue(loginPage.isRadioMaleBtnChecked(),
                "Radio male isn't checked when it should be");
        loginPage.checkAgreeForTerms();
        softAssert.assertTrue(loginPage.isAgreeCheckboxChecked(),
                "Agree Checkbox isn't checked when it should be");
        softAssert.assertAll();
        MyCarinaDescriptionPageBase carinaDescriptionPage = loginPage.clickLoginBtn();
        Assert.assertTrue(carinaDescriptionPage.isPageOpened(timeout),
                "Carina description page isn't opened");
    }

}
