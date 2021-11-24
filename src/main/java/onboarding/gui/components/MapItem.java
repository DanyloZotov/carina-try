package onboarding.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import onboarding.utils.TimeConstants;
import org.mozilla.javascript.tools.debugger.Dim;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MapItem extends AbstractUIObject {

    @FindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]")
    private ExtendedWebElement map;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Zoom in\"]")
    private ExtendedWebElement zoomInBtn;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Zoom out\"]")
    private ExtendedWebElement zoomOutBtn;

    public MapItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isMapPresent() {
        return map.isPresent(TimeConstants.TWO_SECONDS);
    }

    public boolean isZoomInBtnPresent() {
        return zoomInBtn.isPresent(TimeConstants.TWO_SECONDS);
    }

    public boolean isZoomOutBtnPresent() {
        return zoomOutBtn.isPresent(TimeConstants.TWO_SECONDS);
    }

    public Point getZoomInBtnLocation() {
        return zoomInBtn.getLocation();
    }

    public Point getZoomOutBtnLocation() {
        return zoomOutBtn.getLocation();
    }

    public Dimension getZoomInBtnSize(){
        return zoomInBtn.getSize();
    }

    public Dimension getZoomOutBtnSize(){
        return  zoomOutBtn.getSize();
    }


}
