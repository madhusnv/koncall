package p001o;

/* loaded from: classes6.dex */
public final class t0i implements dc9 {

    /* renamed from: a */
    public static final t0i f46191a = new t0i();

    /* renamed from: b */
    public static final uef f46192b = zi8.m59498a("kotlin.ULong", sm1.m48529x(hla.f27108a));

    /* renamed from: a */
    public long m49113a(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return p0i.m42841c(w75Var.mo17257z(getDescriptor()).mo17243l());
    }

    /* renamed from: b */
    public void m49114b(h76 h76Var, long j) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo25651t(getDescriptor()).mo29880q(j);
    }

    @Override // p001o.bn5
    public /* bridge */ /* synthetic */ Object deserialize(w75 w75Var) {
        return p0i.m42840a(m49113a(w75Var));
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f46192b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m49114b(h76Var, ((p0i) obj).m42846j());
    }
}
