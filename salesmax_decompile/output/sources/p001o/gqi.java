package p001o;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class gqi {

    /* renamed from: a */
    public static AtomicReference f25668a = new AtomicReference();

    /* renamed from: a */
    public static long m29315a(long j) {
        Calendar calendarM29327m = m29327m();
        calendarM29327m.setTimeInMillis(j);
        return m29319e(calendarM29327m).getTimeInMillis();
    }

    /* renamed from: b */
    public static DateFormat m29316b(Locale locale) {
        return m29317c("MMMd", locale);
    }

    /* renamed from: c */
    public static DateFormat m29317c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m29326l());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    /* renamed from: d */
    public static String m29318d(String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    /* renamed from: e */
    public static Calendar m29319e(Calendar calendar) {
        Calendar calendarM29328n = m29328n(calendar);
        Calendar calendarM29327m = m29327m();
        calendarM29327m.set(calendarM29328n.get(1), calendarM29328n.get(2), calendarM29328n.get(5));
        return calendarM29327m;
    }

    /* renamed from: f */
    public static SimpleDateFormat m29320f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(m29318d(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(m29324j());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: g */
    public static String m29321g(Resources resources, SimpleDateFormat simpleDateFormat) throws Resources.NotFoundException {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(v9e.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(v9e.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(v9e.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: h */
    public static DateFormat m29322h(Locale locale) {
        return m29317c("MMMMEEEEd", locale);
    }

    /* renamed from: i */
    public static gmh m29323i() {
        gmh gmhVar = (gmh) f25668a.get();
        return gmhVar == null ? gmh.m29089c() : gmhVar;
    }

    /* renamed from: j */
    public static TimeZone m29324j() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    /* renamed from: k */
    public static Calendar m29325k() {
        Calendar calendarM29090a = m29323i().m29090a();
        calendarM29090a.set(11, 0);
        calendarM29090a.set(12, 0);
        calendarM29090a.set(13, 0);
        calendarM29090a.set(14, 0);
        calendarM29090a.setTimeZone(m29324j());
        return calendarM29090a;
    }

    /* renamed from: l */
    public static android.icu.util.TimeZone m29326l() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: m */
    public static Calendar m29327m() {
        return m29328n(null);
    }

    /* renamed from: n */
    public static Calendar m29328n(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m29324j());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* renamed from: o */
    public static DateFormat m29329o(Locale locale) {
        return m29317c("yMMMd", locale);
    }

    /* renamed from: p */
    public static DateFormat m29330p(Locale locale) {
        return m29317c("yMMMM", locale);
    }

    /* renamed from: q */
    public static DateFormat m29331q(Locale locale) {
        return m29317c("yMMMMEEEEd", locale);
    }
}
