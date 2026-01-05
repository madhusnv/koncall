package p001o;

/* loaded from: classes2.dex */
public abstract class du3 {
    /* renamed from: a */
    public static final long m23817a(int i, int i2, int i3, int i4) {
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (!(i4 >= i3)) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        if (i >= 0 && i3 >= 0) {
            return bu3.f16822b.m19805b(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m23818b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m23817a(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static final int m23819c(long j, int i) {
        return bce.m18608k(i, bu3.m19799k(j), bu3.m19797i(j));
    }

    /* renamed from: d */
    public static final int m23820d(long j, int i) {
        return bce.m18608k(i, bu3.m19800l(j), bu3.m19798j(j));
    }
}
