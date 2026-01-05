package yv;

import com.websoptimization.callyzerbiz.R;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.j */
/* loaded from: classes3.dex */
public final class EnumC8795j {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8795j[] $VALUES;
    public static final C8794i Companion;
    private final long period;
    private final int periodName;
    public static final EnumC8795j _2_HOUR = new EnumC8795j("_2_HOUR", 0, R.string._2_hours, 120);
    public static final EnumC8795j _4_HOUR = new EnumC8795j("_4_HOUR", 1, R.string._4_hours, 240);
    public static final EnumC8795j _6_HOUR = new EnumC8795j("_6_HOUR", 2, R.string._6_hours, 360);
    public static final EnumC8795j _8_HOUR = new EnumC8795j("_8_HOUR", 3, R.string._8_hours, 480);
    public static final EnumC8795j _10_HOUR = new EnumC8795j("_10_HOUR", 4, R.string._10_hours, 600);
    public static final EnumC8795j _12_HOUR = new EnumC8795j("_12_HOUR", 5, R.string._12_hours, 720);

    private static final /* synthetic */ EnumC8795j[] $values() {
        return new EnumC8795j[]{_2_HOUR, _4_HOUR, _6_HOUR, _8_HOUR, _10_HOUR, _12_HOUR};
    }

    static {
        EnumC8795j[] enumC8795jArr$values = $values();
        $VALUES = enumC8795jArr$values;
        $ENTRIES = b8.m11548b(enumC8795jArr$values);
        Companion = new C8794i();
    }

    private EnumC8795j(String str, int i10, int i11, long j6) {
        this.periodName = i11;
        this.period = j6;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8795j valueOf(String str) {
        return (EnumC8795j) Enum.valueOf(EnumC8795j.class, str);
    }

    public static EnumC8795j[] values() {
        return (EnumC8795j[]) $VALUES.clone();
    }

    public final long getPeriod() {
        return this.period;
    }

    public final int getPeriodName() {
        return this.periodName;
    }
}
