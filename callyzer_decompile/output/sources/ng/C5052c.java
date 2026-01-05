package ng;

import og.w1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.c */
/* loaded from: classes.dex */
public final class C5052c extends AbstractC5053d {

    /* renamed from: c */
    public final transient int f24828c;

    /* renamed from: d */
    public final transient int f24829d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC5053d f24830e;

    public C5052c(AbstractC5053d abstractC5053d, int i10, int i11) {
        this.f24830e = abstractC5053d;
        this.f24828c = i10;
        this.f24829d = i11;
    }

    @Override // ng.AbstractC5050a
    /* renamed from: b */
    public final int mo9988b() {
        return this.f24830e.mo9989c() + this.f24828c + this.f24829d;
    }

    @Override // ng.AbstractC5050a
    /* renamed from: c */
    public final int mo9989c() {
        return this.f24830e.mo9989c() + this.f24828c;
    }

    @Override // ng.AbstractC5050a
    /* renamed from: e */
    public final Object[] mo9990e() {
        return this.f24830e.mo9990e();
    }

    @Override // ng.AbstractC5053d, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC5053d subList(int i10, int i11) {
        w1.m11024d(i10, i11, this.f24829d);
        int i12 = this.f24828c;
        return this.f24830e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w1.m11022b(i10, this.f24829d);
        return this.f24830e.get(i10 + this.f24828c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24829d;
    }
}
