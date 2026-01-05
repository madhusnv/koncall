package p001o;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class aqa {
    /* renamed from: a */
    public static String m17656a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* renamed from: b */
    public static boolean m17657b() {
        return m17658c() || m17660e();
    }

    /* renamed from: c */
    public static boolean m17658c() {
        return m17656a().equals("lge");
    }

    /* renamed from: d */
    public static boolean m17659d() {
        return m17656a().equals("meizu");
    }

    /* renamed from: e */
    public static boolean m17660e() {
        return m17656a().equals("samsung");
    }
}
