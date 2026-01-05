package p001o;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class z59 {
    /* renamed from: a */
    public static boolean m58770a(Iterable iterable, hgd hgdVar) {
        return e69.m24378b(iterable.iterator(), hgdVar);
    }

    /* renamed from: b */
    public static Collection m58771b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : fga.m26653i(iterable.iterator());
    }

    /* renamed from: c */
    public static Object m58772c(Iterable iterable, Object obj) {
        return e69.m24386j(iterable.iterator(), obj);
    }

    /* renamed from: d */
    public static Object m58773d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return e69.m24385i(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return m58774e(list);
    }

    /* renamed from: e */
    public static Object m58774e(List list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    public static Object m58775f(Iterable iterable) {
        return e69.m24387k(iterable.iterator());
    }

    /* renamed from: g */
    public static boolean m58776g(Iterable iterable, hgd hgdVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? m58777h((List) iterable, (hgd) dgd.m23062o(hgdVar)) : e69.m24391o(iterable.iterator(), hgdVar);
    }

    /* renamed from: h */
    public static boolean m58777h(List list, hgd hgdVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!hgdVar.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        m58778i(list, hgdVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m58778i(list, hgdVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    /* renamed from: i */
    public static void m58778i(List list, hgd hgdVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (hgdVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* renamed from: j */
    public static Object[] m58779j(Iterable iterable) {
        return m58771b(iterable).toArray();
    }
}
