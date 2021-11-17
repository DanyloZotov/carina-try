package onboarding.utils;

import com.qaprosoft.carina.core.foundation.crypto.CryptoConsole;

public class CarinaCrypto {

        public static void main(String[] args) {
            CryptoConsole.main(new String[]{"-encrypt", "-string", "xxxxxxxxxx", "-key_file", "src/main/resources/crypto.key"});
            CryptoConsole.main(new String[]{"-decrypt", "-string", "/oB5lxRwxbxmCL4A47sCgQ==", "-key_file", "src/main/resources/crypto.key"});
        }
}
