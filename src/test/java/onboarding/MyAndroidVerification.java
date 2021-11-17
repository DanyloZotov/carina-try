package onboarding;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import onboarding.pages.android.MyCarinaDescriptionPage;
import onboarding.pages.android.MyLoginPage;
import onboarding.pages.android.MyMapsPage;
import onboarding.pages.android.MyWelcomePage;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAndroidVerification implements IAbstractTest, IMobileUtils {

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testLoginPage(){
        MyWelcomePage welcomePage = new MyWelcomePage(getDriver());
        MyLoginPageBase loginPage = welcomePage.clickNextBtn();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page hasn't been opened :<");
    }

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testSignUpBtn(){
        MyWelcomePage welcomePage = new MyWelcomePage(getDriver());
        MyLoginPageBase loginPage = welcomePage.clickNextBtn();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page hasn't been opened :<");
        Assert.assertFalse(loginPage.isLoginBtnActive(), "Login button is active, but it should not be");
    }

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testGoogleMapFeature(){
        MyWelcomePage welcomePage = new MyWelcomePage(getDriver());
        MyLoginPageBase loginPage = welcomePage.clickNextBtn();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page hasn't been opened :<");
        //MyCarinaDescriptionPageBase carinaDescriptionPage = loginPage.login();
        //Assert.assertTrue(carinaDescriptionPage.isPageOpened(), "Carina description page hasn't been opened");
        //MyMapsPage mapsPage = carinaDescriptionPage.openMapsPage();
        //Assert.assertTrue(mapsPage.isPageOpened(), "Maps page hasn't been opened");
        //Assert.assertTrue(mapsPage.checkGoogleMap(), "Map is not visible");
    }

}
