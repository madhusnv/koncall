package ur;

import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.temporal.TemporalAdjusters;
import kotlin.jvm.internal.AbstractC4154l;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends f0 {

    /* renamed from: b */
    public static final a0 f36204b = new a0(R.string.month);

    @Override // ur.f0
    /* renamed from: a */
    public final LocalDateTime mo14291a() {
        C8800o c8800o = C8800o.f42459a;
        LocalDate localDateMo7844j = LocalDate.now().mo7844j(TemporalAdjusters.lastDayOfMonth());
        AbstractC4154l.m8922e(localDateMo7844j, "with(...)");
        LocalDateTime localDateTimeMo7827M = localDateMo7844j.mo7827M(LocalTime.MAX);
        AbstractC4154l.m8922e(localDateTimeMo7827M, "atTime(...)");
        return localDateTimeMo7827M;
    }

    @Override // ur.f0
    /* renamed from: b */
    public final LocalDateTime mo14292b() {
        C8800o c8800o = C8800o.f42459a;
        LocalDate localDateMo7844j = LocalDate.now().mo7844j(TemporalAdjusters.firstDayOfMonth());
        AbstractC4154l.m8922e(localDateMo7844j, "with(...)");
        LocalDateTime localDateTimeAtStartOfDay = localDateMo7844j.atStartOfDay();
        AbstractC4154l.m8922e(localDateTimeAtStartOfDay, "atStartOfDay(...)");
        return localDateTimeAtStartOfDay;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a0);
    }

    public final int hashCode() {
        return 1241899092;
    }

    public final String toString() {
        return "Month";
    }
}
