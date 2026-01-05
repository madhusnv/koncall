package com.onesignal.common;

import java.io.File;

/* loaded from: classes6.dex */
public final class RootToolsInternalMethods {
    public static final RootToolsInternalMethods INSTANCE = new RootToolsInternalMethods();

    private RootToolsInternalMethods() {
    }

    public final boolean isRooted() {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 8; i++) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
