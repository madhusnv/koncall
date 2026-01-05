package p001o;

import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class fgd {
    /* renamed from: a */
    public static void m26657a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m26658b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m26659c(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (i <= i3) {
            return i;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    /* renamed from: d */
    public static int m26660d(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public static int m26661e(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: f */
    public static int m26662f(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    /* renamed from: g */
    public static Object m26663g(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: h */
    public static Object m26664h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: i */
    public static void m26665i(boolean z) {
        m26666j(z, null);
    }

    /* renamed from: j */
    public static void m26666j(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
