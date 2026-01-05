package p001o;

/* loaded from: classes6.dex */
public abstract class ik6 {

    /* renamed from: a */
    public static final lgg f28778a = new lgg("REMOVED_TASK");

    /* renamed from: b */
    public static final lgg f28779b = new lgg("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m32243c(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
