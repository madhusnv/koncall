package p001o;

import java.util.ArrayList;
import java.util.Set;
import p001o.u6f;

/* loaded from: classes3.dex */
public final class ff7 implements l9g, zhd {

    /* renamed from: a */
    public final ye7 f23203a;

    /* renamed from: b */
    public final h7f f23204b;

    /* renamed from: c */
    public final String f23205c;

    public ff7(ye7 ye7Var, h7f h7fVar, String str) {
        sq8.m48649h(ye7Var, "parent");
        sq8.m48649h(h7fVar, "structDescriptor");
        sq8.m48649h(str, "prefix");
        this.f23203a = ye7Var;
        this.f23204b = h7fVar;
        this.f23205c = str;
        Set<hu6> setM29948c = h7fVar.m29948c();
        ArrayList<b5e> arrayList = new ArrayList();
        for (hu6 hu6Var : setM29948c) {
            b5e b5eVar = hu6Var instanceof b5e ? (b5e) hu6Var : null;
            if (b5eVar != null) {
                arrayList.add(b5eVar);
            }
        }
        for (final b5e b5eVar2 : arrayList) {
            m26538G(ze7.m59344k(b5eVar2), new uk7() { // from class: o.ef7
                @Override // p001o.uk7
                public final Object invoke() {
                    return ff7.m26525C(this.f21540a, b5eVar2);
                }
            });
        }
    }

    /* renamed from: A */
    public static final y3i m26524A(ff7 ff7Var, float f) {
        ff7Var.m26536E(f);
        return y3i.f54824a;
    }

    /* renamed from: C */
    public static final y3i m26525C(ff7 ff7Var, b5e b5eVar) {
        ff7Var.mo21108d(b5eVar.m18172b());
        return y3i.f54824a;
    }

    /* renamed from: x */
    public static final y3i m26531x(ff7 ff7Var, String str) {
        ff7Var.mo21108d(str);
        return y3i.f54824a;
    }

    /* renamed from: y */
    public static final y3i m26532y(ff7 ff7Var, boolean z) {
        ff7Var.m26535D(z);
        return y3i.f54824a;
    }

    /* renamed from: z */
    public static final y3i m26533z(ff7 ff7Var, int i) {
        ff7Var.m26537F(i);
        return y3i.f54824a;
    }

    /* renamed from: B */
    public final t6f m26534B() {
        return this.f23203a.m57685v();
    }

    /* renamed from: D */
    public void m26535D(boolean z) {
        this.f23203a.m57686w(z);
    }

    /* renamed from: E */
    public void m26536E(float f) {
        this.f23203a.m57687x(f);
    }

    /* renamed from: F */
    public void m26537F(int i) {
        this.f23203a.m57688z(i);
    }

    /* renamed from: G */
    public final void m26538G(h7f h7fVar, uk7 uk7Var) {
        if (m26534B().m49489c() > 0) {
            u6f.C17307a.m51045b(m26534B(), "&", 0, 0, 6, null);
        }
        if (!f9g.d0(this.f23205c)) {
            u6f.C17307a.m51045b(m26534B(), this.f23205c, 0, 0, 6, null);
        }
        u6f.C17307a.m51045b(m26534B(), ze7.m59343j(h7fVar), 0, 0, 6, null);
        u6f.C17307a.m51045b(m26534B(), "=", 0, 0, 6, null);
        uk7Var.invoke();
    }

    @Override // p001o.l9g
    /* renamed from: b */
    public void mo26539b(h7f h7fVar, vv5 vv5Var) {
        sq8.m48649h(h7fVar, "descriptor");
        throw new hff("cannot serialize field " + ze7.m59343j(h7fVar) + "; Document type is not supported by form-url encoding");
    }

    @Override // p001o.l9g
    /* renamed from: c */
    public void mo26540c(h7f h7fVar, xk7 xk7Var) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(xk7Var, "block");
        qe7 qe7Var = new qe7(this.f23203a, ze7.m59341h(h7fVar, this.f23205c + ze7.m59343j(h7fVar)));
        xk7Var.invoke(qe7Var);
        qe7Var.mo21110f();
    }

    @Override // p001o.zhd
    /* renamed from: d */
    public void mo21108d(String str) {
        sq8.m48649h(str, "value");
        this.f23203a.mo21108d(str);
    }

    @Override // p001o.l9g
    /* renamed from: g */
    public void mo26541g(h7f h7fVar, final String str) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(str, "value");
        m26538G(h7fVar, new uk7() { // from class: o.bf7
            @Override // p001o.uk7
            public final Object invoke() {
                return ff7.m26531x(this.f16089a, str);
            }
        });
    }

    @Override // p001o.l9g
    /* renamed from: i */
    public void mo26542i(h7f h7fVar, final boolean z) {
        sq8.m48649h(h7fVar, "descriptor");
        m26538G(h7fVar, new uk7() { // from class: o.af7
            @Override // p001o.uk7
            public final Object invoke() {
                return ff7.m26532y(this.f14594a, z);
            }
        });
    }

    @Override // p001o.l9g
    /* renamed from: j */
    public void mo26543j() {
    }

    @Override // p001o.l9g
    /* renamed from: n */
    public void mo26544n(h7f h7fVar, c8f c8fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(c8fVar, "value");
        c8fVar.mo20495a(new ye7(m26534B(), this.f23205c + ze7.m59343j(h7fVar) + '.'));
    }

    @Override // p001o.l9g
    /* renamed from: p */
    public void mo26545p(h7f h7fVar, final float f) {
        sq8.m48649h(h7fVar, "descriptor");
        m26538G(h7fVar, new uk7() { // from class: o.df7
            @Override // p001o.uk7
            public final Object invoke() {
                return ff7.m26524A(this.f19730a, f);
            }
        });
    }

    @Override // p001o.l9g
    /* renamed from: q */
    public void mo26546q(h7f h7fVar, final int i) {
        sq8.m48649h(h7fVar, "descriptor");
        m26538G(h7fVar, new uk7() { // from class: o.cf7
            @Override // p001o.uk7
            public final Object invoke() {
                return ff7.m26533z(this.f18028a, i);
            }
        });
    }

    @Override // p001o.l9g
    /* renamed from: r */
    public void mo26547r(h7f h7fVar, xk7 xk7Var) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(xk7Var, "block");
        xk7Var.invoke(new te7(this.f23203a, ze7.m59341h(h7fVar, this.f23205c + ze7.m59343j(h7fVar))));
    }
}
