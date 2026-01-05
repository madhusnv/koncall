package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class mq1 implements dc9 {

    /* renamed from: a */
    public static final mq1 f35857a = new mq1();

    /* renamed from: b */
    public static final uef f35858b = new yhd("kotlin.Byte", vhd.C17580b.f50343a);

    @Override // p001o.bn5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return Byte.valueOf(w75Var.mo17219G());
    }

    /* renamed from: b */
    public void m39503b(h76 h76Var, byte b) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo29878h(b);
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f35858b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m39503b(h76Var, ((Number) obj).byteValue());
    }
}
