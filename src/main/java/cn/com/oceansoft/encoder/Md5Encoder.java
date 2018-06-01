package cn.com.oceansoft.encoder;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by zhangxh on 2018/5/24.
 */
public class Md5Encoder implements PasswordEncoder {
    private static final String SECRET="cas";

    public String encode(CharSequence password) {
        return DigestUtils.md5Hex(password+SECRET);
    }

    public boolean matches(CharSequence rawPassword, String encodePassword) {
        return this.encode(rawPassword).equals(encodePassword);
    }

}
