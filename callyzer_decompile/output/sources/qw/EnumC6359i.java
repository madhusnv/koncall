package qw;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.i */
/* loaded from: classes3.dex */
public final class EnumC6359i {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6359i[] $VALUES;
    public static final EnumC6359i SYNCHRONIZED = new EnumC6359i("SYNCHRONIZED", 0);
    public static final EnumC6359i PUBLICATION = new EnumC6359i("PUBLICATION", 1);
    public static final EnumC6359i NONE = new EnumC6359i("NONE", 2);

    private static final /* synthetic */ EnumC6359i[] $values() {
        return new EnumC6359i[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        EnumC6359i[] enumC6359iArr$values = $values();
        $VALUES = enumC6359iArr$values;
        $ENTRIES = b8.m11548b(enumC6359iArr$values);
    }

    private EnumC6359i(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6359i valueOf(String str) {
        return (EnumC6359i) Enum.valueOf(EnumC6359i.class, str);
    }

    public static EnumC6359i[] values() {
        return (EnumC6359i[]) $VALUES.clone();
    }
}
