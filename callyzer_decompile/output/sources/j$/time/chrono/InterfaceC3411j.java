package j$.time.chrono;

import j$.time.AbstractC3428d;
import j$.time.C3429e;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.C3484n;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;

/* renamed from: j$.time.chrono.j */
/* loaded from: classes2.dex */
public interface InterfaceC3411j extends TemporalAccessor, TemporalAdjuster {
    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: i */
    default boolean mo7811i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.ERA : temporalField != null && temporalField.mo8008t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: h */
    default int mo7810h(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return getValue();
        }
        return super.mo7810h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
        }
        return temporalField.mo8006Q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: d */
    default Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18279c) {
            return ChronoUnit.ERAS;
        }
        return super.mo7808d(c3429e);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    /* renamed from: f */
    default Temporal mo7809f(Temporal temporal) {
        return temporal.mo7819a(getValue(), ChronoField.ERA);
    }
}
