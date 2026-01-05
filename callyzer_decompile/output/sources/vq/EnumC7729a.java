package vq;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vq.a */
/* loaded from: classes3.dex */
public final class EnumC7729a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7729a[] $VALUES;
    private final int index;
    private final String text;
    public static final EnumC7729a Today = new EnumC7729a("Today", 0, "Today", 0);
    public static final EnumC7729a Yesterday = new EnumC7729a("Yesterday", 1, "Yesterday", 1);
    public static final EnumC7729a Week = new EnumC7729a("Week", 2, "Week", 2);
    public static final EnumC7729a Month = new EnumC7729a("Month", 3, "Month", 3);
    public static final EnumC7729a Year = new EnumC7729a("Year", 4, "Year", 4);
    public static final EnumC7729a Custom = new EnumC7729a("Custom", 5, "Custom", 5);
    public static final EnumC7729a AllTime = new EnumC7729a("AllTime", 6, "All Time", 6);

    private static final /* synthetic */ EnumC7729a[] $values() {
        return new EnumC7729a[]{Today, Yesterday, Week, Month, Year, Custom, AllTime};
    }

    static {
        EnumC7729a[] enumC7729aArr$values = $values();
        $VALUES = enumC7729aArr$values;
        $ENTRIES = b8.m11548b(enumC7729aArr$values);
    }

    private EnumC7729a(String str, int i10, String str2, int i11) {
        this.text = str2;
        this.index = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7729a valueOf(String str) {
        return (EnumC7729a) Enum.valueOf(EnumC7729a.class, str);
    }

    public static EnumC7729a[] values() {
        return (EnumC7729a[]) $VALUES.clone();
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getText() {
        return this.text;
    }
}
