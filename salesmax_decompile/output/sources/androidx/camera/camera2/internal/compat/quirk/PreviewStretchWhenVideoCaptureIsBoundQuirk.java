package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;

/* loaded from: classes2.dex */
public class PreviewStretchWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk {
    /* renamed from: c */
    public static boolean m4613c() {
        return "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: d */
    public static boolean m4614d() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "A37F".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: e */
    public static boolean m4615e() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j111f".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: f */
    public static boolean m4616f() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j320f".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: g */
    public static boolean m4617g() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j510fn".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: h */
    public static boolean m4618h() {
        return "Samsung".equalsIgnoreCase(Build.MANUFACTURER) && "sm-j700f".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: i */
    public static boolean m4619i() {
        return m4613c() || m4616f() || m4618h() || m4615e() || m4614d() || m4617g();
    }
}
