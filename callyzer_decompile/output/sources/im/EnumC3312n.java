package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.n */
/* loaded from: classes3.dex */
public final class EnumC3312n {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3312n[] $VALUES;
    public static final EnumC3312n NONE = new EnumC3312n("NONE", 0);
    public static final EnumC3312n LEAD = new EnumC3312n("LEAD", 1);
    public static final EnumC3312n COPY = new EnumC3312n("COPY", 2);
    public static final EnumC3312n WHATSAPP = new EnumC3312n("WHATSAPP", 3);
    public static final EnumC3312n CALL = new EnumC3312n("CALL", 4);

    private static final /* synthetic */ EnumC3312n[] $values() {
        return new EnumC3312n[]{NONE, LEAD, COPY, WHATSAPP, CALL};
    }

    static {
        EnumC3312n[] enumC3312nArr$values = $values();
        $VALUES = enumC3312nArr$values;
        $ENTRIES = b8.m11548b(enumC3312nArr$values);
    }

    private EnumC3312n(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3312n valueOf(String str) {
        return (EnumC3312n) Enum.valueOf(EnumC3312n.class, str);
    }

    public static EnumC3312n[] values() {
        return (EnumC3312n[]) $VALUES.clone();
    }
}
