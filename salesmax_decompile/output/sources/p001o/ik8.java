package p001o;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public abstract class ik8 {
    /* renamed from: c */
    public static final DateTimeFormatter m32247c() {
        Map<Long, String> mapM32684k = isa.m32684k(vyh.m53620a(1L, "Mon"), vyh.m53620a(2L, "Tue"), vyh.m53620a(3L, "Wed"), vyh.m53620a(4L, "Thu"), vyh.m53620a(5L, "Fri"), vyh.m53620a(6L, "Sat"), vyh.m53620a(7L, "Sun"));
        DateTimeFormatter dateTimeFormatterWithChronology = new DateTimeFormatterBuilder().parseCaseInsensitive().parseLenient().optionalStart().appendText(ChronoField.DAY_OF_WEEK, mapM32684k).appendLiteral(", ").optionalEnd().appendValue(ChronoField.DAY_OF_MONTH, 2, 2, SignStyle.NOT_NEGATIVE).appendLiteral(TokenParser.SP).appendText(ChronoField.MONTH_OF_YEAR, isa.m32684k(vyh.m53620a(1L, "Jan"), vyh.m53620a(2L, "Feb"), vyh.m53620a(3L, "Mar"), vyh.m53620a(4L, "Apr"), vyh.m53620a(5L, "May"), vyh.m53620a(6L, "Jun"), vyh.m53620a(7L, "Jul"), vyh.m53620a(8L, "Aug"), vyh.m53620a(9L, "Sep"), vyh.m53620a(10L, "Oct"), vyh.m53620a(11L, "Nov"), vyh.m53620a(12L, "Dec"))).appendLiteral(TokenParser.SP).appendValue(ChronoField.YEAR, 4).appendLiteral(TokenParser.SP).appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral(':').appendValue(ChronoField.MINUTE_OF_HOUR, 2).optionalStart().appendLiteral(':').appendValue(ChronoField.SECOND_OF_MINUTE, 2).optionalEnd().appendLiteral(TokenParser.SP).appendOffset("+HHMM", "GMT").toFormatter().withChronology(IsoChronology.INSTANCE);
        sq8.m48648g(dateTimeFormatterWithChronology, "withChronology(...)");
        return dateTimeFormatterWithChronology;
    }

    /* renamed from: d */
    public static final gk8 m32248d(fxc fxcVar) {
        List listM21249n = (fxcVar.m27713b() == 24 && fxcVar.m27714c() == 0 && fxcVar.m27718g() == 0) ? ch3.m21249n(1, 0, 0, 0) : (fxcVar.m27713b() == 23 && fxcVar.m27714c() == 59 && fxcVar.m27718g() == 60) ? ch3.m21249n(0, 23, 59, 59) : ch3.m21249n(0, Integer.valueOf(fxcVar.m27713b()), Integer.valueOf(fxcVar.m27714c()), Integer.valueOf(fxcVar.m27718g()));
        Instant instant = LocalDateTime.of(fxcVar.m27719h(), fxcVar.m27715d(), fxcVar.m27712a(), ((Number) listM21249n.get(1)).intValue(), ((Number) listM21249n.get(2)).intValue(), ((Number) listM21249n.get(3)).intValue(), fxcVar.m27716e()).plusDays(((Number) listM21249n.get(0)).intValue()).atOffset(ZoneOffset.ofTotalSeconds(fxcVar.m27717f())).toInstant();
        sq8.m48646e(instant);
        return new gk8(instant);
    }
}
