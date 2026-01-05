package og;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.m */
/* loaded from: classes.dex */
public class C5372m extends AbstractCollection implements List {

    /* renamed from: a */
    public final Object f26627a;

    /* renamed from: b */
    public Collection f26628b;

    /* renamed from: c */
    public final C5372m f26629c;

    /* renamed from: d */
    public final Collection f26630d;

    /* renamed from: e */
    public final /* synthetic */ C5375p f26631e;

    /* renamed from: f */
    public final /* synthetic */ C5375p f26632f;

    public C5372m(C5375p c5375p, Object obj, List list, C5372m c5372m) {
        this.f26632f = c5375p;
        this.f26631e = c5375p;
        this.f26627a = obj;
        this.f26628b = list;
        this.f26629c = c5372m;
        this.f26630d = c5372m == null ? null : c5372m.f26628b;
    }

    /* renamed from: a */
    public final void m10754a() {
        C5372m c5372m = this.f26629c;
        if (c5372m != null) {
            c5372m.m10754a();
            return;
        }
        this.f26631e.f26714c.put(this.f26627a, this.f26628b);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        m10755b();
        boolean zIsEmpty = this.f26628b.isEmpty();
        ((List) this.f26628b).add(i10, obj);
        if (zIsEmpty) {
            m10754a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f26628b).addAll(i10, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f26628b.size();
        if (size != 0) {
            return zAddAll;
        }
        m10754a();
        return true;
    }

    /* renamed from: b */
    public final void m10755b() {
        C5372m c5372m = this.f26629c;
        if (c5372m != null) {
            c5372m.m10755b();
            if (c5372m.f26628b != this.f26630d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f26628b.isEmpty()) {
            Collection collection = (Collection) this.f26631e.f26714c.get(this.f26627a);
            if (collection != null) {
                this.f26628b = collection;
            }
        }
    }

    /* renamed from: c */
    public final void m10756c() {
        C5372m c5372m = this.f26629c;
        if (c5372m != null) {
            c5372m.m10756c();
        } else if (this.f26628b.isEmpty()) {
            this.f26631e.f26714c.remove(this.f26627a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (size() == 0) {
            return;
        }
        this.f26628b.clear();
        m10756c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        m10755b();
        return this.f26628b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        m10755b();
        return this.f26628b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m10755b();
        return this.f26628b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m10755b();
        return ((List) this.f26628b).get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m10755b();
        return this.f26628b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m10755b();
        return ((List) this.f26628b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m10755b();
        return new C5368i(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m10755b();
        return ((List) this.f26628b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m10755b();
        return new C5371l(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        m10755b();
        Object objRemove = ((List) this.f26628b).remove(i10);
        m10756c();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        size();
        boolean zRemoveAll = this.f26628b.removeAll(collection);
        if (zRemoveAll) {
            this.f26628b.size();
            m10756c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        size();
        boolean zRetainAll = this.f26628b.retainAll(collection);
        if (zRetainAll) {
            this.f26628b.size();
            m10756c();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        m10755b();
        return ((List) this.f26628b).set(i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m10755b();
        return this.f26628b.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        m10755b();
        List listSubList = ((List) this.f26628b).subList(i10, i11);
        C5372m c5372m = this.f26629c;
        if (c5372m == null) {
            c5372m = this;
        }
        boolean z6 = listSubList instanceof RandomAccess;
        Object obj = this.f26627a;
        C5375p c5375p = this.f26632f;
        return z6 ? new C5370k(c5375p, obj, listSubList, c5372m) : new C5372m(c5375p, obj, listSubList, c5372m);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m10755b();
        return this.f26628b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        m10755b();
        return new C5371l(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m10755b();
        boolean zRemove = this.f26628b.remove(obj);
        if (zRemove) {
            m10756c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m10755b();
        boolean zIsEmpty = this.f26628b.isEmpty();
        boolean zAdd = this.f26628b.add(obj);
        if (!zAdd || !zIsEmpty) {
            return zAdd;
        }
        m10754a();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f26628b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f26628b.size();
        if (size != 0) {
            return zAddAll;
        }
        m10754a();
        return true;
    }
}
