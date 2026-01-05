package p001o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class gte extends mfc implements Serializable {

    /* renamed from: a */
    public static final gte f25787a = new gte();

    private Object readResolve() {
        return f25787a;
    }

    @Override // p001o.mfc
    /* renamed from: e */
    public mfc mo29478e() {
        return mfc.m38937c();
    }

    @Override // p001o.mfc, java.util.Comparator
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        dgd.m23062o(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
