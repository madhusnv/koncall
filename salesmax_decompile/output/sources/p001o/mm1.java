package p001o;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class mm1 {

    /* renamed from: a */
    public static final mm1 f35674a = new mm1();

    /* renamed from: b */
    public static final int f35675b;

    /* renamed from: c */
    public static final int f35676c;

    /* renamed from: d */
    public static final int f35677d;

    /* renamed from: e */
    public static final int f35678e;

    /* renamed from: o.mm1$a */
    public static final class C15359a {

        /* renamed from: a */
        public static final C15359a f35679a = new C15359a();

        /* renamed from: a */
        public final int m39341a(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f35675b = i >= 30 ? C15359a.f35679a.m39341a(30) : 0;
        f35676c = i >= 30 ? C15359a.f35679a.m39341a(31) : 0;
        f35677d = i >= 30 ? C15359a.f35679a.m39341a(33) : 0;
        f35678e = i >= 30 ? C15359a.f35679a.m39341a(1000000) : 0;
    }

    /* renamed from: a */
    public static final boolean m39337a(String str, String str2) {
        sq8.m48649h(str, "codename");
        sq8.m48649h(str2, "buildCodename");
        if (sq8.m48644c("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        sq8.m48648g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        sq8.m48648g(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    /* renamed from: b */
    public static final boolean m39338b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                sq8.m48648g(str, "CODENAME");
                if (m39337a("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m39339c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            if (i >= 33) {
                String str = Build.VERSION.CODENAME;
                sq8.m48648g(str, "CODENAME");
                if (m39337a("UpsideDownCake", str)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m39340d() {
        if (Build.VERSION.SDK_INT >= 34) {
            String str = Build.VERSION.CODENAME;
            sq8.m48648g(str, "CODENAME");
            if (m39337a("VanillaIceCream", str)) {
                return true;
            }
        }
        return false;
    }
}
