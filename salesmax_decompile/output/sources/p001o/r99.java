package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class r99 implements dc9 {

    /* renamed from: a */
    public static final r99 f43237a = new r99();

    /* renamed from: b */
    public static final uef f43238b = yef.m57704a("kotlinx.serialization.json.JsonLiteral", vhd.C17587i.f50350a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q99 deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        k89 k89VarMo18279f = o89.m41763d(w75Var).mo18279f();
        if (k89VarMo18279f instanceof q99) {
            return (q99) k89VarMo18279f;
        }
        throw w89.m54057e(-1, "Unexpected JSON element, expected JsonLiteral, had " + kge.m35689b(k89VarMo18279f.getClass()), k89VarMo18279f.toString());
    }

    @Override // p001o.iff
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, q99 q99Var) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(q99Var, "value");
        o89.m41767h(h76Var);
        if (q99Var.m45033n()) {
            h76Var.mo29875F(q99Var.mo24656d());
            return;
        }
        if (q99Var.m45032e() != null) {
            h76Var.mo25651t(q99Var.m45032e()).mo29875F(q99Var.mo24656d());
            return;
        }
        Long lM22640n = d9g.m22640n(q99Var.mo24656d());
        if (lM22640n != null) {
            h76Var.mo29880q(lM22640n.longValue());
            return;
        }
        p0i p0iVarM38193i = m1i.m38193i(q99Var.mo24656d());
        if (p0iVarM38193i != null) {
            h76Var.mo25651t(sm1.m48503C(p0i.f39160b).getDescriptor()).mo29880q(p0iVarM38193i.m42846j());
            return;
        }
        Double dM20528j = c9g.m20528j(q99Var.mo24656d());
        if (dM20528j != null) {
            h76Var.mo29877g(dM20528j.doubleValue());
            return;
        }
        Boolean boolY0 = f9g.Y0(q99Var.mo24656d());
        if (boolY0 != null) {
            h76Var.mo29882w(boolY0.booleanValue());
        } else {
            h76Var.mo29875F(q99Var.mo24656d());
        }
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f43238b;
    }
}
