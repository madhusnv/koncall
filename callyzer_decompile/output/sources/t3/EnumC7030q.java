package t3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t3.q */
/* loaded from: classes.dex */
public final class EnumC7030q {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7030q[] $VALUES;
    public static final EnumC7030q Width = new EnumC7030q("Width", 0);
    public static final EnumC7030q Height = new EnumC7030q("Height", 1);

    private static final /* synthetic */ EnumC7030q[] $values() {
        return new EnumC7030q[]{Width, Height};
    }

    static {
        EnumC7030q[] enumC7030qArr$values = $values();
        $VALUES = enumC7030qArr$values;
        $ENTRIES = b8.m11548b(enumC7030qArr$values);
    }

    private EnumC7030q(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7030q valueOf(String str) {
        return (EnumC7030q) Enum.valueOf(EnumC7030q.class, str);
    }

    public static EnumC7030q[] values() {
        return (EnumC7030q[]) $VALUES.clone();
    }
}
