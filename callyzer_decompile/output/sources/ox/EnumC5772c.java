package ox;

import java.util.concurrent.TimeUnit;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ox.c */
/* loaded from: classes3.dex */
public final class EnumC5772c {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC5772c[] $VALUES;
    private final TimeUnit timeUnit;
    public static final EnumC5772c NANOSECONDS = new EnumC5772c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final EnumC5772c MICROSECONDS = new EnumC5772c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final EnumC5772c MILLISECONDS = new EnumC5772c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final EnumC5772c SECONDS = new EnumC5772c("SECONDS", 3, TimeUnit.SECONDS);
    public static final EnumC5772c MINUTES = new EnumC5772c("MINUTES", 4, TimeUnit.MINUTES);
    public static final EnumC5772c HOURS = new EnumC5772c("HOURS", 5, TimeUnit.HOURS);
    public static final EnumC5772c DAYS = new EnumC5772c("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ EnumC5772c[] $values() {
        return new EnumC5772c[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        EnumC5772c[] enumC5772cArr$values = $values();
        $VALUES = enumC5772cArr$values;
        $ENTRIES = b8.m11548b(enumC5772cArr$values);
    }

    private EnumC5772c(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5772c valueOf(String str) {
        return (EnumC5772c) Enum.valueOf(EnumC5772c.class, str);
    }

    public static EnumC5772c[] values() {
        return (EnumC5772c[]) $VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
