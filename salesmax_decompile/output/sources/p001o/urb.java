package p001o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class urb extends mfc implements Serializable {

    /* renamed from: a */
    public static final urb f49408a = new urb();

    private Object readResolve() {
        return f49408a;
    }

    @Override // p001o.mfc
    /* renamed from: e */
    public mfc mo29478e() {
        return gte.f25787a;
    }

    @Override // p001o.mfc, java.util.Comparator
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        dgd.m23062o(comparable);
        dgd.m23062o(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
