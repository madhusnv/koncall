package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.q */
/* loaded from: classes3.dex */
public final class EnumC3315q {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3315q[] $VALUES;
    private final String screenName;
    public static final EnumC3315q MyLead = new EnumC3315q("MyLead", 0, "my_lead");
    public static final EnumC3315q ScheduleLead = new EnumC3315q("ScheduleLead", 1, "schedule_lead");
    public static final EnumC3315q DueLead = new EnumC3315q("DueLead", 2, "due_lead");

    private static final /* synthetic */ EnumC3315q[] $values() {
        return new EnumC3315q[]{MyLead, ScheduleLead, DueLead};
    }

    static {
        EnumC3315q[] enumC3315qArr$values = $values();
        $VALUES = enumC3315qArr$values;
        $ENTRIES = b8.m11548b(enumC3315qArr$values);
    }

    private EnumC3315q(String str, int i10, String str2) {
        this.screenName = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3315q valueOf(String str) {
        return (EnumC3315q) Enum.valueOf(EnumC3315q.class, str);
    }

    public static EnumC3315q[] values() {
        return (EnumC3315q[]) $VALUES.clone();
    }

    public final String getScreenName() {
        return this.screenName;
    }
}
