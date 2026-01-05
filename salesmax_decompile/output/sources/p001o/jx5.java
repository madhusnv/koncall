package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class jx5 implements dc9 {

    /* renamed from: a */
    public static final jx5 f31219a = new jx5();

    /* renamed from: b */
    public static final uef f31220b = new yhd("kotlin.Double", vhd.C17582d.f50345a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return Double.valueOf(w75Var.mo17254w());
    }

    /* renamed from: b */
    public void m34650b(h76 h76Var, double d) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo29877g(d);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f31220b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m34650b(h76Var, ((Number) obj).doubleValue());
    }
}
