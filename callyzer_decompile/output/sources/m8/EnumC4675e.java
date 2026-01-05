package m8;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m8.e */
/* loaded from: classes.dex */
public final class EnumC4675e {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4675e[] $VALUES;
    public static final EnumC4675e ON_CONFIGURE = new EnumC4675e("ON_CONFIGURE", 0);
    public static final EnumC4675e ON_CREATE = new EnumC4675e("ON_CREATE", 1);
    public static final EnumC4675e ON_UPGRADE = new EnumC4675e("ON_UPGRADE", 2);
    public static final EnumC4675e ON_DOWNGRADE = new EnumC4675e("ON_DOWNGRADE", 3);
    public static final EnumC4675e ON_OPEN = new EnumC4675e("ON_OPEN", 4);

    private static final /* synthetic */ EnumC4675e[] $values() {
        return new EnumC4675e[]{ON_CONFIGURE, ON_CREATE, ON_UPGRADE, ON_DOWNGRADE, ON_OPEN};
    }

    static {
        EnumC4675e[] enumC4675eArr$values = $values();
        $VALUES = enumC4675eArr$values;
        $ENTRIES = b8.m11548b(enumC4675eArr$values);
    }

    private EnumC4675e(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4675e valueOf(String str) {
        return (EnumC4675e) Enum.valueOf(EnumC4675e.class, str);
    }

    public static EnumC4675e[] values() {
        return (EnumC4675e[]) $VALUES.clone();
    }
}
