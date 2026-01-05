package pg;

import og.tb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class xa extends ra {

    /* renamed from: c */
    public final transient Object[] f29114c;

    /* renamed from: d */
    public final transient int f29115d;

    /* renamed from: e */
    public final transient int f29116e = 1;

    public xa(int i10, Object[] objArr) {
        this.f29114c = objArr;
        this.f29115d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        tb.m10929b(i10, this.f29116e);
        Object obj = this.f29114c[i10 + i10 + this.f29115d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29116e;
    }
}
