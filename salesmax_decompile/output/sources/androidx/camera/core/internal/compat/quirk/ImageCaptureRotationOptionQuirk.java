package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import p001o.cd2;
import p001o.j5e;
import p001o.mq3;

/* loaded from: classes2.dex */
public final class ImageCaptureRotationOptionQuirk implements j5e {
    /* renamed from: c */
    public static boolean m4705c() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Cuttlefish") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk") && !Build.HARDWARE.contains("ranchu"))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m4706d() {
        m4705c();
        return false;
    }

    /* renamed from: e */
    public static boolean m4707e() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: f */
    public static boolean m4708f() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    /* renamed from: h */
    public static boolean m4709h() {
        return m4708f() || m4707e() || m4706d();
    }

    /* renamed from: g */
    public boolean m4710g(mq3.AbstractC15402a abstractC15402a) {
        return abstractC15402a != cd2.f17857i;
    }
}
