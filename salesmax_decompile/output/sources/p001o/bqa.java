package p001o;

import com.google.firebase.messaging.Constants;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p001o.wb9;

/* loaded from: classes6.dex */
public final class bqa implements Map, Serializable, wb9 {

    /* renamed from: L */
    public static final C12471a f16681L = new C12471a(null);

    /* renamed from: M */
    public static final bqa f16682M;

    /* renamed from: H */
    public boolean f16683H;

    /* renamed from: a */
    public Object[] f16684a;

    /* renamed from: b */
    public Object[] f16685b;

    /* renamed from: c */
    public int[] f16686c;

    /* renamed from: d */
    public int[] f16687d;

    /* renamed from: e */
    public int f16688e;

    /* renamed from: f */
    public int f16689f;

    /* renamed from: g */
    public int f16690g;

    /* renamed from: h */
    public int f16691h;

    /* renamed from: q */
    public int f16692q;

    /* renamed from: s */
    public dqa f16693s;

    /* renamed from: x */
    public eqa f16694x;

    /* renamed from: y */
    public cqa f16695y;

    /* renamed from: o.bqa$a */
    public static final class C12471a {
        public C12471a() {
        }

        public /* synthetic */ C12471a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public final int m19597c(int i) {
            return Integer.highestOneBit(bce.m18601d(i, 1) * 3);
        }

        /* renamed from: d */
        public final int m19598d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        /* renamed from: e */
        public final bqa m19599e() {
            return bqa.f16682M;
        }
    }

