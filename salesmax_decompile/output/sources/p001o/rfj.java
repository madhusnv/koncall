package p001o;

import android.hardware.camera2.CameraCharacteristics;

/* loaded from: classes2.dex */
public abstract class rfj {
    /* renamed from: a */
    public static boolean m46676a(s82 s82Var, int i) {
        int[] iArr = (int[]) s82Var.m47965a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
