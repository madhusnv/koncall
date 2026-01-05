package p001o;

import java.util.Comparator;

/* loaded from: classes6.dex */
public final class hte implements Comparator {

    /* renamed from: a */
    public static final hte f27538a = new hte();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        sq8.m48649h(comparable, "a");
        sq8.m48649h(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return trb.f47659a;
    }
}
