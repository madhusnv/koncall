package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public abstract class ih3 extends hh3 {
    /* renamed from: P */
    public static final List m32128P(List list) {
        sq8.m48649h(list, "<this>");
        return new jte(list);
    }

    /* renamed from: Q */
    public static final int m32129Q(List list, int i) {
        if (i >= 0 && i <= ch3.m21248m(list)) {
            return ch3.m21248m(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new kl8(0, ch3.m21248m(list)) + "].");
    }

    /* renamed from: R */
    public static final int m32130R(List list, int i) {
        return ch3.m21248m(list) - i;
    }

    /* renamed from: S */
    public static final int m32131S(List list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new kl8(0, list.size()) + "].");
    }
}
