package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.m7814I(1)),
    MICROS("Micros", Duration.m7814I(1000)),
    MILLIS("Millis", Duration.m7814I(1000000)),
    SECONDS("Seconds", Duration.m7813C(1, 0)),
    MINUTES("Minutes", Duration.m7813C(60, 0)),
    HOURS("Hours", Duration.m7813C(3600, 0)),
    HALF_DAYS("HalfDays", Duration.m7813C(43200, 0)),
    DAYS("Days", Duration.m7813C(86400, 0)),
    WEEKS("Weeks", Duration.m7813C(604800, 0)),
    MONTHS("Months", Duration.m7813C(2629746, 0)),
    YEARS("Years", Duration.m7813C(31556952, 0)),
    DECADES("Decades", Duration.m7813C(315569520, 0)),
    CENTURIES("Centuries", Duration.m7813C(3155695200L, 0)),
    MILLENNIA("Millennia", Duration.m7813C(31556952000L, 0)),
    ERAS("Eras", Duration.m7813C(31556952000000000L, 0)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));


    /* renamed from: a */
    public final String f18250a;

    /* renamed from: b */
    public final Duration f18251b;

    ChronoUnit(String str, Duration duration) {
        this.f18250a = str;
        this.f18251b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.f18251b;
    }

    @Override // j$.time.temporal.TemporalUnit
    /* renamed from: C */
    public final Temporal mo8009C(Temporal temporal, long j6) {
        return temporal.mo7820b(j6, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    /* renamed from: t */
    public final long mo8010t(Temporal temporal, Temporal temporal2) {
        return temporal.mo7823n(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18250a;
    }
}
