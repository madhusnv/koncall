package s4;

import i0.m0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.b */
/* loaded from: classes.dex */
public abstract class AbstractC6746b {
    /* renamed from: a */
    public static final long m12923a(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            AbstractC6753i.m12938a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m12930h(i10, i11, i12, i13);
    }

    /* renamed from: b */
    public static /* synthetic */ long m12924b(int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return m12923a(0, i10, 0, i11);
    }

    /* renamed from: c */
    public static final int m12925c(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    /* renamed from: d */
    public static final long m12926d(long j6, long j10) {
        int i10 = (int) (j10 >> 32);
        int iM12920k = C6745a.m12920k(j6);
        int iM12918i = C6745a.m12918i(j6);
        if (i10 < iM12920k) {
            i10 = iM12920k;
        }
        if (i10 <= iM12918i) {
            iM12918i = i10;
        }
        int i11 = (int) (j10 & 4294967295L);
        int iM12919j = C6745a.m12919j(j6);
        int iM12917h = C6745a.m12917h(j6);
        if (i11 < iM12919j) {
            i11 = iM12919j;
        }
        if (i11 <= iM12917h) {
            iM12917h = i11;
        }
        return (iM12918i << 32) | (iM12917h & 4294967295L);
    }

    /* renamed from: e */
    public static final long m12927e(long j6, long j10) {
        int iM12920k = C6745a.m12920k(j6);
        int iM12918i = C6745a.m12918i(j6);
        int iM12919j = C6745a.m12919j(j6);
        int iM12917h = C6745a.m12917h(j6);
        int iM12920k2 = C6745a.m12920k(j10);
        if (iM12920k2 < iM12920k) {
            iM12920k2 = iM12920k;
        }
        if (iM12920k2 > iM12918i) {
            iM12920k2 = iM12918i;
        }
        int iM12918i2 = C6745a.m12918i(j10);
        if (iM12918i2 >= iM12920k) {
            iM12920k = iM12918i2;
        }
        if (iM12920k <= iM12918i) {
            iM12918i = iM12920k;
        }
        int iM12919j2 = C6745a.m12919j(j10);
        if (iM12919j2 < iM12919j) {
            iM12919j2 = iM12919j;
        }
        if (iM12919j2 > iM12917h) {
            iM12919j2 = iM12917h;
        }
        int iM12917h2 = C6745a.m12917h(j10);
        if (iM12917h2 >= iM12919j) {
            iM12919j = iM12917h2;
        }
        if (iM12919j <= iM12917h) {
            iM12917h = iM12919j;
        }
        return m12923a(iM12920k2, iM12918i, iM12919j2, iM12917h);
    }

    /* renamed from: f */
    public static final int m12928f(int i10, long j6) {
        int iM12919j = C6745a.m12919j(j6);
        int iM12917h = C6745a.m12917h(j6);
        if (i10 < iM12919j) {
            i10 = iM12919j;
        }
        return i10 > iM12917h ? iM12917h : i10;
    }

    /* renamed from: g */
    public static final int m12929g(int i10, long j6) {
        int iM12920k = C6745a.m12920k(j6);
        int iM12918i = C6745a.m12918i(j6);
        if (i10 < iM12920k) {
            i10 = iM12920k;
        }
        return i10 > iM12918i ? iM12918i : i10;
    }

    /* renamed from: h */
    public static final long m12930h(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iM12925c = m12925c(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iM12925c2 = m12925c(i15);
        if (iM12925c + iM12925c2 > 31) {
            m12933k(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = iM12925c2 - 13;
        return ((i16 & (~(i16 >> 31))) << 33) | ((i18 >> 1) + (i18 & 1)) | (i10 << 2) | (i12 << (iM12925c2 + 2)) | ((i17 & (~(i17 >> 31))) << (iM12925c2 + 33));
    }

    /* renamed from: i */
    public static final long m12931i(int i10, int i11, long j6) {
        int iM12920k = C6745a.m12920k(j6) + i10;
        if (iM12920k < 0) {
            iM12920k = 0;
        }
        int iM12918i = C6745a.m12918i(j6);
        if (iM12918i != Integer.MAX_VALUE && (iM12918i = iM12918i + i10) < 0) {
            iM12918i = 0;
        }
        int iM12919j = C6745a.m12919j(j6) + i11;
        if (iM12919j < 0) {
            iM12919j = 0;
        }
        int iM12917h = C6745a.m12917h(j6);
        return m12923a(iM12920k, iM12918i, iM12919j, (iM12917h == Integer.MAX_VALUE || (iM12917h = iM12917h + i11) >= 0) ? iM12917h : 0);
    }

    /* renamed from: j */
    public static /* synthetic */ long m12932j(int i10, int i11, int i12, long j6) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m12931i(i10, i11, j6);
    }

    /* renamed from: k */
    public static final void m12933k(int i10, int i11) {
        throw new IllegalArgumentException(m0.m7377j(i10, i11, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    /* renamed from: l */
    public static final Void m12934l(int i10) {
        throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Can't represent a size of ", " in Constraints"));
    }
}
