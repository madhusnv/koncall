package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.s */
/* loaded from: classes3.dex */
public final class EnumC3317s {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3317s[] $VALUES;
    public static final EnumC3317s FIRST_NAME = new EnumC3317s("FIRST_NAME", 0);
    public static final EnumC3317s LAST_NAME = new EnumC3317s("LAST_NAME", 1);
    public static final EnumC3317s MOBILE_NO = new EnumC3317s("MOBILE_NO", 2);
    public static final EnumC3317s SERIAL_NO = new EnumC3317s("SERIAL_NO", 3);
    public static final EnumC3317s CREATE_DATE = new EnumC3317s("CREATE_DATE", 4);
    public static final EnumC3317s REMINDER_DATE = new EnumC3317s("REMINDER_DATE", 5);
    public static final EnumC3317s NOT_CONNECTED_LEAD = new EnumC3317s("NOT_CONNECTED_LEAD", 6);
    public static final EnumC3317s STATUS = new EnumC3317s("STATUS", 7);
    public static final EnumC3317s TAGS = new EnumC3317s("TAGS", 8);
    public static final EnumC3317s SORTING = new EnumC3317s("SORTING", 9);
    public static final EnumC3317s NONE = new EnumC3317s("NONE", 10);

    private static final /* synthetic */ EnumC3317s[] $values() {
        return new EnumC3317s[]{FIRST_NAME, LAST_NAME, MOBILE_NO, SERIAL_NO, CREATE_DATE, REMINDER_DATE, NOT_CONNECTED_LEAD, STATUS, TAGS, SORTING, NONE};
    }

    static {
        EnumC3317s[] enumC3317sArr$values = $values();
        $VALUES = enumC3317sArr$values;
        $ENTRIES = b8.m11548b(enumC3317sArr$values);
    }

    private EnumC3317s(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3317s valueOf(String str) {
        return (EnumC3317s) Enum.valueOf(EnumC3317s.class, str);
    }

    public static EnumC3317s[] values() {
        return (EnumC3317s[]) $VALUES.clone();
    }
}
