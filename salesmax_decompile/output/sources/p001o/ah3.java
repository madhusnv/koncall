package p001o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ah3 {

    /* renamed from: o.ah3$a */
    public static class C12169a extends AbstractCollection {

        /* renamed from: a */
        public final Collection f14706a;

        /* renamed from: b */
        public final hgd f14707b;

        public C12169a(Collection collection, hgd hgdVar) {
            this.f14706a = collection;
            this.f14707b = hgdVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            dgd.m23051d(this.f14707b.apply(obj));
            return this.f14706a.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                dgd.m23051d(this.f14707b.apply(it.next()));
            }
            return this.f14706a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            z59.m58776g(this.f14706a, this.f14707b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (ah3.m17048c(this.f14706a, obj)) {
                return this.f14707b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            return ah3.m17046a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !z59.m58770a(this.f14706a, this.f14707b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return e69.m24383g(this.f14706a.iterator(), this.f14707b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f14706a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it = this.f14706a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f14707b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it = this.f14706a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f14707b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator it = this.f14706a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f14707b.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return fga.m26653i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return fga.m26653i(iterator()).toArray(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m17046a(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static StringBuilder m17047b(int i) {
        rg3.m46690b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    /* renamed from: c */
    public static boolean m17048c(Collection collection, Object obj) {
        dgd.m23062o(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
