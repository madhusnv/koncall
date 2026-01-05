package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p001o.j5e;
import p001o.s82;

/* loaded from: classes2.dex */
public class LegacyCameraSurfaceCleanupQuirk implements j5e {
    /* renamed from: c */
    public static boolean m4605c(s82 s82Var) {
        Integer num = (Integer) s82Var.m47965a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* renamed from: d */
    public static boolean m4606d(s82 s82Var) {
        return Build.VERSION.SDK_INT < 29 && m4605c(s82Var);
    }
}
