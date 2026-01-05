package p001o;

import p001o.h76;
import p001o.lo3;

/* loaded from: classes6.dex */
public abstract class m7 implements h76, lo3 {
    @Override // p001o.h76
    /* renamed from: A */
    public void mo29872A() {
        h76.C13887a.m29886b(this);
    }

    @Override // p001o.h76
    /* renamed from: B */
    public void mo29873B(int i) {
        mo25645I(Integer.valueOf(i));
    }

    @Override // p001o.lo3
    /* renamed from: C */
    public final void mo37558C(uef uefVar, int i, float f) {
        sq8.m48649h(uefVar, "descriptor");
        if (mo25644G(uefVar, i)) {
            mo29883x(f);
        }
    }

    @Override // p001o.h76
    /* renamed from: D */
    public lo3 mo29874D(uef uefVar, int i) {
        return h76.C13887a.m29885a(this, uefVar, i);
    }

    @Override // p001o.lo3
    /* renamed from: E */
    public final void mo37559E(uef uefVar, int i, byte b) {
        sq8.m48649h(uefVar, "descriptor");
        if (mo25644G(uefVar, i)) {
            mo29878h(b);
        }
    }

    @Override // p001o.h76
    /* renamed from: F */
    public void mo29875F(String str) {
        sq8.m48649h(str, "value");
        mo25645I(str);
    }

    /* renamed from: G */
    public boolean mo25644G(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return true;
    }

    /* renamed from: H */
    public void m38463H(iff iffVar, Object obj) {
        h76.C13887a.m29887c(this, iffVar, obj);
    }

    /* renamed from: I */
    public void mo25645I(Object obj) {
        sq8.m48649h(obj, "value");
        throw new gff("Non-serializable " + kge.m35689b(obj.getClass()) + " is not supported by " + kge.m35689b(getClass()) + " encoder");
    }

    @Override // p001o.h76
    /* renamed from: b */
    public lo3 mo29876b(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        return this;
    }

    @Override // p001o.lo3
    /* renamed from: c */
    public void mo37560c(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
    }

    @Override // p001o.lo3
    /* renamed from: e */
    public final void mo37561e(uef uefVar, int i, boolean z) {
        sq8.m48649h(uefVar, "descriptor");
        if (mo25644G(uefVar, i)) {
            mo29882w(z);
        }
    }

    @Override // p001o.lo3
    /* renamed from: f */
    public final void mo37562f(uef uefVar, int i, int i2) {
        sq8.m48649h(uefVar, "descriptor");
        if (mo25644G(uefVar, i)) {
            mo29873B(i2);
        }
    }

    @Override // p001o.h76
    /* renamed from: g */
    public void mo29877g(double d) {
        mo25645I(Double.valueOf(d));
    }

    @Override // p001o.h76
    /* renamed from: h */
    public void mo29878h(byte b) {
        mo25645I(Byte.valueOf(b));
    }

    @Override // p001o.lo3
    /* renamed from: i */
    public final void mo37563i(uef uefVar, int i, char c) {
        sq8.m48649h(uefVar, "descriptor");
        if (mo25644G(uefVar, i)) {
            mo29884y(c);
        }
    }

    @Override // p001o.lo3
    /* renamed from: j */
    public final void mo37564j(uef uefVar, int i, double d) {
        sq8.m48649h(uefVar, "descriptor");
        if (mo25644G(uefVar, i)) {
            mo29877g(d);
        }
    }

    @Override // p001o.lo3
    /* renamed from: k */
    public final void mo37565k(uef uefVar, int i, long j) {
        sq8.m48649h(uefVar, "descriptor");
        if (mo25644G(uefVar, i)) {
            mo29880q(j);
        }
    }

    @Override // p001o.lo3
    /* renamed from: l */
    public void mo37566l(uef uefVar, int i, iff iffVar, Object obj) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(iffVar, "serializer");
        if (mo25644G(uefVar, i)) {
            mo25649n(iffVar, obj);
        }
    }

    @Override // p001o.h76
    /* renamed from: m */
    public void mo29879m(uef uefVar, int i) {
        sq8.m48649h(uefVar, "enumDescriptor");
        mo25645I(Integer.valueOf(i));
    }

    @Override // p001o.h76
    /* renamed from: n */
    public void mo25649n(iff iffVar, Object obj) {
        h76.C13887a.m29888d(this, iffVar, obj);
    }

    @Override // p001o.lo3
    /* renamed from: o */
    public final h76 mo37567o(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo25644G(uefVar, i) ? mo25651t(uefVar.mo16765g(i)) : jzb.f31288a;
    }

    @Override // p001o.lo3
    /* renamed from: p */
    public final void mo37568p(uef uefVar, int i, String str) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(str, "value");
        if (mo25644G(uefVar, i)) {
            mo29875F(str);
        }
    }

    @Override // p001o.h76
    /* renamed from: q */
    public void mo29880q(long j) {
        mo25645I(Long.valueOf(j));
    }

    @Override // p001o.lo3
    /* renamed from: r */
    public boolean mo37569r(uef uefVar, int i) {
        return lo3.C15121a.m37572a(this, uefVar, i);
    }

    @Override // p001o.h76
    /* renamed from: t */
    public h76 mo25651t(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        return this;
    }

    @Override // p001o.h76
    /* renamed from: u */
    public void mo29881u(short s) {
        mo25645I(Short.valueOf(s));
    }

    @Override // p001o.lo3
    /* renamed from: v */
    public final void mo37570v(uef uefVar, int i, short s) {
        sq8.m48649h(uefVar, "descriptor");
        if (mo25644G(uefVar, i)) {
            mo29881u(s);
        }
    }

    @Override // p001o.h76
    /* renamed from: w */
    public void mo29882w(boolean z) {
        mo25645I(Boolean.valueOf(z));
    }

    @Override // p001o.h76
    /* renamed from: x */
    public void mo29883x(float f) {
        mo25645I(Float.valueOf(f));
    }

    @Override // p001o.h76
    /* renamed from: y */
    public void mo29884y(char c) {
        mo25645I(Character.valueOf(c));
    }

    @Override // p001o.lo3
    /* renamed from: z */
    public void mo37571z(uef uefVar, int i, iff iffVar, Object obj) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(iffVar, "serializer");
        if (mo25644G(uefVar, i)) {
            m38463H(iffVar, obj);
        }
    }
}
