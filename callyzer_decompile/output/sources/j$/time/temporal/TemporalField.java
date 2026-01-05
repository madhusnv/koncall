package j$.time.temporal;

import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* loaded from: classes2.dex */
public interface TemporalField {
    /* renamed from: C */
    C3485o mo8004C(TemporalAccessor temporalAccessor);

    /* renamed from: K */
    C3485o mo8005K();

    /* renamed from: Q */
    long mo8006Q(TemporalAccessor temporalAccessor);

    /* renamed from: X */
    Temporal mo8007X(Temporal temporal, long j6);

    boolean isDateBased();

    /* renamed from: t */
    boolean mo8008t(TemporalAccessor temporalAccessor);

    /* renamed from: I */
    default TemporalAccessor mo8011I(Map map, a0 a0Var, b0 b0Var) {
        return null;
    }
}
