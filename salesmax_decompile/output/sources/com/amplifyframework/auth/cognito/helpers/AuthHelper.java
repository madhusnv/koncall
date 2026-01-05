package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidParameterException;
import com.amplifyframework.auth.exceptions.UnknownException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p001o.id5;
import p001o.sh2;
import p001o.sq8;

/* loaded from: classes5.dex */
public class AuthHelper {
    public static final Companion Companion = new Companion(null);
    private static final String HMAC_SHA_256 = "HmacSHA256";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final String getActiveUsername(String str, String str2, String str3) {
            sq8.m48649h(str, "username");
            return str2 == null ? str3 == null ? str : str3 : str2;
        }

        public final String getHMAC_SHA_256() {
            return AuthHelper.HMAC_SHA_256;
        }

        public final String getSecretHash(String str, String str2, String str3) throws IllegalStateException, InvalidParameterException, UnknownException, NoSuchAlgorithmException, InvalidKeyException {
            if (str == null) {
                throw new InvalidParameterException(null, new Exception("user ID cannot be null"), 1, null);
            }
            if (str2 == null) {
                throw new InvalidParameterException(null, new Exception("client ID cannot be null"), 1, null);
            }
            if (str3 == null || str3.length() == 0) {
                return null;
            }
            try {
                Mac mac = Mac.getInstance(getHMAC_SHA_256());
                Charset charset = sh2.f45422b;
                byte[] bytes = str3.getBytes(charset);
                sq8.m48648g(bytes, "getBytes(...)");
                mac.init(new SecretKeySpec(bytes, getHMAC_SHA_256()));
                byte[] bytes2 = str.getBytes(charset);
                sq8.m48648g(bytes2, "getBytes(...)");
                mac.update(bytes2);
                byte[] bytes3 = str2.getBytes(charset);
                sq8.m48648g(bytes3, "getBytes(...)");
                byte[] bArrEncode = Base64.encode(mac.doFinal(bytes3), 2);
                sq8.m48648g(bArrEncode, "encode(...)");
                return new String(bArrEncode, charset);
            } catch (Exception unused) {
                throw new UnknownException(null, new Exception("errors in HMAC calculation"), 1, null);
            }
        }
    }
}
