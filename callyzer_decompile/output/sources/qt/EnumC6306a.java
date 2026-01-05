package qt;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qt.a */
/* loaded from: classes3.dex */
public final class EnumC6306a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6306a[] $VALUES;
    public static final EnumC6306a FROM_LEAD = new EnumC6306a("FROM_LEAD", 0, "lead");
    public static final EnumC6306a FROM_MORE = new EnumC6306a("FROM_MORE", 1, "more");
    private final String token;

    private static final /* synthetic */ EnumC6306a[] $values() {
        return new EnumC6306a[]{FROM_LEAD, FROM_MORE};
    }

    static {
        EnumC6306a[] enumC6306aArr$values = $values();
        $VALUES = enumC6306aArr$values;
        $ENTRIES = b8.m11548b(enumC6306aArr$values);
    }

    private EnumC6306a(String str, int i10, String str2) {
        this.token = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6306a valueOf(String str) {
        return (EnumC6306a) Enum.valueOf(EnumC6306a.class, str);
    }

    public static EnumC6306a[] values() {
        return (EnumC6306a[]) $VALUES.clone();
    }

    public final String getToken() {
        return this.token;
    }
}
