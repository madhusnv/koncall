package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001o.j5e;

/* loaded from: classes2.dex */
public class InvalidVideoProfilesQuirk implements j5e {

    /* renamed from: a */
    public static final List f6077a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* renamed from: b */
    public static final List f6078b = Arrays.asList("cph2417", "cph2451");

    /* renamed from: c */
    public static final List f6079c = Arrays.asList("cph2437", "cph2525", "pht110");

    /* renamed from: c */
    public static boolean m4588c() {
        return Build.VERSION.SDK_INT == 33;
    }

    /* renamed from: d */
    public static boolean m4589d() {
        return m4590e() && m4588c();
    }

    /* renamed from: e */
    public static boolean m4590e() {
        return f6078b.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* renamed from: f */
    public static boolean m4591f() {
        return m4592g() && m4588c();
    }

    /* renamed from: g */
    public static boolean m4592g() {
        return f6079c.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* renamed from: h */
    public static boolean m4593h() {
        return m4600o() || m4598m();
    }

    /* renamed from: i */
    public static boolean m4594i() {
        return m4595j() && m4593h();
    }

    /* renamed from: j */
    public static boolean m4595j() {
        return f6077a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    /* renamed from: k */
    public static boolean m4596k() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && m4600o();
    }

    /* renamed from: l */
    public static boolean m4597l() {
        String str = Build.BRAND;
        return ("redmi".equalsIgnoreCase(str) || "xiaomi".equalsIgnoreCase(str)) && (m4599n() || m4600o());
    }

    /* renamed from: m */
    public static boolean m4598m() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    /* renamed from: n */
    public static boolean m4599n() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tkq1");
    }

    /* renamed from: o */
    public static boolean m4600o() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    /* renamed from: p */
    public static boolean m4601p() {
        return m4596k() || m4594i() || m4597l() || m4589d() || m4591f();
    }
}
