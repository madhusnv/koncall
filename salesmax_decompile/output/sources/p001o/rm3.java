package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public abstract class rm3 {
    /* renamed from: a */
    public static final Object m46954a(Object obj, n64 n64Var) {
        if (!(obj instanceof lm3)) {
            return vre.m53351b(obj);
        }
        vre.C17665a c17665a = vre.f50797b;
        return vre.m53351b(wre.m54933a(((lm3) obj).f34036a));
    }

    /* renamed from: b */
    public static final Object m46955b(Object obj) {
        Throwable thM53354e = vre.m53354e(obj);
        return thM53354e == null ? obj : new lm3(thM53354e, false, 2, null);
    }

    /* renamed from: c */
    public static final Object m46956c(Object obj, xb2 xb2Var) {
        Throwable thM53354e = vre.m53354e(obj);
        return thM53354e == null ? obj : new lm3(thM53354e, false, 2, null);
    }
}
