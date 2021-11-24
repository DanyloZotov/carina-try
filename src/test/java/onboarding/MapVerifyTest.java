package onboarding;

import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.zebrunner.agent.core.annotation.TestLabel;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyMapPageBase;
import onboarding.pages.common.MyWelcomePageBase;
import onboarding.utils.TimeConstants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MapVerifyTest extends BaseTest{

    @BeforeClass
    public void enterCarinaDescriptionPage(){
        MyWelcomePageBase welcomePage = initPage(getDriver(), MyWelcomePageBase.class);
        welcomePage.clickNextBtn();
        MyCarinaDescriptionPageBase carinaDescriptionPage =loginService.login(users.get(0));
    }

    @Test
    @MethodOwner(owner = "Dan")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void mapZoomFunctionalVerify(){
        SoftAssert softAssert = new SoftAssert();

        MyCarinaDescriptionPageBase carinaDescriptionPage = initPage(getDriver(), MyCarinaDescriptionPageBase.class);
        Assert.assertTrue(carinaDescriptionPage.isPageOpened(TimeConstants.FIVE_SECONDS),
                "Carina Description Page is not opened");
        carinaDescriptionPage.openMenu();
        MyMapPageBase mapPage = carinaDescriptionPage.clickMapMenuItem();
        Assert.assertTrue(mapPage.isPageOpened(TimeConstants.FIVE_SECONDS), "Map page is not opened");
        softAssert.assertTrue(mapPage.isZoomInBtnPresent(), "Zoom In Btn is not present");
        softAssert.assertTrue(mapPage.isZoomOutBtnPresent(), "Zoom Out Btn is not present");
        softAssert.assertTrue(mapPage.verifyZoomInDirectlyAboveZoomOut(),
                "Zoom In Btn is not directly above Zoom Out Btn");

        softAssert.assertAll();
    }

}
