package p001o;

import com.amplifyframework.core.model.temporal.Temporal;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes2.dex */
public abstract class e91 {
    /* renamed from: a */
    public static Temporal.Time m24530a(String str) {
        try {
            return new Temporal.Time(DateTimeFormatter.ofPattern("hh:mm:ss.SSS").format(DateTimeFormatter.ofPattern("hh:mm a").parse(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m24531b(Temporal.Time time) {
        return time.format();
    }

    /* renamed from: c */
    public static String m24532c(Temporal.Time time) {
        try {
            final DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("hh:mm a");
            Optional map = Optional.ofNullable(time).map(new bd()).map(new Function() { // from class: o.c91
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return LocalTime.parse((String) obj);
                }
            });
            Objects.requireNonNull(dateTimeFormatterOfPattern);
            return (String) map.map(new Function() { // from class: o.d91
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return dateTimeFormatterOfPattern.format((LocalTime) obj);
                }
            }).orElse("--");
        } catch (Exception unused) {
            return "--";
        }
    }
}
