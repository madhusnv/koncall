package p001o;

/* loaded from: classes3.dex */
public abstract class kx5 {
    /* renamed from: a */
    public static long m36274a(double d) {
        dgd.m23052e(m36275b(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* renamed from: b */
    public static boolean m36275b(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
