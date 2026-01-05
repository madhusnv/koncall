package qt;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qt.c */
/* loaded from: classes3.dex */
public final class EnumC6308c {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6308c[] $VALUES;
    public static final EnumC6308c UpdateMessageTemplateData = new EnumC6308c("UpdateMessageTemplateData", 0);

    private static final /* synthetic */ EnumC6308c[] $values() {
        return new EnumC6308c[]{UpdateMessageTemplateData};
    }

    static {
        EnumC6308c[] enumC6308cArr$values = $values();
        $VALUES = enumC6308cArr$values;
        $ENTRIES = b8.m11548b(enumC6308cArr$values);
    }

    private EnumC6308c(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6308c valueOf(String str) {
        return (EnumC6308c) Enum.valueOf(EnumC6308c.class, str);
    }

    public static EnumC6308c[] values() {
        return (EnumC6308c[]) $VALUES.clone();
    }
}
