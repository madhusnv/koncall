package ca;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.m */
/* loaded from: classes.dex */
public final class EnumC0941m {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0941m[] $VALUES;
    public static final EnumC0941m SOURCE_PROFILE = new EnumC0941m("SOURCE_PROFILE", 0);
    public static final EnumC0941m CREDENTIALS_SOURCE = new EnumC0941m("CREDENTIALS_SOURCE", 1);

    private static final /* synthetic */ EnumC0941m[] $values() {
        return new EnumC0941m[]{SOURCE_PROFILE, CREDENTIALS_SOURCE};
    }

    static {
        EnumC0941m[] enumC0941mArr$values = $values();
        $VALUES = enumC0941mArr$values;
        $ENTRIES = b8.m11548b(enumC0941mArr$values);
    }

    private EnumC0941m(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0941m valueOf(String str) {
        return (EnumC0941m) Enum.valueOf(EnumC0941m.class, str);
    }

    public static EnumC0941m[] values() {
        return (EnumC0941m[]) $VALUES.clone();
    }
}
