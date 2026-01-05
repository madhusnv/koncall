package nc;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nc.l */
/* loaded from: classes.dex */
public final class EnumC5001l {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC5001l[] $VALUES;
    public static final EnumC5001l NOT_INITIALIZED = new EnumC5001l("NOT_INITIALIZED", 0);
    public static final EnumC5001l INITIALIZED = new EnumC5001l("INITIALIZED", 1);
    public static final EnumC5001l EXPLICIT_CONFIG = new EnumC5001l("EXPLICIT_CONFIG", 2);
    public static final EnumC5001l EXPLICIT_ENGINE = new EnumC5001l("EXPLICIT_ENGINE", 3);

    private static final /* synthetic */ EnumC5001l[] $values() {
        return new EnumC5001l[]{NOT_INITIALIZED, INITIALIZED, EXPLICIT_CONFIG, EXPLICIT_ENGINE};
    }

    static {
        EnumC5001l[] enumC5001lArr$values = $values();
        $VALUES = enumC5001lArr$values;
        $ENTRIES = b8.m11548b(enumC5001lArr$values);
    }

    private EnumC5001l(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5001l valueOf(String str) {
        return (EnumC5001l) Enum.valueOf(EnumC5001l.class, str);
    }

    public static EnumC5001l[] values() {
        return (EnumC5001l[]) $VALUES.clone();
    }
}
