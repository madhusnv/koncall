package lx;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lx.o */
/* loaded from: classes3.dex */
public final class EnumC4576o {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4576o[] $VALUES;
    public static final EnumC4576o PUBLIC = new EnumC4576o("PUBLIC", 0);
    public static final EnumC4576o PROTECTED = new EnumC4576o("PROTECTED", 1);
    public static final EnumC4576o INTERNAL = new EnumC4576o("INTERNAL", 2);
    public static final EnumC4576o PRIVATE = new EnumC4576o("PRIVATE", 3);

    private static final /* synthetic */ EnumC4576o[] $values() {
        return new EnumC4576o[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    static {
        EnumC4576o[] enumC4576oArr$values = $values();
        $VALUES = enumC4576oArr$values;
        $ENTRIES = b8.m11548b(enumC4576oArr$values);
    }

    private EnumC4576o(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4576o valueOf(String str) {
        return (EnumC4576o) Enum.valueOf(EnumC4576o.class, str);
    }

    public static EnumC4576o[] values() {
        return (EnumC4576o[]) $VALUES.clone();
    }
}
