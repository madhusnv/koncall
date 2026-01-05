package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public abstract class hh3 extends gh3 {
    /* renamed from: A */
    public static final boolean m30441A(Collection collection, Iterable iterable) {
        sq8.m48649h(collection, "<this>");
        sq8.m48649h(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: B */
    public static final boolean m30442B(Collection collection, Object[] objArr) {
        sq8.m48649h(collection, "<this>");
        sq8.m48649h(objArr, "elements");
        return collection.addAll(fp0.m27255d(objArr));
    }

    /* renamed from: C */
    public static final Collection m30443C(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : kh3.Q0(iterable);
    }

    /* renamed from: D */
    public static final boolean m30444D(Iterable iterable, xk7 xk7Var, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) xk7Var.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: E */
    public static final boolean m30445E(List list, xk7 xk7Var, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            sq8.m48647f(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m30444D(azh.m18049b(list), xk7Var, z);
        }
        int iM21248m = ch3.m21248m(list);
        if (iM21248m >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (((Boolean) xk7Var.invoke(obj)).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == iM21248m) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int iM21248m2 = ch3.m21248m(list);
        if (i > iM21248m2) {
            return true;
        }
        while (true) {
            list.remove(iM21248m2);
            if (iM21248m2 == i) {
                return true;
            }
            iM21248m2--;
        }
    }

    /* renamed from: F */
    public static final boolean m30446F(Iterable iterable, xk7 xk7Var) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(xk7Var, "predicate");
        return m30444D(iterable, xk7Var, true);
    }

    /* renamed from: G */
    public static final boolean m30447G(List list, xk7 xk7Var) {
        sq8.m48649h(list, "<this>");
        sq8.m48649h(xk7Var, "predicate");
        return m30445E(list, xk7Var, true);
    }

    /* renamed from: H */
    public static final Object m30448H(List list) {
        sq8.m48649h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    /* renamed from: I */
    public static final Object m30449I(List list) {
        sq8.m48649h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(ch3.m21248m(list));
    }

    /* renamed from: J */
    public static final Object m30450J(List list) {
        sq8.m48649h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(ch3.m21248m(list));
    }

    /* renamed from: K */
    public static final boolean m30451K(Iterable iterable, xk7 xk7Var) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(xk7Var, "predicate");
        return m30444D(iterable, xk7Var, false);
    }

    /* renamed from: L */
    public static final boolean m30452L(Collection collection, Iterable iterable) {
        sq8.m48649h(collection, "<this>");
        sq8.m48649h(iterable, "elements");
        return collection.retainAll(m30443C(iterable));
    }
}
