package l4;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 StartInput = new b0("StartInput", 0);
    public static final b0 StopInput = new b0("StopInput", 1);
    public static final b0 ShowKeyboard = new b0("ShowKeyboard", 2);
    public static final b0 HideKeyboard = new b0("HideKeyboard", 3);

    private static final /* synthetic */ b0[] $values() {
        return new b0[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
    }

    static {
        b0[] b0VarArr$values = $values();
        $VALUES = b0VarArr$values;
        $ENTRIES = b8.m11548b(b0VarArr$values);
    }

    private b0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
