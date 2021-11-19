package onboarding;


import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import onboarding.models.User;
import onboarding.services.LoginService;
import onboarding.utils.StringGenerator;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;
import java.util.Random;

public class BaseTest implements IAbstractTest, IMobileUtils {

    protected LoginService loginService = new LoginService();

    protected ArrayList<User> users = new ArrayList<>();

    @BeforeSuite
    public void createUsers() {
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int g = random.nextInt(2);
            User.Gender gender = g == 0 ? User.Gender.MALE : User.Gender.FEMALE;
            User user = new User(StringGenerator.generateAlphabeticalString(10),
                    StringGenerator.generateCryptedAlphbeticalNumericalString(10),
                    gender);
            users.add(user);
        }
    }

}
