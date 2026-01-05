package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.r */
/* loaded from: classes3.dex */
public final class EnumC3316r {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3316r[] $VALUES;
    private final String params;
    private final String title;
    public static final EnumC3316r Newest = new EnumC3316r("Newest", 0, "Newly Added", "createdDate");
    public static final EnumC3316r Modified = new EnumC3316r("Modified", 1, "Last Modified", "modifiedDate");
    public static final EnumC3316r AtoZ = new EnumC3316r("AtoZ", 2, "A to Z", "firstName");
    public static final EnumC3316r CallBackDate = new EnumC3316r("CallBackDate", 3, "Callback Date", "callBackDate");
    public static final EnumC3316r Reminder = new EnumC3316r("Reminder", 4, "Reminder", "reminderDate");

    private static final /* synthetic */ EnumC3316r[] $values() {
        return new EnumC3316r[]{Newest, Modified, AtoZ, CallBackDate, Reminder};
    }

    static {
        EnumC3316r[] enumC3316rArr$values = $values();
        $VALUES = enumC3316rArr$values;
        $ENTRIES = b8.m11548b(enumC3316rArr$values);
    }

    private EnumC3316r(String str, int i10, String str2, String str3) {
        this.title = str2;
        this.params = str3;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3316r valueOf(String str) {
        return (EnumC3316r) Enum.valueOf(EnumC3316r.class, str);
    }

    public static EnumC3316r[] values() {
        return (EnumC3316r[]) $VALUES.clone();
    }

    public final String getParams() {
        return this.params;
    }

    public final String getTitle() {
        return this.title;
    }
}
