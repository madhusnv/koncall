package ud;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.q */
/* loaded from: classes.dex */
public final class EnumC7413q {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7413q[] $VALUES;
    public static final EnumC7413q NOT_INITIALIZED = new EnumC7413q("NOT_INITIALIZED", 0);
    public static final EnumC7413q INITIALIZED = new EnumC7413q("INITIALIZED", 1);
    public static final EnumC7413q EXPLICIT_CONFIG = new EnumC7413q("EXPLICIT_CONFIG", 2);
    public static final EnumC7413q EXPLICIT_INSTANCE = new EnumC7413q("EXPLICIT_INSTANCE", 3);

    private static final /* synthetic */ EnumC7413q[] $values() {
        return new EnumC7413q[]{NOT_INITIALIZED, INITIALIZED, EXPLICIT_CONFIG, EXPLICIT_INSTANCE};
    }

    static {
        EnumC7413q[] enumC7413qArr$values = $values();
        $VALUES = enumC7413qArr$values;
        $ENTRIES = b8.m11548b(enumC7413qArr$values);
    }

    private EnumC7413q(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7413q valueOf(String str) {
        return (EnumC7413q) Enum.valueOf(EnumC7413q.class, str);
    }

    public static EnumC7413q[] values() {
        return (EnumC7413q[]) $VALUES.clone();
    }
}
