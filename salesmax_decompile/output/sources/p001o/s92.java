package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class s92 {
    /* renamed from: a */
    public static boolean m48031a(z92 z92Var, String str) throws li8 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) z92Var.m58952c(str).m47965a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (h72 e) {
            throw new li8(wa2.m54130a(e));
        }
    }
}
