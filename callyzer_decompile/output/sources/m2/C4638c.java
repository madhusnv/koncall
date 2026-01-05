package m2;

import fx.InterfaceC2397c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m2.c */
/* loaded from: classes.dex */
public final class C4638c implements List, InterfaceC2397c {

    /* renamed from: a */
    public final Object f22879a;

    /* renamed from: b */
    public final int f22880b;

    /* renamed from: c */
    public int f22881c;

    public C4638c(List list, int i10, int i11) {
        this.f22879a = list;
        this.f22880b = i10;
        this.f22881c = i11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f22881c;
        this.f22881c = i10 + 1;
        this.f22879a.add(i10, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        this.f22879a.addAll(i10 + this.f22880b, collection);
        int size = collection.size();
        this.f22881c += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10 = this.f22881c - 1;
        int i11 = this.f22880b;
        if (i11 <= i10) {
            while (true) {
                this.f22879a.remove(i10);
                if (i10 == i11) {
                    break;
                } else {
                    i10--;
                }
            }
        }
        this.f22881c = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f22881c;
        for (int i11 = this.f22880b; i11 < i10; i11++) {
            if (AbstractC4154l.m8918a(this.f22879a.get(i11), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4641f.m9519a(this, i10);
        return this.f22879a.get(i10 + this.f22880b);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10 = this.f22881c;
        int i11 = this.f22880b;
        for (int i12 = i11; i12 < i10; i12++) {
            if (AbstractC4154l.m8918a(this.f22879a.get(i12), obj)) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f22881c == this.f22880b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C4639d(this, 0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10 = this.f22881c - 1;
        int i11 = this.f22880b;
        if (i11 > i10) {
            return -1;
        }
        while (!AbstractC4154l.m8918a(this.f22879a.get(i10), obj)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C4639d(this, 0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10 = this.f22881c;
        for (int i11 = this.f22880b; i11 < i10; i11++) {
            ?? r22 = this.f22879a;
            if (AbstractC4154l.m8918a(r22.get(i11), obj)) {
                r22.remove(i11);
                this.f22881c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10 = this.f22881c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f22881c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10 = this.f22881c;
        int i11 = i10 - 1;
        int i12 = this.f22880b;
        if (i12 <= i11) {
            while (true) {
                ?? r32 = this.f22879a;
                if (!collection.contains(r32.get(i11))) {
                    r32.remove(i11);
                    this.f22881c--;
                }
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        return i10 != this.f22881c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        AbstractC4641f.m9519a(this, i10);
        return this.f22879a.set(i10 + this.f22880b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f22881c - this.f22880b;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        AbstractC4641f.m9520b(this, i10, i11);
        return new C4638c(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f22879a.add(i10 + this.f22880b, obj);
        this.f22881c++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C4639d(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4153k.m8917b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f22879a.addAll(this.f22881c, collection);
        int size = collection.size();
        this.f22881c += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i10) {
        AbstractC4641f.m9519a(this, i10);
        this.f22881c--;
        return this.f22879a.remove(i10 + this.f22880b);
    }
}
