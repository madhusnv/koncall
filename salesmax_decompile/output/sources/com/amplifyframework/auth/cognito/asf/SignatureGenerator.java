package com.amplifyframework.auth.cognito.asf;

import android.util.Base64;
import com.google.firebase.messaging.Constants;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.cookie.ClientCookie;
import p001o.id5;
import p001o.sh2;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignatureGenerator {
    private static final String HMAC_SHA_256 = "HmacSHA256";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = SignatureGenerator.class.getSimpleName();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final String getSignature(String str, String str2, String str3) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
            sq8.m48649h(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            sq8.m48649h(str2, "secret");
            sq8.m48649h(str3, ClientCookie.VERSION_ATTR);
            try {
                Mac mac = Mac.getInstance(SignatureGenerator.HMAC_SHA_256);
                Charset charset = sh2.f45422b;
                byte[] bytes = str2.getBytes(charset);
                sq8.m48648g(bytes, "getBytes(...)");
                mac.init(new SecretKeySpec(bytes, SignatureGenerator.HMAC_SHA_256));
                byte[] bytes2 = str3.getBytes(charset);
                sq8.m48648g(bytes2, "getBytes(...)");
                mac.update(bytes2);
                byte[] bytes3 = str.getBytes(charset);
                sq8.m48648g(bytes3, "getBytes(...)");
                byte[] bArrEncode = Base64.encode(mac.doFinal(bytes3), 2);
                sq8.m48648g(bArrEncode, "encode(...)");
                return new String(bArrEncode, charset);
            } catch (Exception unused) {
                String unused2 = SignatureGenerator.TAG;
                return "";
            }
        }
    }

    public static final String getSignature(String str, String str2, String str3) {
        return Companion.getSignature(str, str2, str3);
    }
}
