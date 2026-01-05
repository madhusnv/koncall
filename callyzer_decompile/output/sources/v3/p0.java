package v3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 IsPlacedInLookahead = new p0("IsPlacedInLookahead", 0);
    public static final p0 IsPlacedInApproach = new p0("IsPlacedInApproach", 1);
    public static final p0 IsNotPlaced = new p0("IsNotPlaced", 2);

    private static final /* synthetic */ p0[] $values() {
        return new p0[]{IsPlacedInLookahead, IsPlacedInApproach, IsNotPlaced};
    }

    static {
        p0[] p0VarArr$values = $values();
        $VALUES = p0VarArr$values;
        $ENTRIES = b8.m11548b(p0VarArr$values);
    }

    private p0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}
