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
    public void carinaLeftMenuTest(){
        SoftAssert softAssert = new SoftAssert();
        MyCarinaDescriptionPageBase carinaDescriptionPage = initPage(getDriver(), MyCarinaDescriptionPageBase.class);
        carinaDescriptionPage.openMenu();
        List<MenuItem> menuItems = carinaDescriptionPage.getMenuItems();
        for(MenuItem.MenuItemTypes type:MenuItem.MenuItemTypes.values()){
            softAssert.assertEquals(menuItems.get(type.ordinal()).getType(), type,
                    "Expected name of list menu don't mach actual"+type.getType());
        }
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void anotherCarinaLeftMenuTest(){
        SoftAssert softAssert = new SoftAssert();
        MyCarinaDescriptionPageBase carinaDescriptionPage = initPage(getDriver(), MyCarinaDescriptionPageBase.class);
        carinaDescriptionPage.openMenu();
        List<MenuItem> menuItems = carinaDescriptionPage.getMenuItems();
        softAssert.assertEquals(menuItems.size(), 4);
        softAssert.assertEquals(carinaDescriptionPage.getMenuItemNameByOrder(0), "Web View",
                "Item name is not Web View");
        softAssert.assertEquals(carinaDescriptionPage.getMenuItemNameByOrder(1), "Charts",
                "Item name is not Charts");
        softAssert.assertEquals(carinaDescriptionPage.getMenuItemNameByOrder(2), "Map",
                "Item name is not Map");
        softAssert.assertEquals(carinaDescriptionPage.getMenuItemNameByOrder(3), "UI Elements",
                "Item name is not UI Elements");
        softAssert.assertAll();
    }
}