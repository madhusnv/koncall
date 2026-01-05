package p001o;

/* loaded from: classes2.dex */
public abstract class v9c {
    /* renamed from: a */
    public static final long m52474a(float f, float f2) {
        return s9c.m48048g((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: b */
    public static final boolean m52475b(long j) {
        float fM48052k = s9c.m48052k(j);
        if ((Float.isInfinite(fM48052k) || Float.isNaN(fM48052k)) ? false : true) {
            float fM48053l = s9c.m48053l(j);
            if ((Float.isInfinite(fM48053l) || Float.isNaN(fM48053l)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m52476c(long j) {
        return j != s9c.f45035b.m48062b();
    }
}
