package onboarding.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import onboarding.gui.components.MapItem;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyMapPageBase;
import onboarding.utils.TimeConstants;
import org.mozilla.javascript.tools.debugger.Dim;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.xml.stream.Location;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyMapPageBase.class)
public class MyMapPage extends MyMapPageBase {

    @FindBy(id="map")
    private MapItem googleMap;

    public MyMapPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isPageOpened(TimeConstants.EXPLICIT_TIMEOUT);
    }

    @Override
    public boolean isPageOpened(long timeout) {
        return googleMap.isMapPresent();
    }

    @Override
    public boolean isMapPresent(){
        return googleMap.isMapPresent();
    }

    @Override
    public boolean isZoomInBtnPresent() {
        return googleMap.isZoomInBtnPresent();
    }

    @Override
    public boolean isZoomOutBtnPresent() {
        return googleMap.isZoomOutBtnPresent();
    }

    @Override
    public boolean verifyZoomInDirectlyAboveZoomOut() {
        Point zoomInLocation = googleMap.getZoomInBtnLocation();
        Point zoomOutLocation = googleMap.getZoomOutBtnLocation();
        Dimension zoomInSize = googleMap.getZoomInBtnSize();
        return ((zoomOutLocation.y-zoomInLocation.y)==zoomInSize.height)&&
                (zoomInLocation.x==zoomOutLocation.x);
    }


}
