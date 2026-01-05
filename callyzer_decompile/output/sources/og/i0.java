package og;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends a0 {

    /* renamed from: c */
    public final transient Object[] f26527c;

    /* renamed from: d */
    public final transient int f26528d;

    /* renamed from: e */
    public final transient int f26529e = 1;

    public i0(int i10, Object[] objArr) {
        this.f26527c = objArr;
        this.f26528d = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        qa.m10846a(i10, this.f26529e);
        Object obj = this.f26527c[i10 + i10 + this.f26528d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26529e;
    }
}
