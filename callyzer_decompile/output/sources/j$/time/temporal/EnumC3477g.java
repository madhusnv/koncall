package j$.time.temporal;

import j$.time.Duration;

/* renamed from: j$.time.temporal.g */
/* loaded from: classes2.dex */
public enum EnumC3477g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.m7813C(31556952, 0)),
    QUARTER_YEARS("QuarterYears", Duration.m7813C(7889238, 0));


    /* renamed from: a */
    public final String f18264a;

    /* renamed from: b */
    public final Duration f18265b;

    EnumC3477g(String str, Duration duration) {
        this.f18264a = str;
        this.f18265b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.f18265b;
    }

    @Override // j$.time.temporal.TemporalUnit
    /* renamed from: C */
    public final Temporal mo8009C(Temporal temporal, long j6) {
        int i10 = AbstractC3471a.f18260a[ordinal()];
        if (i10 == 1) {
            return temporal.mo7819a(Math.addExact(temporal.mo7810h(r0), j6), AbstractC3478h.f18268c);
        }
        if (i10 == 2) {
            return temporal.mo7820b(j6 / 4, ChronoUnit.YEARS).mo7820b((j6 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    /* renamed from: t */
    public final long mo8010t(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.mo7823n(temporal2, this);
        }
        int i10 = AbstractC3471a.f18260a[ordinal()];
        if (i10 == 1) {
            EnumC3476f enumC3476f = AbstractC3478h.f18268c;
            return Math.subtractExact(temporal2.getLong(enumC3476f), temporal.getLong(enumC3476f));
        }
        if (i10 == 2) {
            return temporal.mo7823n(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18264a;
    }
}
