package c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: d */
    public static final l1 f5149d = new l1(0, false, false);

    /* renamed from: e */
    public static final l1 f5150e = new l1(500, true, false);

    /* renamed from: f */
    public static final l1 f5151f;

    /* renamed from: a */
    public final long f5152a;

    /* renamed from: b */
    public final boolean f5153b;

    /* renamed from: c */
    public final boolean f5154c;

    static {
        new l1(100L, true, false);
        f5151f = new l1(0L, false, true);
    }

    public l1(long j6, boolean z6, boolean z10) {
        this.f5153b = z6;
        this.f5152a = j6;
        if (z10) {
            og.y0.m11051a("shouldRetry must be false when completeWithoutFailure is set to true", !z6);
        }
        this.f5154c = z10;
    }
}
