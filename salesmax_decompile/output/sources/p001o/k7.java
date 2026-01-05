package p001o;

import p001o.jo3;
import p001o.w75;

/* loaded from: classes6.dex */
public abstract class k7 implements w75, jo3 {
    @Override // p001o.jo3
    /* renamed from: A */
    public final double mo17214A(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17254w();
    }

    @Override // p001o.w75
    /* renamed from: B */
    public String mo17215B() {
        Object objM35089J = m35089J();
        sq8.m48647f(objM35089J, "null cannot be cast to non-null type kotlin.String");
        return (String) objM35089J;
    }

    @Override // p001o.w75
    /* renamed from: C */
    public Object mo17216C(bn5 bn5Var) {
        return w75.C17792a.m54034a(this, bn5Var);
    }

    @Override // p001o.w75
    /* renamed from: D */
    public boolean mo20417D() {
        return true;
    }

    @Override // p001o.jo3
    /* renamed from: E */
    public final float mo17217E(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17251t();
    }

    @Override // p001o.jo3
    /* renamed from: F */
    public final int mo17218F(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17240h();
    }

    @Override // p001o.w75
    /* renamed from: G */
    public abstract byte mo17219G();

    @Override // p001o.jo3
    /* renamed from: H */
    public final long mo17220H(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17243l();
    }

    /* renamed from: I */
    public Object m35088I(bn5 bn5Var, Object obj) {
        sq8.m48649h(bn5Var, "deserializer");
        return mo17216C(bn5Var);
    }

    /* renamed from: J */
    public Object m35089J() {
        throw new gff(kge.m35689b(getClass()) + " can't retrieve untyped values");
    }

    @Override // p001o.w75
    /* renamed from: b */
    public jo3 mo20420b(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        return this;
    }

    @Override // p001o.jo3
    /* renamed from: c */
    public void mo18548c(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
    }

    @Override // p001o.w75
    /* renamed from: e */
    public int mo17238e(uef uefVar) {
        sq8.m48649h(uefVar, "enumDescriptor");
        Object objM35089J = m35089J();
        sq8.m48647f(objM35089J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objM35089J).intValue();
    }

    @Override // p001o.jo3
    /* renamed from: g */
    public w75 mo17239g(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17257z(uefVar.mo16765g(i));
    }

    @Override // p001o.w75
    /* renamed from: h */
    public abstract int mo17240h();

    @Override // p001o.w75
    /* renamed from: i */
    public Void mo17241i() {
        return null;
    }

    @Override // p001o.jo3
    /* renamed from: j */
    public final byte mo17242j(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17219G();
    }

    @Override // p001o.w75
    /* renamed from: l */
    public abstract long mo17243l();

    @Override // p001o.jo3
    /* renamed from: m */
    public final Object mo17244m(uef uefVar, int i, bn5 bn5Var, Object obj) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(bn5Var, "deserializer");
        return (bn5Var.getDescriptor().mo16760b() || mo20417D()) ? m35088I(bn5Var, obj) : mo17241i();
    }

    @Override // p001o.jo3
    /* renamed from: n */
    public boolean mo17245n() {
        return jo3.C14621a.m34147b(this);
    }

    @Override // p001o.jo3
    /* renamed from: o */
    public final short mo17246o(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17250s();
    }

    @Override // p001o.jo3
    /* renamed from: p */
    public final String mo17247p(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17215B();
    }

    @Override // p001o.jo3
    /* renamed from: q */
    public int mo17248q(uef uefVar) {
        return jo3.C14621a.m34146a(this, uefVar);
    }

    @Override // p001o.jo3
    /* renamed from: r */
    public final char mo17249r(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17256y();
    }

    @Override // p001o.w75
    /* renamed from: s */
    public abstract short mo17250s();

    @Override // p001o.w75
    /* renamed from: t */
    public float mo17251t() {
        Object objM35089J = m35089J();
        sq8.m48647f(objM35089J, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objM35089J).floatValue();
    }

    @Override // p001o.jo3
    /* renamed from: u */
    public Object mo17252u(uef uefVar, int i, bn5 bn5Var, Object obj) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(bn5Var, "deserializer");
        return m35088I(bn5Var, obj);
    }

    @Override // p001o.jo3
    /* renamed from: v */
    public final boolean mo17253v(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17255x();
    }

    @Override // p001o.w75
    /* renamed from: w */
    public double mo17254w() {
        Object objM35089J = m35089J();
        sq8.m48647f(objM35089J, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objM35089J).doubleValue();
    }

    @Override // p001o.w75
    /* renamed from: x */
    public boolean mo17255x() {
        Object objM35089J = m35089J();
        sq8.m48647f(objM35089J, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objM35089J).booleanValue();
    }

    @Override // p001o.w75
    /* renamed from: y */
    public char mo17256y() {
        Object objM35089J = m35089J();
        sq8.m48647f(objM35089J, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objM35089J).charValue();
    }

    @Override // p001o.w75
    /* renamed from: z */
    public w75 mo17257z(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        return this;
    }
}
