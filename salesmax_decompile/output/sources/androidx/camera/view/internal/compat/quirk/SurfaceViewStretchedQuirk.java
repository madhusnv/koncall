package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import p001o.j5e;

/* loaded from: classes2.dex */
public class SurfaceViewStretchedQuirk implements j5e {
    /* renamed from: c */
    public static boolean m4821c() {
        return "LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: d */
    public static boolean m4822d() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: e */
    public static boolean m4823e() {
        if ("SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            String str = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m4824f() {
        return Build.VERSION.SDK_INT < 33 && (m4823e() || m4822d() || m4821c());
    }
}
