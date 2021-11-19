package onboarding;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import onboarding.gui.components.compare.MenuItem;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyWelcomePageBase;
import onboarding.utils.TimeConstants;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ListVerificationTest extends BaseTest {

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    @Parameters({"name", "password"})
    public void carinaLeftMenuTest(String name, String password){
        SoftAssert softAssert = new SoftAssert();
        MyWelcomePageBase welcomePage = initPage(getDriver(), MyWelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(TimeConstants.WAIT_INTERVAL), "Welcome Page isn't opened");
        MyLoginPageBase loginPage = welcomePage.clickNextBtn();
        Assert.assertTrue(loginPage.isPageOpened(TimeConstants.WAIT_INTERVAL), "Login Page isn't opened");
        MyCarinaDescriptionPageBase carinaDescriptionPage = loginPage.login(name, password);
        Assert.assertTrue(carinaDescriptionPage.isPageOpened(TimeConstants.WAIT_INTERVAL));
        List<MenuItem> menuItems = carinaDescriptionPage.getMenuItems();
        for(MenuItem.MenuItemTypes type:MenuItem.MenuItemTypes.values()){
            softAssert.assertEquals(menuItems.get(type.ordinal()).getType(), type);
        }
        softAssert.assertAll();
    }

    public void anotherCarinaLeftMenuTest(){

    }
}