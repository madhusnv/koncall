package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import p001o.j5e;
import p001o.s82;

/* loaded from: classes2.dex */
public final class YuvImageOnePixelShiftQuirk implements j5e {
    /* renamed from: c */
    public static boolean m4635c() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    public static boolean m4636d() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-A920F".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: e */
    public static boolean m4637e() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: f */
    public static boolean m4638f() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J415F".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: g */
    public static boolean m4639g() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: h */
    public static boolean m4640h() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && "Mi A1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: i */
    public static boolean m4641i(s82 s82Var) {
        return m4635c() || m4637e() || m4639g() || m4636d() || m4638f() || m4640h();
    }
}
