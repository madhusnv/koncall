package p001o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p001o.fsa;
import p001o.v8;

/* loaded from: classes3.dex */
public abstract class l8 extends v8 implements Serializable {

    /* renamed from: e */
    public transient Map f33393e;

    /* renamed from: f */
    public transient int f33394f;

    /* renamed from: o.l8$a */
    public class C15017a extends AbstractC15020d {
        public C15017a(l8 l8Var) {
            super();
        }

        @Override // p001o.l8.AbstractC15020d
        /* renamed from: a */
        public Object mo36694a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* renamed from: o.l8$b */
    public class C15018b extends AbstractC15020d {
        public C15018b(l8 l8Var) {
            super();
        }

        @Override // p001o.l8.AbstractC15020d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry mo36694a(Object obj, Object obj2) {
            return fsa.m27431d(obj, obj2);
        }
    }

    /* renamed from: o.l8$c */
    public class C15019c extends fsa.AbstractC13549f {

        /* renamed from: c */
        public final transient Map f33395c;

        /* renamed from: o.l8$c$a */
        public class a extends fsa.AbstractC13546c {
            public a() {
            }

            @Override // p001o.fsa.AbstractC13546c
            /* renamed from: b */
            public Map mo27441b() {
                return C15019c.this;
            }

            @Override // p001o.fsa.AbstractC13546c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return ah3.m17048c(C15019c.this.f33395c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return C15019c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                l8.this.m36681B(entry.getKey());
                return true;
            }
        }

        /* renamed from: o.l8$c$b */
        public class b implements Iterator {

            /* renamed from: a */
            public final Iterator f33398a;

            /* renamed from: b */
            public Collection f33399b;

            public b() {
                this.f33398a = C15019c.this.f33395c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f33398a.next();
                this.f33399b = (Collection) entry.getValue();
                return C15019c.this.m36698f(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33398a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                dgd.m23069v(this.f33399b != null, "no calls to next() since the last call to remove()");
                this.f33398a.remove();
                l8.m36679r(l8.this, this.f33399b.size());
                this.f33399b.clear();
                this.f33399b = null;
            }
        }

        public C15019c(Map map) {
            this.f33395c = map;
        }

        @Override // p001o.fsa.AbstractC13549f
        /* renamed from: a */
        public Set mo27444a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f33395c == l8.this.f33393e) {
                l8.this.clear();
            } else {
                e69.m24379c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return fsa.m27434g(this.f33395c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) fsa.m27435h(this.f33395c, obj);
            if (collection == null) {
                return null;
            }
            return l8.this.mo26262F(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f33395c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionMo36690u = l8.this.mo36690u();
            collectionMo36690u.addAll(collection);
            l8.m36679r(l8.this, collection.size());
            collection.clear();
            return collectionMo36690u;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f33395c.equals(obj);
        }

        /* renamed from: f */
        public Map.Entry m36698f(Map.Entry entry) {
            Object key = entry.getKey();
            return fsa.m27431d(key, l8.this.mo26262F(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f33395c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return l8.this.m52450j();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f33395c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f33395c.toString();
        }
    }

    /* renamed from: o.l8$d */
    public abstract class AbstractC15020d implements Iterator {

        /* renamed from: a */
        public final Iterator f33401a;

        /* renamed from: b */
        public Object f33402b = null;

        /* renamed from: c */
        public Collection f33403c = null;

        /* renamed from: d */
        public Iterator f33404d = e69.m24382f();

        public AbstractC15020d() {
            this.f33401a = l8.this.f33393e.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract Object mo36694a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33401a.hasNext() || this.f33404d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f33404d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f33401a.next();
                this.f33402b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f33403c = collection;
                this.f33404d = collection.iterator();
            }
            return mo36694a(a5c.m16437a(this.f33402b), this.f33404d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f33404d.remove();
            Collection collection = this.f33403c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f33401a.remove();
            }
            l8.m36677p(l8.this);
        }
    }

    /* renamed from: o.l8$e */
    public class C15021e extends fsa.C13547d {

        /* renamed from: o.l8$e$a */
        public class a implements Iterator {

            /* renamed from: a */
            public Map.Entry f33407a;

            /* renamed from: b */
            public final /* synthetic */ Iterator f33408b;

            public a(Iterator it) {
                this.f33408b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33408b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f33408b.next();
                this.f33407a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                dgd.m23069v(this.f33407a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f33407a.getValue();
                this.f33408b.remove();
                l8.m36679r(l8.this, collection.size());
                collection.clear();
                this.f33407a = null;
            }
        }

        public C15021e(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e69.m24379c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return m27442b().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || m27442b().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m27442b().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(m27442b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) m27442b().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                l8.m36679r(l8.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* renamed from: o.l8$f */
    public final class C15022f extends C15025i implements NavigableMap {
        public C15022f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = mo36702k().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return m36698f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return mo36702k().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return l8.this.new C15022f(mo36702k().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry entryFirstEntry = mo36702k().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return m36698f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry entryFloorEntry = mo36702k().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return m36698f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return mo36702k().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry entryHigherEntry = mo36702k().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return m36698f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return mo36702k().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry entryLastEntry = mo36702k().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return m36698f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = mo36702k().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return m36698f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return mo36702k().lowerKey(obj);
        }

        @Override // p001o.l8.C15025i
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableSet mo36700g() {
            return l8.this.new C15023g(mo36702k());
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return mo36701h();
        }

        @Override // p001o.l8.C15025i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return m36706s(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return m36706s(descendingMap().entrySet().iterator());
        }

        @Override // p001o.l8.C15025i, p001o.l8.C15019c, java.util.AbstractMap, java.util.Map
        /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        /* renamed from: s */
        public Map.Entry m36706s(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionMo36690u = l8.this.mo36690u();
            collectionMo36690u.addAll((Collection) entry.getValue());
            it.remove();
            return fsa.m27431d(entry.getKey(), l8.this.mo26261E(collectionMo36690u));
        }

        @Override // p001o.l8.C15025i
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public NavigableMap mo36702k() {
            return (NavigableMap) super.mo36702k();
        }

        @Override // p001o.l8.C15025i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // p001o.l8.C15025i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return l8.this.new C15022f(mo36702k().headMap(obj, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return l8.this.new C15022f(mo36702k().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return l8.this.new C15022f(mo36702k().tailMap(obj, z));
        }
    }

    /* renamed from: o.l8$g */
    public final class C15023g extends C15026j implements NavigableSet {
        public C15023g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return mo36710d().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return l8.this.new C15023g(mo36710d().descendingMap());
        }

        @Override // p001o.l8.C15026j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return mo36710d().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return mo36710d().higherKey(obj);
        }

        @Override // p001o.l8.C15026j
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap mo36710d() {
            return (NavigableMap) super.mo36710d();
        }

        @Override // p001o.l8.C15026j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // p001o.l8.C15026j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return mo36710d().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return e69.m24389m(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return e69.m24389m(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return l8.this.new C15023g(mo36710d().headMap(obj, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return l8.this.new C15023g(mo36710d().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return l8.this.new C15023g(mo36710d().tailMap(obj, z));
        }
    }

