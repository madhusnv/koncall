package p001o;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public class ak3 extends AbstractMap implements Serializable {

    /* renamed from: s */
    public static final Object f14874s = new Object();

    /* renamed from: a */
    public transient Object f14875a;

    /* renamed from: b */
    public transient int[] f14876b;

    /* renamed from: c */
    public transient Object[] f14877c;

    /* renamed from: d */
    public transient Object[] f14878d;

    /* renamed from: e */
    public transient int f14879e;

    /* renamed from: f */
    public transient int f14880f;

    /* renamed from: g */
    public transient Set f14881g;

    /* renamed from: h */
    public transient Set f14882h;

    /* renamed from: q */
    public transient Collection f14883q;

    /* renamed from: o.ak3$a */
    public class C12203a extends AbstractC12207e {
        public C12203a() {
            super(ak3.this, null);
        }

        @Override // p001o.ak3.AbstractC12207e
        /* renamed from: b */
        public Object mo17301b(int i) {
            return ak3.this.m17296V(i);
        }
    }

    /* renamed from: o.ak3$b */
    public class C12204b extends AbstractC12207e {
        public C12204b() {
            super(ak3.this, null);
        }

        @Override // p001o.ak3.AbstractC12207e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry mo17301b(int i) {
            return ak3.this.new C12209g(i);
        }
    }

    /* renamed from: o.ak3$c */
    public class C12205c extends AbstractC12207e {
        public C12205c() {
            super(ak3.this, null);
        }

        @Override // p001o.ak3.AbstractC12207e
        /* renamed from: b */
        public Object mo17301b(int i) {
            return ak3.this.m0(i);
        }
    }

    /* renamed from: o.ak3$d */
    public class C12206d extends AbstractSet {
        public C12206d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ak3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapM17286L = ak3.this.m17286L();
            if (mapM17286L != null) {
                return mapM17286L.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iM17293S = ak3.this.m17293S(entry.getKey());
            return iM17293S != -1 && r6c.m46255a(ak3.this.m0(iM17293S), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return ak3.this.m17288N();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapM17286L = ak3.this.m17286L();
            if (mapM17286L != null) {
                return mapM17286L.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (ak3.this.m17299Z()) {
                return false;
            }
            int iM17291Q = ak3.this.m17291Q();
            int iM19272f = bk3.m19272f(entry.getKey(), entry.getValue(), iM17291Q, ak3.this.d0(), ak3.this.b0(), ak3.this.c0(), ak3.this.e0());
            if (iM19272f == -1) {
                return false;
            }
            ak3.this.m17298Y(iM19272f, iM17291Q);
            ak3.m17270f(ak3.this);
            ak3.this.m17292R();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ak3.this.size();
        }
    }

    /* renamed from: o.ak3$f */
    public class C12208f extends AbstractSet {
        public C12208f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ak3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ak3.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return ak3.this.m17297W();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapM17286L = ak3.this.m17286L();
            return mapM17286L != null ? mapM17286L.keySet().remove(obj) : ak3.this.a0(obj) != ak3.f14874s;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ak3.this.size();
        }
    }

    /* renamed from: o.ak3$g */
    public final class C12209g extends o8 {

        /* renamed from: a */
        public final Object f14893a;

        /* renamed from: b */
        public int f14894b;

        public C12209g(int i) {
            this.f14893a = ak3.this.m17296V(i);
            this.f14894b = i;
        }

        /* renamed from: a */
        public final void m17305a() {
            int i = this.f14894b;
            if (i == -1 || i >= ak3.this.size() || !r6c.m46255a(this.f14893a, ak3.this.m17296V(this.f14894b))) {
                this.f14894b = ak3.this.m17293S(this.f14893a);
            }
        }

        @Override // p001o.o8, java.util.Map.Entry
        public Object getKey() {
            return this.f14893a;
        }

        @Override // p001o.o8, java.util.Map.Entry
        public Object getValue() {
            Map mapM17286L = ak3.this.m17286L();
            if (mapM17286L != null) {
                return a5c.m16437a(mapM17286L.get(this.f14893a));
            }
            m17305a();
            int i = this.f14894b;
            return i == -1 ? a5c.m16438b() : ak3.this.m0(i);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapM17286L = ak3.this.m17286L();
            if (mapM17286L != null) {
                return a5c.m16437a(mapM17286L.put(this.f14893a, obj));
            }
            m17305a();
            int i = this.f14894b;
            if (i == -1) {
                ak3.this.put(this.f14893a, obj);
                return a5c.m16438b();
            }
            Object objM0 = ak3.this.m0(i);
            ak3.this.l0(this.f14894b, obj);
            return objM0;
        }
    }

    /* renamed from: o.ak3$h */
    public class C12210h extends AbstractCollection {
        public C12210h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ak3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return ak3.this.n0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return ak3.this.size();
        }
    }

    public ak3(int i) {
        m17294T(i);
    }

    /* renamed from: J */
    public static ak3 m17265J(int i) {
        return new ak3(i);
    }

    /* renamed from: f */
    public static /* synthetic */ int m17270f(ak3 ak3Var) {
        int i = ak3Var.f14880f;
        ak3Var.f14880f = i - 1;
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid size: " + i);
        }
        m17294T(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itM17288N = m17288N();
        while (itM17288N.hasNext()) {
            Map.Entry entry = (Map.Entry) itM17288N.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: A */
    public int m17279A(int i, int i2) {
        return i - 1;
    }

    /* renamed from: B */
    public int m17280B() {
        dgd.m23069v(m17299Z(), "Arrays already allocated");
        int i = this.f14879e;
        int iM19276j = bk3.m19276j(i);
        this.f14875a = bk3.m19267a(iM19276j);
        j0(iM19276j - 1);
        this.f14876b = new int[i];
        this.f14877c = new Object[i];
        this.f14878d = new Object[i];
        return i;
    }

    /* renamed from: C */
    public Map m17281C() {
        Map mapM17283G = m17283G(m17291Q() + 1);
        int iM17289O = m17289O();
        while (iM17289O >= 0) {
            mapM17283G.put(m17296V(iM17289O), m0(iM17289O));
            iM17289O = m17290P(iM17289O);
        }
        this.f14875a = mapM17283G;
        this.f14876b = null;
        this.f14877c = null;
        this.f14878d = null;
        m17292R();
        return mapM17283G;
    }

    /* renamed from: F */
    public Set m17282F() {
        return new C12206d();
    }

    /* renamed from: G */
    public Map m17283G(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    /* renamed from: H */
    public Set m17284H() {
        return new C12208f();
    }

    /* renamed from: I */
    public Collection m17285I() {
        return new C12210h();
    }

    /* renamed from: L */
    public Map m17286L() {
        Object obj = this.f14875a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: M */
    public final int m17287M(int i) {
        return b0()[i];
    }

    /* renamed from: N */
    public Iterator m17288N() {
        Map mapM17286L = m17286L();
        return mapM17286L != null ? mapM17286L.entrySet().iterator() : new C12204b();
    }

    /* renamed from: O */
    public int m17289O() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: P */
    public int m17290P(int i) {
        int i2 = i + 1;
        if (i2 < this.f14880f) {
            return i2;
        }
        return -1;
    }

    /* renamed from: Q */
    public final int m17291Q() {
        return (1 << (this.f14879e & 31)) - 1;
    }

    /* renamed from: R */
    public void m17292R() {
        this.f14879e += 32;
    }

    /* renamed from: S */
    public final int m17293S(Object obj) {
        if (m17299Z()) {
            return -1;
        }
        int iM27711c = fx7.m27711c(obj);
        int iM17291Q = m17291Q();
        int iM19274h = bk3.m19274h(d0(), iM27711c & iM17291Q);
        if (iM19274h == 0) {
            return -1;
        }
        int iM19268b = bk3.m19268b(iM27711c, iM17291Q);
        do {
            int i = iM19274h - 1;
            int iM17287M = m17287M(i);
            if (bk3.m19268b(iM17287M, iM17291Q) == iM19268b && r6c.m46255a(obj, m17296V(i))) {
                return i;
            }
            iM19274h = bk3.m19269c(iM17287M, iM17291Q);
        } while (iM19274h != 0);
        return -1;
    }

    /* renamed from: T */
    public void m17294T(int i) {
        dgd.m23052e(i >= 0, "Expected size must be >= 0");
        this.f14879e = br8.m19639f(i, 1, 1073741823);
    }

    /* renamed from: U */
    public void m17295U(int i, Object obj, Object obj2, int i2, int i3) {
        i0(i, bk3.m19270d(i2, 0, i3));
        k0(i, obj);
        l0(i, obj2);
    }

    /* renamed from: V */
    public final Object m17296V(int i) {
        return c0()[i];
    }

    /* renamed from: W */
    public Iterator m17297W() {
        Map mapM17286L = m17286L();
        return mapM17286L != null ? mapM17286L.keySet().iterator() : new C12203a();
    }

    /* renamed from: Y */
    public void m17298Y(int i, int i2) {
        Object objD0 = d0();
        int[] iArrB0 = b0();
        Object[] objArrC0 = c0();
        Object[] objArrE0 = e0();
        int size = size() - 1;
        if (i >= size) {
            objArrC0[i] = null;
            objArrE0[i] = null;
            iArrB0[i] = 0;
            return;
        }
        Object obj = objArrC0[size];
        objArrC0[i] = obj;
        objArrE0[i] = objArrE0[size];
        objArrC0[size] = null;
        objArrE0[size] = null;
        iArrB0[i] = iArrB0[size];
        iArrB0[size] = 0;
        int iM27711c = fx7.m27711c(obj) & i2;
        int iM19274h = bk3.m19274h(objD0, iM27711c);
        int i3 = size + 1;
        if (iM19274h == i3) {
            bk3.m19275i(objD0, iM27711c, i + 1);
            return;
        }
        while (true) {
            int i4 = iM19274h - 1;
            int i5 = iArrB0[i4];
            int iM19269c = bk3.m19269c(i5, i2);
            if (iM19269c == i3) {
                iArrB0[i4] = bk3.m19270d(i5, i + 1, i2);
                return;
            }
            iM19274h = iM19269c;
        }
    }

    /* renamed from: Z */
    public boolean m17299Z() {
        return this.f14875a == null;
    }

    public final Object a0(Object obj) {
        if (m17299Z()) {
            return f14874s;
        }
        int iM17291Q = m17291Q();
        int iM19272f = bk3.m19272f(obj, null, iM17291Q, d0(), b0(), c0(), null);
        if (iM19272f == -1) {
            return f14874s;
        }
        Object objM0 = m0(iM19272f);
        m17298Y(iM19272f, iM17291Q);
        this.f14880f--;
        m17292R();
        return objM0;
    }

    public final int[] b0() {
        int[] iArr = this.f14876b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] c0() {
        Object[] objArr = this.f14877c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m17299Z()) {
            return;
        }
        m17292R();
        Map mapM17286L = m17286L();
        if (mapM17286L != null) {
            this.f14879e = br8.m19639f(size(), 3, 1073741823);
            mapM17286L.clear();
            this.f14875a = null;
            this.f14880f = 0;
            return;
        }
        Arrays.fill(c0(), 0, this.f14880f, (Object) null);
        Arrays.fill(e0(), 0, this.f14880f, (Object) null);
        bk3.m19273g(d0());
        Arrays.fill(b0(), 0, this.f14880f, 0);
        this.f14880f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapM17286L = m17286L();
        return mapM17286L != null ? mapM17286L.containsKey(obj) : m17293S(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapM17286L = m17286L();
        if (mapM17286L != null) {
            return mapM17286L.containsValue(obj);
        }
        for (int i = 0; i < this.f14880f; i++) {
            if (r6c.m46255a(obj, m0(i))) {
                return true;
            }
        }
        return false;
    }

    public final Object d0() {
        Object obj = this.f14875a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] e0() {
        Object[] objArr = this.f14878d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f14882h;
        if (set != null) {
            return set;
        }
        Set setM17282F = m17282F();
        this.f14882h = setM17282F;
        return setM17282F;
    }

    public void f0(int i) {
        this.f14876b = Arrays.copyOf(b0(), i);
        this.f14877c = Arrays.copyOf(c0(), i);
        this.f14878d = Arrays.copyOf(e0(), i);
    }

    public final void g0(int i) {
        int iMin;
        int length = b0().length;
        if (i <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        f0(iMin);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapM17286L = m17286L();
        if (mapM17286L != null) {
            return mapM17286L.get(obj);
        }
        int iM17293S = m17293S(obj);
        if (iM17293S == -1) {
            return null;
        }
        m17300y(iM17293S);
        return m0(iM17293S);
    }

    public final int h0(int i, int i2, int i3, int i4) {
        Object objM19267a = bk3.m19267a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            bk3.m19275i(objM19267a, i3 & i5, i4 + 1);
        }
        Object objD0 = d0();
        int[] iArrB0 = b0();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM19274h = bk3.m19274h(objD0, i6);
            while (iM19274h != 0) {
                int i7 = iM19274h - 1;
                int i8 = iArrB0[i7];
                int iM19268b = bk3.m19268b(i8, i) | i6;
                int i9 = iM19268b & i5;
                int iM19274h2 = bk3.m19274h(objM19267a, i9);
                bk3.m19275i(objM19267a, i9, iM19274h);
                iArrB0[i7] = bk3.m19270d(iM19268b, iM19274h2, i5);
                iM19274h = bk3.m19269c(i8, i);
            }
        }
        this.f14875a = objM19267a;
        j0(i5);
        return i5;
    }

    public final void i0(int i, int i2) {
        b0()[i] = i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void j0(int i) {
        this.f14879e = bk3.m19270d(this.f14879e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    public final void k0(int i, Object obj) {
        c0()[i] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f14881g;
        if (set != null) {
            return set;
        }
        Set setM17284H = m17284H();
        this.f14881g = setM17284H;
        return setM17284H;
    }

    public final void l0(int i, Object obj) {
        e0()[i] = obj;
    }

    public final Object m0(int i) {
        return e0()[i];
    }

    public Iterator n0() {
        Map mapM17286L = m17286L();
        return mapM17286L != null ? mapM17286L.values().iterator() : new C12205c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int iH0;
        int i;
        if (m17299Z()) {
            m17280B();
        }
        Map mapM17286L = m17286L();
        if (mapM17286L != null) {
            return mapM17286L.put(obj, obj2);
        }
        int[] iArrB0 = b0();
        Object[] objArrC0 = c0();
        Object[] objArrE0 = e0();
        int i2 = this.f14880f;
        int i3 = i2 + 1;
        int iM27711c = fx7.m27711c(obj);
        int iM17291Q = m17291Q();
        int i4 = iM27711c & iM17291Q;
        int iM19274h = bk3.m19274h(d0(), i4);
        if (iM19274h != 0) {
            int iM19268b = bk3.m19268b(iM27711c, iM17291Q);
            int i5 = 0;
            while (true) {
                int i6 = iM19274h - 1;
                int i7 = iArrB0[i6];
                if (bk3.m19268b(i7, iM17291Q) == iM19268b && r6c.m46255a(obj, objArrC0[i6])) {
                    Object obj3 = objArrE0[i6];
                    objArrE0[i6] = obj2;
                    m17300y(i6);
                    return obj3;
                }
                int iM19269c = bk3.m19269c(i7, iM17291Q);
                i5++;
                if (iM19269c != 0) {
                    iM19274h = iM19269c;
                } else {
                    if (i5 >= 9) {
                        return m17281C().put(obj, obj2);
                    }
                    if (i3 > iM17291Q) {
                        iH0 = h0(iM17291Q, bk3.m19271e(iM17291Q), iM27711c, i2);
                    } else {
                        iArrB0[i6] = bk3.m19270d(i7, i3, iM17291Q);
                    }
                }
            }
            i = iM17291Q;
        } else if (i3 > iM17291Q) {
            iH0 = h0(iM17291Q, bk3.m19271e(iM17291Q), iM27711c, i2);
            i = iH0;
        } else {
            bk3.m19275i(d0(), i4, i3);
            i = iM17291Q;
        }
        g0(i3);
        m17295U(i2, obj, obj2, iM27711c, i);
        this.f14880f = i3;
        m17292R();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapM17286L = m17286L();
        if (mapM17286L != null) {
            return mapM17286L.remove(obj);
        }
        Object objA0 = a0(obj);
        if (objA0 == f14874s) {
            return null;
        }
        return objA0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapM17286L = m17286L();
        return mapM17286L != null ? mapM17286L.size() : this.f14880f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f14883q;
        if (collection != null) {
            return collection;
        }
        Collection collectionM17285I = m17285I();
        this.f14883q = collectionM17285I;
        return collectionM17285I;
    }

    /* renamed from: y */
    public void m17300y(int i) {
    }

    /* renamed from: o.ak3$e */
    public abstract class AbstractC12207e implements Iterator {

        /* renamed from: a */
        public int f14888a;

        /* renamed from: b */
        public int f14889b;

        /* renamed from: c */
        public int f14890c;

        public AbstractC12207e() {
            this.f14888a = ak3.this.f14879e;
            this.f14889b = ak3.this.m17289O();
            this.f14890c = -1;
        }

        /* renamed from: a */
        public final void m17303a() {
            if (ak3.this.f14879e != this.f14888a) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public abstract Object mo17301b(int i);

        /* renamed from: e */
        public void m17304e() {
            this.f14888a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14889b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            m17303a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f14889b;
            this.f14890c = i;
            Object objMo17301b = mo17301b(i);
            this.f14889b = ak3.this.m17290P(this.f14889b);
            return objMo17301b;
        }

        @Override // java.util.Iterator
        public void remove() {
            m17303a();
            rg3.m46691c(this.f14890c >= 0);
            m17304e();
            ak3 ak3Var = ak3.this;
            ak3Var.remove(ak3Var.m17296V(this.f14890c));
            this.f14889b = ak3.this.m17279A(this.f14889b, this.f14890c);
            this.f14890c = -1;
        }

        public /* synthetic */ AbstractC12207e(ak3 ak3Var, C12203a c12203a) {
            this();
        }
    }
}
