package p001o;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class o16 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ o16[] $VALUES;
    private final TimeUnit timeUnit;
    public static final o16 NANOSECONDS = new o16("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final o16 MICROSECONDS = new o16("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final o16 MILLISECONDS = new o16("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final o16 SECONDS = new o16("SECONDS", 3, TimeUnit.SECONDS);
    public static final o16 MINUTES = new o16("MINUTES", 4, TimeUnit.MINUTES);
    public static final o16 HOURS = new o16("HOURS", 5, TimeUnit.HOURS);
    public static final o16 DAYS = new o16("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ o16[] $values() {
        return new o16[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        o16[] o16VarArr$values = $values();
        $VALUES = o16VarArr$values;
        $ENTRIES = hi6.m30609a(o16VarArr$values);
    }

    private o16(String str, int i, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static o16 valueOf(String str) {
        return (o16) Enum.valueOf(o16.class, str);
    }

    public static o16[] values() {
        return (o16[]) $VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
