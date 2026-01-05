package pg;

import og.tb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class qa extends ra {

    /* renamed from: c */
    public final transient int f29038c;

    /* renamed from: d */
    public final transient int f29039d;

    /* renamed from: e */
    public final /* synthetic */ ra f29040e;

    public qa(ra raVar, int i10, int i11) {
        this.f29040e = raVar;
        this.f29038c = i10;
        this.f29039d = i11;
    }

    @Override // pg.l9
    /* renamed from: b */
    public final int mo11770b() {
        return this.f29040e.mo11771c() + this.f29038c + this.f29039d;
    }

    @Override // pg.l9
    /* renamed from: c */
    public final int mo11771c() {
        return this.f29040e.mo11771c() + this.f29038c;
    }

    @Override // pg.l9
    /* renamed from: e */
    public final Object[] mo11772e() {
        return this.f29040e.mo11772e();
    }

    @Override // pg.ra, java.util.List
    /* renamed from: g */
    public final ra subList(int i10, int i11) {
        tb.m10930c(i10, i11, this.f29039d);
        int i12 = this.f29038c;
        return this.f29040e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        tb.m10929b(i10, this.f29039d);
        return this.f29040e.get(i10 + this.f29038c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29039d;
    }
}
