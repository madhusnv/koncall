package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import p001o.j5e;
import p001o.s82;

/* loaded from: classes2.dex */
public class CaptureNoResponseQuirk implements j5e {
    /* renamed from: c */
    public static boolean m4532c(s82 s82Var) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) s82Var.m47965a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
