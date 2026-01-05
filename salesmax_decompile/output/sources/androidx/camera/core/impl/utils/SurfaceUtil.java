package androidx.camera.core.impl.utils;

import android.view.Surface;

/* loaded from: classes2.dex */
public abstract class SurfaceUtil {

    /* renamed from: androidx.camera.core.impl.utils.SurfaceUtil$a */
    public static class C1897a {

        /* renamed from: a */
        public int f6125a = 0;

        /* renamed from: b */
        public int f6126b = 0;

        /* renamed from: c */
        public int f6127c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    /* renamed from: a */
    public static C1897a m4702a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        C1897a c1897a = new C1897a();
        c1897a.f6125a = iArrNativeGetSurfaceInfo[0];
        c1897a.f6126b = iArrNativeGetSurfaceInfo[1];
        c1897a.f6127c = iArrNativeGetSurfaceInfo[2];
        return c1897a;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
