package p001o;

import p001o.ese;

/* loaded from: classes2.dex */
public final class z26 implements tse {
    /* renamed from: a */
    public final ese m58656a(Throwable th) {
        if (!(th instanceof sc4)) {
            return ese.C13255b.f22117a;
        }
        sc4 sc4Var = (sc4) th;
        return sc4Var.mo30426c().m35774e() ? new ese.C13254a(fse.Throttling) : sc4Var.mo30426c().m35773d() ? new ese.C13254a(fse.ServerSide) : ese.C13255b.f22117a;
    }

    @Override // p001o.tse
    public ese evaluate(Object obj) {
        if (vre.m53357h(obj)) {
            return ese.C13256c.f22118a;
        }
        Throwable thM53354e = vre.m53354e(obj);
        sq8.m48646e(thM53354e);
        return m58656a(thM53354e);
    }
}
