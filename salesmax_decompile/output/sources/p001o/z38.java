package p001o;

import p001o.l8i;
import p001o.m18;

/* loaded from: classes3.dex */
public final class z38 implements qb2 {

    /* renamed from: a */
    public o38 f56461a;

    /* renamed from: b */
    public final l8i.C15036a f56462b;

    /* renamed from: c */
    public final xx7 f56463c;

    /* renamed from: d */
    public m18 f56464d;

    /* renamed from: e */
    public final fk5 f56465e;

    public z38(o38 o38Var, l8i.C15036a c15036a, xx7 xx7Var, m18 m18Var, fk5 fk5Var) {
        this.f56461a = o38Var;
        this.f56462b = c15036a;
        this.f56463c = xx7Var;
        this.f56464d = m18Var;
        this.f56465e = fk5Var;
    }

    /* renamed from: b */
    public final y38 m58665b() {
        return f48.m26051a(this.f56461a, this.f56462b.m36761b(), this.f56463c.m59807o() ? ux7.f49593b.m52099a() : this.f56463c.m56937t(), this.f56464d, this.f56465e.m59807o() ? ek5.f21784a.m25185a() : this.f56465e.m26959t());
    }

    @Override // p001o.qb2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public z38 mo26958a() {
        return new z38(this.f56461a, this.f56462b.mo26958a(), this.f56463c.mo26958a(), this.f56464d, this.f56465e.mo26958a());
    }

    /* renamed from: d */
    public final m18 m58667d() {
        return this.f56464d;
    }

    /* renamed from: e */
    public final xx7 m58668e() {
        return this.f56463c;
    }

    /* renamed from: f */
    public final o38 m58669f() {
        return this.f56461a;
    }

    /* renamed from: g */
    public final fk5 m58670g() {
        return this.f56465e;
    }

    /* renamed from: h */
    public final l8i.C15036a m58671h() {
        return this.f56462b;
    }

    /* renamed from: i */
    public final void m58672i(m18 m18Var) {
        sq8.m48649h(m18Var, "<set-?>");
        this.f56464d = m18Var;
    }

    /* renamed from: j */
    public final void m58673j(o38 o38Var) {
        sq8.m48649h(o38Var, "<set-?>");
        this.f56461a = o38Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HttpRequestBuilder(method=" + this.f56461a + ", url=" + this.f56462b + ", headers=" + this.f56463c + ", body=" + this.f56464d + ", trailingHeaders=" + this.f56465e + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public z38() {
        this(o38.GET, new l8i.C15036a(), new xx7(), m18.C15196d.f34631a, new fk5());
    }
}
