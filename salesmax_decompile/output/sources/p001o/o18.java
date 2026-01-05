package p001o;

import p001o.m18;
import p001o.vre;

/* loaded from: classes3.dex */
public abstract class o18 implements h84 {

    /* renamed from: a */
    public final y38 f37525a;

    /* renamed from: b */
    public final g48 f37526b;

    /* renamed from: c */
    public final gk8 f37527c;

    /* renamed from: d */
    public final gk8 f37528d;

    /* renamed from: e */
    public final q74 f37529e;

    public o18(y38 y38Var, g48 g48Var, gk8 gk8Var, gk8 gk8Var2, q74 q74Var) {
        sq8.m48649h(y38Var, "request");
        sq8.m48649h(g48Var, "response");
        sq8.m48649h(gk8Var, "requestTime");
        sq8.m48649h(gk8Var2, "responseTime");
        sq8.m48649h(q74Var, "coroutineContext");
        this.f37525a = y38Var;
        this.f37526b = g48Var;
        this.f37527c = gk8Var;
        this.f37528d = gk8Var2;
        this.f37529e = q74Var;
    }

    /* renamed from: c */
    public static /* synthetic */ o18 m41344c(o18 o18Var, y38 y38Var, g48 g48Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            y38Var = o18Var.f37525a;
        }
        if ((i & 2) != 0) {
            g48Var = o18Var.f37526b;
        }
        return o18Var.mo28290b(y38Var, g48Var);
    }

    @Override // p001o.h84
    /* renamed from: D */
    public q74 mo6529D() {
        return this.f37529e;
    }

    /* renamed from: a */
    public void mo28289a() {
        y6f from;
        try {
            vre.C17665a c17665a = vre.f50797b;
            m18 body = this.f37526b.getBody();
            Boolean boolValueOf = null;
            m18.AbstractC15194b abstractC15194b = body instanceof m18.AbstractC15194b ? (m18.AbstractC15194b) body : null;
            if (abstractC15194b != null && (from = abstractC15194b.readFrom()) != null) {
                boolValueOf = Boolean.valueOf(from.cancel(null));
            }
            vre.m53351b(boolValueOf);
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            vre.m53351b(wre.m54933a(th));
        }
    }

    /* renamed from: b */
    public abstract o18 mo28290b(y38 y38Var, g48 g48Var);

    /* renamed from: d */
    public final y38 m41345d() {
        return this.f37525a;
    }

    /* renamed from: e */
    public final gk8 m41346e() {
        return this.f37527c;
    }

    /* renamed from: f */
    public final g48 m41347f() {
        return this.f37526b;
    }

    /* renamed from: g */
    public final gk8 m41348g() {
        return this.f37528d;
    }
}
