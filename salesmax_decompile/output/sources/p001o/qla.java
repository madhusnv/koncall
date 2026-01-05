package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class qla implements dc9 {

    /* renamed from: a */
    public static final qla f42120a = new qla();

    /* renamed from: b */
    public static final uef f42121b = new yhd("kotlin.Long", vhd.C17585g.f50348a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return Long.valueOf(w75Var.mo17243l());
    }

    /* renamed from: b */
    public void m45633b(h76 h76Var, long j) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo29880q(j);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f42121b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m45633b(h76Var, ((Number) obj).longValue());
    }
}
