package p001o;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ap0 implements Collection, Set, tb9, zb9 {

    /* renamed from: a */
    public int[] f15087a;

    /* renamed from: b */
    public Object[] f15088b;

    /* renamed from: c */
    public int f15089c;

    /* renamed from: o.ap0$a */
    public final class C12229a extends vh8 {
        public C12229a() {
            super(ap0.this.m17582o());
        }

        @Override // p001o.vh8
        /* renamed from: a */
        public Object mo17588a(int i) {
            return ap0.this.m17577A(i);
        }

        @Override // p001o.vh8
        /* renamed from: e */
        public void mo17589e(int i) {
            ap0.this.m17584r(i);
        }
    }

    public ap0() {
        this(0, 1, null);
    }

    /* renamed from: A */
    public final Object m17577A(int i) {
        return m17579e()[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i;
        int iM21560c;
        int iM17582o = m17582o();
        if (obj == null) {
            iM21560c = cp0.m21561d(this);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM21560c = cp0.m21560c(this, obj, iHashCode);
        }
        if (iM21560c >= 0) {
            return false;
        }
        int i2 = ~iM21560c;
        if (iM17582o >= m17580j().length) {
            int i3 = 8;
            if (iM17582o >= 8) {
                i3 = (iM17582o >> 1) + iM17582o;
            } else if (iM17582o < 4) {
                i3 = 4;
            }
            int[] iArrM17580j = m17580j();
            Object[] objArrM17579e = m17579e();
            cp0.m21558a(this, i3);
            if (iM17582o != m17582o()) {
                throw new ConcurrentModificationException();
            }
            if (!(m17580j().length == 0)) {
                fp0.m27263l(iArrM17580j, m17580j(), 0, 0, iArrM17580j.length, 6, null);
                fp0.m27264m(objArrM17579e, m17579e(), 0, 0, objArrM17579e.length, 6, null);
            }
        }
        if (i2 < iM17582o) {
            int i4 = i2 + 1;
            fp0.m27258g(m17580j(), m17580j(), i4, i2, iM17582o);
            fp0.m27260i(m17579e(), m17579e(), i4, i2, iM17582o);
        }
        if (iM17582o != m17582o() || i2 >= m17580j().length) {
            throw new ConcurrentModificationException();
        }
        m17580j()[i2] = i;
        m17579e()[i2] = obj;
        m17587y(m17582o() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        m17578d(m17582o() + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (m17582o() != 0) {
            m17586w(h14.f26079a);
            m17585v(h14.f26081c);
            m17587y(0);
        }
        if (m17582o() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void m17578d(int i) {
        int iM17582o = m17582o();
        if (m17580j().length < i) {
            int[] iArrM17580j = m17580j();
            Object[] objArrM17579e = m17579e();
            cp0.m21558a(this, i);
            if (m17582o() > 0) {
                fp0.m27263l(iArrM17580j, m17580j(), 0, 0, m17582o(), 6, null);
                fp0.m27264m(objArrM17579e, m17579e(), 0, 0, m17582o(), 6, null);
            }
        }
        if (m17582o() != iM17582o) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final Object[] m17579e() {
        return this.f15088b;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int iM17582o = m17582o();
                for (int i = 0; i < iM17582o; i++) {
                    if (((Set) obj).contains(m17577A(i))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrM17580j = m17580j();
        int iM17582o = m17582o();
        int i = 0;
        for (int i2 = 0; i2 < iM17582o; i2++) {
            i += iArrM17580j[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        return obj == null ? cp0.m21561d(this) : cp0.m21560c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return m17582o() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C12229a();
    }

    /* renamed from: j */
    public final int[] m17580j() {
        return this.f15087a;
    }

    /* renamed from: n */
    public int m17581n() {
        return this.f15089c;
    }

    /* renamed from: o */
    public final int m17582o() {
        return this.f15089c;
    }

    /* renamed from: p */
    public final boolean m17583p(ap0 ap0Var) {
        sq8.m48649h(ap0Var, "array");
        int iM17582o = ap0Var.m17582o();
        int iM17582o2 = m17582o();
        for (int i = 0; i < iM17582o; i++) {
            remove(ap0Var.m17577A(i));
        }
        return iM17582o2 != m17582o();
    }

    /* renamed from: r */
    public final Object m17584r(int i) {
        int iM17582o = m17582o();
        Object obj = m17579e()[i];
        if (iM17582o <= 1) {
            clear();
        } else {
            int i2 = iM17582o - 1;
            if (m17580j().length <= 8 || m17582o() >= m17580j().length / 3) {
                if (i < i2) {
                    int i3 = i + 1;
                    int i4 = i2 + 1;
                    fp0.m27258g(m17580j(), m17580j(), i, i3, i4);
                    fp0.m27260i(m17579e(), m17579e(), i, i3, i4);
                }
                m17579e()[i2] = null;
            } else {
                int iM17582o2 = m17582o() > 8 ? m17582o() + (m17582o() >> 1) : 8;
                int[] iArrM17580j = m17580j();
                Object[] objArrM17579e = m17579e();
                cp0.m21558a(this, iM17582o2);
                if (i > 0) {
                    fp0.m27263l(iArrM17580j, m17580j(), 0, 0, i, 6, null);
                    fp0.m27264m(objArrM17579e, m17579e(), 0, 0, i, 6, null);
                }
                if (i < i2) {
                    int i5 = i + 1;
                    int i6 = i2 + 1;
                    fp0.m27258g(iArrM17580j, m17580j(), i, i5, i6);
                    fp0.m27260i(objArrM17579e, m17579e(), i, i5, i6);
                }
            }
            if (iM17582o != m17582o()) {
                throw new ConcurrentModificationException();
            }
            m17587y(i2);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m17584r(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        boolean z = false;
        for (int iM17582o = m17582o() - 1; -1 < iM17582o; iM17582o--) {
            if (!kh3.m35708X(collection, m17579e()[iM17582o])) {
                m17584r(iM17582o);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m17581n();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return fp0.m27266o(this.f15088b, 0, this.f15089c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(m17582o() * 14);
        sb.append('{');
        int iM17582o = m17582o();
        for (int i = 0; i < iM17582o; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM17577A = m17577A(i);
            if (objM17577A != this) {
                sb.append(objM17577A);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        sq8.m48648g(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* renamed from: v */
    public final void m17585v(Object[] objArr) {
        sq8.m48649h(objArr, "<set-?>");
        this.f15088b = objArr;
    }

    /* renamed from: w */
    public final void m17586w(int[] iArr) {
        sq8.m48649h(iArr, "<set-?>");
        this.f15087a = iArr;
    }

    /* renamed from: y */
    public final void m17587y(int i) {
        this.f15089c = i;
    }

    public ap0(int i) {
        this.f15087a = h14.f26079a;
        this.f15088b = h14.f26081c;
        if (i > 0) {
            cp0.m21558a(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        Object[] objArrM19501a = bp0.m19501a(objArr, this.f15089c);
        fp0.m27260i(this.f15088b, objArrM19501a, 0, 0, this.f15089c);
        sq8.m48648g(objArrM19501a, "result");
        return objArrM19501a;
    }

    public /* synthetic */ ap0(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
