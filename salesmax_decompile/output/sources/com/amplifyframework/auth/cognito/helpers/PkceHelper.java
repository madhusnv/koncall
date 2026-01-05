package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import com.google.firebase.messaging.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class PkceHelper {
    public static final PkceHelper INSTANCE = new PkceHelper();

    private PkceHelper() {
    }

    public final String encodeBase64(String str) {
        sq8.m48649h(str, "str");
        Charset charsetForName = Charset.forName("ISO-8859-1");
        sq8.m48648g(charsetForName, "forName(...)");
        byte[] bytes = str.getBytes(charsetForName);
        sq8.m48648g(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 3);
        sq8.m48648g(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final String generateHash(String str) throws NoSuchAlgorithmException {
        sq8.m48649h(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Charset charsetForName = Charset.forName("US-ASCII");
        sq8.m48648g(charsetForName, "forName(...)");
        byte[] bytes = str.getBytes(charsetForName);
        sq8.m48648g(bytes, "getBytes(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bytes, 0, bytes.length);
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
        sq8.m48646e(strEncodeToString);
        return strEncodeToString;
    }

    public final String generateRandom() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        sq8.m48648g(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
