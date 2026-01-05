package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.logging.AndroidLogger;
import p001o.w48;

/* loaded from: classes6.dex */
public class Utils {
    private static Boolean isDebugLoggingEnabled;

    public static int bufferToInt(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4 && i2 < bArr.length; i2++) {
            i |= (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public static void checkArgument(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean isDebugLoggingEnabled(Context context) {
        Boolean bool = isDebugLoggingEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            isDebugLoggingEnabled = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            AndroidLogger.getInstance().debug("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    public static int saturatedIntCast(long j) {
        if (j > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static String stripSensitiveInfo(String str) {
        w48 w48VarM53870l = w48.m53870l(str);
        return w48VarM53870l != null ? w48VarM53870l.m53879j().m53897I("").m53913p("").m53918u(null).m53906i(null).toString() : str;
    }

    public static String truncateURL(String str, int i) {
        int iLastIndexOf;
        if (str.length() <= i) {
            return str;
        }
        if (str.charAt(i) == '/') {
            return str.substring(0, i);
        }
        w48 w48VarM53870l = w48.m53870l(str);
        return w48VarM53870l == null ? str.substring(0, i) : (w48VarM53870l.m53873c().lastIndexOf(47) < 0 || (iLastIndexOf = str.lastIndexOf(47, i + (-1))) < 0) ? str.substring(0, i) : str.substring(0, iLastIndexOf);
    }
}
