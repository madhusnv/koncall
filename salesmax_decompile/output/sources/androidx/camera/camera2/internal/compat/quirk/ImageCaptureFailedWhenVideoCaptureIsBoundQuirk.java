package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import p001o.j5e;

/* loaded from: classes2.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, j5e {
    /* renamed from: c */
    public static boolean m4575c() {
        return "blu".equalsIgnoreCase(Build.BRAND) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    public static boolean m4576d() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: e */
    public static boolean m4577e() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: f */
    public static boolean m4578f() {
        return "pixel 4 xl".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT == 29;
    }

    /* renamed from: g */
    public static boolean m4579g() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: h */
    public static boolean m4580h() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            String str = Build.DEVICE;
            if ("gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m4581i() {
        return "vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: j */
    public static boolean m4582j() {
        return m4575c() || m4576d() || m4581i() || m4579g() || m4578f() || m4577e() || m4580h();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    /* renamed from: a */
    public boolean mo4531a() {
        return m4575c() || m4576d() || m4581i() || m4579g();
    }
}
