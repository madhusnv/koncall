package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes3.dex */
public abstract class dgd {
    /* renamed from: a */
    public static String m23048a(int i, int i2, String str) {
        if (i < 0) {
            return u8g.m51209c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return u8g.m51209c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    /* renamed from: b */
    public static String m23049b(int i, int i2, String str) {
        if (i < 0) {
            return u8g.m51209c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return u8g.m51209c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    /* renamed from: c */
    public static String m23050c(int i, int i2, int i3) {
        return (i < 0 || i > i3) ? m23049b(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m23049b(i2, i3, "end index") : u8g.m51209c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m23051d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m23052e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m23053f(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(u8g.m51209c(str, Character.valueOf(c)));
        }
    }

    /* renamed from: g */
    public static void m23054g(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(u8g.m51209c(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: h */
    public static void m23055h(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(u8g.m51209c(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: i */
    public static void m23056i(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(u8g.m51209c(str, Long.valueOf(j)));
        }
    }

    /* renamed from: j */
    public static void m23057j(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(u8g.m51209c(str, Long.valueOf(j), obj));
        }
    }

    /* renamed from: k */
    public static void m23058k(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(u8g.m51209c(str, obj));
        }
    }

    /* renamed from: l */
    public static void m23059l(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(u8g.m51209c(str, objArr));
        }
    }

    /* renamed from: m */
    public static int m23060m(int i, int i2) {
        return m23061n(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    /* renamed from: n */
    public static int m23061n(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(m23048a(i, i2, str));
        }
        return i;
    }

    /* renamed from: o */
    public static Object m23062o(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: p */
    public static Object m23063p(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: q */
    public static Object m23064q(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(u8g.m51209c(str, objArr));
    }

    /* renamed from: r */
    public static int m23065r(int i, int i2) {
        return m23066s(i, i2, FirebaseAnalytics.Param.INDEX);
    }

    /* renamed from: s */
    public static int m23066s(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m23049b(i, i2, str));
        }
        return i;
    }

    /* renamed from: t */
    public static void m23067t(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m23050c(i, i2, i3));
        }
    }

    /* renamed from: u */
    public static void m23068u(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: v */
    public static void m23069v(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: w */
    public static void m23070w(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(u8g.m51209c(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: x */
    public static void m23071x(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(u8g.m51209c(str, Long.valueOf(j)));
        }
    }

    /* renamed from: y */
    public static void m23072y(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(u8g.m51209c(str, obj));
        }
    }

    /* renamed from: z */
    public static void m23073z(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(u8g.m51209c(str, objArr));
        }
    }
}
