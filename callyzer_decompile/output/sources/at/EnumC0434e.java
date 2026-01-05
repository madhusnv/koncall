package at;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: at.e */
/* loaded from: classes3.dex */
public final class EnumC0434e {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0434e[] $VALUES;
    public static final EnumC0434e CREATE_SCREEN = new EnumC0434e("CREATE_SCREEN", 0);
    public static final EnumC0434e EDIT_SCREEN = new EnumC0434e("EDIT_SCREEN", 1);
    public static final EnumC0434e CLONE_SCREEN = new EnumC0434e("CLONE_SCREEN", 2);

    private static final /* synthetic */ EnumC0434e[] $values() {
        return new EnumC0434e[]{CREATE_SCREEN, EDIT_SCREEN, CLONE_SCREEN};
    }

    static {
        EnumC0434e[] enumC0434eArr$values = $values();
        $VALUES = enumC0434eArr$values;
        $ENTRIES = b8.m11548b(enumC0434eArr$values);
    }

    private EnumC0434e(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0434e valueOf(String str) {
        return (EnumC0434e) Enum.valueOf(EnumC0434e.class, str);
    }

    public static EnumC0434e[] values() {
        return (EnumC0434e[]) $VALUES.clone();
    }
}
