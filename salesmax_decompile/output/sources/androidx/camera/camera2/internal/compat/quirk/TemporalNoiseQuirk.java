package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p001o.s82;

/* loaded from: classes2.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    /* renamed from: c */
    public static boolean m4625c() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    public static boolean m4626d(s82 s82Var) {
        return m4625c() && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
