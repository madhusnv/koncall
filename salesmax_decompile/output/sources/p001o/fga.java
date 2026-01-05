package p001o;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class fga {

    /* renamed from: o.fga$a */
    public static class C13424a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a */
        public final List f23290a;

        /* renamed from: b */
        public final ol7 f23291b;

        /* renamed from: o.fga$a$a */
        public class a extends cvh {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p001o.bvh
            /* renamed from: a */
            public Object mo19878a(Object obj) {
                return C13424a.this.f23291b.apply(obj);
            }
        }

        public C13424a(List list, ol7 ol7Var) {
            this.f23290a = (List) dgd.m23062o(list);
            this.f23291b = (ol7) dgd.m23062o(ol7Var);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            return this.f23291b.apply(this.f23290a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f23290a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            return new a(this.f23290a.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i) {
            return this.f23291b.apply(this.f23290a.remove(i));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i, int i2) {
            this.f23290a.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f23290a.size();
        }
    }

    /* renamed from: o.fga$b */
    public static class C13425b extends AbstractSequentialList implements Serializable {

        /* renamed from: a */
        public final List f23293a;

        /* renamed from: b */
        public final ol7 f23294b;

        /* renamed from: o.fga$b$a */
        public class a extends cvh {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p001o.bvh
            /* renamed from: a */
            public Object mo19878a(Object obj) {
                return C13425b.this.f23294b.apply(obj);
            }
        }

        public C13425b(List list, ol7 ol7Var) {
            this.f23293a = (List) dgd.m23062o(list);
            this.f23294b = (ol7) dgd.m23062o(ol7Var);
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            return new a(this.f23293a.listIterator(i));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i, int i2) {
            this.f23293a.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f23293a.size();
        }
    }

    /* renamed from: a */
    public static int m26645a(int i) {
        rg3.m46690b(i, "arraySize");
        return br8.m19645l(i + 5 + (i / 10));
    }

    /* renamed from: b */
    public static boolean m26646b(List list, Object obj) {
        if (obj == dgd.m23062o(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return e69.m24381e(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!r6c.m46255a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static int m26647c(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m26648d(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (r6c.m46255a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m26648d(List list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public static int m26649e(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m26650f(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (r6c.m46255a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static int m26650f(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static ArrayList m26651g() {
        return new ArrayList();
    }

    /* renamed from: h */
    public static ArrayList m26652h(Iterable iterable) {
        dgd.m23062o(iterable);
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : m26653i(iterable.iterator());
    }

    /* renamed from: i */
    public static ArrayList m26653i(Iterator it) {
        ArrayList arrayListM26651g = m26651g();
        e69.m24377a(arrayListM26651g, it);
        return arrayListM26651g;
    }

    /* renamed from: j */
    public static ArrayList m26654j(Object... objArr) {
        dgd.m23062o(objArr);
        ArrayList arrayList = new ArrayList(m26645a(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* renamed from: k */
    public static List m26655k(List list, ol7 ol7Var) {
        return list instanceof RandomAccess ? new C13424a(list, ol7Var) : new C13425b(list, ol7Var);
    }
}
