package p001o;

/* loaded from: classes6.dex */
public abstract class ddf {

    /* renamed from: a */
    public static final int f19619a = rig.m46848e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b */
    public static final lgg f19620b = new lgg("PERMIT");

    /* renamed from: c */
    public static final lgg f19621c = new lgg("TAKEN");

    /* renamed from: d */
    public static final lgg f19622d = new lgg("BROKEN");

    /* renamed from: e */
    public static final lgg f19623e = new lgg("CANCELLED");

    /* renamed from: f */
    public static final int f19624f = rig.m46848e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* renamed from: a */
    public static final zcf m22827a(int i, int i2) {
        return new cdf(i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ zcf m22828b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m22827a(i, i2);
    }

    /* renamed from: j */
    public static final edf m22836j(long j, edf edfVar) {
        return new edf(j, edfVar, 0);
    }
}
