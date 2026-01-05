package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PkceHelper {
    public static final PkceHelper INSTANCE = new PkceHelper();

    private PkceHelper() {
    }

    public final String encodeBase64(String str) {
        AbstractC4154l.m8923f(str, "str");
        Charset charsetForName = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        AbstractC4154l.m8922e(charsetForName, "forName(...)");
        byte[] bytes = str.getBytes(charsetForName);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 3);
        AbstractC4154l.m8922e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final String generateHash(String data) throws NoSuchAlgorithmException {
        AbstractC4154l.m8923f(data, "data");
        Charset charsetForName = Charset.forName("US-ASCII");
        AbstractC4154l.m8922e(charsetForName, "forName(...)");
        byte[] bytes = data.getBytes(charsetForName);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bytes, 0, bytes.length);
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
        AbstractC4154l.m8920c(strEncodeToString);
        return strEncodeToString;
    }

    public final String generateRandom() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        AbstractC4154l.m8922e(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
