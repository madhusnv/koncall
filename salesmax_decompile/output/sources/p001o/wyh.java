package p001o;

/* loaded from: classes2.dex */
public class wyh {

    /* renamed from: d */
    public static wyh f52900d;

    /* renamed from: a */
    public long f52901a;

    /* renamed from: b */
    public long f52902b;

    /* renamed from: c */
    public int f52903c;

    /* renamed from: b */
    public static wyh m55428b() {
        if (f52900d == null) {
            f52900d = new wyh();
        }
        return f52900d;
    }

    /* renamed from: a */
    public void m55429a(long j, double d, double d2) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d2) / 360.0d) + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(dAsin))) / (Math.cos(d4) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f52903c = 1;
            this.f52901a = -1L;
            this.f52902b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f52903c = 0;
                this.f52901a = -1L;
                this.f52902b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f52901a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f52902b = jRound;
            if (jRound >= j || this.f52901a <= j) {
                this.f52903c = 1;
            } else {
                this.f52903c = 0;
            }
        }
    }
}
