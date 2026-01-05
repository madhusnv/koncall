package s4;

import a2.AbstractC0030c;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.a */
/* loaded from: classes.dex */
public final class C6745a {

    /* renamed from: a */
    public final long f32195a;

    public /* synthetic */ C6745a(long j6) {
        this.f32195a = j6;
    }

    /* renamed from: a */
    public static final long m12910a(int i10, int i11, int i12, int i13) {
        if (i11 < i10 || i13 < i12 || i10 < 0 || i12 < 0) {
            AbstractC6753i.m12938a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC6746b.m12930h(i10, i11, i12, i13);
    }

    /* renamed from: b */
    public static /* synthetic */ long m12911b(long j6, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = m12920k(j6);
        }
        if ((i14 & 2) != 0) {
            i11 = m12918i(j6);
        }
        if ((i14 & 4) != 0) {
            i12 = m12919j(j6);
        }
        if ((i14 & 8) != 0) {
            i13 = m12917h(j6);
        }
        return m12910a(i10, i11, i12, i13);
    }

    /* renamed from: c */
    public static final boolean m12912c(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: d */
    public static final boolean m12913d(long j6) {
        int i10 = (int) (3 & j6);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j6 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    /* renamed from: e */
    public static final boolean m12914e(long j6) {
        int i10 = (int) (3 & j6);
        return (((int) (j6 >> 33)) & ((1 << AbstractC5601a.m11230a((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1)) != 0;
    }

    /* renamed from: f */
    public static final boolean m12915f(long j6) {
        int i10 = (int) (3 & j6);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j6 >> (i11 + 15))) & i12;
        int i14 = ((int) (j6 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    /* renamed from: g */
    public static final boolean m12916g(long j6) {
        int i10 = (int) (3 & j6);
        int iM11230a = (1 << AbstractC5601a.m11230a((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1;
        int i11 = ((int) (j6 >> 2)) & iM11230a;
        int i12 = ((int) (j6 >> 33)) & iM11230a;
        return i11 == (i12 == 0 ? Integer.MAX_VALUE : i12 - 1);
    }

    /* renamed from: h */
    public static final int m12917h(long j6) {
        int i10 = (int) (3 & j6);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j6 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    /* renamed from: i */
    public static final int m12918i(long j6) {
        int i10 = (int) (3 & j6);
        int i11 = (int) (j6 >> 33);
        int iM11230a = i11 & ((1 << AbstractC5601a.m11230a((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1);
        if (iM11230a == 0) {
            return Integer.MAX_VALUE;
        }
        return iM11230a - 1;
    }

    /* renamed from: j */
    public static final int m12919j(long j6) {
        int i10 = (int) (3 & j6);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j6 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    /* renamed from: k */
    public static final int m12920k(long j6) {
        int i10 = (int) (3 & j6);
        return ((int) (j6 >> 2)) & ((1 << AbstractC5601a.m11230a((i10 & 2) >> 1, 3, (i10 & 1) << 1, 13)) - 1);
    }

    /* renamed from: l */
    public static final boolean m12921l(long j6) {
        int i10 = (int) (3 & j6);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((((int) (j6 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0) | ((((int) (j6 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0);
    }

    /* renamed from: m */
    public static String m12922m(long j6) {
        int iM12918i = m12918i(j6);
        String strValueOf = iM12918i == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM12918i);
        int iM12917h = m12917h(j6);
        String strValueOf2 = iM12917h != Integer.MAX_VALUE ? String.valueOf(iM12917h) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(m12920k(j6));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(m12919j(j6));
        sb2.append(", maxHeight = ");
        return AbstractC0030c.m123n(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6745a) {
            return this.f32195a == ((C6745a) obj).f32195a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32195a);
    }

    public final String toString() {
        return m12922m(this.f32195a);
    }
}
