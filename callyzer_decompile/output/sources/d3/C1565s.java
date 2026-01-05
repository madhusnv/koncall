package d3;

import a2.AbstractC0030c;
import com.skydoves.balloon.internals.DefinitionKt;
import e1.C1922x;
import e3.AbstractC1927c;
import e3.AbstractC1932h;
import e3.AbstractC1934j;
import e3.C1928d;
import e3.C1931g;
import og.pd;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.s */
/* loaded from: classes.dex */
public final class C1565s {

    /* renamed from: b */
    public static final long f7809b = h0.m5132d(4278190080L);

    /* renamed from: c */
    public static final long f7810c;

    /* renamed from: d */
    public static final long f7811d;

    /* renamed from: e */
    public static final long f7812e;

    /* renamed from: f */
    public static final long f7813f;

    /* renamed from: g */
    public static final long f7814g;

    /* renamed from: h */
    public static final long f7815h;

    /* renamed from: i */
    public static final long f7816i;

    /* renamed from: j */
    public static final long f7817j;

    /* renamed from: k */
    public static final /* synthetic */ int f7818k = 0;

    /* renamed from: a */
    public final long f7819a;

    static {
        h0.m5132d(4282664004L);
        f7810c = h0.m5132d(4287137928L);
        f7811d = h0.m5132d(4291611852L);
        f7812e = h0.m5132d(4294967295L);
        f7813f = h0.m5132d(4294901760L);
        f7814g = h0.m5132d(4278255360L);
        f7815h = h0.m5132d(4278190335L);
        h0.m5132d(4294967040L);
        h0.m5132d(4278255615L);
        h0.m5132d(4294902015L);
        f7816i = h0.m5131c(0);
        f7817j = h0.m5130b(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, C1928d.f9123u);
    }

    public /* synthetic */ C1565s(long j6) {
        this.f7819a = j6;
    }

    /* renamed from: a */
    public static final long m5185a(long j6, AbstractC1927c abstractC1927c) {
        C1931g c1931gM5688e;
        AbstractC1927c abstractC1927cM5190f = m5190f(j6);
        int i10 = abstractC1927cM5190f.f9102c;
        int i11 = abstractC1927c.f9102c;
        if ((i10 | i11) < 0) {
            c1931gM5688e = AbstractC1934j.m5688e(abstractC1927cM5190f, abstractC1927c);
        } else {
            C1922x c1922x = AbstractC1932h.f9135a;
            int i12 = i10 | (i11 << 6);
            Object objM5595b = c1922x.m5595b(i12);
            if (objM5595b == null) {
                objM5595b = AbstractC1934j.m5688e(abstractC1927cM5190f, abstractC1927c);
                c1922x.m5663h(i12, objM5595b);
            }
            c1931gM5688e = (C1931g) objM5595b;
        }
        return c1931gM5688e.mo5683a(j6);
    }

    /* renamed from: b */
    public static long m5186b(float f6, int i10, long j6) {
        if ((i10 & 1) != 0) {
            f6 = m5188d(j6);
        }
        return h0.m5130b(m5192h(j6), (i10 & 4) != 0 ? m5191g(j6) : 0.5f, m5189e(j6), f6, m5190f(j6));
    }

    /* renamed from: c */
    public static final boolean m5187c(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: d */
    public static final float m5188d(long j6) {
        float fM10824b;
        float f6;
        if ((63 & j6) == 0) {
            fM10824b = (float) pd.m10824b((j6 >>> 56) & 255);
            f6 = 255.0f;
        } else {
            fM10824b = (float) pd.m10824b((j6 >>> 6) & 1023);
            f6 = 1023.0f;
        }
        return fM10824b / f6;
    }

    /* renamed from: e */
    public static final float m5189e(long j6) {
        int i10;
        int i11;
        int i12;
        if ((63 & j6) == 0) {
            return ((float) pd.m10824b((j6 >>> 32) & 255)) / 255.0f;
        }
        short s5 = (short) ((j6 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & s5;
        int i14 = ((65535 & s5) >>> 10) & 31;
        int i15 = s5 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC1569w.f7822a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* renamed from: f */
    public static final AbstractC1927c m5190f(long j6) {
        float[] fArr = C1928d.f9103a;
        return C1928d.f9127y[(int) (j6 & 63)];
    }

    /* renamed from: g */
    public static final float m5191g(long j6) {
        int i10;
        int i11;
        int i12;
        if ((63 & j6) == 0) {
            return ((float) pd.m10824b((j6 >>> 40) & 255)) / 255.0f;
        }
        short s5 = (short) ((j6 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & s5;
        int i14 = ((65535 & s5) >>> 10) & 31;
        int i15 = s5 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC1569w.f7822a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* renamed from: h */
    public static final float m5192h(long j6) {
        int i10;
        int i11;
        int i12;
        if ((63 & j6) == 0) {
            return ((float) pd.m10824b((j6 >>> 48) & 255)) / 255.0f;
        }
        short s5 = (short) ((j6 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & s5;
        int i14 = ((65535 & s5) >>> 10) & 31;
        int i15 = s5 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - AbstractC1569w.f7822a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* renamed from: i */
    public static String m5193i(long j6) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(m5192h(j6));
        sb2.append(", ");
        sb2.append(m5191g(j6));
        sb2.append(", ");
        sb2.append(m5189e(j6));
        sb2.append(", ");
        sb2.append(m5188d(j6));
        sb2.append(", ");
        return AbstractC0030c.m123n(sb2, m5190f(j6).f9100a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1565s) {
            return this.f7819a == ((C1565s) obj).f7819a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7819a);
    }

    public final String toString() {
        return m5193i(this.f7819a);
    }
}
