package p001o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import p001o.if8;

/* loaded from: classes3.dex */
public abstract class of8 implements Map, Serializable {

    /* renamed from: d */
    public static final Map.Entry[] f38286d = new Map.Entry[0];

    /* renamed from: a */
    public transient pf8 f38287a;

    /* renamed from: b */
    public transient pf8 f38288b;

    /* renamed from: c */
    public transient if8 f38289c;

    /* renamed from: o.of8$a */
    public static class C15793a {

        /* renamed from: a */
        public Comparator f38290a;

        /* renamed from: b */
        public Object[] f38291b;

        /* renamed from: c */
        public int f38292c;

        /* renamed from: d */
        public boolean f38293d;

        /* renamed from: e */
        public a f38294e;

        /* renamed from: o.of8$a$a */
        public static final class a {

            /* renamed from: a */
            public final Object f38295a;

            /* renamed from: b */
            public final Object f38296b;

            /* renamed from: c */
            public final Object f38297c;

            public a(Object obj, Object obj2, Object obj3) {
                this.f38295a = obj;
                this.f38296b = obj2;
                this.f38297c = obj3;
            }

            /* renamed from: a */
            public IllegalArgumentException m42193a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f38295a + "=" + this.f38296b + " and " + this.f38295a + "=" + this.f38297c);
            }
        }

        public C15793a() {
            this(4);
        }

        /* renamed from: i */
        public static void m42184i(Object[] objArr, int i, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, mfc.m38936b(comparator).m38939d(fsa.m27438k()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        /* renamed from: a */
        public of8 m42185a() {
            return m42187c();
        }

        /* renamed from: b */
        public final of8 m42186b(boolean z) {
            Object[] objArrM42189e;
            a aVar;
            a aVar2;
            if (z && (aVar2 = this.f38294e) != null) {
                throw aVar2.m42193a();
            }
            int length = this.f38292c;
            if (this.f38290a == null) {
                objArrM42189e = this.f38291b;
            } else {
                if (this.f38293d) {
                    this.f38291b = Arrays.copyOf(this.f38291b, length * 2);
                }
                objArrM42189e = this.f38291b;
                if (!z) {
                    objArrM42189e = m42189e(objArrM42189e, this.f38292c);
                    if (objArrM42189e.length < this.f38291b.length) {
                        length = objArrM42189e.length >>> 1;
                    }
                }
                m42184i(objArrM42189e, length, this.f38290a);
            }
            this.f38293d = true;
            ghe gheVarM28706t = ghe.m28706t(length, objArrM42189e, this);
            if (!z || (aVar = this.f38294e) == null) {
                return gheVarM28706t;
            }
            throw aVar.m42193a();
        }

        /* renamed from: c */
        public of8 m42187c() {
            return m42186b(true);
        }

        /* renamed from: d */
        public final void m42188d(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f38291b;
            if (i2 > objArr.length) {
                this.f38291b = Arrays.copyOf(objArr, if8.AbstractC14277b.m32055c(objArr.length, i2));
                this.f38293d = false;
            }
        }

        /* renamed from: e */
        public final Object[] m42189e(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 = i5 + 1;
                    i3 = i6 + 1;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        /* renamed from: f */
        public C15793a m42190f(Object obj, Object obj2) {
            m42188d(this.f38292c + 1);
            rg3.m46689a(obj, obj2);
            Object[] objArr = this.f38291b;
            int i = this.f38292c;
            objArr[i * 2] = obj;
            objArr[(i * 2) + 1] = obj2;
            this.f38292c = i + 1;
            return this;
        }

        /* renamed from: g */
        public C15793a m42191g(Map.Entry entry) {
            return m42190f(entry.getKey(), entry.getValue());
        }

        /* renamed from: h */
        public C15793a m42192h(Iterable iterable) {
            if (iterable instanceof Collection) {
                m42188d(this.f38292c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m42191g((Map.Entry) it.next());
            }
            return this;
        }

        public C15793a(int i) {
            this.f38291b = new Object[i * 2];
            this.f38292c = 0;
            this.f38293d = false;
        }
    }

    /* renamed from: o.of8$b */
    public static class C15794b implements Serializable {

        /* renamed from: a */
        public final Object f38298a;

        /* renamed from: b */
        public final Object f38299b;

        public C15794b(of8 of8Var) {
            Object[] objArr = new Object[of8Var.size()];
            Object[] objArr2 = new Object[of8Var.size()];
            q4i it = of8Var.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i] = entry.getKey();
                objArr2[i] = entry.getValue();
                i++;
            }
            this.f38298a = objArr;
            this.f38299b = objArr2;
        }

        /* renamed from: a */
        public final Object m42194a() {
            Object[] objArr = (Object[]) this.f38298a;
            Object[] objArr2 = (Object[]) this.f38299b;
            C15793a c15793aM42195b = m42195b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                c15793aM42195b.m42190f(objArr[i], objArr2[i]);
            }
            return c15793aM42195b.m42187c();
        }

        /* renamed from: b */
        public C15793a m42195b(int i) {
            return new C15793a(i);
        }

        public final Object readResolve() {
            Object obj = this.f38298a;
            if (!(obj instanceof pf8)) {
                return m42194a();
            }
            pf8 pf8Var = (pf8) obj;
            if8 if8Var = (if8) this.f38299b;
            C15793a c15793aM42195b = m42195b(pf8Var.size());
            q4i it = pf8Var.iterator();
            q4i it2 = if8Var.iterator();
            while (it.hasNext()) {
                c15793aM42195b.m42190f(it.next(), it2.next());
            }
            return c15793aM42195b.m42187c();
        }
    }

    /* renamed from: a */
    public static C15793a m42177a() {
        return new C15793a();
    }

    /* renamed from: c */
    public static of8 m42178c(Iterable iterable) {
        C15793a c15793a = new C15793a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        c15793a.m42192h(iterable);
        return c15793a.m42185a();
    }

    /* renamed from: d */
    public static of8 m42179d(Map map) {
        if ((map instanceof of8) && !(map instanceof SortedMap)) {
            of8 of8Var = (of8) map;
            if (!of8Var.mo28712k()) {
                return of8Var;
            }
        }
        return m42178c(map.entrySet());
    }

    /* renamed from: r */
    public static of8 m42180r() {
        return ghe.f25205h;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: e */
    public abstract pf8 mo28709e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return fsa.m27430c(this, obj);
    }

    /* renamed from: f */
    public abstract pf8 mo28710f();

    /* renamed from: g */
    public abstract if8 mo28711g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public pf8 entrySet() {
        pf8 pf8Var = this.f38287a;
        if (pf8Var != null) {
            return pf8Var;
        }
        pf8 pf8VarMo28709e = mo28709e();
        this.f38287a = pf8VarMo28709e;
        return pf8VarMo28709e;
    }

    @Override // java.util.Map
    public int hashCode() {
        return lif.m37324d(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public abstract boolean mo28712k();

    @Override // java.util.Map
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public pf8 keySet() {
        pf8 pf8Var = this.f38288b;
        if (pf8Var != null) {
            return pf8Var;
        }
        pf8 pf8VarMo28710f = mo28710f();
        this.f38288b = pf8VarMo28710f;
        return pf8VarMo28710f;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public if8 values() {
        if8 if8Var = this.f38289c;
        if (if8Var != null) {
            return if8Var;
        }
        if8 if8VarMo28711g = mo28711g();
        this.f38289c = if8VarMo28711g;
        return if8VarMo28711g;
    }

    public String toString() {
        return fsa.m27437j(this);
    }

    public Object writeReplace() {
        return new C15794b(this);
    }
}
