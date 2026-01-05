package p001o;

/* loaded from: classes2.dex */
public abstract class rh3 {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m46766a(float f, float f2, float f3, float f4, ei3 ei3Var) {
        boolean z;
        sq8.m48649h(ei3Var, "colorSpace");
        if (f <= ei3Var.mo17011c(0) && ei3Var.mo17012d(0) <= f) {
            if (f2 <= ei3Var.mo17011c(1) && ei3Var.mo17012d(1) <= f2) {
                if (f3 <= ei3Var.mo17011c(2) && ei3Var.mo17012d(2) <= f3) {
                    if (0.0f <= f4 && f4 <= 1.0f) {
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            if (ei3Var.mo25096g()) {
                return lh3.m37197f(p0i.m42841c(p0i.m42841c(p0i.m42841c((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
            }
            if (!(ei3Var.m25092a() == 3)) {
                throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
            }
            int iM25093b = ei3Var.m25093b();
            if (!(iM25093b != -1)) {
                throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
            }
            return lh3.m37197f(p0i.m42841c(p0i.m42841c(p0i.m42841c(p0i.m42841c(p0i.m42841c(p0i.m42841c(p0i.m42841c(y27.m57134a(f2)) & 65535) << 32) | p0i.m42841c(p0i.m42841c(p0i.m42841c(y27.m57134a(f)) & 65535) << 48)) | p0i.m42841c(p0i.m42841c(p0i.m42841c(y27.m57134a(f3)) & 65535) << 16)) | p0i.m42841c(p0i.m42841c(p0i.m42841c((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | p0i.m42841c(p0i.m42841c(iM25093b) & 63)));
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + ei3Var).toString());
    }

    /* renamed from: b */
    public static final long m46767b(int i) {
        return lh3.m37197f(p0i.m42841c(p0i.m42841c(i) << 32));
    }

    /* renamed from: c */
    public static final long m46768c(long j) {
        return lh3.m37197f(p0i.m42841c(p0i.m42841c(p0i.m42841c(j) & 4294967295L) << 32));
    }

    /* renamed from: d */
    public static final int m46769d(long j) {
        return (int) p0i.m42841c(lh3.m37198g(j, ii3.f28698a.m32167h()) >>> 32);
    }
}
