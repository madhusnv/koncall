package androidx.camera.core.impl.utils;

import android.view.Surface;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    /* renamed from: a */
    public static C8687a m612a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        C8687a c8687a = new C8687a(17);
        int i10 = iArrNativeGetSurfaceInfo[0];
        int i11 = iArrNativeGetSurfaceInfo[1];
        int i12 = iArrNativeGetSurfaceInfo[2];
        return c8687a;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
