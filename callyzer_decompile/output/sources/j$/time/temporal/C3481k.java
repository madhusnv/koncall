package j$.time.temporal;

/* renamed from: j$.time.temporal.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3481k implements TemporalAdjuster {

    /* renamed from: a */
    public final /* synthetic */ int f18275a;

    /* renamed from: b */
    public final /* synthetic */ int f18276b;

    public /* synthetic */ C3481k(int i10, int i11) {
        this.f18275a = i11;
        this.f18276b = i10;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    public final Temporal mo7809f(Temporal temporal) {
        switch (this.f18275a) {
            case 0:
                int iMo7810h = temporal.mo7810h(ChronoField.DAY_OF_WEEK);
                int i10 = this.f18276b;
                if (iMo7810h == i10) {
                    return temporal;
                }
                return temporal.mo7820b(iMo7810h - i10 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int iMo7810h2 = temporal.mo7810h(ChronoField.DAY_OF_WEEK);
                int i11 = this.f18276b;
                if (iMo7810h2 == i11) {
                    return temporal;
                }
                return temporal.mo7821c(i11 - iMo7810h2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
