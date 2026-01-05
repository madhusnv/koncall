package ur;

import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import kotlin.jvm.internal.AbstractC4154l;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 extends f0 {

    /* renamed from: b */
    public static final e0 f36212b = new e0(R.string.yesterday);

    @Override // ur.f0
    /* renamed from: a */
    public final LocalDateTime mo14291a() {
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTimeMo7827M = LocalDate.now().minusDays(1L).mo7827M(LocalTime.MAX);
        AbstractC4154l.m8922e(localDateTimeMo7827M, "atTime(...)");
        return localDateTimeMo7827M;
    }

    @Override // ur.f0
    /* renamed from: b */
    public final LocalDateTime mo14292b() {
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTimeAtStartOfDay = LocalDate.now().minusDays(1L).atStartOfDay();
        AbstractC4154l.m8922e(localDateTimeAtStartOfDay, "atStartOfDay(...)");
        return localDateTimeAtStartOfDay;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e0);
    }

    public final int hashCode() {
        return 94978390;
    }

    public final String toString() {
        return "Yesterday";
    }
}
