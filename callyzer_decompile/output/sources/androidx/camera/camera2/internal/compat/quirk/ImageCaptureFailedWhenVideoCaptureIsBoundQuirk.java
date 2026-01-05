package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import i0.s1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, s1 {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    /* renamed from: a */
    public final boolean mo595a() {
        String str = Build.BRAND;
        if ("blu".equalsIgnoreCase(str) && "studio x10".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if ("itel".equalsIgnoreCase(str) && "itel w6004".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        if ("vivo".equalsIgnoreCase(str) && "vivo 1805".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return "positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }
}
