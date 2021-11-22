package onboarding.services;

import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory;
import onboarding.models.User;
import onboarding.pages.android.MyCarinaDescriptionPage;
import onboarding.pages.android.MyLoginPage;
import onboarding.pages.common.MyCarinaDescriptionPageBase;
import onboarding.pages.common.MyLoginPageBase;
import onboarding.pages.common.MyWelcomePageBase;
import onboarding.utils.TimeConstants;
import org.testng.Assert;

public class LoginService implements ICustomTypePageFactory, IMobileUtils {

    public MyCarinaDescriptionPageBase login(){
        MyLoginPageBase myLoginPage = initPage(getDriver(), MyLoginPageBase.class);
        myLoginPage.typeName("Danylo");
        myLoginPage.typePassword("{crypt:dgcy+aVh3mVD7T7LrBocfA==}");
        myLoginPage.chooseMaleRadioBtn();
        myLoginPage.checkAgreeForTerms();
        return myLoginPage.clickLoginBtn();
    }

    public MyCarinaDescriptionPageBase login(String name, String password){
        MyLoginPageBase myLoginPage = initPage(getDriver(), MyLoginPageBase.class);
        myLoginPage.typeName(name);
        myLoginPage.typePassword(password);
        myLoginPage.chooseMaleRadioBtn();
        myLoginPage.checkAgreeForTerms();
        return myLoginPage.clickLoginBtn();
    }

    public MyCarinaDescriptionPageBase login (User user){
        MyLoginPageBase myLoginPage = initPage(getDriver(), MyLoginPageBase.class);
        myLoginPage.typeName(user.getName());
        myLoginPage.typePassword(user.getPassword());
        if (user.getGender() == User.Gender.MALE) {
            myLoginPage.chooseMaleRadioBtn();
        } else {
            myLoginPage.chooseFemaleRadioBtn();
        }
        myLoginPage.checkAgreeForTerms();
        return myLoginPage.clickLoginBtn();
    }

    public MyLoginPageBase logout(){
        swipe(0, 100, 100, 100, 100);
        return initPage(getDriver(), MyLoginPageBase.class);
    }

    public void clearFields(){
        MyLoginPageBase myLoginPage = initPage(getDriver(), MyLoginPageBase.class);
        myLoginPage.typeName("");
        myLoginPage.typePassword("");
        myLoginPage.checkAgreeForTerms();
    }

}