    /* renamed from: o.bqa$b */
    public static final class C12472b extends C12474d implements Iterator, sb9 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12472b(bqa bqaVar) {
            super(bqaVar);
            sq8.m48649h(bqaVar, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C12473c next() {
            m19603a();
            if (m19604e() >= m19606g().f16689f) {
                throw new NoSuchElementException();
            }
            int iM19604e = m19604e();
            m19608k(iM19604e + 1);
            m19609n(iM19604e);
            C12473c c12473c = new C12473c(m19606g(), m19605f());
            m19607j();
            return c12473c;
        }

        /* renamed from: p */
        public final void m19601p(StringBuilder sb) {
            sq8.m48649h(sb, "sb");
            if (m19604e() >= m19606g().f16689f) {
                throw new NoSuchElementException();
            }
            int iM19604e = m19604e();
            m19608k(iM19604e + 1);
            m19609n(iM19604e);
            Object obj = m19606g().f16684a[m19605f()];
            if (obj == m19606g()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = m19606g().f16685b;
            sq8.m48646e(objArr);
            Object obj2 = objArr[m19605f()];
            if (obj2 == m19606g()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            m19607j();
        }

        /* renamed from: r */
        public final int m19602r() {
            if (m19604e() >= m19606g().f16689f) {
                throw new NoSuchElementException();
            }
            int iM19604e = m19604e();
            m19608k(iM19604e + 1);
            m19609n(iM19604e);
            Object obj = m19606g().f16684a[m19605f()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = m19606g().f16685b;
            sq8.m48646e(objArr);
            Object obj2 = objArr[m19605f()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m19607j();
            return iHashCode2;
        }
    }

    /* renamed from: o.bqa$c */
    public static final class C12473c implements Map.Entry, wb9.InterfaceC17813a {

        /* renamed from: a */
        public final bqa f16696a;

        /* renamed from: b */
        public final int f16697b;

        public C12473c(bqa bqaVar, int i) {
            sq8.m48649h(bqaVar, "map");
            this.f16696a = bqaVar;
            this.f16697b = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (sq8.m48644c(entry.getKey(), getKey()) && sq8.m48644c(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f16696a.f16684a[this.f16697b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f16696a.f16685b;
            sq8.m48646e(objArr);
            return objArr[this.f16697b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f16696a.m19592t();
            Object[] objArrM19590r = this.f16696a.m19590r();
            int i = this.f16697b;
            Object obj2 = objArrM19590r[i];
            objArrM19590r[i] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: o.bqa$d */
    public static class C12474d {

        /* renamed from: a */
        public final bqa f16698a;

        /* renamed from: b */
        public int f16699b;

        /* renamed from: c */
        public int f16700c;

        /* renamed from: d */
        public int f16701d;

        public C12474d(bqa bqaVar) {
            sq8.m48649h(bqaVar, "map");
            this.f16698a = bqaVar;
            this.f16700c = -1;
            this.f16701d = bqaVar.f16691h;
            m19607j();
        }

        /* renamed from: a */
        public final void m19603a() {
            if (this.f16698a.f16691h != this.f16701d) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: e */
        public final int m19604e() {
            return this.f16699b;
        }

        /* renamed from: f */
        public final int m19605f() {
            return this.f16700c;
        }

        /* renamed from: g */
        public final bqa m19606g() {
            return this.f16698a;
        }

        public final boolean hasNext() {
            return this.f16699b < this.f16698a.f16689f;
        }

        /* renamed from: j */
        public final void m19607j() {
            while (this.f16699b < this.f16698a.f16689f) {
                int[] iArr = this.f16698a.f16686c;
                int i = this.f16699b;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.f16699b = i + 1;
                }
            }
        }

        /* renamed from: k */
        public final void m19608k(int i) {
            this.f16699b = i;
        }

        /* renamed from: n */
        public final void m19609n(int i) {
            this.f16700c = i;
        }

        public final void remove() {
            m19603a();
            if (!(this.f16700c != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f16698a.m19592t();
            this.f16698a.a0(this.f16700c);
            this.f16700c = -1;
            this.f16701d = this.f16698a.f16691h;
        }
    }

    /* renamed from: o.bqa$e */
    public static final class C12475e extends C12474d implements Iterator, sb9 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12475e(bqa bqaVar) {
            super(bqaVar);
            sq8.m48649h(bqaVar, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m19603a();
            if (m19604e() >= m19606g().f16689f) {
                throw new NoSuchElementException();
            }
            int iM19604e = m19604e();
            m19608k(iM19604e + 1);
            m19609n(iM19604e);
            Object obj = m19606g().f16684a[m19605f()];
            m19607j();
            return obj;
        }
    }

    /* renamed from: o.bqa$f */
    public static final class C12476f extends C12474d implements Iterator, sb9 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12476f(bqa bqaVar) {
            super(bqaVar);
            sq8.m48649h(bqaVar, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m19603a();
            if (m19604e() >= m19606g().f16689f) {
                throw new NoSuchElementException();
            }
            int iM19604e = m19604e();
            m19608k(iM19604e + 1);
            m19609n(iM19604e);
            Object[] objArr = m19606g().f16685b;
            sq8.m48646e(objArr);
            Object obj = objArr[m19605f()];
            m19607j();
            return obj;
        }
    }

    static {
        bqa bqaVar = new bqa(0);
        bqaVar.f16683H = true;
        f16682M = bqaVar;
    }

    public bqa(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i, int i2) {
        this.f16684a = objArr;
        this.f16685b = objArr2;
        this.f16686c = iArr;
        this.f16687d = iArr2;
        this.f16688e = i;
        this.f16689f = i2;
        this.f16690g = f16681L.m19598d(m19576M());
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f16683H) {
            return new nff(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: A */
    public final boolean m19567A(Map.Entry entry) {
        sq8.m48649h(entry, "entry");
        int iM19572H = m19572H(entry.getKey());
        if (iM19572H < 0) {
            return false;
        }
        Object[] objArr = this.f16685b;
        sq8.m48646e(objArr);
        return sq8.m48644c(objArr[iM19572H], entry.getValue());
    }

    /* renamed from: B */
    public final boolean m19568B(Map map) {
        return size() == map.size() && m19594y(map.entrySet());
    }

    /* renamed from: C */
    public final void m19569C(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > m19574J()) {
            int iM24507e = e8.f21141a.m24507e(m19574J(), i);
            this.f16684a = eea.m24852e(this.f16684a, iM24507e);
            Object[] objArr = this.f16685b;
            this.f16685b = objArr != null ? eea.m24852e(objArr, iM24507e) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f16686c, iM24507e);
            sq8.m48648g(iArrCopyOf, "copyOf(...)");
            this.f16686c = iArrCopyOf;
            int iM19597c = f16681L.m19597c(iM24507e);
            if (iM19597c > m19576M()) {
                m19587Y(iM19597c);
            }
        }
    }

    /* renamed from: F */
    public final void m19570F(int i) {
        if (e0(i)) {
            m19593u(true);
        } else {
            m19569C(this.f16689f + i);
        }
    }

    /* renamed from: G */
    public final C12472b m19571G() {
        return new C12472b(this);
    }

    /* renamed from: H */
    public final int m19572H(Object obj) {
        int iM19580Q = m19580Q(obj);
        int i = this.f16688e;
        while (true) {
            int i2 = this.f16687d[iM19580Q];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (sq8.m48644c(this.f16684a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM19580Q = iM19580Q == 0 ? m19576M() - 1 : iM19580Q - 1;
        }
    }

    /* renamed from: I */
    public final int m19573I(Object obj) {
        int i = this.f16689f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f16686c[i] >= 0) {
                Object[] objArr = this.f16685b;
                sq8.m48646e(objArr);
                if (sq8.m48644c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: J */
    public final int m19574J() {
        return this.f16684a.length;
    }

    /* renamed from: L */
    public Set m19575L() {
        cqa cqaVar = this.f16695y;
        if (cqaVar != null) {
            return cqaVar;
        }
        cqa cqaVar2 = new cqa(this);
        this.f16695y = cqaVar2;
        return cqaVar2;
    }

    /* renamed from: M */
    public final int m19576M() {
        return this.f16687d.length;
    }

    /* renamed from: N */
    public Set m19577N() {
        dqa dqaVar = this.f16693s;
        if (dqaVar != null) {
            return dqaVar;
        }
        dqa dqaVar2 = new dqa(this);
        this.f16693s = dqaVar2;
        return dqaVar2;
    }

    /* renamed from: O */
    public int m19578O() {
        return this.f16692q;
    }

    /* renamed from: P */
    public Collection m19579P() {
        eqa eqaVar = this.f16694x;
        if (eqaVar != null) {
            return eqaVar;
        }
        eqa eqaVar2 = new eqa(this);
        this.f16694x = eqaVar2;
        return eqaVar2;
    }

    /* renamed from: Q */
    public final int m19580Q(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f16690g;
    }

    /* renamed from: R */
    public final boolean m19581R() {
        return this.f16683H;
    }

    /* renamed from: S */
    public final C12475e m19582S() {
        return new C12475e(this);
    }

    /* renamed from: T */
    public final boolean m19583T(Collection collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m19570F(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m19584U((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: U */
    public final boolean m19584U(Map.Entry entry) {
        int iM19589o = m19589o(entry.getKey());
        Object[] objArrM19590r = m19590r();
        if (iM19589o >= 0) {
            objArrM19590r[iM19589o] = entry.getValue();
            return true;
        }
        int i = (-iM19589o) - 1;
        if (sq8.m48644c(entry.getValue(), objArrM19590r[i])) {
            return false;
        }
        objArrM19590r[i] = entry.getValue();
        return true;
    }

    /* renamed from: V */
    public final boolean m19585V(int i) {
        int iM19580Q = m19580Q(this.f16684a[i]);
        int i2 = this.f16688e;
        while (true) {
            int[] iArr = this.f16687d;
            if (iArr[iM19580Q] == 0) {
                iArr[iM19580Q] = i + 1;
                this.f16686c[i] = iM19580Q;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iM19580Q = iM19580Q == 0 ? m19576M() - 1 : iM19580Q - 1;
        }
    }

    /* renamed from: W */
    public final void m19586W() {
        this.f16691h++;
    }

    /* renamed from: Y */
    public final void m19587Y(int i) {
        m19586W();
        int i2 = 0;
        if (this.f16689f > size()) {
            m19593u(false);
        }
        this.f16687d = new int[i];
        this.f16690g = f16681L.m19598d(i);
        while (i2 < this.f16689f) {
            int i3 = i2 + 1;
            if (!m19585V(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    /* renamed from: Z */
    public final boolean m19588Z(Map.Entry entry) {
        sq8.m48649h(entry, "entry");
        m19592t();
        int iM19572H = m19572H(entry.getKey());
        if (iM19572H < 0) {
            return false;
        }
        Object[] objArr = this.f16685b;
        sq8.m48646e(objArr);
        if (!sq8.m48644c(objArr[iM19572H], entry.getValue())) {
            return false;
        }
        a0(iM19572H);
        return true;
    }

    public final void a0(int i) {
        eea.m24853f(this.f16684a, i);
        Object[] objArr = this.f16685b;
        if (objArr != null) {
            eea.m24853f(objArr, i);
        }
        b0(this.f16686c[i]);
        this.f16686c[i] = -1;
        this.f16692q = size() - 1;
        m19586W();
    }

    public final void b0(int i) {
        int iM18604g = bce.m18604g(this.f16688e * 2, m19576M() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? m19576M() - 1 : i - 1;
            i2++;
            if (i2 > this.f16688e) {
                this.f16687d[i3] = 0;
                return;
            }
            int[] iArr = this.f16687d;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((m19580Q(this.f16684a[i5]) - i) & (m19576M() - 1)) >= i2) {
                    this.f16687d[i3] = i4;
                    this.f16686c[i5] = i3;
                }
                iM18604g--;
            }
            i3 = i;
            i2 = 0;
            iM18604g--;
        } while (iM18604g >= 0);
        this.f16687d[i3] = -1;
    }

    public final boolean c0(Object obj) {
        m19592t();
        int iM19572H = m19572H(obj);
        if (iM19572H < 0) {
            return false;
        }
        a0(iM19572H);
        return true;
    }

    @Override // java.util.Map
    public void clear() {
        m19592t();
        int i = this.f16689f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f16686c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f16687d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        eea.m24854g(this.f16684a, 0, this.f16689f);
        Object[] objArr = this.f16685b;
        if (objArr != null) {
            eea.m24854g(objArr, 0, this.f16689f);
        }
        this.f16692q = 0;
        this.f16689f = 0;
        m19586W();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m19572H(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m19573I(obj) >= 0;
    }

    public final boolean d0(Object obj) {
        m19592t();
        int iM19573I = m19573I(obj);
        if (iM19573I < 0) {
            return false;
        }
        a0(iM19573I);
        return true;
    }

    public final boolean e0(int i) {
        int iM19574J = m19574J();
        int i2 = this.f16689f;
        int i3 = iM19574J - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= m19574J() / 4;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m19575L();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && m19568B((Map) obj));
    }

    public final C12476f f0() {
        return new C12476f(this);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iM19572H = m19572H(obj);
        if (iM19572H < 0) {
            return null;
        }
        Object[] objArr = this.f16685b;
        sq8.m48646e(objArr);
        return objArr[iM19572H];
    }

    @Override // java.util.Map
    public int hashCode() {
        C12472b c12472bM19571G = m19571G();
        int iM19602r = 0;
        while (c12472bM19571G.hasNext()) {
            iM19602r += c12472bM19571G.m19602r();
        }
        return iM19602r;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m19577N();
    }

    /* renamed from: o */
    public final int m19589o(Object obj) {
        m19592t();
        while (true) {
            int iM19580Q = m19580Q(obj);
            int iM18604g = bce.m18604g(this.f16688e * 2, m19576M() / 2);
            int i = 0;
            while (true) {
                int i2 = this.f16687d[iM19580Q];
                if (i2 <= 0) {
                    if (this.f16689f < m19574J()) {
                        int i3 = this.f16689f;
                        int i4 = i3 + 1;
                        this.f16689f = i4;
                        this.f16684a[i3] = obj;
                        this.f16686c[i3] = iM19580Q;
                        this.f16687d[iM19580Q] = i4;
                        this.f16692q = size() + 1;
                        m19586W();
                        if (i > this.f16688e) {
                            this.f16688e = i;
                        }
                        return i3;
                    }
                    m19570F(1);
                } else {
                    if (sq8.m48644c(this.f16684a[i2 - 1], obj)) {
                        return -i2;
                    }
                    i++;
                    if (i > iM18604g) {
                        m19587Y(m19576M() * 2);
                        break;
                    }
                    iM19580Q = iM19580Q == 0 ? m19576M() - 1 : iM19580Q - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m19592t();
        int iM19589o = m19589o(obj);
        Object[] objArrM19590r = m19590r();
        if (iM19589o >= 0) {
            objArrM19590r[iM19589o] = obj2;
            return null;
        }
        int i = (-iM19589o) - 1;
        Object obj3 = objArrM19590r[i];
        objArrM19590r[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        sq8.m48649h(map, Constants.MessagePayloadKeys.FROM);
        m19592t();
        m19583T(map.entrySet());
    }

    /* renamed from: r */
    public final Object[] m19590r() {
        Object[] objArr = this.f16685b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrM24851d = eea.m24851d(m19574J());
        this.f16685b = objArrM24851d;
        return objArrM24851d;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        m19592t();
        int iM19572H = m19572H(obj);
        if (iM19572H < 0) {
            return null;
        }
        Object[] objArr = this.f16685b;
        sq8.m48646e(objArr);
        Object obj2 = objArr[iM19572H];
        a0(iM19572H);
        return obj2;
    }

    /* renamed from: s */
    public final Map m19591s() {
        m19592t();
        this.f16683H = true;
        if (size() > 0) {
            return this;
        }
        bqa bqaVar = f16682M;
        sq8.m48647f(bqaVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return bqaVar;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m19578O();
    }

    /* renamed from: t */
    public final void m19592t() {
        if (this.f16683H) {
            throw new UnsupportedOperationException();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C12472b c12472bM19571G = m19571G();
        int i = 0;
        while (c12472bM19571G.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            c12472bM19571G.m19601p(sb);
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: u */
    public final void m19593u(boolean z) {
        int i;
        Object[] objArr = this.f16685b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f16689f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f16686c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f16684a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f16687d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        eea.m24854g(this.f16684a, i3, i);
        if (objArr != null) {
            eea.m24854g(objArr, i3, this.f16689f);
        }
        this.f16689f = i3;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m19579P();
    }

    /* renamed from: y */
    public final boolean m19594y(Collection collection) {
        sq8.m48649h(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m19567A((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public bqa() {
        this(8);
    }

    public bqa(int i) {
        this(eea.m24851d(i), null, new int[i], new int[f16681L.m19597c(i)], 2, 0);
    }
}
