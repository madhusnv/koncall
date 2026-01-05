package td;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import ox.C5770a;
import ox.EnumC5772c;
import qw.C6361k;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.c */
/* loaded from: classes.dex */
public final class C7126c implements Comparable {

    /* renamed from: b */
    public static final DateTimeFormatter f34342b;

    /* renamed from: c */
    public static final DateTimeFormatter f34343c;

    /* renamed from: d */
    public static final DateTimeFormatter f34344d;

    /* renamed from: e */
    public static final C7126c f34345e;

    /* renamed from: a */
    public final Instant f34346a;

    static {
        Map<Long, String> mapM12778f = AbstractC6674x.m12778f(new C6361k(1L, "Mon"), new C6361k(2L, "Tue"), new C6361k(3L, "Wed"), new C6361k(4L, "Thu"), new C6361k(5L, "Fri"), new C6361k(6L, "Sat"), new C6361k(7L, "Sun"));
        DateTimeFormatter dateTimeFormatterWithChronology = new DateTimeFormatterBuilder().parseCaseInsensitive().parseLenient().optionalStart().appendText(ChronoField.DAY_OF_WEEK, mapM12778f).appendLiteral(", ").optionalEnd().appendValue(ChronoField.DAY_OF_MONTH, 2, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ').appendText(ChronoField.MONTH_OF_YEAR, AbstractC6674x.m12778f(new C6361k(1L, "Jan"), new C6361k(2L, "Feb"), new C6361k(3L, "Mar"), new C6361k(4L, "Apr"), new C6361k(5L, "May"), new C6361k(6L, "Jun"), new C6361k(7L, "Jul"), new C6361k(8L, "Aug"), new C6361k(9L, "Sep"), new C6361k(10L, "Oct"), new C6361k(11L, "Nov"), new C6361k(12L, "Dec"))).appendLiteral(' ').appendValue(ChronoField.YEAR, 4).appendLiteral(' ').appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral(':').appendValue(ChronoField.MINUTE_OF_HOUR, 2).optionalStart().appendLiteral(':').appendValue(ChronoField.SECOND_OF_MINUTE, 2).optionalEnd().appendLiteral(' ').appendOffset("+HHMM", "GMT").toFormatter().withChronology(IsoChronology.INSTANCE);
        AbstractC4154l.m8922e(dateTimeFormatterWithChronology, "withChronology(...)");
        f34342b = dateTimeFormatterWithChronology;
        ZoneId zoneIdOf = ZoneId.of("Z");
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'").withZone(zoneIdOf);
        AbstractC4154l.m8922e(dateTimeFormatterWithZone, "withZone(...)");
        f34343c = dateTimeFormatterWithZone;
        DateTimeFormatter dateTimeFormatterWithZone2 = DateTimeFormatter.ofPattern("yyyyMMdd").withZone(zoneIdOf);
        AbstractC4154l.m8922e(dateTimeFormatterWithZone2, "withZone(...)");
        f34344d = dateTimeFormatterWithZone2;
        Instant MIN = Instant.MIN;
        AbstractC4154l.m8922e(MIN, "MIN");
        Instant MAX = Instant.MAX;
        AbstractC4154l.m8922e(MAX, "MAX");
        f34345e = new C7126c(MAX);
    }

    public C7126c(Instant instant) {
        this.f34346a = instant;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C7126c other) {
        AbstractC4154l.m8923f(other, "other");
        return this.f34346a.compareTo(other.f34346a);
    }

    /* renamed from: b */
    public final String m13409b(EnumC7143t fmt) {
        CharSequence charSequenceSubSequence;
        AbstractC4154l.m8923f(fmt, "fmt");
        int i10 = AbstractC7125b.f34341a[fmt.ordinal()];
        Instant instant = this.f34346a;
        switch (i10) {
            case 1:
                String str = DateTimeFormatter.ISO_INSTANT.format(instant.truncatedTo(ChronoUnit.MICROS));
                AbstractC4154l.m8922e(str, "format(...)");
                return str;
            case 2:
                String str2 = f34343c.format(instant);
                AbstractC4154l.m8922e(str2, "format(...)");
                return str2;
            case 3:
                String str3 = f34344d.format(instant);
                AbstractC4154l.m8922e(str3, "format(...)");
                return str3;
            case 4:
                String str4 = DateTimeFormatter.ISO_INSTANT.format(instant);
                AbstractC4154l.m8922e(str4, "format(...)");
                return str4;
            case 5:
                String str5 = f34342b.format(ZonedDateTime.ofInstant(instant, ZoneOffset.UTC));
                AbstractC4154l.m8922e(str5, "format(...)");
                return str5;
            case 6:
                StringBuffer stringBuffer = new StringBuffer(String.valueOf(instant.getEpochSecond()));
                if (instant.getNano() <= 0) {
                    String string = stringBuffer.toString();
                    AbstractC4154l.m8920c(string);
                    return string;
                }
                stringBuffer.append(".");
                String strValueOf = String.valueOf(instant.getNano());
                stringBuffer.append(AbstractC5185w.m10134p(9 - strValueOf.length(), "0"));
                stringBuffer.append(strValueOf);
                char[] cArr = {'0'};
                int length = stringBuffer.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i11 = length - 1;
                        char cCharAt = stringBuffer.charAt(length);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 1) {
                                i12 = -1;
                            } else if (cCharAt != cArr[i12]) {
                                i12++;
                            }
                        }
                        if (!(i12 >= 0)) {
                            charSequenceSubSequence = stringBuffer.subSequence(0, length + 1);
                        } else if (i11 >= 0) {
                            length = i11;
                        }
                    }
                    charSequenceSubSequence = "";
                } else {
                    charSequenceSubSequence = "";
                }
                return charSequenceSubSequence.toString();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public final C7126c m13410c(long j6) {
        int i10 = C5770a.f28335d;
        long jM11302m = C5770a.m11302m(j6, EnumC5772c.SECONDS);
        int iM11295f = C5770a.m11295f(j6);
        Instant instant = this.f34346a;
        return C7124a.m13403a(instant.getNano() + iM11295f, instant.getEpochSecond() + jM11302m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7126c) {
            return AbstractC4154l.m8918a(this.f34346a, ((C7126c) obj).f34346a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34346a.hashCode();
    }

    public final String toString() {
        return m13409b(EnumC7143t.ISO_8601);
    }
}
