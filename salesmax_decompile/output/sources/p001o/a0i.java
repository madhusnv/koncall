package p001o;

/* loaded from: classes6.dex */
public final class a0i implements dc9 {

    /* renamed from: a */
    public static final a0i f14016a = new a0i();

    /* renamed from: b */
    public static final uef f14017b = zi8.m59498a("kotlin.UByte", sm1.m48523r(gq1.f25657a));

    /* renamed from: a */
    public byte m16321a(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return wzh.m55511c(w75Var.mo17257z(getDescriptor()).mo17219G());
    }

    /* renamed from: b */
    public void m16322b(h76 h76Var, byte b) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo25651t(getDescriptor()).mo29878h(b);
    }

    @Override // p001o.bn5
    public /* bridge */ /* synthetic */ Object deserialize(w75 w75Var) {
        return wzh.m55510a(m16321a(w75Var));
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f14017b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m16322b(h76Var, ((wzh) obj).m55515h());
    }
}
