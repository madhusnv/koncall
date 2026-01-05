package h1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a */
    public float f15673a;

    /* renamed from: b */
    public double f15674b;

    /* renamed from: c */
    public float f15675c;

    /* renamed from: a */
    public final long m6883a(float f6, float f10, long j6) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f11 = f6 - this.f15673a;
        double d2 = j6 / 1000.0d;
        float f12 = this.f15675c;
        double d10 = f12 * f12;
        double d11 = this.f15674b;
        double d12 = (-f12) * d11;
        if (f12 > 1.0f) {
            double dSqrt = Math.sqrt(d10 - 1) * d11;
            double d13 = d12 + dSqrt;
            double d14 = d12 - dSqrt;
            double d15 = f11;
            double d16 = ((d14 * d15) - f10) / (d14 - d13);
            double d17 = d15 - d16;
            double d18 = d14 * d2;
            double d19 = d2 * d13;
            dSin = (Math.exp(d19) * d16) + (Math.exp(d18) * d17);
            dExp = Math.exp(d18) * d17 * d14;
            dExp2 = Math.exp(d19) * d16 * d13;
        } else {
            if (f12 != 1.0f) {
                double d20 = 1;
                double dSqrt2 = Math.sqrt(d20 - d10) * d11;
                double d21 = f11;
                double d22 = (((-d12) * d21) + f10) * (d20 / dSqrt2);
                double d23 = dSqrt2 * d2;
                double d24 = d2 * d12;
                dSin = ((Math.sin(d23) * d22) + (Math.cos(d23) * d21)) * Math.exp(d24);
                dCos = (((Math.cos(d23) * dSqrt2 * d22) + (Math.sin(d23) * (-dSqrt2) * d21)) * Math.exp(d24)) + (d12 * dSin);
                float f13 = (float) dCos;
                return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.f15673a)) << 32);
            }
            double d25 = f11;
            double d26 = (d11 * d25) + f10;
            double d27 = (-d11) * d2;
            double d28 = (d2 * d26) + d25;
            dSin = Math.exp(d27) * d28;
            dExp = Math.exp(d27) * d28 * (-this.f15674b);
            dExp2 = Math.exp(d27) * d26;
        }
        dCos = dExp2 + dExp;
        float f132 = (float) dCos;
        return (Float.floatToRawIntBits(f132) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.f15673a)) << 32);
    }
}
