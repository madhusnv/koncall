package pg;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class wa extends sa {

    /* renamed from: c */
    public final transient og.j0 f29104c;

    /* renamed from: d */
    public final transient xa f29105d;

    public wa(og.j0 j0Var, xa xaVar) {
        this.f29104c = j0Var;
        this.f29105d = xaVar;
    }

    @Override // pg.l9
    /* renamed from: a */
    public final int mo11769a(Object[] objArr) {
        return this.f29105d.mo11769a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29104c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f29105d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f29104c.getClass();
        return 1;
    }
}
