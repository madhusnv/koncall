package p024z;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import c0.h1;
import p019u.C7286a;
import p023y.AbstractC8523a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z.a */
/* loaded from: classes.dex */
public final class C8832a {
    /* renamed from: a */
    public static void m16288a(int i10, h1 h1Var) {
        if (((ImageCapturePixelHDRPlusQuirk) AbstractC8523a.f41447a.m5729g(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i10 == 0) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
            Boolean bool = Boolean.TRUE;
            h1Var.f5106b.m7352n(C7286a.g0(key), bool);
            return;
        }
        if (i10 != 1) {
            return;
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
        Boolean bool2 = Boolean.FALSE;
        h1Var.f5106b.m7352n(C7286a.g0(key2), bool2);
    }
}
