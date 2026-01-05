package p001o;

/* loaded from: classes2.dex */
public abstract class l74 {
    /* renamed from: a */
    public static final long m36645a(float f, float f2) {
        return k74.m35095b((Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: b */
    public static /* synthetic */ long m36646b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return m36645a(f, f2);
    }
}
