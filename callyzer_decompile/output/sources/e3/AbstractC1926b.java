package e3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.b */
/* loaded from: classes.dex */
public abstract class AbstractC1926b {

    /* renamed from: a */
    public static final long f9095a;

    /* renamed from: b */
    public static final long f9096b;

    /* renamed from: c */
    public static final long f9097c;

    /* renamed from: d */
    public static final long f9098d;

    /* renamed from: e */
    public static final /* synthetic */ int f9099e = 0;

    static {
        long j6 = 3;
        long j10 = j6 << 32;
        f9095a = (0 & 4294967295L) | j10;
        f9096b = (1 & 4294967295L) | j10;
        f9097c = j10 | (2 & 4294967295L);
        f9098d = (j6 & 4294967295L) | (4 << 32);
    }

    /* renamed from: a */
    public static final boolean m5671a(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: b */
    public static String m5672b(long j6) {
        return m5671a(j6, f9095a) ? "Rgb" : m5671a(j6, f9096b) ? "Xyz" : m5671a(j6, f9097c) ? "Lab" : m5671a(j6, f9098d) ? "Cmyk" : "Unknown";
    }
}
