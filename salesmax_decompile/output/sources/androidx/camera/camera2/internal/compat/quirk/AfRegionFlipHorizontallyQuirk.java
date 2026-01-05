package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p001o.j5e;
import p001o.s82;

/* loaded from: classes2.dex */
public class AfRegionFlipHorizontallyQuirk implements j5e {
    /* renamed from: c */
    public static boolean m4525c(s82 s82Var) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
