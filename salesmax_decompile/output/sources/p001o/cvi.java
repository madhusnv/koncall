package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class cvi {
    /* renamed from: a */
    public static boolean m21886a(s82 s82Var) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) s82Var.m47965a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
            for (int i : iArr) {
                if (i == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
