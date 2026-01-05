package p001o;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public class vo0 extends ktf implements Map {

    /* renamed from: d */
    public C17627a f50610d;

    /* renamed from: e */
    public C17629c f50611e;

    /* renamed from: f */
    public C17631e f50612f;

    /* renamed from: o.vo0$a */
    public final class C17627a extends AbstractSet {
        public C17627a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return vo0.this.new C17630d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return vo0.this.size();
        }
    }

    /* renamed from: o.vo0$b */
    public final class C17628b extends vh8 {
        public C17628b() {
            super(vo0.this.size());
        }

        @Override // p001o.vh8
        /* renamed from: a */
        public Object mo17588a(int i) {
            return vo0.this.m36227g(i);
        }

        @Override // p001o.vh8
        /* renamed from: e */
        public void mo17589e(int i) {
            vo0.this.mo32670k(i);
        }
    }

    /* renamed from: o.vo0$d */
    public final class C17630d implements Iterator, Map.Entry {

        /* renamed from: a */
        public int f50616a;

        /* renamed from: b */
        public int f50617b = -1;

        /* renamed from: c */
        public boolean f50618c;

        public C17630d() {
            this.f50616a = vo0.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f50617b++;
            this.f50618c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f50618c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return h14.m29729c(entry.getKey(), vo0.this.m36227g(this.f50617b)) && h14.m29729c(entry.getValue(), vo0.this.m36228o(this.f50617b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f50618c) {
                return vo0.this.m36227g(this.f50617b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f50618c) {
                return vo0.this.m36228o(this.f50617b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50617b < this.f50616a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f50618c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objM36227g = vo0.this.m36227g(this.f50617b);
            Object objM36228o = vo0.this.m36228o(this.f50617b);
            return (objM36227g == null ? 0 : objM36227g.hashCode()) ^ (objM36228o != null ? objM36228o.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f50618c) {
                throw new IllegalStateException();
            }
            vo0.this.mo32670k(this.f50617b);
            this.f50617b--;
            this.f50616a--;
            this.f50618c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f50618c) {
                return vo0.this.mo32671n(this.f50617b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: o.vo0$f */
    public final class C17632f extends vh8 {
        public C17632f() {
            super(vo0.this.size());
        }

        @Override // p001o.vh8
        /* renamed from: a */
        public Object mo17588a(int i) {
            return vo0.this.m36228o(i);
        }

        @Override // p001o.vh8
        /* renamed from: e */
        public void mo17589e(int i) {
            vo0.this.mo32670k(i);
        }
    }

    public vo0() {
    }

    /* renamed from: s */
    public static boolean m53074s(Set set, Object obj) {
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

    @Override // p001o.ktf, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // p001o.ktf, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C17627a c17627a = this.f50610d;
        if (c17627a != null) {
            return c17627a;
        }
        C17627a c17627a2 = new C17627a();
        this.f50610d = c17627a2;
        return c17627a2;
    }

    @Override // p001o.ktf, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        C17629c c17629c = this.f50611e;
        if (c17629c != null) {
            return c17629c;
        }
        C17629c c17629c2 = new C17629c();
        this.f50611e = c17629c2;
        return c17629c2;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        m36223c(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: r */
    public boolean m53075r(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.ktf, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    /* renamed from: t */
    public boolean m53076t(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    /* renamed from: u */
    public boolean m53077u(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(m36227g(size2))) {
                mo32670k(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public Collection values() {
        C17631e c17631e = this.f50612f;
        if (c17631e != null) {
            return c17631e;
        }
        C17631e c17631e2 = new C17631e();
        this.f50612f = c17631e2;
        return c17631e2;
    }

    public vo0(int i) {
        super(i);
    }

    /* renamed from: o.vo0$c */
    public final class C17629c implements Set {
        public C17629c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            vo0.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return vo0.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return vo0.this.m53075r(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return vo0.m53074s(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = vo0.this.size() - 1; size >= 0; size--) {
                Object objM36227g = vo0.this.m36227g(size);
                iHashCode += objM36227g == null ? 0 : objM36227g.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return vo0.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return vo0.this.new C17628b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iM36225e = vo0.this.m36225e(obj);
            if (iM36225e < 0) {
                return false;
            }
            vo0.this.mo32670k(iM36225e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return vo0.this.m53076t(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return vo0.this.m53077u(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return vo0.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = vo0.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = vo0.this.m36227g(i);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i = 0; i < size; i++) {
                objArr[i] = vo0.this.m36227g(i);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* renamed from: o.vo0$e */
    public final class C17631e implements Collection {
        public C17631e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            vo0.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return vo0.this.m36222a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return vo0.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return vo0.this.new C17632f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iM36222a = vo0.this.m36222a(obj);
            if (iM36222a < 0) {
                return false;
            }
            vo0.this.mo32670k(iM36222a);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = vo0.this.size();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (collection.contains(vo0.this.m36228o(i))) {
                    vo0.this.mo32670k(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = vo0.this.size();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (!collection.contains(vo0.this.m36228o(i))) {
                    vo0.this.mo32670k(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return vo0.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = vo0.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = vo0.this.m36228o(i);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i = 0; i < size; i++) {
                objArr[i] = vo0.this.m36228o(i);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public vo0(ktf ktfVar) {
        super(ktfVar);
    }
}
