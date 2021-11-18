package onboarding.utils;


import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class TimeConstants {

    public static final long EXPLICIT_TIMEOUT = Configuration.getLong(Configuration.Parameter.EXPLICIT_TIMEOUT);
    public static final long RETRY_INTERVAL = Configuration.getLong(Configuration.Parameter.RETRY_INTERVAL);
    public static final long WAIT_INTERVAL = 5;
}
