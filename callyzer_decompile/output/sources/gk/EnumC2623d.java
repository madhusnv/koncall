package gk;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gk.d */
/* loaded from: classes.dex */
public final class EnumC2623d {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2623d[] $VALUES;
    public static final EnumC2623d CRASHLYTICS = new EnumC2623d("CRASHLYTICS", 0);
    public static final EnumC2623d PERFORMANCE = new EnumC2623d("PERFORMANCE", 1);
    public static final EnumC2623d MATT_SAYS_HI = new EnumC2623d("MATT_SAYS_HI", 2);

    private static final /* synthetic */ EnumC2623d[] $values() {
        return new EnumC2623d[]{CRASHLYTICS, PERFORMANCE, MATT_SAYS_HI};
    }

    static {
        EnumC2623d[] enumC2623dArr$values = $values();
        $VALUES = enumC2623dArr$values;
        $ENTRIES = b8.m11548b(enumC2623dArr$values);
    }

    private EnumC2623d(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2623d valueOf(String str) {
        return (EnumC2623d) Enum.valueOf(EnumC2623d.class, str);
    }

    public static EnumC2623d[] values() {
        return (EnumC2623d[]) $VALUES.clone();
    }
}
