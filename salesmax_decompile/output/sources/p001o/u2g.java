package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public abstract class u2g {

    /* renamed from: a */
    public static final StackTraceElement f48219a = new ip0().m32528a();

    /* renamed from: b */
    public static final String f48220b;

    /* renamed from: c */
    public static final String f48221c;

    static {
        Object objM53351b;
        Object objM53351b2;
        try {
            vre.C17665a c17665a = vre.f50797b;
            objM53351b = vre.m53351b(vb1.class.getCanonicalName());
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        if (vre.m53354e(objM53351b) != null) {
            objM53351b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f48220b = (String) objM53351b;
        try {
            objM53351b2 = vre.m53351b(u2g.class.getCanonicalName());
        } catch (Throwable th2) {
            vre.C17665a c17665a3 = vre.f50797b;
            objM53351b2 = vre.m53351b(wre.m54933a(th2));
        }
        if (vre.m53354e(objM53351b2) != null) {
            objM53351b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f48221c = (String) objM53351b2;
    }

    /* renamed from: a */
    public static final Throwable m50870a(Throwable th) {
        return th;
    }
}
