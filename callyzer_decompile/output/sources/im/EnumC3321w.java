package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.w */
/* loaded from: classes3.dex */
public final class EnumC3321w {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3321w[] $VALUES;
    public static final EnumC3321w CALL_SYNC = new EnumC3321w("CALL_SYNC", 0);
    public static final EnumC3321w NOTE_POPUP = new EnumC3321w("NOTE_POPUP", 1);

    private static final /* synthetic */ EnumC3321w[] $values() {
        return new EnumC3321w[]{CALL_SYNC, NOTE_POPUP};
    }

    static {
        EnumC3321w[] enumC3321wArr$values = $values();
        $VALUES = enumC3321wArr$values;
        $ENTRIES = b8.m11548b(enumC3321wArr$values);
    }

    private EnumC3321w(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3321w valueOf(String str) {
        return (EnumC3321w) Enum.valueOf(EnumC3321w.class, str);
    }

    public static EnumC3321w[] values() {
        return (EnumC3321w[]) $VALUES.clone();
    }
}
