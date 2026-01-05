package p001o;

/* loaded from: classes6.dex */
public final class o0i implements dc9 {

    /* renamed from: a */
    public static final o0i f37514a = new o0i();

    /* renamed from: b */
    public static final uef f37515b = zi8.m59498a("kotlin.UInt", sm1.m48528w(cl8.f18292a));

    /* renamed from: a */
    public int m41340a(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return j0i.m33018c(w75Var.mo17257z(getDescriptor()).mo17240h());
    }

    /* renamed from: b */
    public void m41341b(h76 h76Var, int i) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo25651t(getDescriptor()).mo29873B(i);
    }

    @Override // p001o.bn5
    public /* bridge */ /* synthetic */ Object deserialize(w75 w75Var) {
        return j0i.m33017a(m41340a(w75Var));
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f37515b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m41341b(h76Var, ((j0i) obj).m33022h());
    }
}
