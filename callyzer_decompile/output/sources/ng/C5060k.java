package ng;

import java.util.Objects;
import og.w1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.k */
/* loaded from: classes.dex */
public final class C5060k extends AbstractC5053d {

    /* renamed from: c */
    public final transient Object[] f24845c;

    /* renamed from: d */
    public final transient int f24846d;

    /* renamed from: e */
    public final transient int f24847e;

    public C5060k(Object[] objArr, int i10, int i11) {
        this.f24845c = objArr;
        this.f24846d = i10;
        this.f24847e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        w1.m11022b(i10, this.f24847e);
        Object obj = this.f24845c[i10 + i10 + this.f24846d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24847e;
    }
}
