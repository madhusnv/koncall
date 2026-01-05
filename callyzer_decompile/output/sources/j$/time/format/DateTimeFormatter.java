package j$.time.format;

import j$.time.C3401c;
import j$.time.C3429e;
import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.AbstractC3478h;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: a */
    public final C3434d f18111a;

    /* renamed from: b */
    public final Locale f18112b;

    /* renamed from: c */
    public final DecimalStyle f18113c;

    /* renamed from: d */
    public final b0 f18114d;

    /* renamed from: e */
    public final Chronology f18115e;

    /* renamed from: f */
    public final ZoneId f18116f;

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m7943e(str);
        return dateTimeFormatterBuilder.toFormatter();
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m7943e(str);
        return dateTimeFormatterBuilder.m7948j(locale, b0.SMART, null);
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField3, 2);
        b0 b0Var = b0.STRICT;
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        DateTimeFormatter dateTimeFormatterM7947i = dateTimeFormatterBuilderAppendValue.m7947i(b0Var, isoChronology);
        ISO_LOCAL_DATE = dateTimeFormatterM7947i;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.m7939a(dateTimeFormatterM7947i);
        C3440j c3440j = C3440j.f18166e;
        caseInsensitive.m7941c(c3440j);
        caseInsensitive.m7947i(b0Var, isoChronology);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.m7939a(dateTimeFormatterM7947i);
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart = caseInsensitive2.optionalStart();
        dateTimeFormatterBuilderOptionalStart.getClass();
        dateTimeFormatterBuilderOptionalStart.m7941c(c3440j);
        dateTimeFormatterBuilderOptionalStart.m7947i(b0Var, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral4 = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField5, 2).optionalStart().appendLiteral(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart2 = dateTimeFormatterBuilderAppendLiteral4.appendValue(chronoField6, 2).optionalStart();
        dateTimeFormatterBuilderOptionalStart2.m7940b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterM7947i2 = dateTimeFormatterBuilderOptionalStart2.m7947i(b0Var, null);
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.m7939a(dateTimeFormatterM7947i2);
        caseInsensitive3.m7941c(c3440j);
        caseInsensitive3.m7947i(b0Var, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.m7939a(dateTimeFormatterM7947i2);
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart3 = caseInsensitive4.optionalStart();
        dateTimeFormatterBuilderOptionalStart3.getClass();
        dateTimeFormatterBuilderOptionalStart3.m7941c(c3440j);
        dateTimeFormatterBuilderOptionalStart3.m7947i(b0Var, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.m7939a(dateTimeFormatterM7947i);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral5 = caseInsensitive5.appendLiteral('T');
        dateTimeFormatterBuilderAppendLiteral5.m7939a(dateTimeFormatterM7947i2);
        DateTimeFormatter dateTimeFormatterM7947i3 = dateTimeFormatterBuilderAppendLiteral5.m7947i(b0Var, isoChronology);
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.m7939a(dateTimeFormatterM7947i3);
        DateTimeFormatterBuilder lenient = caseInsensitive6.parseLenient();
        lenient.getClass();
        lenient.m7941c(c3440j);
        EnumC3446p enumC3446p = EnumC3446p.STRICT;
        lenient.m7941c(enumC3446p);
        DateTimeFormatter dateTimeFormatterM7947i4 = lenient.m7947i(b0Var, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.m7939a(dateTimeFormatterM7947i4);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral6 = dateTimeFormatterBuilder3.optionalStart().appendLiteral('[');
        EnumC3446p enumC3446p2 = EnumC3446p.SENSITIVE;
        dateTimeFormatterBuilderAppendLiteral6.m7941c(enumC3446p2);
        C3429e c3429e = DateTimeFormatterBuilder.f18117h;
        dateTimeFormatterBuilderAppendLiteral6.m7941c(new C3449s(c3429e, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendLiteral6.appendLiteral(']').m7947i(b0Var, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.m7939a(dateTimeFormatterM7947i3);
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart4 = dateTimeFormatterBuilder4.optionalStart();
        dateTimeFormatterBuilderOptionalStart4.getClass();
        dateTimeFormatterBuilderOptionalStart4.m7941c(c3440j);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral7 = dateTimeFormatterBuilderOptionalStart4.optionalStart().appendLiteral('[');
        dateTimeFormatterBuilderAppendLiteral7.m7941c(enumC3446p2);
        dateTimeFormatterBuilderAppendLiteral7.m7941c(new C3449s(c3429e, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendLiteral7.appendLiteral(']').m7947i(b0Var, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart5 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3).optionalStart();
        dateTimeFormatterBuilderOptionalStart5.getClass();
        dateTimeFormatterBuilderOptionalStart5.m7941c(c3440j);
        dateTimeFormatterBuilderOptionalStart5.m7947i(b0Var, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral8 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(AbstractC3478h.f18268c, 4, 10, signStyle).appendLiteral("-W").appendValue(AbstractC3478h.f18267b, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart6 = dateTimeFormatterBuilderAppendLiteral8.appendValue(chronoField7, 1).optionalStart();
        dateTimeFormatterBuilderOptionalStart6.getClass();
        dateTimeFormatterBuilderOptionalStart6.m7941c(c3440j);
        dateTimeFormatterBuilderOptionalStart6.m7947i(b0Var, isoChronology);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.getClass();
        caseInsensitive7.m7941c(new C3437g());
        ISO_INSTANT = caseInsensitive7.m7947i(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2).optionalStart().parseLenient().appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.m7941c(enumC3446p);
        dateTimeFormatterBuilderAppendOffset.m7947i(b0Var, isoChronology);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        new DateTimeFormatterBuilder().parseCaseInsensitive().parseLenient().optionalStart().appendText(chronoField7, map).appendLiteral(", ").optionalEnd().appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ').appendText(chronoField2, map2).appendLiteral(' ').appendValue(chronoField, 4).appendLiteral(' ').appendValue(chronoField4, 2).appendLiteral(':').appendValue(chronoField5, 2).optionalStart().appendLiteral(':').appendValue(chronoField6, 2).optionalEnd().appendLiteral(' ').appendOffset("+HHMM", "GMT").m7947i(b0.SMART, isoChronology);
    }

    public DateTimeFormatter(C3434d c3434d, Locale locale, DecimalStyle decimalStyle, b0 b0Var, Chronology chronology, ZoneId zoneId) {
        Objects.requireNonNull(c3434d, "printerParser");
        this.f18111a = c3434d;
        Objects.requireNonNull(locale, "locale");
        this.f18112b = locale;
        Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.f18113c = decimalStyle;
        Objects.requireNonNull(b0Var, "resolverStyle");
        this.f18114d = b0Var;
        this.f18115e = chronology;
        this.f18116f = zoneId;
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.f18113c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.f18111a, this.f18112b, decimalStyle, this.f18114d, this.f18115e, this.f18116f);
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        if (Objects.equals(this.f18115e, chronology)) {
            return this;
        }
        return new DateTimeFormatter(this.f18111a, this.f18112b, this.f18113c, this.f18114d, chronology, this.f18116f);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f18116f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.f18111a, this.f18112b, this.f18113c, this.f18114d, this.f18115e, zoneId);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb2 = new StringBuilder(32);
        C3434d c3434d = this.f18111a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            c3434d.mo7963t(new C3453w(temporalAccessor, this), sb2);
            return sb2.toString();
        } catch (IOException e2) {
            throw new C3401c(e2.getMessage(), e2);
        }
    }

    /* renamed from: a */
    public final Object m7937a(CharSequence charSequence, C3429e c3429e) {
        String string;
        Objects.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        try {
            return m7938b(charSequence).mo7808d(c3429e);
        } catch (DateTimeParseException e2) {
            throw e2;
        } catch (RuntimeException e10) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e10.getMessage(), e10);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0270  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.format.a0 m7938b(java.lang.CharSequence r27) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.m7938b(java.lang.CharSequence):j$.time.format.a0");
    }

    public final String toString() {
        String string = this.f18111a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
