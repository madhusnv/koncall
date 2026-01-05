package p001o;

import com.amazonaws.util.DateUtils;
import com.amplifyframework.core.model.temporal.Temporal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes2.dex */
public abstract class a81 {
    /* renamed from: A */
    public static /* synthetic */ Long m16640A(Temporal.DateTime dateTime) {
        return Long.valueOf(DateUtils.parseISO8601Date(dateTime.format()).getTime());
    }

    /* renamed from: B */
    public static Temporal.DateTime m16641B() {
        return m16658m(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: C */
    public static Temporal.Time m16642C() {
        return new Temporal.Time(m16641B().toDate());
    }

    /* renamed from: D */
    public static Date m16643D(String str) {
        try {
            return DateUtils.parseISO8601Date(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing ISO 8601 string: ");
            sb.append(str);
            return null;
        }
    }

    /* renamed from: E */
    public static List m16644E(Temporal.DateTime dateTime, Temporal.DateTime dateTime2) {
        int iCompareTo = dateTime.compareTo(dateTime2);
        ArrayList arrayList = new ArrayList();
        if (iCompareTo == 0) {
            return Collections.singletonList(dateTime);
        }
        if (iCompareTo > 0) {
            dateTime2 = dateTime;
            dateTime = dateTime2;
        }
        while (dateTime.compareTo(dateTime2) < 0) {
            arrayList.add(dateTime);
            dateTime = m16658m(Long.valueOf(m16668w(dateTime.toDate(), 1).getTime()));
        }
        return arrayList;
    }

    /* renamed from: F */
    public static Long m16645F(Temporal.DateTime dateTime) {
        return (Long) Optional.ofNullable(dateTime).map(new Function() { // from class: o.x71
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a81.m16640A((Temporal.DateTime) obj);
            }
        }).orElse(null);
    }

    /* renamed from: e */
    public static Temporal.DateTime m16650e(Date date, Integer num) {
        try {
            return new Temporal.DateTime(m16653h(Long.valueOf(m16668w(date, num).getTime())));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static String m16651f(Temporal.Date date) {
        return (String) Optional.ofNullable(date).map(new Function() { // from class: o.y71
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Temporal.Date) obj).format();
            }
        }).orElse(null);
    }

    /* renamed from: g */
    public static String m16652g(Temporal.DateTime dateTime) {
        return (String) Optional.ofNullable(dateTime).map(new Function() { // from class: o.s71
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Temporal.DateTime) obj).format();
            }
        }).orElse(null);
    }

    /* renamed from: h */
    public static String m16653h(Long l) {
        return m16652g(m16658m(l));
    }

    /* renamed from: i */
    public static String m16654i(Temporal.DateTime dateTime) {
        return (String) Optional.ofNullable(dateTime).map(new t71()).map(new Function() { // from class: o.z71
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a81.m16655j((Date) obj);
            }
        }).orElse(null);
    }

    /* renamed from: j */
    public static String m16655j(Date date) {
        return (String) Optional.ofNullable(date).map(new nv0(new SimpleDateFormat("dd MMM"))).orElse(null);
    }

    /* renamed from: k */
    public static String m16656k(Temporal.DateTime dateTime) {
        return (String) Optional.ofNullable(dateTime).map(new t71()).map(new Function() { // from class: o.u71
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a81.m16657l((Date) obj);
            }
        }).orElse(null);
    }

    /* renamed from: l */
    public static String m16657l(Date date) {
        return (String) Optional.ofNullable(date).map(new nv0(new SimpleDateFormat("yyyy-MM-dd"))).orElse(null);
    }

    /* renamed from: m */
    public static Temporal.DateTime m16658m(Long l) {
        return (Temporal.DateTime) Optional.ofNullable(l).map(new Function() { // from class: o.v71
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new Date(((Long) obj).longValue());
            }
        }).map(new Function() { // from class: o.w71
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return a81.m16671z((Date) obj);
            }
        }).orElse(null);
    }

    /* renamed from: n */
    public static long m16659n(Integer num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(System.currentTimeMillis() - (num.intValue() * 86400000)));
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar.getTime().toString();
        return calendar.getTimeInMillis();
    }

    /* renamed from: o */
    public static long m16660o() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        calendar.getTime().toString();
        return calendar.getTimeInMillis();
    }

    /* renamed from: p */
    public static long m16661p(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        calendar.getTime().toString();
        return calendar.getTimeInMillis();
    }

    /* renamed from: q */
    public static long m16662q() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar.set(5, calendar.getFirstDayOfWeek());
        calendar.add(2, 1);
        calendar.getTime().toString();
        return calendar.getTimeInMillis() - 1;
    }

    /* renamed from: r */
    public static long m16663r() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.add(3, 1);
        calendar.getTime().toString();
        return calendar.getTimeInMillis() - 1;
    }

    /* renamed from: s */
    public static long m16664s() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.getTime().toString();
        return calendar.getTimeInMillis();
    }

    /* renamed from: t */
    public static long m16665t(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.getTime().toString();
        return calendar.getTimeInMillis();
    }

    /* renamed from: u */
    public static long m16666u() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar.set(5, calendar.getFirstDayOfWeek());
        calendar.getTime().toString();
        return calendar.getTimeInMillis();
    }

    /* renamed from: v */
    public static long m16667v() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.getTime().toString();
        return calendar.getTimeInMillis();
    }

    /* renamed from: w */
    public static Date m16668w(Date date, Integer num) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(6, num.intValue());
            return calendar.getTime();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: z */
    public static /* synthetic */ Temporal.DateTime m16671z(Date date) {
        return new Temporal.DateTime(date, 0);
    }
}
