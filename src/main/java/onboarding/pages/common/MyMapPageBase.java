package onboarding.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MyMapPageBase extends AbstractPage {
    public MyMapPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isMapPresent();

    public abstract boolean isZoomInBtnPresent();

    public abstract boolean isZoomOutBtnPresent();

    public abstract boolean verifyZoomInDirectlyAboveZoomOut();

}