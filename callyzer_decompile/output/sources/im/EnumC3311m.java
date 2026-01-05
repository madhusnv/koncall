package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.m */
/* loaded from: classes3.dex */
public final class EnumC3311m {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3311m[] $VALUES;
    public static final EnumC3311m NONE = new EnumC3311m("NONE", 0);
    public static final EnumC3311m SERVER_ISSUE = new EnumC3311m("SERVER_ISSUE", 1);
    public static final EnumC3311m SUBSCRIPTION_ISSUE = new EnumC3311m("SUBSCRIPTION_ISSUE", 2);
    public static final EnumC3311m OTHER_ISSUE = new EnumC3311m("OTHER_ISSUE", 3);

    private static final /* synthetic */ EnumC3311m[] $values() {
        return new EnumC3311m[]{NONE, SERVER_ISSUE, SUBSCRIPTION_ISSUE, OTHER_ISSUE};
    }

    static {
        EnumC3311m[] enumC3311mArr$values = $values();
        $VALUES = enumC3311mArr$values;
        $ENTRIES = b8.m11548b(enumC3311mArr$values);
    }

    private EnumC3311m(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3311m valueOf(String str) {
        return (EnumC3311m) Enum.valueOf(EnumC3311m.class, str);
    }

    public static EnumC3311m[] values() {
        return (EnumC3311m[]) $VALUES.clone();
    }
}
