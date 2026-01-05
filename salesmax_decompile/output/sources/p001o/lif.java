package p001o;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p001o.ah3;

/* loaded from: classes3.dex */
public abstract class lif {

    /* renamed from: o.lif$a */
    public class C15082a extends AbstractC15086e {

        /* renamed from: a */
        public final /* synthetic */ Set f33901a;

        /* renamed from: b */
        public final /* synthetic */ Set f33902b;

        /* renamed from: o.lif$a$a */
        public class a extends x7 {

            /* renamed from: c */
            public final Iterator f33903c;

            public a() {
                this.f33903c = C15082a.this.f33901a.iterator();
            }

            @Override // p001o.x7
            /* renamed from: a */
            public Object mo24393a() {
                while (this.f33903c.hasNext()) {
                    Object next = this.f33903c.next();
                    if (C15082a.this.f33902b.contains(next)) {
                        return next;
                    }
                }
                return m55754b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15082a(Set set, Set set2) {
            super(null);
            this.f33901a = set;
            this.f33902b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q4i iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f33901a.contains(obj) && this.f33902b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f33901a.containsAll(collection) && this.f33902b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f33902b, this.f33901a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f33901a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f33902b.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }
    }

    /* renamed from: o.lif$b */
    public static class C15083b extends ah3.C12169a implements Set {
        public C15083b(Set set, hgd hgdVar) {
            super(set, hgdVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return lif.m37321a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return lif.m37324d(this);
        }
    }

    /* renamed from: o.lif$c */
    public static class C15084c extends C15083b implements SortedSet {
        public C15084c(SortedSet sortedSet, hgd hgdVar) {
            super(sortedSet, hgdVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f14706a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return e69.m24384h(this.f14706a.iterator(), this.f14707b);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new C15084c(((SortedSet) this.f14706a).headSet(obj), this.f14707b);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f14706a;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.f14707b.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new C15084c(((SortedSet) this.f14706a).subSet(obj, obj2), this.f14707b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new C15084c(((SortedSet) this.f14706a).tailSet(obj), this.f14707b);
        }
    }

    /* renamed from: o.lif$d */
    public static abstract class AbstractC15085d extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return lif.m37329i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) dgd.m23062o(collection));
        }
    }

    /* renamed from: o.lif$e */
    public static abstract class AbstractC15086e extends AbstractSet {
        public /* synthetic */ AbstractC15086e(kif kifVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public AbstractC15086e() {
        }
    }

    /* renamed from: a */
    public static boolean m37321a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Set m37322b(Set set, hgd hgdVar) {
        if (set instanceof SortedSet) {
            return m37323c((SortedSet) set, hgdVar);
        }
        if (!(set instanceof C15083b)) {
            return new C15083b((Set) dgd.m23062o(set), (hgd) dgd.m23062o(hgdVar));
        }
        C15083b c15083b = (C15083b) set;
        return new C15083b((Set) c15083b.f14706a, igd.m32111b(c15083b.f14707b, hgdVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static SortedSet m37323c(SortedSet sortedSet, hgd hgdVar) {
        if (!(sortedSet instanceof C15083b)) {
            return new C15084c((SortedSet) dgd.m23062o(sortedSet), (hgd) dgd.m23062o(hgdVar));
        }
        C15083b c15083b = (C15083b) sortedSet;
        return new C15084c((SortedSet) c15083b.f14706a, igd.m32111b(c15083b.f14707b, hgdVar));
    }

    /* renamed from: d */
    public static int m37324d(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: e */
    public static AbstractC15086e m37325e(Set set, Set set2) {
        dgd.m23063p(set, "set1");
        dgd.m23063p(set2, "set2");
        return new C15082a(set, set2);
    }

    /* renamed from: f */
    public static HashSet m37326f() {
        return new HashSet();
    }

    /* renamed from: g */
    public static HashSet m37327g(int i) {
        return new HashSet(fsa.m27428a(i));
    }

    /* renamed from: h */
    public static Set m37328h() {
        return Collections.newSetFromMap(fsa.m27433f());
    }

    /* renamed from: i */
    public static boolean m37329i(Set set, Collection collection) {
        dgd.m23062o(collection);
        if (collection instanceof pob) {
            collection = ((pob) collection).D1();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m37330j(set, collection.iterator()) : e69.m24390n(set.iterator(), collection);
    }

    /* renamed from: j */
    public static boolean m37330j(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
