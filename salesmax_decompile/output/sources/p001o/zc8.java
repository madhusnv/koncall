package p001o;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import p001o.d72;

/* loaded from: classes2.dex */
public class zc8 {
    /* renamed from: a */
    public void m59182a(int i, d72.C12801a c12801a) {
        if (((ImageCapturePixelHDRPlusQuirk) zq5.m59712b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i == 0) {
            c12801a.m22395f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i != 1) {
                return;
            }
            c12801a.m22395f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
