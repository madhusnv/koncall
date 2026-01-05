package p001o;

/* loaded from: classes3.dex */
public abstract class rg3 {
    /* renamed from: a */
    public static void m46689a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* renamed from: b */
    public static int m46690b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: c */
    public static void m46691c(boolean z) {
        dgd.m23069v(z, "no calls to next() since the last call to remove()");
    }
}
