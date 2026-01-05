package yv;

import a2.AbstractC0030c;
import android.content.Context;
import android.text.format.DateFormat;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;
import qw.C6361k;
import rw.AbstractC6664n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.o */
/* loaded from: classes3.dex */
public final class C8800o {

    /* renamed from: a */
    public static final C8800o f42459a = new C8800o();

    /* renamed from: b */
    public static final DateTimeFormatter f42460b = m16214w("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c */
    public static final DateTimeFormatter f42461c = m16214w("yyyy-MM-dd");

    /* renamed from: d */
    public static final DateTimeFormatter f42462d;

    /* renamed from: e */
    public static final DateTimeFormatter f42463e;

    static {
        Locale locale = Locale.ENGLISH;
        f42462d = DateTimeFormatter.ofPattern("dd-MM-yyyy, hh:mm a", locale);
        f42463e = DateTimeFormatter.ofPattern("dd MMM yyyy", locale);
    }

    /* renamed from: A */
    public static String m16177A(LocalDateTime localDateTime) {
        String str = localDateTime.format(m16214w("dd-MM-yyyy HH_mm_ss"));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: B */
    public static String m16178B(LocalDateTime localDateTime, Context context) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        AbstractC4154l.m8923f(context, "context");
        String str = DateFormat.getMediumDateFormat(context).format(DesugarDate.from(Instant.from(localDateTime.mo7840H(ZoneId.systemDefault()))));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: C */
    public static String m16179C(LocalDateTime localDateTime) {
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateMo7846m = localDateTime.mo7846m();
        Locale locale = Locale.ENGLISH;
        return AbstractC0030c.m121l("Last active ", AbstractC4154l.m8918a(localDateMo7846m, localDateNow) ? "today" : AbstractC4154l.m8918a(localDateMo7846m, localDateNow.minusDays(1L)) ? "yesterday" : localDateTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy", locale)), " at ", localDateTime.format(DateTimeFormatter.ofPattern("hh:mm a", locale)));
    }

    /* renamed from: D */
    public static LocalDate m16180D(long j6) {
        LocalDate localDate = Instant.ofEpochMilli(j6).atZone(ZoneId.systemDefault()).mo7878m();
        AbstractC4154l.m8922e(localDate, "toLocalDate(...)");
        return localDate;
    }

    /* renamed from: E */
    public static LocalDate m16181E(String str, DateTimeFormatter formatter) {
        String string;
        LocalDate localDateMo7846m;
        AbstractC4154l.m8923f(formatter, "formatter");
        if (str != null && (string = AbstractC5178p.g0(str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null && (localDateMo7846m = LocalDateTime.parse(string, formatter).mo7846m()) != null) {
                return localDateMo7846m;
            }
        }
        LocalDate MIN = LocalDate.MIN;
        AbstractC4154l.m8922e(MIN, "MIN");
        return MIN;
    }

    /* renamed from: F */
    public static LocalDateTime m16182F(long j6) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j6), ZoneId.systemDefault());
        AbstractC4154l.m8922e(localDateTimeOfInstant, "ofInstant(...)");
        return localDateTimeOfInstant;
    }

    /* renamed from: G */
    public static LocalDateTime m16183G(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        LocalDateTime localDateTime = LocalDateTime.parse(str, f42460b);
        AbstractC4154l.m8922e(localDateTime, "parse(...)");
        return localDateTime;
    }

    /* renamed from: H */
    public static long m16184H(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        return localDateTime.mo7840H(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /* renamed from: I */
    public static String m16185I(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str = localDateTime.format(m16214w("dd-MMM-yyyy hh:mm a"));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: J */
    public static String m16186J(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str = localDateTime.format(m16214w("hh:mm a"));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: K */
    public static String m16187K(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str = localDateTime.format(m16214w("dd MMM yyyy"));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: L */
    public static String m16188L(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str = localDateTime.format(m16214w("dd-MM-yyyy, hh:mm a"));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: M */
    public static String m16189M(long j6) {
        String str = m16214w("dd-MMM-yyyy hh:mm a").format(Instant.ofEpochMilli(j6));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: N */
    public static String m16190N(long j6) {
        String str = m16214w("yyyy-MM-dd HH:mm:ss").format(Instant.ofEpochMilli(j6));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: O */
    public static String m16191O(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str = localDateTime.format(m16214w("yyyy-MM-dd"));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: a */
    public static long m16192a(String str, String inputDate) {
        AbstractC4154l.m8923f(inputDate, "inputDate");
        LocalDateTime localDateTime = LocalDateTime.parse(inputDate, m16214w(str));
        AbstractC4154l.m8922e(localDateTime, "parse(...)");
        return m16184H(localDateTime);
    }

    /* renamed from: b */
    public static String m16193b(LocalDateTime localDateTime, String str) {
        String str2 = localDateTime.format(m16214w(str));
        AbstractC4154l.m8922e(str2, "format(...)");
        return str2;
    }

    /* renamed from: c */
    public static long m16194c(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        return localDateTime.mo7840H(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /* renamed from: d */
    public static String m16195d(LocalDate localDate) {
        String str = localDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH).withZone(ZoneId.systemDefault()));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: e */
    public static LocalDateTime m16196e(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "localDateTime");
        LocalDateTime localDateTime2 = localDateTime.mo7840H(ZoneId.systemDefault()).mo7880p(ZoneOffset.UTC).mo7881y();
        AbstractC4154l.m8922e(localDateTime2, "toLocalDateTime(...)");
        return localDateTime2;
    }

    /* renamed from: f */
    public static String m16197f(LocalDate localDate) {
        AbstractC4154l.m8923f(localDate, "<this>");
        String str = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH).withZone(ZoneId.systemDefault()));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: g */
    public static LocalDateTime m16198g(LocalDateTime localDateTime) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        AbstractC4154l.m8922e(zoneIdSystemDefault, "systemDefault(...)");
        AbstractC4154l.m8923f(localDateTime, "<this>");
        LocalDateTime localDateTime2 = ZonedDateTime.of(localDateTime, ZoneId.of("UTC")).mo7880p(zoneIdSystemDefault).mo7881y();
        AbstractC4154l.m8922e(localDateTime2, "toLocalDateTime(...)");
        return localDateTime2;
    }

    /* renamed from: h */
    public static String m16199h(LocalDate localDate, String format) {
        AbstractC4154l.m8923f(localDate, "<this>");
        AbstractC4154l.m8923f(format, "format");
        String str = localDate.format(DateTimeFormatter.ofPattern(format, Locale.ENGLISH).withZone(ZoneId.systemDefault()));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: i */
    public static String m16200i(LocalDate localDate) {
        AbstractC4154l.m8923f(localDate, "<this>");
        LocalDate localDateNow = LocalDate.now();
        Object objPlusDays = localDateNow.plusDays(1L);
        Object objMinusDays = localDateNow.minusDays(1L);
        if (localDate.equals(localDateNow)) {
            return "Today";
        }
        if (localDate.equals(objPlusDays)) {
            return "Tomorrow";
        }
        if (localDate.equals(objMinusDays)) {
            return "Yesterday";
        }
        String str = localDate.format(f42463e);
        return str == null ? "" : str;
    }

    /* renamed from: j */
    public static LocalDateTime m16201j() {
        LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        AbstractC4154l.m8922e(localDateTimeOf, "of(...)");
        return localDateTimeOf;
    }

    /* renamed from: k */
    public static LocalDate m16202k(LocalDate localDate) {
        int monthValue;
        int dayOfMonth;
        AbstractC4154l.m8923f(localDate, "<this>");
        int year = localDate.getYear();
        return (2000 > year || year >= 2051 || (monthValue = localDate.getMonthValue()) < 0 || monthValue >= 13 || 1 > (dayOfMonth = localDate.getDayOfMonth()) || dayOfMonth >= 32) ? m16180D(System.currentTimeMillis()) : localDate;
    }

    /* renamed from: l */
    public static LocalDateTime m16203l() {
        LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        AbstractC4154l.m8922e(localDateTimeOf, "of(...)");
        return localDateTimeOf;
    }

    /* renamed from: m */
    public static LocalDateTime m16204m() {
        LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.systemDefault());
        AbstractC4154l.m8922e(localDateTimeNow, "now(...)");
        return localDateTimeNow;
    }

    /* renamed from: n */
    public static String m16205n(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        LocalDate localDateMo7846m = m16182F(System.currentTimeMillis()).mo7846m();
        AbstractC4154l.m8922e(localDateMo7846m, "toLocalDate(...)");
        LocalDate localDateMo7846m2 = localDateTime.mo7846m();
        LocalDate localDateMo7846m3 = LocalDateTime.of(LocalDate.now().minusDays(1L), LocalTime.MIN).mo7846m();
        if (localDateMo7846m.equals(localDateMo7846m2)) {
            return "Today";
        }
        if (AbstractC4154l.m8918a(localDateMo7846m2, localDateMo7846m3)) {
            return "Yesterday";
        }
        String str = localDateTime.format(m16214w("dd MMMM yyyy"));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: o */
    public static String m16206o(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        return localDateTime.getYear() + "-" + localDateTime.getMonthValue() + "-" + localDateTime.getDayOfMonth() + " " + localDateTime.getHour() + ":" + localDateTime.getMinute() + ":" + localDateTime.getSecond();
    }

    /* renamed from: p */
    public static String m16207p(int i10, LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        long jCurrentTimeMillis = (System.currentTimeMillis() - m16184H(localDateTime)) / 60000;
        if (jCurrentTimeMillis < i10) {
            return null;
        }
        if (jCurrentTimeMillis < 60) {
            return jCurrentTimeMillis + " minutes";
        }
        if (jCurrentTimeMillis < 1440) {
            return (jCurrentTimeMillis / 60) + " hours";
        }
        if (jCurrentTimeMillis >= 10080) {
            return "Long Time Ago";
        }
        return (jCurrentTimeMillis / 1440) + " days";
    }

    /* renamed from: q */
    public static long m16208q(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        List listM10112W = AbstractC5178p.m10112W(str, new String[]{":"}, 6);
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM10112W, 10));
        Iterator it = listM10112W.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return AbstractC5601a.m11230a(((Number) arrayList.get(1)).intValue(), 60, ((Number) arrayList.get(0)).intValue() * 3600, ((Number) arrayList.get(2)).intValue());
    }

    /* renamed from: r */
    public static LocalDateTime m16209r() {
        LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        AbstractC4154l.m8922e(localDateTimeOf, "of(...)");
        return localDateTimeOf;
    }

    /* renamed from: s */
    public static LocalDateTime m16210s(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        LocalDateTime localDateTime2 = localDateTime.mo7840H(ZoneId.of("UTC")).mo7880p(ZoneId.systemDefault()).mo7881y();
        AbstractC4154l.m8922e(localDateTime2, "toLocalDateTime(...)");
        return localDateTime2;
    }

    /* renamed from: t */
    public static String m16211t(long j6) throws Exception {
        if (j6 <= 0) {
            throw new Exception(a1.m14330j("Wrong dateTimeInMilliSec passed, value :=", j6));
        }
        String str = f42460b.format(Instant.ofEpochMilli(j6));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: u */
    public static String m16212u(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str = localDateTime.format(f42460b);
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: v */
    public static String m16213v(String str, String str2) {
        AbstractC4154l.m8923f(str, "<this>");
        String str3 = LocalDateTime.parse(str, m16214w("yyyy-MM-dd HH:mm:ss")).format(m16214w(str2));
        AbstractC4154l.m8922e(str3, "format(...)");
        return str3;
    }

    /* renamed from: w */
    public static DateTimeFormatter m16214w(String str) {
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern(str, Locale.ENGLISH).withZone(ZoneId.systemDefault());
        AbstractC4154l.m8922e(dateTimeFormatterWithZone, "withZone(...)");
        return dateTimeFormatterWithZone;
    }

    /* renamed from: x */
    public static C6361k m16215x(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        return new C6361k(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault())), localDateTime.format(DateTimeFormatter.ofPattern("hh:mm a", Locale.getDefault())));
    }

    /* renamed from: y */
    public static String m16216y(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str = localDateTime.format(m16214w("dd MMM yyyy"));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }

    /* renamed from: z */
    public static String m16217z(LocalDateTime localDateTime) {
        AbstractC4154l.m8923f(localDateTime, "<this>");
        String str = localDateTime.format(m16214w("dd MMMM yyyy | hh:mm a"));
        AbstractC4154l.m8922e(str, "format(...)");
        return str;
    }
}
