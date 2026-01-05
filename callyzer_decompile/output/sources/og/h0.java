package og;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends b0 {

    /* renamed from: c */
    public final transient j0 f26486c;

    /* renamed from: d */
    public final transient i0 f26487d;

    public h0(j0 j0Var, i0 i0Var) {
        this.f26486c = j0Var;
        this.f26487d = i0Var;
    }

    @Override // og.AbstractC5382w
    /* renamed from: a */
    public final int mo10520a(int i10, Object[] objArr) {
        return this.f26487d.mo10520a(i10, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f26486c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f26487d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
