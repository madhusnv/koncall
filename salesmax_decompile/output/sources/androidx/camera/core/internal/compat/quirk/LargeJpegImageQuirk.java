package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p001o.j5e;

/* loaded from: classes2.dex */
public final class LargeJpegImageQuirk implements j5e {

    /* renamed from: a */
    public static final Set f6130a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* renamed from: b */
    public static final Set f6131b = new HashSet(Arrays.asList("V2244A", "V2045", "V2046"));

    /* renamed from: c */
    public static boolean m4716c() {
        return "Samsung".equalsIgnoreCase(Build.BRAND);
    }

    /* renamed from: d */
    public static boolean m4717d() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f6130a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: e */
    public static boolean m4718e() {
        return "Vivo".equalsIgnoreCase(Build.BRAND) && f6131b.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: f */
    public static boolean m4719f() {
        return m4716c() || m4718e();
    }

    /* renamed from: g */
    public boolean m4720g(byte[] bArr) {
        return m4717d() || m4718e() || bArr.length > 10000000;
    }
}
