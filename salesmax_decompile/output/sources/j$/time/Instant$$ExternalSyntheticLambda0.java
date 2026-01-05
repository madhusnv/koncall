package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* loaded from: classes9.dex */
public final /* synthetic */ class Instant$$ExternalSyntheticLambda0 implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Instant.from(temporalAccessor);
    }
}
