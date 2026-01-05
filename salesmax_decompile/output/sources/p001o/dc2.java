package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public abstract class dc2 {
    /* renamed from: a */
    public static final void m22767a(n64 n64Var, Throwable th) throws Throwable {
        vre.C17665a c17665a = vre.f50797b;
        n64Var.resumeWith(vre.m53351b(wre.m54933a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m22768b(n64 n64Var, n64 n64Var2) throws Throwable {
        try {
            n64 n64VarM50336c = tq8.m50336c(n64Var);
            vre.C17665a c17665a = vre.f50797b;
            zt5.m59877b(n64VarM50336c, vre.m53351b(y3i.f54824a));
        } catch (Throwable th) {
            m22767a(n64Var2, th);
        }
    }

    /* renamed from: c */
    public static final void m22769c(nl7 nl7Var, Object obj, n64 n64Var) {
        try {
            n64 n64VarM50336c = tq8.m50336c(tq8.m50334a(nl7Var, obj, n64Var));
            vre.C17665a c17665a = vre.f50797b;
            zt5.m59877b(n64VarM50336c, vre.m53351b(y3i.f54824a));
        } catch (Throwable th) {
            m22767a(n64Var, th);
        }
    }
}
