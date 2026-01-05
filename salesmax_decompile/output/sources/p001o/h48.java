package p001o;

import p001o.m18;

/* loaded from: classes3.dex */
public final class h48 implements qb2 {

    /* renamed from: a */
    public s48 f26193a;

    /* renamed from: b */
    public final xx7 f26194b;

    /* renamed from: c */
    public m18 f26195c;

    public h48(s48 s48Var, xx7 xx7Var, m18 m18Var) {
        this.f26193a = s48Var;
        this.f26194b = xx7Var;
        this.f26195c = m18Var;
    }

    /* renamed from: b */
    public final g48 m29797b() {
        return j48.m33187b(this.f26193a, this.f26194b.m59807o() ? ux7.f49593b.m52099a() : this.f26194b.m56937t(), this.f26195c);
    }

    @Override // p001o.qb2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h48 mo26958a() {
        return new h48(this.f26193a, this.f26194b.mo26958a(), this.f26195c);
    }

    /* renamed from: d */
    public final xx7 m29799d() {
        return this.f26194b;
    }

    /* renamed from: e */
    public final void m29800e(m18 m18Var) {
        sq8.m48649h(m18Var, "<set-?>");
        this.f26195c = m18Var;
    }

    /* renamed from: f */
    public final void m29801f(s48 s48Var) {
        sq8.m48649h(s48Var, "<set-?>");
        this.f26193a = s48Var;
    }

    public String toString() {
        return "HttpResponseBuilder(status=" + this.f26193a + ", headers=" + this.f26194b + ", body=" + this.f26195c + ')';
    }

    public h48() {
        this(s48.f44774c.m47773E(), new xx7(), m18.C15196d.f34631a);
    }
}
