package com.google.api.client.util;

import p001o.yb1;

/* loaded from: classes3.dex */
public class Base64 {
    private Base64() {
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return decodeBase64(StringUtils.newStringUtf8(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return StringUtils.getBytesUtf8(encodeBase64String(bArr));
    }

    public static String encodeBase64String(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return yb1.m57436a().m57442f(bArr);
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return StringUtils.getBytesUtf8(encodeBase64URLSafeString(bArr));
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return yb1.m57437b().mo57447l().m57442f(bArr);
    }

    public static byte[] decodeBase64(String str) {
        if (str == null) {
            return null;
        }
        try {
            return yb1.m57436a().m57439c(str);
        } catch (IllegalArgumentException e) {
            if (e.getCause() instanceof yb1.C18368d) {
                return yb1.m57437b().m57439c(str.trim());
            }
            throw e;
        }
    }
}
