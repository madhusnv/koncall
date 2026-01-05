package av;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: av.c */
/* loaded from: classes3.dex */
public final class EnumC0460c {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0460c[] $VALUES;
    public static final EnumC0460c NotProcessed = new EnumC0460c("NotProcessed", 0);
    public static final EnumC0460c Saved = new EnumC0460c("Saved", 1);
    public static final EnumC0460c Error = new EnumC0460c("Error", 2);
    public static final EnumC0460c NotApplicable = new EnumC0460c("NotApplicable", 3);

    private static final /* synthetic */ EnumC0460c[] $values() {
        return new EnumC0460c[]{NotProcessed, Saved, Error, NotApplicable};
    }

    static {
        EnumC0460c[] enumC0460cArr$values = $values();
        $VALUES = enumC0460cArr$values;
        $ENTRIES = b8.m11548b(enumC0460cArr$values);
    }

    private EnumC0460c(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0460c valueOf(String str) {
        return (EnumC0460c) Enum.valueOf(EnumC0460c.class, str);
    }

    public static EnumC0460c[] values() {
        return (EnumC0460c[]) $VALUES.clone();
    }
}
