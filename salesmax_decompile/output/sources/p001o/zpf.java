package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class zpf implements dc9 {

    /* renamed from: a */
    public static final zpf f57493a = new zpf();

    /* renamed from: b */
    public static final uef f57494b = new yhd("kotlin.Short", vhd.C17586h.f50349a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return Short.valueOf(w75Var.mo17250s());
    }

    /* renamed from: b */
    public void m59683b(h76 h76Var, short s) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo29881u(s);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f57494b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m59683b(h76Var, ((Number) obj).shortValue());
    }
}
