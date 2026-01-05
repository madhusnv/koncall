package j$.time.temporal;

import j$.time.C3429e;
import j$.time.DayOfWeek;

/* loaded from: classes2.dex */
public final class TemporalAdjusters {
    public static TemporalAdjuster firstDayOfMonth() {
        return new C3429e(5);
    }

    public static TemporalAdjuster lastDayOfMonth() {
        return new C3429e(7);
    }

    public static TemporalAdjuster firstDayOfYear() {
        return new C3429e(6);
    }

    public static TemporalAdjuster lastDayOfYear() {
        return new C3429e(4);
    }

    public static TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek) {
        return new C3481k(dayOfWeek.getValue(), 0);
    }

    public static TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek) {
        return new C3481k(dayOfWeek.getValue(), 1);
    }
}
