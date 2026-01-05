package mg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.l */
/* loaded from: classes.dex */
public final class C4733l extends AbstractC4735n {

    /* renamed from: c */
    public final transient AbstractC4735n f23663c;

    public C4733l(AbstractC4735n abstractC4735n) {
        this.f23663c = abstractC4735n;
    }

    @Override // mg.AbstractC4735n, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f23663c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4735n abstractC4735n = this.f23663c;
        AbstractC4723b.m9603e(i10, abstractC4735n.size());
        return abstractC4735n.get((abstractC4735n.size() - 1) - i10);
    }

    @Override // mg.AbstractC4735n
    /* renamed from: h */
    public final AbstractC4735n mo9623h() {
        return this.f23663c;
    }

    @Override // mg.AbstractC4735n, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f23663c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // mg.AbstractC4735n, java.util.List
    /* renamed from: j */
    public final AbstractC4735n subList(int i10, int i11) {
        AbstractC4735n abstractC4735n = this.f23663c;
        AbstractC4723b.m9611m(i10, i11, abstractC4735n.size());
        return abstractC4735n.subList(abstractC4735n.size() - i11, abstractC4735n.size() - i10).mo9623h();
    }

    @Override // mg.AbstractC4735n, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f23663c.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23663c.size();
    }
}
