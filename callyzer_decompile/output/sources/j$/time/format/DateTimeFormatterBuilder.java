package j$.time.format;

import j$.time.C3429e;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.AbstractC3478h;
import j$.time.temporal.AbstractC3480j;
import j$.time.temporal.ChronoField;
import j$.time.temporal.EnumC3476f;
import j$.time.temporal.TemporalField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {

    /* renamed from: h */
    public static final C3429e f18117h = new C3429e(3);

    /* renamed from: i */
    public static final Map f18118i;

    /* renamed from: a */
    public DateTimeFormatterBuilder f18119a;

    /* renamed from: b */
    public final DateTimeFormatterBuilder f18120b;

    /* renamed from: c */
    public final List f18121c;

    /* renamed from: d */
    public final boolean f18122d;

    /* renamed from: e */
    public int f18123e;

    /* renamed from: f */
    public char f18124f;

    /* renamed from: g */
    public int f18125g;

    static {
        HashMap map = new HashMap();
        f18118i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        EnumC3476f enumC3476f = AbstractC3478h.f18266a;
        map.put('Q', enumC3476f);
        map.put('q', enumC3476f);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', AbstractC3480j.f18274a);
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat dateTimeInstance;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            dateTimeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else if (formatStyle == null) {
            dateTimeInstance = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (dateTimeInstance instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
            if (pattern == null) {
                return null;
            }
            int i10 = 0;
            boolean z6 = pattern.indexOf(66) != -1;
            boolean z10 = pattern.indexOf(98) != -1;
            if (!z6 && !z10) {
                return pattern;
            }
            StringBuilder sb2 = new StringBuilder(pattern.length());
            char c2 = ' ';
            while (i10 < pattern.length()) {
                char cCharAt = pattern.charAt(i10);
                if (cCharAt != ' ') {
                    if (cCharAt != 'B' && cCharAt != 'b') {
                        sb2.append(cCharAt);
                    }
                } else if (i10 == 0 || (c2 != 'B' && c2 != 'b')) {
                    sb2.append(cCharAt);
                }
                i10++;
                c2 = cCharAt;
            }
            int length = sb2.length() - 1;
            if (length >= 0 && sb2.charAt(length) == ' ') {
                sb2.deleteCharAt(length);
            }
            return sb2.toString();
        }
        throw new UnsupportedOperationException("Can't determine pattern from " + dateTimeInstance);
    }

    public DateTimeFormatterBuilder() {
        this.f18119a = this;
        this.f18121c = new ArrayList();
        this.f18125g = -1;
        this.f18120b = null;
        this.f18122d = false;
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f18119a = this;
        this.f18121c = new ArrayList();
        this.f18125g = -1;
        this.f18120b = dateTimeFormatterBuilder;
        this.f18122d = true;
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        m7941c(EnumC3446p.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder parseLenient() {
        m7941c(EnumC3446p.LENIENT);
        return this;
    }

    /* renamed from: h */
    public final void m7946h(TemporalField temporalField) {
        m7945g(new C3439i(temporalField, 1, 19, SignStyle.NORMAL));
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10) {
        Objects.requireNonNull(temporalField, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        }
        m7945g(new C3439i(temporalField, i10, i10, SignStyle.NOT_NEGATIVE));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10, int i11, SignStyle signStyle) {
        if (i10 == i11 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i11);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
        m7945g(new C3439i(temporalField, i10, i11, signStyle));
        return this;
    }

    /* renamed from: g */
    public final void m7945g(C3439i c3439i) {
        C3439i c3439iMo7965d;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f18119a;
        int i10 = dateTimeFormatterBuilder.f18125g;
        if (i10 < 0) {
            dateTimeFormatterBuilder.f18125g = m7941c(c3439i);
            return;
        }
        C3439i c3439i2 = (C3439i) ((ArrayList) dateTimeFormatterBuilder.f18121c).get(i10);
        int i11 = c3439i.f18161b;
        int i12 = c3439i.f18162c;
        if (i11 == i12 && c3439i.f18163d == SignStyle.NOT_NEGATIVE) {
            c3439iMo7965d = c3439i2.mo7966e(i12);
            m7941c(c3439i.mo7965d());
            this.f18119a.f18125g = i10;
        } else {
            c3439iMo7965d = c3439i2.mo7965d();
            this.f18119a.f18125g = m7941c(c3439i);
        }
        ((ArrayList) this.f18119a.f18121c).set(i10, c3439iMo7965d);
    }

    /* renamed from: b */
    public final void m7940b(ChronoField chronoField, int i10, int i11, boolean z6) {
        if (i10 == i11 && !z6) {
            m7945g(new C3436f(chronoField, i10, i11, z6));
        } else {
            m7941c(new C3436f(chronoField, i10, i11, z6));
        }
    }

    /* renamed from: f */
    public final void m7944f(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        m7941c(new C3447q(temporalField, textStyle, C3456z.f18218c));
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, Map<Long, String> map) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        m7941c(new C3447q(temporalField, textStyle, new C3431a(new C3455y(Collections.singletonMap(textStyle, linkedHashMap)))));
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        m7941c(new C3440j(str, str2));
        return this;
    }

    /* renamed from: d */
    public final void m7942d(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        m7941c(new C3438h(textStyle, 0));
    }

    public DateTimeFormatterBuilder appendLiteral(char c2) {
        m7941c(new C3433c(c2));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        Objects.requireNonNull(str, "literal");
        if (!str.isEmpty()) {
            if (str.length() == 1) {
                m7941c(new C3433c(str.charAt(0)));
                return this;
            }
            m7941c(new C3438h(str, 1));
        }
        return this;
    }

    /* renamed from: a */
    public final void m7939a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        C3434d c3434d = dateTimeFormatter.f18111a;
        if (c3434d.f18155b) {
            c3434d = new C3434d(c3434d.f18154a, false);
        }
        m7941c(c3434d);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0471 A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7943e(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.m7943e(java.lang.String):void");
    }

    public DateTimeFormatterBuilder optionalStart() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f18119a;
        dateTimeFormatterBuilder.f18125g = -1;
        this.f18119a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
        return this;
    }

    public DateTimeFormatterBuilder optionalEnd() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f18119a;
        if (dateTimeFormatterBuilder.f18120b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) dateTimeFormatterBuilder.f18121c).size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f18119a;
            C3434d c3434d = new C3434d(dateTimeFormatterBuilder2.f18121c, dateTimeFormatterBuilder2.f18122d);
            this.f18119a = this.f18119a.f18120b;
            m7941c(c3434d);
            return this;
        }
        this.f18119a = this.f18119a.f18120b;
        return this;
    }

    /* renamed from: c */
    public final int m7941c(InterfaceC3435e interfaceC3435e) {
        Objects.requireNonNull(interfaceC3435e, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f18119a;
        int i10 = dateTimeFormatterBuilder.f18123e;
        if (i10 > 0) {
            C3441k c3441k = new C3441k(interfaceC3435e, i10, dateTimeFormatterBuilder.f18124f);
            dateTimeFormatterBuilder.f18123e = 0;
            dateTimeFormatterBuilder.f18124f = (char) 0;
            interfaceC3435e = c3441k;
        }
        ((ArrayList) dateTimeFormatterBuilder.f18121c).add(interfaceC3435e);
        this.f18119a.f18125g = -1;
        return ((ArrayList) r5.f18121c).size() - 1;
    }

    public DateTimeFormatter toFormatter() {
        return m7948j(Locale.getDefault(), b0.SMART, null);
    }

    /* renamed from: i */
    public final DateTimeFormatter m7947i(b0 b0Var, IsoChronology isoChronology) {
        return m7948j(Locale.getDefault(), b0Var, isoChronology);
    }

    /* renamed from: j */
    public final DateTimeFormatter m7948j(Locale locale, b0 b0Var, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.f18119a.f18120b != null) {
            optionalEnd();
        }
        return new DateTimeFormatter(new C3434d(this.f18121c, false), locale, DecimalStyle.f18126d, b0Var, chronology, null);
    }
}
