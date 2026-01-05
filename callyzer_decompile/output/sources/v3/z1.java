package v3;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ z1[] $VALUES;
    public static final z1 ContinueTraversal = new z1("ContinueTraversal", 0);
    public static final z1 SkipSubtreeAndContinueTraversal = new z1("SkipSubtreeAndContinueTraversal", 1);
    public static final z1 CancelTraversal = new z1("CancelTraversal", 2);

    private static final /* synthetic */ z1[] $values() {
        return new z1[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
    }

    static {
        z1[] z1VarArr$values = $values();
        $VALUES = z1VarArr$values;
        $ENTRIES = b8.m11548b(z1VarArr$values);
    }

    private z1(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) $VALUES.clone();
    }
}
