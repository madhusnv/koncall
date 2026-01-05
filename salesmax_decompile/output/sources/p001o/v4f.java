package p001o;

/* loaded from: classes2.dex */
public abstract class v4f {

    /* renamed from: a */
    public static final long[] f49867a = {-9187201950435737345L, -1};

    /* renamed from: b */
    public static final xpb f49868b = new xpb(0);

    /* renamed from: a */
    public static final int m52316a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    /* renamed from: b */
    public static final int m52317b(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    /* renamed from: c */
    public static final int m52318c(int i) {
        if (i == 7) {
            return 8;
        }
        return i + ((i - 1) / 7);
    }
}
