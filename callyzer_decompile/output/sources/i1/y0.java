package i1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;
    public static final y0 Default = new y0("Default", 0);
    public static final y0 UserInput = new y0("UserInput", 1);
    public static final y0 PreventUserInput = new y0("PreventUserInput", 2);

    private static final /* synthetic */ y0[] $values() {
        return new y0[]{Default, UserInput, PreventUserInput};
    }

    static {
        y0[] y0VarArr$values = $values();
        $VALUES = y0VarArr$values;
        $ENTRIES = b8.m11548b(y0VarArr$values);
    }

    private y0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }
}
