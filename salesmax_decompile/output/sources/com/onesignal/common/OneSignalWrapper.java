package com.onesignal.common;

/* loaded from: classes6.dex */
public final class OneSignalWrapper {
    public static final OneSignalWrapper INSTANCE = new OneSignalWrapper();
    private static String sdkType;
    private static String sdkVersion;

    private OneSignalWrapper() {
    }

    public static final String getSdkType() {
        return sdkType;
    }

    public static /* synthetic */ void getSdkType$annotations() {
    }

    public static final String getSdkVersion() {
        return sdkVersion;
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static final void setSdkType(String str) {
        sdkType = str;
    }

    public static final void setSdkVersion(String str) {
        sdkVersion = str;
    }
}
