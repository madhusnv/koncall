package mg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.m */
/* loaded from: classes.dex */
public final class C4734m extends AbstractC4735n {

    /* renamed from: c */
    public final transient int f23674c;

    /* renamed from: d */
    public final transient int f23675d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC4735n f23676e;

    public C4734m(AbstractC4735n abstractC4735n, int i10, int i11) {
        this.f23676e = abstractC4735n;
        this.f23674c = i10;
        this.f23675d = i11;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: b */
    public final int mo9589b() {
        return this.f23676e.mo9590c() + this.f23674c + this.f23675d;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: c */
    public final int mo9590c() {
        return this.f23676e.mo9590c() + this.f23674c;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: g */
    public final Object[] mo9592g() {
        return this.f23676e.mo9592g();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4723b.m9603e(i10, this.f23675d);
        return this.f23676e.get(i10 + this.f23674c);
    }

    @Override // mg.AbstractC4735n, java.util.List
    /* renamed from: j */
    public final AbstractC4735n subList(int i10, int i11) {
        AbstractC4723b.m9611m(i10, i11, this.f23675d);
        int i12 = this.f23674c;
        return this.f23676e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23675d;
    }
}
