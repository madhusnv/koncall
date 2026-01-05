package e3;

import com.skydoves.balloon.internals.DefinitionKt;
import d6.C1612b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.d */
/* loaded from: classes.dex */
public final class C1928d {

    /* renamed from: a */
    public static final float[] f9103a;

    /* renamed from: b */
    public static final float[] f9104b;

    /* renamed from: c */
    public static final C1942r f9105c;

    /* renamed from: d */
    public static final C1942r f9106d;

    /* renamed from: e */
    public static final C1941q f9107e;

    /* renamed from: f */
    public static final C1941q f9108f;

    /* renamed from: g */
    public static final C1941q f9109g;

    /* renamed from: h */
    public static final C1941q f9110h;

    /* renamed from: i */
    public static final C1941q f9111i;

    /* renamed from: j */
    public static final C1941q f9112j;

    /* renamed from: k */
    public static final C1941q f9113k;

    /* renamed from: l */
    public static final C1941q f9114l;

    /* renamed from: m */
    public static final C1941q f9115m;

    /* renamed from: n */
    public static final C1941q f9116n;

    /* renamed from: o */
    public static final C1941q f9117o;

    /* renamed from: p */
    public static final C1941q f9118p;

    /* renamed from: q */
    public static final C1941q f9119q;

    /* renamed from: r */
    public static final C1941q f9120r;

    /* renamed from: s */
    public static final C1935k f9121s;

    /* renamed from: t */
    public static final C1935k f9122t;

    /* renamed from: u */
    public static final C1941q f9123u;

    /* renamed from: v */
    public static final C1941q f9124v;

    /* renamed from: w */
    public static final C1941q f9125w;

    /* renamed from: x */
    public static final C1936l f9126x;

