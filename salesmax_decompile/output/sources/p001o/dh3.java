package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class dh3 extends ch3 {
    /* renamed from: v */
    public static final int m23088v(Iterable iterable, int i) {
        sq8.m48649h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: w */
    public static final Integer m23089w(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: x */
    public static final List m23090x(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hh3.m30441A(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
