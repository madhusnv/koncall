package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import p001o.j5e;

/* loaded from: classes2.dex */
public class SurfaceViewNotCroppedByParentQuirk implements j5e {
    /* renamed from: c */
    public static boolean m4820c() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
