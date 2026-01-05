package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import p001o.j5e;
import p001o.s82;

/* loaded from: classes2.dex */
public class AspectRatioLegacyApi21Quirk implements j5e {
    /* renamed from: d */
    public static boolean m4526d(s82 s82Var) {
        Integer num = (Integer) s82Var.m47965a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num == null) {
            return false;
        }
        num.intValue();
        return false;
    }

    /* renamed from: c */
    public int m4527c() {
        return 2;
    }
}
