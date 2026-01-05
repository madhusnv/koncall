package yd;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yd.e */
/* loaded from: classes.dex */
public final class EnumC8622e {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8622e[] $VALUES;
    public static final EnumC8622e MEMORY_CACHE = new EnumC8622e("MEMORY_CACHE", 0);
    public static final EnumC8622e MEMORY = new EnumC8622e("MEMORY", 1);
    public static final EnumC8622e DISK = new EnumC8622e("DISK", 2);
    public static final EnumC8622e NETWORK = new EnumC8622e("NETWORK", 3);

    private static final /* synthetic */ EnumC8622e[] $values() {
        return new EnumC8622e[]{MEMORY_CACHE, MEMORY, DISK, NETWORK};
    }

    static {
        EnumC8622e[] enumC8622eArr$values = $values();
        $VALUES = enumC8622eArr$values;
        $ENTRIES = b8.m11548b(enumC8622eArr$values);
    }

    private EnumC8622e(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8622e valueOf(String str) {
        return (EnumC8622e) Enum.valueOf(EnumC8622e.class, str);
    }

    public static EnumC8622e[] values() {
        return (EnumC8622e[]) $VALUES.clone();
    }
}
