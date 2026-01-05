package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3429e implements TemporalAdjuster {

    /* renamed from: a */
    public final /* synthetic */ int f18108a;

    public /* synthetic */ C3429e(int i10) {
        this.f18108a = i10;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    public Temporal mo7809f(Temporal temporal) {
        switch (this.f18108a) {
            case 4:
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return temporal.mo7819a(temporal.mo7812l(chronoField).f18287d, chronoField);
            case 5:
                return temporal.mo7819a(1L, ChronoField.DAY_OF_MONTH);
            case 6:
                return temporal.mo7819a(1L, ChronoField.DAY_OF_YEAR);
            default:
                ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
                return temporal.mo7819a(temporal.mo7812l(chronoField2).f18287d, chronoField2);
        }
    }

    /* renamed from: l */
    public Object m7936l(TemporalAccessor temporalAccessor) {
        int i10 = this.f18108a;
        C3429e c3429e = AbstractC3483m.f18277a;
        switch (i10) {
            case 0:
                return Instant.from(temporalAccessor);
            case 1:
                return LocalDate.m7825I(temporalAccessor);
            case 2:
                return LocalDateTime.m7838C(temporalAccessor);
            case 3:
                C3429e c3429e2 = DateTimeFormatterBuilder.f18117h;
                ZoneId zoneId = (ZoneId) temporalAccessor.mo7808d(c3429e);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                ChronoField chronoField = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.mo7811i(chronoField)) {
                    return LocalTime.m7851X(temporalAccessor.getLong(chronoField));
                }
                return null;
            case 8:
                return (ZoneId) temporalAccessor.mo7808d(c3429e);
            case 9:
                return (Chronology) temporalAccessor.mo7808d(AbstractC3483m.f18278b);
            case 10:
                return (TemporalUnit) temporalAccessor.mo7808d(AbstractC3483m.f18279c);
            case 11:
                ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.mo7811i(chronoField2)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.mo7810h(chronoField2));
                }
                return null;
            case 12:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.mo7808d(c3429e);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.mo7808d(AbstractC3483m.f18280d);
            case 13:
                ChronoField chronoField3 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.mo7811i(chronoField3)) {
                    return LocalDate.d0(temporalAccessor.getLong(chronoField3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f18108a) {
            case 8:
                return "ZoneId";
            case 9:
                return "Chronology";
            case 10:
                return "Precision";
            case 11:
                return "ZoneOffset";
            case 12:
                return "Zone";
            case 13:
                return "LocalDate";
            case 14:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
