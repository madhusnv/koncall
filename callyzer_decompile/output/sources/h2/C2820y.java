package h2;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.C6361k;
import rw.AbstractC6662l;
import rw.C6668r;
import sw.C6959c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.y */
/* loaded from: classes.dex */
public final class C2820y extends AbstractC2808m {

    /* renamed from: d */
    public static final TimeZone f15805d = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: b */
    public final int f15806b;

    /* renamed from: c */
    public final C6959c f15807c;

    public C2820y(Locale locale) {
        List listM10833h;
        int firstDayOfWeek = (Calendar.getInstance(locale).getFirstDayOfWeek() + 6) % 7;
        this.f15806b = firstDayOfWeek != 0 ? firstDayOfWeek : 7;
        C6959c c6959cM10829d = pe.m10829d();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        AbstractC4154l.m8923f(weekdays, "<this>");
        int length = weekdays.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            listM10833h = C6668r.f31943a;
        } else {
            int length2 = weekdays.length;
            if (length >= length2) {
                listM10833h = AbstractC6662l.m12708K(weekdays);
            } else if (length == 1) {
                listM10833h = pe.m10833h(weekdays[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i10 = length2 - length; i10 < length2; i10++) {
                    arrayList.add(weekdays[i10]);
                }
                listM10833h = arrayList;
            }
        }
        int size = listM10833h.size();
        for (int i11 = 0; i11 < size; i11++) {
            c6959cM10829d.add(new C6361k((String) listM10833h.get(i11), shortWeekdays[i11 + 2]));
        }
        c6959cM10829d.add(new C6361k(weekdays[1], shortWeekdays[1]));
        this.f15807c = pe.m10828c(c6959cM10829d);
    }

    @Override // h2.AbstractC2808m
    /* renamed from: a */
    public final String mo6897a(long j6, String str, Locale locale) {
        return AbstractC2812q.m6914f(j6, str, locale, this.f15733a);
    }

    @Override // h2.AbstractC2808m
    /* renamed from: b */
    public final C2807l mo6898b(long j6) {
        Calendar calendar = Calendar.getInstance(f15805d);
        calendar.setTimeInMillis(j6);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new C2807l(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // h2.AbstractC2808m
    /* renamed from: c */
    public final C2811p mo6899c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        AbstractC4154l.m8921d(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        return AbstractC2812q.m6912d(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // h2.AbstractC2808m
    /* renamed from: d */
    public final int mo6900d() {
        return this.f15806b;
    }

    @Override // h2.AbstractC2808m
    /* renamed from: e */
    public final C2810o mo6901e(int i10, int i11) {
        Calendar calendar = Calendar.getInstance(f15805d);
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, i11 - 1);
        calendar.set(5, 1);
        return m6924l(calendar);
    }

    @Override // h2.AbstractC2808m
    /* renamed from: f */
    public final C2810o mo6902f(long j6) {
        Calendar calendar = Calendar.getInstance(f15805d);
        calendar.setTimeInMillis(j6);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return m6924l(calendar);
    }

    @Override // h2.AbstractC2808m
    /* renamed from: g */
    public final C2810o mo6903g(C2807l c2807l) {
        return mo6901e(c2807l.f15724a, c2807l.f15725b);
    }

    @Override // h2.AbstractC2808m
    /* renamed from: h */
    public final C2807l mo6904h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new C2807l(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.get(16) + calendar.get(15) + calendar.getTimeInMillis());
    }

    @Override // h2.AbstractC2808m
    /* renamed from: i */
    public final List mo6905i() {
        return this.f15807c;
    }

    @Override // h2.AbstractC2808m
    /* renamed from: j */
    public final C2807l mo6906j(String str, String str2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = f15805d;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new C2807l(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // h2.AbstractC2808m
    /* renamed from: k */
    public final C2810o mo6907k(C2810o c2810o, int i10) {
        if (i10 <= 0) {
            return c2810o;
        }
        Calendar calendar = Calendar.getInstance(f15805d);
        calendar.setTimeInMillis(c2810o.f15751e);
        calendar.add(2, i10);
        return m6924l(calendar);
    }

    /* renamed from: l */
    public final C2810o m6924l(Calendar calendar) {
        int i10 = (calendar.get(7) + 6) % 7;
        int i11 = (i10 != 0 ? i10 : 7) - this.f15806b;
        if (i11 < 0) {
            i11 += 7;
        }
        return new C2810o(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i11, calendar.getTimeInMillis());
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }
}
