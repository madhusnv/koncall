package p001o;

/* loaded from: classes6.dex */
public final class m89 {

    /* renamed from: a */
    public final m46 f34962a;

    /* renamed from: b */
    public boolean f34963b;

    /* renamed from: o.m89$a */
    public /* synthetic */ class C15250a extends dm7 implements nl7 {
        public C15250a(Object obj) {
            super(2, obj, m89.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        /* renamed from: b */
        public final Boolean m38554b(uef uefVar, int i) {
            sq8.m48649h(uefVar, "p0");
            return Boolean.valueOf(((m89) this.receiver).m38553e(uefVar, i));
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m38554b((uef) obj, ((Number) obj2).intValue());
        }
    }

    public m89(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        this.f34962a = new m46(uefVar, new C15250a(this));
    }

    /* renamed from: b */
    public final boolean m38550b() {
        return this.f34963b;
    }

    /* renamed from: c */
    public final void m38551c(int i) {
        this.f34962a.m38339a(i);
    }

    /* renamed from: d */
    public final int m38552d() {
        return this.f34962a.m38342d();
    }

    /* renamed from: e */
    public final boolean m38553e(uef uefVar, int i) {
        boolean z = !uefVar.mo16767i(i) && uefVar.mo16765g(i).mo16760b();
        this.f34963b = z;
        return z;
    }
}
