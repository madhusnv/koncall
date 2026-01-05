package es;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: es.b */
/* loaded from: classes3.dex */
public final class EnumC2125b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2125b[] $VALUES;
    public static final EnumC2125b TypeSimple = new EnumC2125b("TypeSimple", 0);
    public static final EnumC2125b TypeChipList = new EnumC2125b("TypeChipList", 1);

    private static final /* synthetic */ EnumC2125b[] $values() {
        return new EnumC2125b[]{TypeSimple, TypeChipList};
    }

    static {
        EnumC2125b[] enumC2125bArr$values = $values();
        $VALUES = enumC2125bArr$values;
        $ENTRIES = b8.m11548b(enumC2125bArr$values);
    }

    private EnumC2125b(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2125b valueOf(String str) {
        return (EnumC2125b) Enum.valueOf(EnumC2125b.class, str);
    }

    public static EnumC2125b[] values() {
        return (EnumC2125b[]) $VALUES.clone();
    }
}
