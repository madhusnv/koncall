package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class hk1 implements dc9 {

    /* renamed from: a */
    public static final hk1 f27067a = new hk1();

    /* renamed from: b */
    public static final uef f27068b = new yhd("kotlin.Boolean", vhd.C17579a.f50342a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return Boolean.valueOf(w75Var.mo17255x());
    }

    /* renamed from: b */
    public void m30676b(h76 h76Var, boolean z) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo29882w(z);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f27068b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m30676b(h76Var, ((Boolean) obj).booleanValue());
    }
}
