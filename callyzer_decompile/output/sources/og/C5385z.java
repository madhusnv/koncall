package og;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.z */
/* loaded from: classes.dex */
public final class C5385z extends a0 {

    /* renamed from: c */
    public final transient int f26979c;

    /* renamed from: d */
    public final transient int f26980d;

    /* renamed from: e */
    public final /* synthetic */ a0 f26981e;

    public C5385z(a0 a0Var, int i10, int i11) {
        this.f26981e = a0Var;
        this.f26979c = i10;
        this.f26980d = i11;
    }

    @Override // og.AbstractC5382w
    /* renamed from: b */
    public final int mo10616b() {
        return this.f26981e.mo10617c() + this.f26979c + this.f26980d;
    }

    @Override // og.AbstractC5382w
    /* renamed from: c */
    public final int mo10617c() {
        return this.f26981e.mo10617c() + this.f26979c;
    }

    @Override // og.AbstractC5382w
    /* renamed from: e */
    public final Object[] mo10618e() {
        return this.f26981e.mo10618e();
    }

    @Override // og.a0, java.util.List
    /* renamed from: g */
    public final a0 subList(int i10, int i11) {
        qa.m10849d(i10, i11, this.f26980d);
        int i12 = this.f26979c;
        return this.f26981e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        qa.m10846a(i10, this.f26980d);
        return this.f26981e.get(i10 + this.f26979c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26980d;
    }
}
