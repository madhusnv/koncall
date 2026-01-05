package p001o;

import p001o.vhd;

/* loaded from: classes6.dex */
public final class n16 implements dc9 {

    /* renamed from: a */
    public static final n16 f36212a = new n16();

    /* renamed from: b */
    public static final uef f36213b = new yhd("kotlin.time.Duration", vhd.C17587i.f50350a);

    /* renamed from: a */
    public long m39978a(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return k16.f31358b.m34901d(w75Var.mo17215B());
    }

    /* renamed from: b */
    public void m39979b(h76 h76Var, long j) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo29875F(k16.m34874T(j));
    }

    @Override // p001o.bn5
    public /* bridge */ /* synthetic */ Object deserialize(w75 w75Var) {
        return k16.m34883h(m39978a(w75Var));
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f36213b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m39979b(h76Var, ((k16) obj).m34896X());
    }
}
