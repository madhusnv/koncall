package p001o;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class gmh {

    /* renamed from: c */
    public static final gmh f25505c = new gmh(null, null);

    /* renamed from: a */
    public final Long f25506a;

    /* renamed from: b */
    public final TimeZone f25507b;

    public gmh(Long l, TimeZone timeZone) {
        this.f25506a = l;
        this.f25507b = timeZone;
    }

    /* renamed from: c */
    public static gmh m29089c() {
        return f25505c;
    }

    /* renamed from: a */
    public Calendar m29090a() {
        return m29091b(this.f25507b);
    }

    /* renamed from: b */
    public Calendar m29091b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f25506a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
