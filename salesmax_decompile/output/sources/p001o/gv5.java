package p001o;

/* loaded from: classes2.dex */
public abstract class gv5 {
    /* renamed from: a */
    public static final int m29522a(long j, long j2) {
        boolean zM29525d = m29525d(j);
        return zM29525d != m29525d(j2) ? zM29525d ? -1 : 1 : (int) Math.signum(m29524c(j) - m29524c(j2));
    }

    /* renamed from: b */
    public static long m29523b(long j) {
        return j;
    }

    /* renamed from: c */
    public static final float m29524c(long j) {
        e37 e37Var = e37.f20857a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: d */
    public static final boolean m29525d(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }
}
