package j$.time.temporal;

import j$.time.LocalDate;

/* loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    /* renamed from: a */
    Temporal mo7819a(long j6, TemporalField temporalField);

    /* renamed from: b */
    Temporal mo7820b(long j6, TemporalUnit temporalUnit);

    /* renamed from: n */
    long mo7823n(Temporal temporal, TemporalUnit temporalUnit);

    /* renamed from: e */
    default Temporal mo7835j(LocalDate localDate) {
        return localDate.mo7809f(this);
    }

    /* renamed from: c */
    default Temporal mo7821c(long j6, TemporalUnit temporalUnit) {
        return j6 == Long.MIN_VALUE ? mo7820b(Long.MAX_VALUE, temporalUnit).mo7820b(1L, temporalUnit) : mo7820b(-j6, temporalUnit);
    }
}
