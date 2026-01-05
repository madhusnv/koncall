package com.amplifyframework.auth.cognito.helpers;

import android.util.Base64;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CognitoDeviceHelper {
    public static final CognitoDeviceHelper INSTANCE = new CognitoDeviceHelper();
    public static final int SALT_LENGTH_BITS = 128;

    private CognitoDeviceHelper() {
    }

    public final Map<String, String> generateVerificationParameters(String deviceKey, String deviceGroup) {
        AbstractC4154l.m8923f(deviceKey, "deviceKey");
        AbstractC4154l.m8923f(deviceGroup, "deviceGroup");
        String string = UUID.randomUUID().toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        BigInteger bigInteger = new BigInteger(128, new SecureRandom());
        SRPHelper sRPHelper = new SRPHelper(string);
        sRPHelper.setUserPoolParams(deviceKey, deviceGroup);
        BigInteger bigIntegerComputePasswordVerifier$aws_auth_cognito_release = sRPHelper.computePasswordVerifier$aws_auth_cognito_release(bigInteger);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("salt", Base64.encodeToString(bigInteger.toByteArray(), 2));
        linkedHashMap.put("verifier", Base64.encodeToString(bigIntegerComputePasswordVerifier$aws_auth_cognito_release.toByteArray(), 2));
        linkedHashMap.put("secret", string);
        return linkedHashMap;
    }
}
