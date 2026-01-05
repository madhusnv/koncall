package p001o;

/* loaded from: classes2.dex */
public final class t9c implements ao0 {

    /* renamed from: a */
    public final ao0 f46666a;

    /* renamed from: b */
    public final int f46667b;

    /* renamed from: c */
    public int f46668c;

    public t9c(ao0 ao0Var, int i) {
        sq8.m48649h(ao0Var, "applier");
        this.f46666a = ao0Var;
        this.f46667b = i;
    }

    @Override // p001o.ao0
    /* renamed from: a */
    public void mo17547a(int i, int i2) {
        this.f46666a.mo17547a(i + (this.f46668c == 0 ? this.f46667b : 0), i2);
    }

    @Override // p001o.ao0
    /* renamed from: b */
    public void mo17548b(int i, int i2, int i3) {
        int i4 = this.f46668c == 0 ? this.f46667b : 0;
        this.f46666a.mo17548b(i + i4, i2 + i4, i3);
    }

    @Override // p001o.ao0
    /* renamed from: c */
    public void mo17549c(int i, Object obj) {
        this.f46666a.mo17549c(i + (this.f46668c == 0 ? this.f46667b : 0), obj);
    }

    @Override // p001o.ao0
    public void clear() {
        go3.m29222v("Clear is not valid on OffsetApplier".toString());
        throw new qe9();
    }

    @Override // p001o.ao0
    /* renamed from: e */
    public void mo17551e(int i, Object obj) {
        this.f46666a.mo17551e(i + (this.f46668c == 0 ? this.f46667b : 0), obj);
    }

    @Override // p001o.ao0
    /* renamed from: f */
    public void mo17552f(Object obj) {
        this.f46668c++;
        this.f46666a.mo17552f(obj);
    }

    @Override // p001o.ao0
    /* renamed from: h */
    public void mo17554h() {
        int i = this.f46668c;
        if (!(i > 0)) {
            go3.m29222v("OffsetApplier up called with no corresponding down".toString());
            throw new qe9();
        }
        this.f46668c = i - 1;
        this.f46666a.mo17554h();
    }
}
