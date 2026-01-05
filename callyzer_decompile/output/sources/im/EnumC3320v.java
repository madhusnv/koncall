package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.v */
/* loaded from: classes3.dex */
public final class EnumC3320v {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3320v[] $VALUES;
    public static final EnumC3320v SCHEDULE_HOUR_SYNC = new EnumC3320v("SCHEDULE_HOUR_SYNC", 0);
    public static final EnumC3320v IDEAL_SYNC = new EnumC3320v("IDEAL_SYNC", 1);
    public static final EnumC3320v JUST_SYNC = new EnumC3320v("JUST_SYNC", 2);

    private static final /* synthetic */ EnumC3320v[] $values() {
        return new EnumC3320v[]{SCHEDULE_HOUR_SYNC, IDEAL_SYNC, JUST_SYNC};
    }

    static {
        EnumC3320v[] enumC3320vArr$values = $values();
        $VALUES = enumC3320vArr$values;
        $ENTRIES = b8.m11548b(enumC3320vArr$values);
    }

    private EnumC3320v(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3320v valueOf(String str) {
        return (EnumC3320v) Enum.valueOf(EnumC3320v.class, str);
    }

    public static EnumC3320v[] values() {
        return (EnumC3320v[]) $VALUES.clone();
    }
}
