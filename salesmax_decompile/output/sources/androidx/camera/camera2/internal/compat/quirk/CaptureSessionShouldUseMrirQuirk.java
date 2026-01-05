package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import p001o.j5e;

/* loaded from: classes2.dex */
public class CaptureSessionShouldUseMrirQuirk implements j5e {
    /* renamed from: c */
    public static boolean m4534c() {
        return "google".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT >= 35;
    }
}
