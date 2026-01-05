package com.google.firebase.platforminfo;

import p001o.te9;

/* loaded from: classes6.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return te9.f46955f.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
