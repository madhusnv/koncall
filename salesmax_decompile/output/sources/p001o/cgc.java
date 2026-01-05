package p001o;

import android.graphics.Outline;
import p001o.bgc;
import p001o.evf;

/* loaded from: classes2.dex */
public final class cgc {

    /* renamed from: a */
    public zl5 f18148a;

    /* renamed from: b */
    public boolean f18149b;

    /* renamed from: c */
    public final Outline f18150c;

    /* renamed from: d */
    public long f18151d;

    /* renamed from: e */
    public xkf f18152e;

    /* renamed from: f */
    public xzc f18153f;

    /* renamed from: g */
    public boolean f18154g;

    /* renamed from: h */
    public boolean f18155h;

    /* renamed from: i */
    public xzc f18156i;

    /* renamed from: j */
    public tue f18157j;

    /* renamed from: k */
    public float f18158k;

    /* renamed from: l */
    public long f18159l;

    /* renamed from: m */
    public long f18160m;

    /* renamed from: n */
    public boolean f18161n;

    /* renamed from: o */
    public qh9 f18162o;

    /* renamed from: p */
    public xzc f18163p;

    /* renamed from: q */
    public xzc f18164q;

    /* renamed from: r */
    public bgc f18165r;

    public cgc(zl5 zl5Var) {
        sq8.m48649h(zl5Var, "density");
        this.f18148a = zl5Var;
        this.f18149b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f18150c = outline;
        evf.C13264a c13264a = evf.f22225a;
        this.f18151d = c13264a.m25661b();
        this.f18152e = tfe.m49810a();
        this.f18159l = s9c.f45035b.m48063c();
        this.f18160m = c13264a.m25661b();
        this.f18162o = qh9.Ltr;
    }

    /* renamed from: a */
    public final void m21185a(mc2 mc2Var) {
        sq8.m48649h(mc2Var, "canvas");
        xzc xzcVarM21186b = m21186b();
        if (xzcVarM21186b != null) {
            mc2.m38702a(mc2Var, xzcVarM21186b, 0, 2, null);
            return;
        }
        float f = this.f18158k;
        if (f <= 0.0f) {
            mc2.m38703k(mc2Var, s9c.m48052k(this.f18159l), s9c.m48053l(this.f18159l), s9c.m48052k(this.f18159l) + evf.m25657f(this.f18160m), s9c.m48053l(this.f18159l) + evf.m25656e(this.f18160m), 0, 16, null);
            return;
        }
        xzc xzcVarM22944a = this.f18156i;
        tue tueVar = this.f18157j;
        if (xzcVarM22944a == null || !m21190f(tueVar, this.f18159l, this.f18160m, f)) {
            tue tueVarM55030b = wue.m55030b(s9c.m48052k(this.f18159l), s9c.m48053l(this.f18159l), s9c.m48052k(this.f18159l) + evf.m25657f(this.f18160m), s9c.m48053l(this.f18159l) + evf.m25656e(this.f18160m), l74.m36646b(this.f18158k, 0.0f, 2, null));
            if (xzcVarM22944a == null) {
                xzcVarM22944a = df0.m22944a();
            } else {
                xzcVarM22944a.reset();
            }
            xzcVarM22944a.mo21113a(tueVarM55030b);
            this.f18157j = tueVarM55030b;
            this.f18156i = xzcVarM22944a;
        }
        mc2.m38702a(mc2Var, xzcVarM22944a, 0, 2, null);
    }

    /* renamed from: b */
    public final xzc m21186b() {
        m21193i();
        return this.f18153f;
    }

    /* renamed from: c */
    public final Outline m21187c() {
        m21193i();
        if (this.f18161n && this.f18149b) {
            return this.f18150c;
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m21188d() {
        return !this.f18155h;
    }

    /* renamed from: e */
    public final boolean m21189e(long j) {
        bgc bgcVar;
        if (this.f18161n && (bgcVar = this.f18165r) != null) {
            return alf.m17386a(bgcVar, s9c.m48052k(j), s9c.m48053l(j), this.f18163p, this.f18164q);
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m21190f(tue tueVar, long j, long j2, float f) {
        if (tueVar == null || !wue.m55031c(tueVar)) {
            return false;
        }
        if (!(tueVar.m50687d() == s9c.m48052k(j))) {
            return false;
        }
        if (!(tueVar.m50689f() == s9c.m48053l(j))) {
            return false;
        }
        if (!(tueVar.m50688e() == s9c.m48052k(j) + evf.m25657f(j2))) {
            return false;
        }
        if (tueVar.m50684a() == s9c.m48053l(j) + evf.m25656e(j2)) {
            return (k74.m35097d(tueVar.m50690g()) > f ? 1 : (k74.m35097d(tueVar.m50690g()) == f ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m21191g(xkf xkfVar, float f, boolean z, float f2, qh9 qh9Var, zl5 zl5Var) {
        sq8.m48649h(xkfVar, "shape");
        sq8.m48649h(qh9Var, "layoutDirection");
        sq8.m48649h(zl5Var, "density");
        this.f18150c.setAlpha(f);
        boolean z2 = !sq8.m48644c(this.f18152e, xkfVar);
        if (z2) {
            this.f18152e = xkfVar;
            this.f18154g = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.f18161n != z3) {
            this.f18161n = z3;
            this.f18154g = true;
        }
        if (this.f18162o != qh9Var) {
            this.f18162o = qh9Var;
            this.f18154g = true;
        }
        if (!sq8.m48644c(this.f18148a, zl5Var)) {
            this.f18148a = zl5Var;
            this.f18154g = true;
        }
        return z2;
    }

    /* renamed from: h */
    public final void m21192h(long j) {
        if (evf.m25655d(this.f18151d, j)) {
            return;
        }
        this.f18151d = j;
        this.f18154g = true;
    }

    /* renamed from: i */
    public final void m21193i() {
        if (this.f18154g) {
            this.f18159l = s9c.f45035b.m48063c();
            long j = this.f18151d;
            this.f18160m = j;
            this.f18158k = 0.0f;
            this.f18153f = null;
            this.f18154g = false;
            this.f18155h = false;
            if (!this.f18161n || evf.m25657f(j) <= 0.0f || evf.m25656e(this.f18151d) <= 0.0f) {
                this.f18150c.setEmpty();
                return;
            }
            this.f18149b = true;
            bgc bgcVarMo49811a = this.f18152e.mo49811a(this.f18151d, this.f18162o, this.f18148a);
            this.f18165r = bgcVarMo49811a;
            if (bgcVarMo49811a instanceof bgc.C12381a) {
                m21194j(((bgc.C12381a) bgcVarMo49811a).m18882a());
            }
        }
    }

    /* renamed from: j */
    public final void m21194j(mfe mfeVar) {
        this.f18159l = v9c.m52474a(mfeVar.m38945f(), mfeVar.m38948i());
        this.f18160m = jvf.m34585a(mfeVar.m38949j(), mfeVar.m38944e());
        this.f18150c.setRect(lza.m38121d(mfeVar.m38945f()), lza.m38121d(mfeVar.m38948i()), lza.m38121d(mfeVar.m38946g()), lza.m38121d(mfeVar.m38942c()));
    }
}
