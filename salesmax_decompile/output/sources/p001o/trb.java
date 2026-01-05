package p001o;

import java.util.Comparator;

/* loaded from: classes6.dex */
public final class trb implements Comparator {

    /* renamed from: a */
    public static final trb f47659a = new trb();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        sq8.m48649h(comparable, "a");
        sq8.m48649h(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return hte.f27538a;
    }
}
