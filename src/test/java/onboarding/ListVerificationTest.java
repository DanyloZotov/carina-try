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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ListVerificationTest extends BaseTest {

    @BeforeClass
    public void enterCarinaDescriptionPage(){
        MyWelcomePageBase welcomePage = initPage(getDriver(), MyWelcomePageBase.class);
        welcomePage.clickNextBtn();
        loginService.login(users.get(0));
    }

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    @Parameters({"name", "password"})
    public void carinaLeftMenuTest(String name, String password){
        SoftAssert softAssert = new SoftAssert();
        MyCarinaDescriptionPageBase carinaDescriptionPage = initPage(getDriver(), MyCarinaDescriptionPageBase.class);
        carinaDescriptionPage.openMenu();
        List<MenuItem> menuItems = carinaDescriptionPage.getMenuItems();
        for(MenuItem.MenuItemTypes type:MenuItem.MenuItemTypes.values()){
            softAssert.assertEquals(menuItems.get(type.ordinal()).getType(), type);
        }
        softAssert.assertAll();
    }

    public void anotherCarinaLeftMenuTest(){
        SoftAssert softAssert = new SoftAssert();
        MyCarinaDescriptionPageBase carinaDescriptionPage = initPage(getDriver(), MyCarinaDescriptionPageBase.class);
        carinaDescriptionPage.openMenu();
        List<MenuItem> menuItems = carinaDescriptionPage.getMenuItems();
        softAssert.assertEquals(menuItems.size(), 4);
        softAssert.assertEquals(carinaDescriptionPage.getMenuItemNameByOrder(0), "Web View");
        softAssert.assertEquals(carinaDescriptionPage.getMenuItemNameByOrder(1), "Charts");
        softAssert.assertEquals(carinaDescriptionPage.getMenuItemNameByOrder(2), "Map");
        softAssert.assertEquals(carinaDescriptionPage.getMenuItemNameByOrder(3), "UI Elements");
        softAssert.assertAll();
    }
}