    /* renamed from: o.l8$h */
    public class C15024h extends C15028l implements RandomAccess {
        public C15024h(l8 l8Var, Object obj, List list, C15027k c15027k) {
            super(obj, list, c15027k);
        }
    }

    /* renamed from: o.l8$i */
    public class C15025i extends C15019c implements SortedMap {

        /* renamed from: e */
        public SortedSet f33412e;

        public C15025i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return mo36702k().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return mo36702k().firstKey();
        }

        /* renamed from: g */
        public SortedSet mo36700g() {
            return l8.this.new C15026j(mo36702k());
        }

        @Override // p001o.l8.C15019c, java.util.AbstractMap, java.util.Map
        /* renamed from: h */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f33412e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetMo36700g = mo36700g();
            this.f33412e = sortedSetMo36700g;
            return sortedSetMo36700g;
        }

        public SortedMap headMap(Object obj) {
            return l8.this.new C15025i(mo36702k().headMap(obj));
        }

        /* renamed from: k */
        public SortedMap mo36702k() {
            return (SortedMap) this.f33395c;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return mo36702k().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return l8.this.new C15025i(mo36702k().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return l8.this.new C15025i(mo36702k().tailMap(obj));
        }
    }

    /* renamed from: o.l8$j */
    public class C15026j extends C15021e implements SortedSet {
        public C15026j(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return mo36710d().comparator();
        }

        /* renamed from: d */
        public SortedMap mo36710d() {
            return (SortedMap) super.m27442b();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return mo36710d().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return l8.this.new C15026j(mo36710d().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return mo36710d().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return l8.this.new C15026j(mo36710d().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return l8.this.new C15026j(mo36710d().tailMap(obj));
        }
    }

    public l8(Map map) {
        dgd.m23051d(map.isEmpty());
        this.f33393e = map;
    }

    /* renamed from: A */
    public static Iterator m36673A(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* renamed from: o */
    public static /* synthetic */ int m36676o(l8 l8Var) {
        int i = l8Var.f33394f;
        l8Var.f33394f = i + 1;
        return i;
    }

    /* renamed from: p */
    public static /* synthetic */ int m36677p(l8 l8Var) {
        int i = l8Var.f33394f;
        l8Var.f33394f = i - 1;
        return i;
    }

    /* renamed from: q */
    public static /* synthetic */ int m36678q(l8 l8Var, int i) {
        int i2 = l8Var.f33394f + i;
        l8Var.f33394f = i2;
        return i2;
    }

    /* renamed from: r */
    public static /* synthetic */ int m36679r(l8 l8Var, int i) {
        int i2 = l8Var.f33394f - i;
        l8Var.f33394f = i2;
        return i2;
    }

    /* renamed from: B */
    public final void m36681B(Object obj) {
        Collection collection = (Collection) fsa.m27436i(this.f33393e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f33394f -= size;
        }
    }

    /* renamed from: C */
    public final void m36682C(Map map) {
        this.f33393e = map;
        this.f33394f = 0;
        for (Collection collection : map.values()) {
            dgd.m23051d(!collection.isEmpty());
            this.f33394f += collection.size();
        }
    }

    /* renamed from: E */
    public abstract Collection mo26261E(Collection collection);

    /* renamed from: F */
    public abstract Collection mo26262F(Object obj, Collection collection);

    /* renamed from: G */
    public final List m36683G(Object obj, List list, C15027k c15027k) {
        return list instanceof RandomAccess ? new C15024h(this, obj, list, c15027k) : new C15028l(obj, list, c15027k);
    }

    @Override // p001o.v8, p001o.lob
    /* renamed from: b */
    public Collection mo36684b() {
        return super.mo36684b();
    }

    @Override // p001o.lob
    public void clear() {
        Iterator it = this.f33393e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f33393e.clear();
        this.f33394f = 0;
    }

    @Override // p001o.v8
    /* renamed from: f */
    public Collection mo36685f() {
        return new v8.C17525a();
    }

    @Override // p001o.lob
    public Collection get(Object obj) {
        Collection collectionM36691x = (Collection) this.f33393e.get(obj);
        if (collectionM36691x == null) {
            collectionM36691x = m36691x(obj);
        }
        return mo26262F(obj, collectionM36691x);
    }

    @Override // p001o.v8
    /* renamed from: h */
    public Collection mo36686h() {
        return new v8.C17526b();
    }

    @Override // p001o.v8
    /* renamed from: i */
    public Iterator mo36687i() {
        return new C15018b(this);
    }

    @Override // p001o.v8
    /* renamed from: k */
    public Iterator mo36688k() {
        return new C15017a(this);
    }

    @Override // p001o.lob
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f33393e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f33394f++;
            return true;
        }
        Collection collectionM36691x = m36691x(obj);
        if (!collectionM36691x.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f33394f++;
        this.f33393e.put(obj, collectionM36691x);
        return true;
    }

    @Override // p001o.lob
    public int size() {
        return this.f33394f;
    }

    /* renamed from: t */
    public Map m36689t() {
        return this.f33393e;
    }

    /* renamed from: u */
    public abstract Collection mo36690u();

    @Override // p001o.v8, p001o.lob
    public Collection values() {
        return super.values();
    }

    /* renamed from: x */
    public Collection m36691x(Object obj) {
        return mo36690u();
    }

    /* renamed from: y */
    public final Map m36692y() {
        Map map = this.f33393e;
        return map instanceof NavigableMap ? new C15022f((NavigableMap) this.f33393e) : map instanceof SortedMap ? new C15025i((SortedMap) this.f33393e) : new C15019c(this.f33393e);
    }

    /* renamed from: z */
    public final Set m36693z() {
        Map map = this.f33393e;
        return map instanceof NavigableMap ? new C15023g((NavigableMap) this.f33393e) : map instanceof SortedMap ? new C15026j((SortedMap) this.f33393e) : new C15021e(this.f33393e);
    }

    /* renamed from: o.l8$k */
    public class C15027k extends AbstractCollection {

        /* renamed from: a */
        public final Object f33415a;

        /* renamed from: b */
        public Collection f33416b;

        /* renamed from: c */
        public final C15027k f33417c;

        /* renamed from: d */
        public final Collection f33418d;

        public C15027k(Object obj, Collection collection, C15027k c15027k) {
            this.f33415a = obj;
            this.f33416b = collection;
            this.f33417c = c15027k;
            this.f33418d = c15027k == null ? null : c15027k.m36717e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            m36719j();
            boolean zIsEmpty = this.f33416b.isEmpty();
            boolean zAdd = this.f33416b.add(obj);
            if (zAdd) {
                l8.m36676o(l8.this);
                if (zIsEmpty) {
                    m36715b();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f33416b.addAll(collection);
            if (zAddAll) {
                l8.m36678q(l8.this, this.f33416b.size() - size);
                if (size == 0) {
                    m36715b();
                }
            }
            return zAddAll;
        }

        /* renamed from: b */
        public void m36715b() {
            C15027k c15027k = this.f33417c;
            if (c15027k != null) {
                c15027k.m36715b();
            } else {
                l8.this.f33393e.put(this.f33415a, this.f33416b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f33416b.clear();
            l8.m36679r(l8.this, size);
            m36720l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m36719j();
            return this.f33416b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            m36719j();
            return this.f33416b.containsAll(collection);
        }

        /* renamed from: d */
        public C15027k m36716d() {
            return this.f33417c;
        }

        /* renamed from: e */
        public Collection m36717e() {
            return this.f33416b;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m36719j();
            return this.f33416b.equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            m36719j();
            return this.f33416b.hashCode();
        }

        /* renamed from: i */
        Object m36718i() {
            return this.f33415a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            m36719j();
            return new a();
        }

        /* renamed from: j */
        public void m36719j() {
            Collection collection;
            C15027k c15027k = this.f33417c;
            if (c15027k != null) {
                c15027k.m36719j();
                if (this.f33417c.m36717e() != this.f33418d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f33416b.isEmpty() || (collection = (Collection) l8.this.f33393e.get(this.f33415a)) == null) {
                    return;
                }
                this.f33416b = collection;
            }
        }

        /* renamed from: l */
        public void m36720l() {
            C15027k c15027k = this.f33417c;
            if (c15027k != null) {
                c15027k.m36720l();
            } else if (this.f33416b.isEmpty()) {
                l8.this.f33393e.remove(this.f33415a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m36719j();
            boolean zRemove = this.f33416b.remove(obj);
            if (zRemove) {
                l8.m36677p(l8.this);
                m36720l();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f33416b.removeAll(collection);
            if (zRemoveAll) {
                l8.m36678q(l8.this, this.f33416b.size() - size);
                m36720l();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            dgd.m23062o(collection);
            int size = size();
            boolean zRetainAll = this.f33416b.retainAll(collection);
            if (zRetainAll) {
                l8.m36678q(l8.this, this.f33416b.size() - size);
                m36720l();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m36719j();
            return this.f33416b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m36719j();
            return this.f33416b.toString();
        }

        /* renamed from: o.l8$k$a */
        public class a implements Iterator {

            /* renamed from: a */
            public final Iterator f33420a;

            /* renamed from: b */
            public final Collection f33421b;

            public a() {
                Collection collection = C15027k.this.f33416b;
                this.f33421b = collection;
                this.f33420a = l8.m36673A(collection);
            }

            /* renamed from: a */
            public Iterator m36721a() {
                m36722b();
                return this.f33420a;
            }

            /* renamed from: b */
            public void m36722b() {
                C15027k.this.m36719j();
                if (C15027k.this.f33416b != this.f33421b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m36722b();
                return this.f33420a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                m36722b();
                return this.f33420a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f33420a.remove();
                l8.m36677p(l8.this);
                C15027k.this.m36720l();
            }

            public a(Iterator it) {
                this.f33421b = C15027k.this.f33416b;
                this.f33420a = it;
            }
        }
    }

    /* renamed from: o.l8$l */
    public class C15028l extends C15027k implements List {

        /* renamed from: o.l8$l$a */
        public class a extends C15027k.a implements ListIterator {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = C15028l.this.isEmpty();
                m36724e().add(obj);
                l8.m36676o(l8.this);
                if (zIsEmpty) {
                    C15028l.this.m36715b();
                }
            }

            /* renamed from: e */
            public final ListIterator m36724e() {
                return (ListIterator) m36721a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m36724e().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m36724e().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return m36724e().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m36724e().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                m36724e().set(obj);
            }

            public a(int i) {
                super(C15028l.this.m36723m().listIterator(i));
            }
        }

        public C15028l(Object obj, List list, C15027k c15027k) {
            super(obj, list, c15027k);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            m36719j();
            boolean zIsEmpty = m36717e().isEmpty();
            m36723m().add(i, obj);
            l8.m36676o(l8.this);
            if (zIsEmpty) {
                m36715b();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = m36723m().addAll(i, collection);
            if (zAddAll) {
                l8.m36678q(l8.this, m36717e().size() - size);
                if (size == 0) {
                    m36715b();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public Object get(int i) {
            m36719j();
            return m36723m().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m36719j();
            return m36723m().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m36719j();
            return m36723m().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            m36719j();
            return new a();
        }

        /* renamed from: m */
        public List m36723m() {
            return (List) m36717e();
        }

        @Override // java.util.List
        public Object remove(int i) {
            m36719j();
            Object objRemove = m36723m().remove(i);
            l8.m36677p(l8.this);
            m36720l();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            m36719j();
            return m36723m().set(i, obj);
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            m36719j();
            return l8.this.m36683G(m36718i(), m36723m().subList(i, i2), m36716d() == null ? this : m36716d());
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            m36719j();
            return new a(i);
        }
    }
}
