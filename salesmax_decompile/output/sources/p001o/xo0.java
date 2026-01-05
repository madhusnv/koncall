package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public abstract class xo0 {

    /* renamed from: a */
    public static final int f53989a;

    static {
        Object objM53351b;
        try {
            vre.C17665a c17665a = vre.f50797b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            sq8.m48648g(property, "getProperty(...)");
            objM53351b = vre.m53351b(d9g.m22638l(property));
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        if (vre.m53356g(objM53351b)) {
            objM53351b = null;
        }
        Integer num = (Integer) objM53351b;
        f53989a = num != null ? num.intValue() : 2097152;
    }
}
