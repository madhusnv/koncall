package p001o;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class op0 {
    /* renamed from: a */
    public static void m42511a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m42512b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m42513c(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    /* renamed from: d */
    public static String m42514d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    /* renamed from: e */
    public static Object m42515e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: f */
    public static Object m42516f(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: g */
    public static void m42517g(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: h */
    public static void m42518h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: i */
    public static Object m42519i(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    /* renamed from: j */
    public static Object m42520j(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.valueOf(obj2));
    }
}
