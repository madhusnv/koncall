package v3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 InMeasureBlock = new e0("InMeasureBlock", 0);
    public static final e0 InLayoutBlock = new e0("InLayoutBlock", 1);
    public static final e0 NotUsed = new e0("NotUsed", 2);

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{InMeasureBlock, InLayoutBlock, NotUsed};
    }

    static {
        e0[] e0VarArr$values = $values();
        $VALUES = e0VarArr$values;
        $ENTRIES = b8.m11548b(e0VarArr$values);
    }

    private e0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
