package ng;

import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.j */
/* loaded from: classes.dex */
public final class C5059j extends AbstractC5055f {

    /* renamed from: c */
    public final transient C5061l f24843c;

    /* renamed from: d */
    public final transient C5060k f24844d;

    public C5059j(C5061l c5061l, C5060k c5060k) {
        this.f24843c = c5061l;
        this.f24844d = c5060k;
    }

    @Override // ng.AbstractC5050a
    /* renamed from: a */
    public final int mo9987a(Object[] objArr) {
        return this.f24844d.mo9987a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f24843c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f24844d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24843c.f24854f;
    }
}
