package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class CognitoDeviceHelper {
    public static final CognitoDeviceHelper INSTANCE = new CognitoDeviceHelper();
    public static final int SALT_LENGTH_BITS = 128;

    private CognitoDeviceHelper() {
    }

    public final Map<String, String> generateVerificationParameters(String str, String str2) {
        sq8.m48649h(str, "deviceKey");
        sq8.m48649h(str2, "deviceGroup");
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "toString(...)");
        BigInteger bigInteger = new BigInteger(128, new SecureRandom());
        SRPHelper sRPHelper = new SRPHelper(string);
        sRPHelper.setUserPoolParams(str, str2);
        BigInteger bigIntegerComputePasswordVerifier$aws_auth_cognito_release = sRPHelper.computePasswordVerifier$aws_auth_cognito_release(bigInteger);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strEncodeToString = Base64.encodeToString(bigInteger.toByteArray(), 2);
        sq8.m48648g(strEncodeToString, "encodeToString(...)");
        linkedHashMap.put("salt", strEncodeToString);
        String strEncodeToString2 = Base64.encodeToString(bigIntegerComputePasswordVerifier$aws_auth_cognito_release.toByteArray(), 2);
        sq8.m48648g(strEncodeToString2, "encodeToString(...)");
        linkedHashMap.put("verifier", strEncodeToString2);
        linkedHashMap.put("secret", string);
        return linkedHashMap;
    }
}
