package p001o;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class wz4 {
    /* renamed from: a */
    public static iwc m55430a(Long l, Long l2) {
        return m55431b(l, l2, null);
    }

    /* renamed from: b */
    public static iwc m55431b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return iwc.m32868a(null, null);
        }
        if (l == null) {
            return iwc.m32868a(null, m55433d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return iwc.m32868a(m55433d(l.longValue(), simpleDateFormat), null);
        }
        Calendar calendarM29325k = gqi.m29325k();
        Calendar calendarM29327m = gqi.m29327m();
        calendarM29327m.setTimeInMillis(l.longValue());
        Calendar calendarM29327m2 = gqi.m29327m();
        calendarM29327m2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return iwc.m32868a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        }
        return calendarM29327m.get(1) == calendarM29327m2.get(1) ? calendarM29327m.get(1) == calendarM29325k.get(1) ? iwc.m32868a(m55436g(l.longValue(), Locale.getDefault()), m55436g(l2.longValue(), Locale.getDefault())) : iwc.m32868a(m55436g(l.longValue(), Locale.getDefault()), m55443n(l2.longValue(), Locale.getDefault())) : iwc.m32868a(m55443n(l.longValue(), Locale.getDefault()), m55443n(l2.longValue(), Locale.getDefault()));
    }

    /* renamed from: c */
    public static String m55432c(long j) {
        return m55433d(j, null);
    }

    /* renamed from: d */
    public static String m55433d(long j, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j)) : m55446q(j) ? m55435f(j) : m55442m(j);
    }

    /* renamed from: e */
    public static String m55434e(Context context, long j, boolean z, boolean z2, boolean z3) {
        String strM55439j = m55439j(j);
        if (z) {
            strM55439j = String.format(context.getString(v9e.mtrl_picker_today_description), strM55439j);
        }
        return z2 ? String.format(context.getString(v9e.mtrl_picker_start_date_description), strM55439j) : z3 ? String.format(context.getString(v9e.mtrl_picker_end_date_description), strM55439j) : strM55439j;
    }

    /* renamed from: f */
    public static String m55435f(long j) {
        return m55436g(j, Locale.getDefault());
    }

    /* renamed from: g */
    public static String m55436g(long j, Locale locale) {
        return gqi.m29316b(locale).format(new Date(j));
    }

    /* renamed from: h */
    public static String m55437h(long j) {
        return m55438i(j, Locale.getDefault());
    }

    /* renamed from: i */
    public static String m55438i(long j, Locale locale) {
        return gqi.m29322h(locale).format(new Date(j));
    }

    /* renamed from: j */
    public static String m55439j(long j) {
        return m55446q(j) ? m55437h(j) : m55444o(j);
    }

    /* renamed from: k */
    public static String m55440k(Context context, int i) {
        return gqi.m29325k().get(1) == i ? String.format(context.getString(v9e.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i)) : String.format(context.getString(v9e.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    /* renamed from: l */
    public static String m55441l(long j) {
        return gqi.m29330p(Locale.getDefault()).format(new Date(j));
    }

    /* renamed from: m */
    public static String m55442m(long j) {
        return m55443n(j, Locale.getDefault());
    }

    /* renamed from: n */
    public static String m55443n(long j, Locale locale) {
        return gqi.m29329o(locale).format(new Date(j));
    }

    /* renamed from: o */
    public static String m55444o(long j) {
        return m55445p(j, Locale.getDefault());
    }

    /* renamed from: p */
    public static String m55445p(long j, Locale locale) {
        return gqi.m29331q(locale).format(new Date(j));
    }

    /* renamed from: q */
    public static boolean m55446q(long j) {
        Calendar calendarM29325k = gqi.m29325k();
        Calendar calendarM29327m = gqi.m29327m();
        calendarM29327m.setTimeInMillis(j);
        return calendarM29325k.get(1) == calendarM29327m.get(1);
    }
}
