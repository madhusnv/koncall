package p001o;

/* loaded from: classes2.dex */
public abstract class cjh {
    /* renamed from: a */
    public static final long m21324a(float f, long j) {
        return m21326c(j, f);
    }

    /* renamed from: b */
    public static final long m21325b(int i) {
        return m21326c(4294967296L, i);
    }

    /* renamed from: c */
    public static final long m21326c(long j, float f) {
        return bjh.m19252c(j | (Float.floatToIntBits(f) & 4294967295L));
    }
}
