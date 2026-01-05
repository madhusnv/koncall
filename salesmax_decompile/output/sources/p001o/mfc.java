package p001o;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class mfc implements Comparator {
    /* renamed from: b */
    public static mfc m38936b(Comparator comparator) {
        return comparator instanceof mfc ? (mfc) comparator : new ek3(comparator);
    }

    /* renamed from: c */
    public static mfc m38937c() {
        return urb.f49408a;
    }

    /* renamed from: a */
    public mfc m38938a(Comparator comparator) {
        return new pp3(this, (Comparator) dgd.m23062o(comparator));
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    /* renamed from: d */
    public mfc m38939d(ol7 ol7Var) {
        return new np1(ol7Var, this);
    }

    /* renamed from: e */
    public mfc mo29478e() {
        return new ite(this);
    }
}
