package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.p */
/* loaded from: classes3.dex */
public final class EnumC3314p {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3314p[] $VALUES;
    private final String leadCondition;
    public static final EnumC3314p Before = new EnumC3314p("Before", 0, "before");
    public static final EnumC3314p After = new EnumC3314p("After", 1, "after");
    public static final EnumC3314p Between = new EnumC3314p("Between", 2, "between");

    private static final /* synthetic */ EnumC3314p[] $values() {
        return new EnumC3314p[]{Before, After, Between};
    }

    static {
        EnumC3314p[] enumC3314pArr$values = $values();
        $VALUES = enumC3314pArr$values;
        $ENTRIES = b8.m11548b(enumC3314pArr$values);
    }

    private EnumC3314p(String str, int i10, String str2) {
        this.leadCondition = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3314p valueOf(String str) {
        return (EnumC3314p) Enum.valueOf(EnumC3314p.class, str);
    }

    public static EnumC3314p[] values() {
        return (EnumC3314p[]) $VALUES.clone();
    }

    public final String getLeadCondition() {
        return this.leadCondition;
    }
}
