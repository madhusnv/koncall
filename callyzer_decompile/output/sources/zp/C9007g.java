package zp;

import com.websoptimization.callyzerbiz.R;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5412n;
import yv.AbstractC8788c;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.g */
/* loaded from: classes3.dex */
public final class C9007g {

    /* renamed from: a */
    public final C5412n f43389a;

    /* renamed from: b */
    public final int f43390b;

    /* renamed from: c */
    public final int f43391c;

    /* renamed from: d */
    public final String f43392d;

    /* renamed from: e */
    public final String f43393e;

    /* renamed from: f */
    public final String f43394f;

    public C9007g(C5412n data) {
        int i10;
        String str;
        AbstractC4154l.m8923f(data, "data");
        LocalDateTime localDateTime = data.f27176a;
        this.f43389a = data;
        int i11 = AbstractC8788c.f42452a[data.f27177b.ordinal()];
        if (i11 == 1) {
            i10 = R.drawable.ic_tab_incoming_outlined;
        } else if (i11 == 2) {
            i10 = R.drawable.ic_tab_outgoing_outlined;
        } else if (i11 == 3) {
            i10 = R.drawable.ic_tab_missed_outline;
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = R.drawable.ic_tab_rejected_outlined;
        }
        this.f43390b = i10;
        int i12 = data.f27178c;
        this.f43391c = i12 != 1 ? i12 != 2 ? R.drawable.ic_no_sim : R.drawable.ic_in_active_sim_2 : R.drawable.ic_in_active_sim_1;
        C8800o c8800o = C8800o.f42459a;
        LocalDate localDateMo7846m = C8800o.m16182F(System.currentTimeMillis()).mo7846m();
        AbstractC4154l.m8922e(localDateMo7846m, "toLocalDate(...)");
        LocalDate localDateMo7846m2 = localDateTime.mo7846m();
        LocalDate localDateMo7846m3 = LocalDateTime.of(LocalDate.now().minusDays(1L), LocalTime.MIN).mo7846m();
        if (localDateMo7846m.equals(localDateMo7846m2)) {
            str = "Today";
        } else if (AbstractC4154l.m8918a(localDateMo7846m2, localDateMo7846m3)) {
            str = "Yesterday";
        } else {
            LocalDateTime localDateTimeAtStartOfDay = localDateMo7846m2.atStartOfDay();
            AbstractC4154l.m8922e(localDateTimeAtStartOfDay, "atStartOfDay(...)");
            long jM16184H = C8800o.m16184H(localDateTimeAtStartOfDay);
            LocalDateTime localDateTimeAtStartOfDay2 = localDateMo7846m.atStartOfDay();
            AbstractC4154l.m8922e(localDateTimeAtStartOfDay2, "atStartOfDay(...)");
            int iConvert = (int) TimeUnit.DAYS.convert(Math.abs(C8800o.m16184H(localDateTimeAtStartOfDay2) - jM16184H), TimeUnit.MILLISECONDS);
            if (iConvert < 31) {
                str = iConvert + " days ago";
            } else if (31 <= iConvert && iConvert < 365) {
                LocalDateTime localDateTimeAtStartOfDay3 = localDateMo7846m2.atStartOfDay();
                AbstractC4154l.m8922e(localDateTimeAtStartOfDay3, "atStartOfDay(...)");
                long jM16184H2 = C8800o.m16184H(localDateTimeAtStartOfDay3);
                LocalDateTime localDateTimeAtStartOfDay4 = localDateMo7846m.atStartOfDay();
                AbstractC4154l.m8922e(localDateTimeAtStartOfDay4, "atStartOfDay(...)");
                long jM16184H3 = C8800o.m16184H(localDateTimeAtStartOfDay4);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jM16184H2);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jM16184H3);
                str = (((calendar2.get(1) - calendar.get(1)) * 12) + (calendar2.get(2) - calendar.get(2))) + " months ago";
            } else if (iConvert >= 365) {
                str = (iConvert / 365) + " years ago";
            } else {
                str = iConvert + " days ago";
            }
        }
        this.f43392d = str;
        this.f43393e = C8800o.m16216y(localDateTime);
        this.f43394f = C8800o.m16186J(localDateTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9007g) && AbstractC4154l.m8918a(this.f43389a, ((C9007g) obj).f43389a);
    }

    public final int hashCode() {
        return this.f43389a.hashCode();
    }

    public final String toString() {
        return "NeverAttendCallHistoryUIModel(data=" + this.f43389a + ")";
    }
}
