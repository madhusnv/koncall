package qt;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qt.b */
/* loaded from: classes3.dex */
public final class EnumC6307b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6307b[] $VALUES;
    public static final EnumC6307b NAVIGATE_TO_MESSAGE_SCREEN = new EnumC6307b("NAVIGATE_TO_MESSAGE_SCREEN", 0);
    public static final EnumC6307b SUBSCRIPTION_EXPAIRED = new EnumC6307b("SUBSCRIPTION_EXPAIRED", 1);

    private static final /* synthetic */ EnumC6307b[] $values() {
        return new EnumC6307b[]{NAVIGATE_TO_MESSAGE_SCREEN, SUBSCRIPTION_EXPAIRED};
    }

    static {
        EnumC6307b[] enumC6307bArr$values = $values();
        $VALUES = enumC6307bArr$values;
        $ENTRIES = b8.m11548b(enumC6307bArr$values);
    }

    private EnumC6307b(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6307b valueOf(String str) {
        return (EnumC6307b) Enum.valueOf(EnumC6307b.class, str);
    }

    public static EnumC6307b[] values() {
        return (EnumC6307b[]) $VALUES.clone();
    }
}
