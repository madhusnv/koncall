package p001o;

import p001o.ggf;

/* loaded from: classes3.dex */
public abstract class b2e {
    /* renamed from: a */
    public static final void m18117a(Object obj, g48 g48Var, b81 b81Var) {
        sq8.m48649h(obj, "exception");
        sq8.m48649h(g48Var, "response");
        if (obj instanceof hgf) {
            hgf hgfVar = (hgf) obj;
            tob tobVarM35772c = hgfVar.mo34658a().m35772c();
            ggf.C13707a c13707a = ggf.f25107e;
            tx0.m50743h(tobVarM35772c, c13707a.m28589a(), b81Var != null ? b81Var.mo18271a() : null);
            tx0.m50743h(hgfVar.mo34658a().m35772c(), c13707a.m28590b(), b81Var != null ? b81Var.getMessage() : null);
            tx0.m50743h(hgfVar.mo34658a().m35772c(), c13707a.m28593e(), g48Var.getHeaders().get("x-amz-request-id"));
            hgfVar.mo34658a().m35772c().mo34002p(c13707a.m28592d(), g48Var);
        }
    }
}
