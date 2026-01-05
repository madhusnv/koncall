package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import com.amplifyframework.auth.cognito.exceptions.service.InvalidParameterException;
import com.amplifyframework.auth.exceptions.UnknownException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AuthHelper {
    public static final Companion Companion = new Companion(null);
    private static final String HMAC_SHA_256 = "HmacSHA256";

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final String getActiveUsername(String username, String str, String str2) {
            AbstractC4154l.m8923f(username, "username");
            return str == null ? str2 == null ? username : str2 : str;
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
                Charset charset = AbstractC5163a.f25245a;
                byte[] bytes = str3.getBytes(charset);
                AbstractC4154l.m8922e(bytes, "getBytes(...)");
                mac.init(new SecretKeySpec(bytes, getHMAC_SHA_256()));
                byte[] bytes2 = str.getBytes(charset);
                AbstractC4154l.m8922e(bytes2, "getBytes(...)");
                mac.update(bytes2);
                byte[] bytes3 = str2.getBytes(charset);
                AbstractC4154l.m8922e(bytes3, "getBytes(...)");
                byte[] bArrEncode = Base64.encode(mac.doFinal(bytes3), 2);
                AbstractC4154l.m8922e(bArrEncode, "encode(...)");
                return new String(bArrEncode, charset);
            } catch (Exception unused) {
                throw new UnknownException(null, new Exception("errors in HMAC calculation"), 1, null);
            }
        }

        private Companion() {
        }
    }
}
