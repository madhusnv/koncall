package j$.time;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* renamed from: j$.time.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3400b {
    /* renamed from: c */
    public static /* synthetic */ List m7884c(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public static String m7883b(long j6, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j6, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    /* renamed from: a */
    public static String m7882a(long j6, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j6, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    /* renamed from: d */
    public static C3399a m7885d() {
        return new C3399a(ZoneId.systemDefault());
    }
}
