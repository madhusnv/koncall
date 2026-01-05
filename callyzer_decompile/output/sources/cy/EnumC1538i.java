package cy;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cy.i */
/* loaded from: classes3.dex */
public final class EnumC1538i {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC1538i[] $VALUES;
    public static final EnumC1538i SUCCESSFUL = new EnumC1538i("SUCCESSFUL", 0);
    public static final EnumC1538i REREGISTER = new EnumC1538i("REREGISTER", 1);
    public static final EnumC1538i CANCELLED = new EnumC1538i("CANCELLED", 2);
    public static final EnumC1538i ALREADY_SELECTED = new EnumC1538i("ALREADY_SELECTED", 3);

    private static final /* synthetic */ EnumC1538i[] $values() {
        return new EnumC1538i[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    static {
        EnumC1538i[] enumC1538iArr$values = $values();
        $VALUES = enumC1538iArr$values;
        $ENTRIES = b8.m11548b(enumC1538iArr$values);
    }

    private EnumC1538i(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC1538i valueOf(String str) {
        return (EnumC1538i) Enum.valueOf(EnumC1538i.class, str);
    }

    public static EnumC1538i[] values() {
        return (EnumC1538i[]) $VALUES.clone();
    }
}
