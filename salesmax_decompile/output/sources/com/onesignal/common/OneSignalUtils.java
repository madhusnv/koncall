package com.onesignal.common;

import java.util.regex.Pattern;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OneSignalUtils {
    public static final OneSignalUtils INSTANCE = new OneSignalUtils();
    public static final String SDK_VERSION = "050134";

    private OneSignalUtils() {
    }

    public final boolean isValidEmail(String str) {
        sq8.m48649h(str, "email");
        if (str.length() == 0) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
        sq8.m48648g(patternCompile, "compile(emRegex)");
        return patternCompile.matcher(str).matches();
    }

    public final boolean isValidPhoneNumber(String str) {
        sq8.m48649h(str, "number");
        if (str.length() == 0) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^\\+?[1-9]\\d{1,14}$");
        sq8.m48648g(patternCompile, "compile(emRegex)");
        return patternCompile.matcher(str).matches();
    }
}