    /* renamed from: y */
    public static final AbstractC1927c[] f9127y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f9103a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f9104b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        C1942r c1942r = new C1942r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1942r c1942r2 = new C1942r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1942r c1942r3 = new C1942r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f9105c = c1942r3;
        C1942r c1942r4 = new C1942r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f9106d = c1942r4;
        C1943s c1943s = AbstractC1934j.f9139d;
        C1941q c1941q = new C1941q("sRGB IEC61966-2.1", fArr, c1943s, c1942r, 0);
        f9107e = c1941q;
        C1941q c1941q2 = new C1941q("sRGB IEC61966-2.1 (Linear)", fArr, c1943s, 1.0d, DefinitionKt.NO_Float_VALUE, 1.0f, 1);
        f9108f = c1941q2;
        C1941q c1941q3 = new C1941q("scRGB-nl IEC 61966-2-2:2003", fArr, c1943s, null, new C1612b(14), new C1612b(15), -0.799f, 2.399f, c1942r, 2);
        f9109g = c1941q3;
        C1941q c1941q4 = new C1941q("scRGB IEC 61966-2-2:2003", fArr, c1943s, 1.0d, -0.5f, 7.499f, 3);
        f9110h = c1941q4;
        C1941q c1941q5 = new C1941q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c1943s, new C1942r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f9111i = c1941q5;
        C1941q c1941q6 = new C1941q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c1943s, new C1942r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f9112j = c1941q6;
        C1941q c1941q7 = new C1941q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C1943s(0.314f, 0.351f), 2.6d, DefinitionKt.NO_Float_VALUE, 1.0f, 6);
        f9113k = c1941q7;
        C1941q c1941q8 = new C1941q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c1943s, c1942r, 7);
        f9114l = c1941q8;
        C1941q c1941q9 = new C1941q("NTSC (1953)", fArr2, AbstractC1934j.f9136a, new C1942r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f9115m = c1941q9;
        C1941q c1941q10 = new C1941q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c1943s, new C1942r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f9116n = c1941q10;
        C1941q c1941q11 = new C1941q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c1943s, 2.2d, DefinitionKt.NO_Float_VALUE, 1.0f, 10);
        f9117o = c1941q11;
        C1941q c1941q12 = new C1941q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC1934j.f9137b, new C1942r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f9118p = c1941q12;
        float[] fArr4 = {0.7347f, 0.2653f, DefinitionKt.NO_Float_VALUE, 1.0f, 1.0E-4f, -0.077f};
        C1943s c1943s2 = AbstractC1934j.f9138c;
        C1941q c1941q13 = new C1941q("SMPTE ST 2065-1:2012 ACES", fArr4, c1943s2, 1.0d, -65504.0f, 65504.0f, 12);
        f9119q = c1941q13;
        C1941q c1941q14 = new C1941q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c1943s2, 1.0d, -65504.0f, 65504.0f, 13);
        f9120r = c1941q14;
        C1935k c1935k = new C1935k("Generic XYZ", 14, 1, AbstractC1926b.f9096b);
        f9121s = c1935k;
        long j6 = AbstractC1926b.f9097c;
        C1935k c1935k2 = new C1935k("Generic L*a*b*", 15, 0, j6);
        f9122t = c1935k2;
        C1941q c1941q15 = new C1941q("None", fArr, c1943s, c1942r2, 16);
        f9123u = c1941q15;
        C1941q c1941q16 = new C1941q("Hybrid Log Gamma encoding", fArr3, c1943s, null, new C1612b(16), new C1612b(17), DefinitionKt.NO_Float_VALUE, 1.0f, c1942r3, 17);
        f9124v = c1941q16;
        C1941q c1941q17 = new C1941q("Perceptual Quantizer encoding", fArr3, c1943s, null, new C1612b(18), new C1612b(19), DefinitionKt.NO_Float_VALUE, 1.0f, c1942r4, 18);
        f9125w = c1941q17;
        C1936l c1936l = new C1936l("Oklab", 19, j6);
        f9126x = c1936l;
        f9127y = new AbstractC1927c[]{c1941q, c1941q2, c1941q3, c1941q4, c1941q5, c1941q6, c1941q7, c1941q8, c1941q9, c1941q10, c1941q11, c1941q12, c1941q13, c1941q14, c1935k, c1935k2, c1941q15, c1941q16, c1941q17, c1936l};
    }

    /* renamed from: a */
    public static double m5679a(C1942r c1942r, double d2) {
        double d10 = d2 < 0.0d ? -1.0d : 1.0d;
        double d11 = d2 * d10;
        double d12 = c1942r.f9170b;
        double d13 = c1942r.f9171c;
        double d14 = c1942r.f9172d;
        double d15 = c1942r.f9173e;
        double d16 = c1942r.f9174f;
        double d17 = d12 * d11;
        return (c1942r.f9175g + 1.0d) * d10 * (d17 <= 1.0d ? Math.pow(d17, d13) : Math.exp((d11 - d16) * d14) + d15);
    }

    /* renamed from: b */
    public static double m5680b(C1942r c1942r, double d2) {
        double d10 = d2 < 0.0d ? -1.0d : 1.0d;
        double d11 = 1.0d / c1942r.f9170b;
        double d12 = 1.0d / c1942r.f9171c;
        double d13 = 1.0d / c1942r.f9172d;
        double d14 = c1942r.f9173e;
        double d15 = c1942r.f9174f;
        double d16 = (d2 * d10) / (c1942r.f9175g + 1.0d);
        return d10 * (d16 <= 1.0d ? Math.pow(d16, d12) * d11 : (Math.log(d16 - d14) * d13) + d15);
    }

    /* renamed from: c */
    public static double m5681c(C1942r c1942r, double d2) {
        double d10 = d2 < 0.0d ? -1.0d : 1.0d;
        double d11 = d2 * d10;
        double d12 = c1942r.f9170b;
        double d13 = c1942r.f9172d;
        double dPow = (Math.pow(d11, d13) * c1942r.f9171c) + d12;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d11, d13) * c1942r.f9174f) + c1942r.f9173e), c1942r.f9175g) * d10;
    }

    /* renamed from: d */
    public static double m5682d(C1942r c1942r, double d2) {
        double d10 = d2 < 0.0d ? -1.0d : 1.0d;
        double d11 = d2 * d10;
        double d12 = -c1942r.f9170b;
        double d13 = c1942r.f9173e;
        double d14 = 1.0d / c1942r.f9175g;
        return Math.pow(Math.max((Math.pow(d11, d14) * d13) + d12, 0.0d) / ((Math.pow(d11, d14) * (-c1942r.f9174f)) + c1942r.f9171c), 1.0d / c1942r.f9172d) * d10;
    }
}
