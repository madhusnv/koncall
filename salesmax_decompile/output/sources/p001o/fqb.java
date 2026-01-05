package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class fqb implements RandomAccess {

    /* renamed from: a */
    public Object[] f23935a;

    /* renamed from: b */
    public List f23936b;

    /* renamed from: c */
    public int f23937c;

    /* renamed from: o.fqb$a */
    public static final class C13531a implements List, vb9 {

        /* renamed from: a */
        public final fqb f23938a;

        public C13531a(fqb fqbVar) {
            sq8.m48649h(fqbVar, "vector");
            this.f23938a = fqbVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f23938a.m27344c(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            sq8.m48649h(collection, "elements");
            return this.f23938a.m27345d(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f23938a.m27349i();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f23938a.m27350j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            return this.f23938a.m27351l(collection);
        }

        /* renamed from: d */
        public int m27366d() {
            return this.f23938a.m27354o();
        }

        /* renamed from: e */
        public Object m27367e(int i) {
            gqb.m29310c(this, i);
            return this.f23938a.m27361v(i);
        }

        @Override // java.util.List
        public Object get(int i) {
            gqb.m29310c(this, i);
            return this.f23938a.m27353n()[i];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f23938a.m27355p(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f23938a.m27356q();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C13533c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f23938a.m27358s(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C13533c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return m27367e(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            return this.f23938a.m27360u(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            return this.f23938a.m27363x(collection);
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            gqb.m29310c(this, i);
            return this.f23938a.m27364y(i, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m27366d();
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            gqb.m29311d(this, i, i2);
            return new C13532b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return yg3.m57773a(this);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            this.f23938a.m27343b(i, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            return this.f23938a.m27347g(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return new C13533c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f23938a.m27359t(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            sq8.m48649h(objArr, "array");
            return yg3.m57774b(this, objArr);
        }
    }

    /* renamed from: o.fqb$b */
    public static final class C13532b implements List, vb9 {

        /* renamed from: a */
        public final List f23939a;

        /* renamed from: b */
        public final int f23940b;

        /* renamed from: c */
        public int f23941c;

        public C13532b(List list, int i, int i2) {
            sq8.m48649h(list, "list");
            this.f23939a = list;
            this.f23940b = i;
            this.f23941c = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f23939a;
            int i = this.f23941c;
            this.f23941c = i + 1;
            list.add(i, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            sq8.m48649h(collection, "elements");
            this.f23939a.addAll(i + this.f23940b, collection);
            this.f23941c += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.f23941c - 1;
            int i2 = this.f23940b;
            if (i2 <= i) {
                while (true) {
                    this.f23939a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.f23941c = this.f23940b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.f23941c;
            for (int i2 = this.f23940b; i2 < i; i2++) {
                if (sq8.m48644c(this.f23939a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
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
        public int m27368d() {
            return this.f23941c - this.f23940b;
        }

        /* renamed from: e */
        public Object m27369e(int i) {
            gqb.m29310c(this, i);
            this.f23941c--;
            return this.f23939a.remove(i + this.f23940b);
        }

        @Override // java.util.List
        public Object get(int i) {
            gqb.m29310c(this, i);
            return this.f23939a.get(i + this.f23940b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.f23941c;
            for (int i2 = this.f23940b; i2 < i; i2++) {
                if (sq8.m48644c(this.f23939a.get(i2), obj)) {
                    return i2 - this.f23940b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f23941c == this.f23940b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C13533c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.f23941c - 1;
            int i2 = this.f23940b;
            if (i2 > i) {
                return -1;
            }
            while (!sq8.m48644c(this.f23939a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f23940b;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C13533c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return m27369e(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            int i = this.f23941c;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f23941c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            int i = this.f23941c;
            int i2 = i - 1;
            int i3 = this.f23940b;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.f23939a.get(i2))) {
                        this.f23939a.remove(i2);
                        this.f23941c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f23941c;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            gqb.m29310c(this, i);
            return this.f23939a.set(i + this.f23940b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m27368d();
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            gqb.m29311d(this, i, i2);
            return new C13532b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return yg3.m57773a(this);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            this.f23939a.add(i + this.f23940b, obj);
            this.f23941c++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return new C13533c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.f23941c;
            for (int i2 = this.f23940b; i2 < i; i2++) {
                if (sq8.m48644c(this.f23939a.get(i2), obj)) {
                    this.f23939a.remove(i2);
                    this.f23941c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            sq8.m48649h(objArr, "array");
            return yg3.m57774b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            sq8.m48649h(collection, "elements");
            this.f23939a.addAll(this.f23941c, collection);
            this.f23941c += collection.size();
            return collection.size() > 0;
        }
    }

    /* renamed from: o.fqb$c */
    public static final class C13533c implements ListIterator, sb9 {

        /* renamed from: a */
        public final List f23942a;

        /* renamed from: b */
        public int f23943b;

        public C13533c(List list, int i) {
            sq8.m48649h(list, "list");
            this.f23942a = list;
            this.f23943b = i;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f23942a.add(this.f23943b, obj);
            this.f23943b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23943b < this.f23942a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23943b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f23942a;
            int i = this.f23943b;
            this.f23943b = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23943b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i = this.f23943b - 1;
            this.f23943b = i;
            return this.f23942a.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f23943b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.f23943b - 1;
            this.f23943b = i;
            this.f23942a.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f23942a.set(this.f23943b, obj);
        }
    }

    public fqb(Object[] objArr, int i) {
        sq8.m48649h(objArr, FirebaseAnalytics.Param.CONTENT);
        this.f23935a = objArr;
        this.f23937c = i;
    }

    /* renamed from: b */
    public final void m27343b(int i, Object obj) {
        m27352m(this.f23937c + 1);
        Object[] objArr = this.f23935a;
        int i2 = this.f23937c;
        if (i != i2) {
            fp0.m27260i(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = obj;
        this.f23937c++;
    }

    /* renamed from: c */
    public final boolean m27344c(Object obj) {
        m27352m(this.f23937c + 1);
        Object[] objArr = this.f23935a;
        int i = this.f23937c;
        objArr[i] = obj;
        this.f23937c = i + 1;
        return true;
    }

    /* renamed from: d */
    public final boolean m27345d(int i, Collection collection) {
        sq8.m48649h(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        m27352m(this.f23937c + collection.size());
        Object[] objArr = this.f23935a;
        if (i != this.f23937c) {
            fp0.m27260i(objArr, objArr, collection.size() + i, i, this.f23937c);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ch3.m21256u();
            }
            objArr[i2 + i] = obj;
            i2 = i3;
        }
        this.f23937c += collection.size();
        return true;
    }

    /* renamed from: e */
    public final boolean m27346e(int i, fqb fqbVar) {
        sq8.m48649h(fqbVar, "elements");
        if (fqbVar.m27356q()) {
            return false;
        }
        m27352m(this.f23937c + fqbVar.f23937c);
        Object[] objArr = this.f23935a;
        int i2 = this.f23937c;
        if (i != i2) {
            fp0.m27260i(objArr, objArr, fqbVar.f23937c + i, i, i2);
        }
        fp0.m27260i(fqbVar.f23935a, objArr, i, 0, fqbVar.f23937c);
        this.f23937c += fqbVar.f23937c;
        return true;
    }

    /* renamed from: g */
    public final boolean m27347g(Collection collection) {
        sq8.m48649h(collection, "elements");
        return m27345d(this.f23937c, collection);
    }

    /* renamed from: h */
    public final List m27348h() {
        List list = this.f23936b;
        if (list != null) {
            return list;
        }
        C13531a c13531a = new C13531a(this);
        this.f23936b = c13531a;
        return c13531a;
    }

    /* renamed from: i */
    public final void m27349i() {
        Object[] objArr = this.f23935a;
        int iM27354o = m27354o();
        while (true) {
            iM27354o--;
            if (-1 >= iM27354o) {
                this.f23937c = 0;
                return;
            }
            objArr[iM27354o] = null;
        }
    }

    /* renamed from: j */
    public final boolean m27350j(Object obj) {
        int iM27354o = m27354o() - 1;
        if (iM27354o >= 0) {
            for (int i = 0; !sq8.m48644c(m27353n()[i], obj); i++) {
                if (i != iM27354o) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m27351l(Collection collection) {
        sq8.m48649h(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m27350j(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void m27352m(int i) {
        Object[] objArr = this.f23935a;
        if (objArr.length < i) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
            sq8.m48648g(objArrCopyOf, "copyOf(this, newSize)");
            this.f23935a = objArrCopyOf;
        }
    }

    /* renamed from: n */
    public final Object[] m27353n() {
        return this.f23935a;
    }

    /* renamed from: o */
    public final int m27354o() {
        return this.f23937c;
    }

    /* renamed from: p */
    public final int m27355p(Object obj) {
        int i = this.f23937c;
        if (i <= 0) {
            return -1;
        }
        Object[] objArr = this.f23935a;
        int i2 = 0;
        while (!sq8.m48644c(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: q */
    public final boolean m27356q() {
        return this.f23937c == 0;
    }

    /* renamed from: r */
    public final boolean m27357r() {
        return this.f23937c != 0;
    }

    /* renamed from: s */
    public final int m27358s(Object obj) {
        int i = this.f23937c;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        Object[] objArr = this.f23935a;
        while (!sq8.m48644c(obj, objArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: t */
    public final boolean m27359t(Object obj) {
        int iM27355p = m27355p(obj);
        if (iM27355p < 0) {
            return false;
        }
        m27361v(iM27355p);
        return true;
    }

    /* renamed from: u */
    public final boolean m27360u(Collection collection) {
        sq8.m48649h(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.f23937c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m27359t(it.next());
        }
        return i != this.f23937c;
    }

    /* renamed from: v */
    public final Object m27361v(int i) {
        Object[] objArr = this.f23935a;
        Object obj = objArr[i];
        if (i != m27354o() - 1) {
            fp0.m27260i(objArr, objArr, i, i + 1, this.f23937c);
        }
        int i2 = this.f23937c - 1;
        this.f23937c = i2;
        objArr[i2] = null;
        return obj;
    }

    /* renamed from: w */
    public final void m27362w(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f23937c;
            if (i2 < i3) {
                Object[] objArr = this.f23935a;
                fp0.m27260i(objArr, objArr, i, i2, i3);
            }
            int i4 = this.f23937c - (i2 - i);
            int iM27354o = m27354o() - 1;
            if (i4 <= iM27354o) {
                int i5 = i4;
                while (true) {
                    this.f23935a[i5] = null;
                    if (i5 == iM27354o) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f23937c = i4;
        }
    }

    /* renamed from: x */
    public final boolean m27363x(Collection collection) {
        sq8.m48649h(collection, "elements");
        int i = this.f23937c;
        for (int iM27354o = m27354o() - 1; -1 < iM27354o; iM27354o--) {
            if (!collection.contains(m27353n()[iM27354o])) {
                m27361v(iM27354o);
            }
        }
        return i != this.f23937c;
    }

    /* renamed from: y */
    public final Object m27364y(int i, Object obj) {
        Object[] objArr = this.f23935a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* renamed from: z */
    public final void m27365z(Comparator comparator) {
        sq8.m48649h(comparator, "comparator");
        fp0.m27250H(this.f23935a, comparator, 0, this.f23937c);
    }
}
