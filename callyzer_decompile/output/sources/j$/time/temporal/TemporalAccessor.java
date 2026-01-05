package j$.time.temporal;

import j$.time.AbstractC3428d;
import j$.time.C3401c;
import j$.time.C3429e;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface TemporalAccessor {
    long getLong(TemporalField temporalField);

    /* renamed from: i */
    boolean mo7811i(TemporalField temporalField);

    /* renamed from: l */
    default C3485o mo7812l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.mo8004C(this);
        }
        if (mo7811i(temporalField)) {
            return ((ChronoField) temporalField).f18248b;
        }
        throw new C3484n(AbstractC3428d.m7935a("Unsupported field: ", temporalField));
    }

    /* renamed from: h */
    default int mo7810h(TemporalField temporalField) {
        C3485o c3485oMo7812l = mo7812l(temporalField);
        if (!c3485oMo7812l.m8018d()) {
            throw new C3484n("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long j6 = getLong(temporalField);
        if (c3485oMo7812l.m8019e(j6)) {
            return (int) j6;
        }
        throw new C3401c("Invalid value for " + temporalField + " (valid values " + c3485oMo7812l + "): " + j6);
    }

    /* renamed from: d */
    default Object mo7808d(C3429e c3429e) {
        if (c3429e == AbstractC3483m.f18277a || c3429e == AbstractC3483m.f18278b || c3429e == AbstractC3483m.f18279c) {
            return null;
        }
        return c3429e.m7936l(this);
    }
}
