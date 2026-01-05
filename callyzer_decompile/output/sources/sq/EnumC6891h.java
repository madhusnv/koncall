package sq;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sq.h */
/* loaded from: classes3.dex */
public final class EnumC6891h {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6891h[] $VALUES;
    public static final EnumC6891h LR = new EnumC6891h("LR", 0);
    public static final EnumC6891h RL = new EnumC6891h("RL", 1);

    private static final /* synthetic */ EnumC6891h[] $values() {
        return new EnumC6891h[]{LR, RL};
    }

    static {
        EnumC6891h[] enumC6891hArr$values = $values();
        $VALUES = enumC6891hArr$values;
        $ENTRIES = b8.m11548b(enumC6891hArr$values);
    }

    private EnumC6891h(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6891h valueOf(String str) {
        return (EnumC6891h) Enum.valueOf(EnumC6891h.class, str);
    }

    public static EnumC6891h[] values() {
        return (EnumC6891h[]) $VALUES.clone();
    }
}
