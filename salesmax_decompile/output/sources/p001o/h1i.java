package p001o;

/* loaded from: classes6.dex */
public final class h1i implements dc9 {

    /* renamed from: a */
    public static final h1i f26108a = new h1i();

    /* renamed from: b */
    public static final uef f26109b = zi8.m59498a("kotlin.UShort", sm1.m48530y(wpf.f52456a));

    /* renamed from: a */
    public short m29752a(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        return d1i.m22246c(w75Var.mo17257z(getDescriptor()).mo17250s());
    }

    /* renamed from: b */
    public void m29753b(h76 h76Var, short s) {
        sq8.m48649h(h76Var, "encoder");
        h76Var.mo25651t(getDescriptor()).mo29881u(s);
    }

    @Override // p001o.bn5
    public /* bridge */ /* synthetic */ Object deserialize(w75 w75Var) {
        return d1i.m22245a(m29752a(w75Var));
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return f26109b;
    }

    @Override // p001o.iff
    public /* bridge */ /* synthetic */ void serialize(h76 h76Var, Object obj) {
        m29753b(h76Var, ((d1i) obj).m22250h());
    }
}
