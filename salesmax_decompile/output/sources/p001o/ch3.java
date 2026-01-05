package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class ch3 extends bh3 {
    /* renamed from: g */
    public static final ArrayList m21242g(Object... objArr) {
        sq8.m48649h(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new lo0(objArr, true));
    }

    /* renamed from: h */
    public static final Collection m21243h(Object[] objArr) {
        sq8.m48649h(objArr, "<this>");
        return new lo0(objArr, false);
    }

    /* renamed from: i */
    public static final int m21244i(List list, Comparable comparable, int i, int i2) {
        sq8.m48649h(list, "<this>");
        m21254s(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iM51674d = uk3.m51674d((Comparable) list.get(i4), comparable);
            if (iM51674d < 0) {
                i = i4 + 1;
            } else {
                if (iM51674d <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: j */
    public static /* synthetic */ int m21245j(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m21244i(list, comparable, i, i2);
    }

    /* renamed from: k */
    public static final List m21246k() {
        return k66.f31526a;
    }

    /* renamed from: l */
    public static final kl8 m21247l(Collection collection) {
        sq8.m48649h(collection, "<this>");
        return new kl8(0, collection.size() - 1);
    }

    /* renamed from: m */
    public static final int m21248m(List list) {
        sq8.m48649h(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: n */
    public static final List m21249n(Object... objArr) {
        sq8.m48649h(objArr, "elements");
        return objArr.length > 0 ? fp0.m27255d(objArr) : m21246k();
    }

    /* renamed from: o */
    public static final List m21250o(Object obj) {
        return obj != null ? bh3.m18963e(obj) : m21246k();
    }

    /* renamed from: p */
    public static final List m21251p(Object... objArr) {
        sq8.m48649h(objArr, "elements");
        return gp0.m29255V(objArr);
    }

    /* renamed from: q */
    public static final List m21252q(Object... objArr) {
        sq8.m48649h(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new lo0(objArr, true));
    }

    /* renamed from: r */
    public static final List m21253r(List list) {
        sq8.m48649h(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : bh3.m18963e(list.get(0)) : m21246k();
    }

    /* renamed from: s */
    public static final void m21254s(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
    }

    /* renamed from: t */
    public static final void m21255t() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: u */
    public static final void m21256u() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
