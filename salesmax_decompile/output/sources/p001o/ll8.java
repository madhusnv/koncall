package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class ll8 implements dc9 {

    /* renamed from: a */
    public static final ll8 f34006a = new ll8();

    /* renamed from: b */
    public static final uef f34007b = new yhd("kotlin.Int", vhd.C17584f.f50347a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return Integer.valueOf(w75Var.mo17240h());
    }

    /* renamed from: b */
    public void m37429b(h76 h76Var, int i) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo29873B(i);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f34007b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m37429b(h76Var, ((Number) obj).intValue());
    }
}
