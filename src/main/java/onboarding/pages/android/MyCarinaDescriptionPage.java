package onboarding.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import onboarding.gui.components.compare.MenuItem;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyMapPageBase;
import onboarding.utils.TimeConstants;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyCarinaDescriptionPageBase.class)
public class MyCarinaDescriptionPage extends MyCarinaDescriptionPageBase {

    public static final Logger LOGGER = LogManager.getLogger(MyCarinaDescriptionPage.class);

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private ExtendedWebElement leftMenu;

    @FindBy(id="design_menu_item_text")
    private List<ExtendedWebElement> leftMenuElements;

    public MyCarinaDescriptionPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isPageOpened(TimeConstants.EXPLICIT_TIMEOUT);
    }

    @Override
    public boolean isPageOpened(long timeout) {
        return leftMenu.isElementPresent(timeout);
    }

    @Override
    public void openMenu(){
        leftMenu.click(TimeConstants.ONE_SECOND);
    }

    @Override
    public List<MenuItem> getMenuItems(){
        List<MenuItem> menuItems = new ArrayList<>();
        for(ExtendedWebElement element:leftMenuElements){
            MenuItem item = new MenuItem(element.getText());
            menuItems.add(item);
        }
        return menuItems;
    }

    @Override
    public String getMenuItemNameByOrder(int index){
        return leftMenuElements.get(index).getText();
    }

    @Override
    public ExtendedWebElement getMenuElementByName(String name){
        for(ExtendedWebElement menuElement:leftMenuElements){
            if (menuElement.getText().equals(name)){
                return menuElement;
            }
        }
        assertUIObjectNotPresent();
        return null;
    }

    @Override
    public void checkMenuElementsNames(SoftAssert softAssert) {
        softAssert.assertEquals(getMenuItemNameByOrder(0), "Web View",
                "Item name is not Web View");
        softAssert.assertEquals(getMenuItemNameByOrder(1), "Charts",
                "Item name is not Charts");
        softAssert.assertEquals(getMenuItemNameByOrder(2), "Map",
                "Item name is not Map");
        softAssert.assertEquals(getMenuItemNameByOrder(3), "UI elements",
                "Item name is not UI Elements");
    }

    @Override
    public MyMapPageBase clickMapMenuItem() {
        getMenuElementByName("Map").click();
        return initPage(getDriver(), MyMapPageBase.class);
    }

}
