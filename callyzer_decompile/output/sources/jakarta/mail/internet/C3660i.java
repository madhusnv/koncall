package jakarta.mail.internet;

import a1.C0005d;
import com.sun.mail.util.MailLogger;
import j$.util.DesugarTimeZone;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.internet.i */
/* loaded from: classes3.dex */
public final class C3660i extends SimpleDateFormat {

    /* renamed from: a */
    public static final MailLogger f19360a = new MailLogger((Class<?>) C3660i.class, "DEBUG", false, System.out);

    /* renamed from: b */
    public static final TimeZone f19361b = DesugarTimeZone.getTimeZone("UTC");

    public C3660i() {
        super("EEE, d MMM yyyy HH:mm:ss Z (z)", Locale.US);
    }

    /* renamed from: a */
    public static Date m8223a(C3660i c3660i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i16 == 60) {
            i16 = 59;
        }
        int i18 = i16;
        TimeZone timeZone = ((SimpleDateFormat) c3660i).calendar.getTimeZone();
        try {
            ((SimpleDateFormat) c3660i).calendar.setTimeZone(f19361b);
            ((SimpleDateFormat) c3660i).calendar.clear();
            ((SimpleDateFormat) c3660i).calendar.set(i13, i12, i11, i14, i15, i18);
            if (i10 != -1 && i10 != ((SimpleDateFormat) c3660i).calendar.get(7)) {
                throw new IllegalArgumentException("Inconsistent day-name");
            }
            ((SimpleDateFormat) c3660i).calendar.add(12, i17);
            Date time = ((SimpleDateFormat) c3660i).calendar.getTime();
            ((SimpleDateFormat) c3660i).calendar.setTimeZone(timeZone);
            return time;
        } catch (Throwable th2) {
            ((SimpleDateFormat) c3660i).calendar.setTimeZone(timeZone);
            throw th2;
        }
    }

    @Override // java.text.SimpleDateFormat
    public final void applyLocalizedPattern(String str) {
        throw new UnsupportedOperationException("Method applyLocalizedPattern() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat
    public final void applyPattern(String str) {
        throw new UnsupportedOperationException("Method applyPattern() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat, java.text.Format
    public final Object clone() {
        return (C3660i) super.clone();
    }

    @Override // java.text.SimpleDateFormat
    public final Date get2DigitYearStart() {
        throw new UnsupportedOperationException("Method get2DigitYearStart() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        if (str == null || parsePosition == null) {
            throw null;
        }
        if (parsePosition.getIndex() < 0 || parsePosition.getIndex() >= str.length()) {
            return null;
        }
        return isLenient() ? new C3659h(23, this, str, parsePosition).m41H() : new C0005d(23, this, str, parsePosition).m41H();
    }

    @Override // java.text.SimpleDateFormat
    public final void set2DigitYearStart(Date date) {
        throw new UnsupportedOperationException("Method set2DigitYearStart() shouldn't be called");
    }

    @Override // java.text.DateFormat
    public final void setCalendar(Calendar calendar) {
        throw new UnsupportedOperationException("Method setCalendar() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat
    public final void setDateFormatSymbols(DateFormatSymbols dateFormatSymbols) {
        throw new UnsupportedOperationException("Method setDateFormatSymbols() shouldn't be called");
    }

    @Override // java.text.DateFormat
    public final void setNumberFormat(NumberFormat numberFormat) {
        throw new UnsupportedOperationException("Method setNumberFormat() shouldn't be called");
    }
}
