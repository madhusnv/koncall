package m2;

import i0.m0;
import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m2.f */
/* loaded from: classes.dex */
public abstract class AbstractC4641f {
    /* renamed from: a */
    public static final void m9519a(List list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            m9521c(i10, size);
        }
    }

    /* renamed from: b */
    public static final void m9520b(List list, int i10, int i11) {
        if (i10 > i11) {
            m9524f(i10, i11);
        }
        if (i10 < 0) {
            m9522d(i10);
        }
        if (i11 > list.size()) {
            m9523e(i11, list.size());
        }
    }

    /* renamed from: c */
    private static final void m9521c(int i10, int i11) {
        throw new IndexOutOfBoundsException(m0.m7377j(i10, i11, "Index ", " is out of bounds. The list has ", " elements."));
    }

    /* renamed from: d */
    private static final void m9522d(int i10) {
        throw new IndexOutOfBoundsException(AbstractC5601a.m11232c(i10, "fromIndex (", ") is less than 0."));
    }

    /* renamed from: e */
    private static final void m9523e(int i10, int i11) {
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + i11 + ')');
    }

    /* renamed from: f */
    private static final void m9524f(int i10, int i11) {
        throw new IllegalArgumentException(m0.m7377j(i10, i11, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
