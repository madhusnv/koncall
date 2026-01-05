package com.amplifyframework.auth.cognito.asf;

import android.util.Base64;
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
public final class SignatureGenerator {
    private static final String HMAC_SHA_256 = "HmacSHA256";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SignatureGenerator";

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final String getSignature(String data, String secret, String version) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
            AbstractC4154l.m8923f(data, "data");
            AbstractC4154l.m8923f(secret, "secret");
            AbstractC4154l.m8923f(version, "version");
            try {
                Mac mac = Mac.getInstance(SignatureGenerator.HMAC_SHA_256);
                Charset charset = AbstractC5163a.f25245a;
                byte[] bytes = secret.getBytes(charset);
                AbstractC4154l.m8922e(bytes, "getBytes(...)");
                mac.init(new SecretKeySpec(bytes, SignatureGenerator.HMAC_SHA_256));
                byte[] bytes2 = version.getBytes(charset);
                AbstractC4154l.m8922e(bytes2, "getBytes(...)");
                mac.update(bytes2);
                byte[] bytes3 = data.getBytes(charset);
                AbstractC4154l.m8922e(bytes3, "getBytes(...)");
                byte[] bArrEncode = Base64.encode(mac.doFinal(bytes3), 2);
                AbstractC4154l.m8922e(bArrEncode, "encode(...)");
                return new String(bArrEncode, charset);
            } catch (Exception unused) {
                String unused2 = SignatureGenerator.TAG;
                return "";
            }
        }

        private Companion() {
        }
    }

    public static final String getSignature(String str, String str2, String str3) {
        return Companion.getSignature(str, str2, str3);
    }
}
