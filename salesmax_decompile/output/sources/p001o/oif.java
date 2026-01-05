package p001o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class oif extends nif {
    /* renamed from: j */
    public static final Set m42270j(Set set, Iterable iterable) {
        sq8.m48649h(set, "<this>");
        sq8.m48649h(iterable, "elements");
        Collection<?> collectionM30443C = hh3.m30443C(iterable);
        if (collectionM30443C.isEmpty()) {
            return kh3.V0(set);
        }
        if (!(collectionM30443C instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM30443C);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!collectionM30443C.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: k */
    public static final Set m42271k(Set set, Object obj) {
        sq8.m48649h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(hsa.m31055e(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && sq8.m48644c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: l */
    public static final Set m42272l(Set set, Iterable iterable) {
        int size;
        sq8.m48649h(set, "<this>");
        sq8.m48649h(iterable, "elements");
        Integer numM23089w = dh3.m23089w(iterable);
        if (numM23089w != null) {
            size = set.size() + numM23089w.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(hsa.m31055e(size));
        linkedHashSet.addAll(set);
        hh3.m30441A(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: m */
    public static final Set m42273m(Set set, Object obj) {
        sq8.m48649h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(hsa.m31055e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
