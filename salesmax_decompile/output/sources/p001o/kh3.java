package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class kh3 extends jh3 {

    /* renamed from: o.kh3$a */
    public static final class C14833a implements ief {

        /* renamed from: a */
        public final /* synthetic */ Iterable f32246a;

        public C14833a(Iterable iterable) {
            this.f32246a = iterable;
        }

        @Override // p001o.ief
        public Iterator iterator() {
            return this.f32246a.iterator();
        }
    }

    /* renamed from: o.kh3$b */
    public static final class C14834b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ int f32247a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14834b(int i) {
            super(1);
            this.f32247a = i;
        }

        /* renamed from: a */
        public final Object m35711a(int i) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f32247a + '.');
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m35711a(((Number) obj).intValue());
        }
    }

    public static final Object A0(Collection collection, vbe vbeVar) {
        sq8.m48649h(collection, "<this>");
        sq8.m48649h(vbeVar, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return a0(collection, vbeVar.mo22613g(collection.size()));
    }

    public static final List B0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Q0(iterable);
        }
        List listS0 = S0(iterable);
        jh3.m33831T(listS0);
        return listS0;
    }

    public static final Object C0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if (iterable instanceof List) {
            return D0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final Object D0(List list) {
        sq8.m48649h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final Object E0(List list) {
        sq8.m48649h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final List F0(List list, kl8 kl8Var) {
        sq8.m48649h(list, "<this>");
        sq8.m48649h(kl8Var, "indices");
        return kl8Var.isEmpty() ? ch3.m21246k() : Q0(list.subList(kl8Var.getStart().intValue(), kl8Var.getEndInclusive().intValue() + 1));
    }

    public static final List G0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listS0 = S0(iterable);
            gh3.m28656y(listS0);
            return listS0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        fp0.m27248F((Comparable[]) array);
        return fp0.m27255d(array);
    }

    public static final List H0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        return I0(iterable, uk3.m51678h());
    }

    public static final List I0(Iterable iterable, Comparator comparator) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listS0 = S0(iterable);
            gh3.m28657z(listS0, comparator);
            return listS0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        fp0.m27249G(array, comparator);
        return fp0.m27255d(array);
    }

    public static final List J0(Iterable iterable, int i) {
        sq8.m48649h(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return ch3.m21246k();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return Q0(iterable);
            }
            if (i == 1) {
                return bh3.m18963e(e0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return ch3.m21253r(arrayList);
    }

    public static final boolean[] K0(Collection collection) {
        sq8.m48649h(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static final byte[] L0(Collection collection) {
        sq8.m48649h(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final Collection M0(Iterable iterable, Collection collection) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(collection, FirebaseAnalytics.Param.DESTINATION);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static final float[] N0(Collection collection) {
        sq8.m48649h(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static final HashSet O0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        return (HashSet) M0(iterable, new HashSet(hsa.m31055e(dh3.m23088v(iterable, 12))));
    }

    public static final int[] P0(Collection collection) {
        sq8.m48649h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static final List Q0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return ch3.m21253r(S0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ch3.m21246k();
        }
        if (size != 1) {
            return T0(collection);
        }
        return bh3.m18963e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final long[] R0(Collection collection) {
        sq8.m48649h(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final List S0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        return iterable instanceof Collection ? T0((Collection) iterable) : (List) M0(iterable, new ArrayList());
    }

    public static final List T0(Collection collection) {
        sq8.m48649h(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: U */
    public static final boolean m35705U(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static final Set U0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) M0(iterable, new LinkedHashSet());
    }

    /* renamed from: V */
    public static final ief m35706V(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        return new C14833a(iterable);
    }

    public static final Set V0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return nif.m40667h((Set) M0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return nif.m40664e();
        }
        if (size != 1) {
            return (Set) M0(iterable, new LinkedHashSet(hsa.m31055e(collection.size())));
        }
        return mif.m39137d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: W */
    public static final List m35707W(Iterable iterable, int i) {
        sq8.m48649h(iterable, "<this>");
        return X0(iterable, i, i, true);
    }

    public static final Set W0(Iterable iterable, Iterable iterable2) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(iterable2, "other");
        Set setU0 = U0(iterable);
        hh3.m30441A(setU0, iterable2);
        return setU0;
    }

    /* renamed from: X */
    public static final boolean m35708X(Iterable iterable, Object obj) {
        sq8.m48649h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : j0(iterable, obj) >= 0;
    }

    public static final List X0(Iterable iterable, int i, int i2, boolean z) {
        int iM18604g;
        sq8.m48649h(iterable, "<this>");
        bwf.m19905a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM19906b = bwf.m19906b(iterable.iterator(), i, i2, z, false);
            while (itM19906b.hasNext()) {
                arrayList.add((List) itM19906b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (true) {
            if (!(i3 >= 0 && i3 < size) || ((iM18604g = bce.m18604g(i, size - i3)) < i && !z)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iM18604g);
            for (int i4 = 0; i4 < iM18604g; i4++) {
                arrayList3.add(list.get(i4 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    /* renamed from: Y */
    public static final List m35709Y(Iterable iterable, int i) {
        ArrayList arrayList;
        sq8.m48649h(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return Q0(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i;
            if (size <= 0) {
                return ch3.m21246k();
            }
            if (size == 1) {
                return bh3.m18963e(q0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i < size2) {
                        arrayList.add(((List) iterable).get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return ch3.m21253r(arrayList);
    }

    public static final List Y0(Iterable iterable, Iterable iterable2) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(dh3.m23088v(iterable, 10), dh3.m23088v(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(vyh.m53620a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: Z */
    public static final List m35710Z(List list, int i) {
        sq8.m48649h(list, "<this>");
        if (i >= 0) {
            return J0(list, bce.m18601d(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static final Object a0(Iterable iterable, int i) {
        sq8.m48649h(iterable, "<this>");
        return iterable instanceof List ? ((List) iterable).get(i) : b0(iterable, i, new C14834b(i));
    }

    public static final Object b0(Iterable iterable, int i, xk7 xk7Var) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(xk7Var, "defaultValue");
        int i2 = 0;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                i2 = 1;
            }
            return i2 != 0 ? list.get(i) : xk7Var.invoke(Integer.valueOf(i));
        }
        if (i < 0) {
            return xk7Var.invoke(Integer.valueOf(i));
        }
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        return xk7Var.invoke(Integer.valueOf(i));
    }

    public static final List c0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        return (List) d0(iterable, new ArrayList());
    }

    public static final Collection d0(Iterable iterable, Collection collection) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(collection, FirebaseAnalytics.Param.DESTINATION);
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static final Object e0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if (iterable instanceof List) {
            return f0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object f0(List list) {
        sq8.m48649h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final Object g0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final Object h0(List list) {
        sq8.m48649h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object i0(List list, int i) {
        sq8.m48649h(list, "<this>");
        boolean z = false;
        if (i >= 0 && i < list.size()) {
            z = true;
        }
        if (z) {
            return list.get(i);
        }
        return null;
    }

    public static final int j0(Iterable iterable, Object obj) {
        sq8.m48649h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                ch3.m21256u();
            }
            if (sq8.m48644c(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int k0(List list, Object obj) {
        sq8.m48649h(list, "<this>");
        return list.indexOf(obj);
    }

    public static final Set l0(Iterable iterable, Iterable iterable2) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(iterable2, "other");
        Set setU0 = U0(iterable);
        hh3.m30452L(setU0, iterable2);
        return setU0;
    }

    public static final Appendable m0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) throws IOException {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(appendable, "buffer");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            w8g.m54067a(appendable, obj, xk7Var);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String o0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        String string = ((StringBuilder) m0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, xk7Var)).toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String p0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            xk7Var = null;
        }
        return o0(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, xk7Var);
    }

    public static final Object q0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if (iterable instanceof List) {
            return r0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final Object r0(List list) {
        sq8.m48649h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(ch3.m21248m(list));
    }

    public static final Object s0(List list) {
        sq8.m48649h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Comparable t0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Comparable u0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Comparable v0(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final List w0(Iterable iterable, Iterable iterable2) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(iterable2, "elements");
        if (iterable instanceof Collection) {
            return x0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        hh3.m30441A(arrayList, iterable);
        hh3.m30441A(arrayList, iterable2);
        return arrayList;
    }

    public static final List x0(Collection collection, Iterable iterable) {
        sq8.m48649h(collection, "<this>");
        sq8.m48649h(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            hh3.m30441A(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final List y0(Collection collection, Object obj) {
        sq8.m48649h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final List z0(Collection collection, Object[] objArr) {
        sq8.m48649h(collection, "<this>");
        sq8.m48649h(objArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + objArr.length);
        arrayList.addAll(collection);
        hh3.m30442B(arrayList, objArr);
        return arrayList;
    }
}
