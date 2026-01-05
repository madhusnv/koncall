package m2;

import fx.InterfaceC2395a;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m2.d */
/* loaded from: classes.dex */
public final class C4639d implements ListIterator, InterfaceC2395a {

    /* renamed from: a */
    public final Object f22882a;

    /* renamed from: b */
    public int f22883b;

    public C4639d(List list, int i10) {
        this.f22882a = list;
        this.f22883b = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f22882a.add(this.f22883b, obj);
        this.f22883b++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f22883b < this.f22882a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f22883b > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f22883b;
        this.f22883b = i10 + 1;
        return this.f22882a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f22883b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f22883b - 1;
        this.f22883b = i10;
        return this.f22882a.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f22883b - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f22883b - 1;
        this.f22883b = i10;
        this.f22882a.remove(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f22882a.set(this.f22883b, obj);
    }
}
