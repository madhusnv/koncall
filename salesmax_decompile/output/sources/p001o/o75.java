package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public abstract class o75 {
    /* renamed from: a */
    public static final String m41657a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m41658b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m41659c(n64 n64Var) {
        Object objM53351b;
        if (n64Var instanceof yt5) {
            return ((yt5) n64Var).toString();
        }
        try {
            vre.C17665a c17665a = vre.f50797b;
            objM53351b = vre.m53351b(n64Var + '@' + m41658b(n64Var));
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        if (vre.m53354e(objM53351b) != null) {
            objM53351b = n64Var.getClass().getName() + '@' + m41658b(n64Var);
        }
        return (String) objM53351b;
    }
}
