package rw;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import fx.InterfaceC2395a;
import fx.InterfaceC2396b;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;
import kx.C4266h;
import mx.C4914j;
import nx.AbstractC5179q;
import og.pe;
import og.qe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* renamed from: rw.m */
/* loaded from: classes3.dex */
public abstract class AbstractC6663m extends AbstractC6666p {
    /* renamed from: A */
    public static List m12737A(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        return c0(f0(iterable));
    }

    /* renamed from: B */
    public static List m12738B(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return C6668r.f31943a;
        }
        if (size == 1) {
            return pe.m10833h(m12749M(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i10 = 1; i10 < size2; i10++) {
                arrayList.add(list.get(i10));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public static final boolean m12739C(Collection collection, InterfaceC2139c interfaceC2139c, boolean z6) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC2139c.invoke(it.next())).booleanValue() == z6) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: D */
    public static ArrayList m12740D(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    public static Object m12741E(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if (iterable instanceof List) {
            return m12742F((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: F */
    public static Object m12742F(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: G */
    public static Object m12743G(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: H */
    public static Object m12744H(List list, int i10) {
        AbstractC4154l.m8923f(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    /* renamed from: I */
    public static int m12745I(Iterable iterable, Object obj) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            if (AbstractC4154l.m8918a(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: J */
    public static final void m12746J(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC2139c interfaceC2139c) {
        AbstractC4154l.m8923f(iterable, "<this>");
        sb2.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                sb2.append(charSequence);
            }
            AbstractC5179q.m10119a(sb2, obj, interfaceC2139c);
        }
        sb2.append(charSequence3);
    }

    /* renamed from: K */
    public static /* synthetic */ void m12747K(Iterable iterable, StringBuilder sb2, String str, InterfaceC2139c interfaceC2139c, int i10) {
        if ((i10 & 64) != 0) {
            interfaceC2139c = null;
        }
        m12746J(iterable, sb2, str, "", "", "...", interfaceC2139c);
    }

    /* renamed from: L */
    public static String m12748L(Iterable iterable, String str, String str2, String str3, InterfaceC2139c interfaceC2139c, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i10 & 2) != 0 ? "" : str2;
        String str5 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            interfaceC2139c = null;
        }
        AbstractC4154l.m8923f(iterable, "<this>");
        AbstractC4154l.m8923f(prefix, "prefix");
        StringBuilder sb2 = new StringBuilder();
        m12746J(iterable, sb2, str4, prefix, str5, "...", interfaceC2139c);
        return sb2.toString();
    }

    /* renamed from: M */
    public static Object m12749M(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if (iterable instanceof List) {
            return m12750N((List) iterable);
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

    /* renamed from: N */
    public static Object m12750N(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(pe.m10832g(list));
    }

    /* renamed from: O */
    public static Object m12751O(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: P */
    public static Comparable m12752P(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
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

    /* renamed from: Q */
    public static ArrayList m12753Q(Object obj, Collection collection) {
        AbstractC4154l.m8923f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: R */
    public static ArrayList m12754R(Collection collection, Iterable elements) {
        AbstractC4154l.m8923f(collection, "<this>");
        AbstractC4154l.m8923f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            m12765x(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: S */
    public static boolean m12755S(List list, InterfaceC2139c predicate) {
        int i10;
        AbstractC4154l.m8923f(list, "<this>");
        AbstractC4154l.m8923f(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof InterfaceC2395a) || (list instanceof InterfaceC2396b)) {
                return m12739C(list, predicate, true);
            }
            d0.m8912i(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        int iM10832g = pe.m10832g(list);
        if (iM10832g >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iM10832g) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iM10832g2 = pe.m10832g(list);
        if (i10 <= iM10832g2) {
            while (true) {
                list.remove(iM10832g2);
                if (iM10832g2 == i10) {
                    break;
                }
                iM10832g2--;
            }
        }
        return true;
    }

    /* renamed from: T */
    public static Object m12756T(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    /* renamed from: U */
    public static Object m12757U(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(pe.m10832g(list));
    }

    /* renamed from: V */
    public static List m12758V(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return c0(iterable);
        }
        List listE0 = e0(iterable);
        Collections.reverse(listE0);
        return listE0;
    }

    /* renamed from: W */
    public static List m12759W(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listE0 = e0(iterable);
            AbstractC6666p.m12770t(listE0);
            return listE0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return c0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        AbstractC4154l.m8923f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC6662l.m12711a(array);
    }

    /* renamed from: X */
    public static List m12760X(Iterable iterable, Comparator comparator) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listE0 = e0(iterable);
            AbstractC6666p.m12771u(listE0, comparator);
            return listE0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return c0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC4154l.m8923f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC6662l.m12711a(array);
    }

    /* renamed from: Y */
    public static List m12761Y(List list, int i10) {
        AbstractC4154l.m8923f(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C6668r.f31943a;
        }
        if (i10 >= list.size()) {
            return c0(list);
        }
        if (i10 == 1) {
            return pe.m10833h(m12741E(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return pe.m10836k(arrayList);
    }

    /* renamed from: Z */
    public static boolean[] m12762Z(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    public static final void a0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC4154l.m8923f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] b0(List list) {
        AbstractC4154l.m8923f(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List c0(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return pe.m10836k(e0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C6668r.f31943a;
        }
        if (size != 1) {
            return d0(collection);
        }
        return pe.m10833h(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList d0(Collection collection) {
        AbstractC4154l.m8923f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List e0(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return d0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        a0(iterable, arrayList);
        return arrayList;
    }

    public static Set f0(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set g0(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return qe.m10862h(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC6674x.m12776d(collection.size()));
                a0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            a0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : qe.m10862h(linkedHashSet2.iterator().next());
            }
        }
        return C6670t.f31945a;
    }

    /* renamed from: v */
    public static final int m12763v(List list, int i10) {
        if (i10 >= 0 && i10 <= pe.m10832g(list)) {
            return pe.m10832g(list) - i10;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Element index ", " must be in range [");
        sbM4567n.append(new C4266h(0, pe.m10832g(list), 1));
        sbM4567n.append("].");
        throw new IndexOutOfBoundsException(sbM4567n.toString());
    }

    /* renamed from: w */
    public static final int m12764w(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Position index ", " must be in range [");
        sbM4567n.append(new C4266h(0, list.size(), 1));
        sbM4567n.append("].");
        throw new IndexOutOfBoundsException(sbM4567n.toString());
    }

    /* renamed from: x */
    public static void m12765x(Collection collection, Iterable elements) {
        AbstractC4154l.m8923f(collection, "<this>");
        AbstractC4154l.m8923f(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* renamed from: y */
    public static C4914j m12766y(Iterable iterable) {
        AbstractC4154l.m8923f(iterable, "<this>");
        return new C4914j(4, iterable);
    }

    /* renamed from: z */
    public static boolean m12767z(Iterable iterable, Object obj) {
        AbstractC4154l.m8923f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : m12745I(iterable, obj) >= 0;
    }
}
