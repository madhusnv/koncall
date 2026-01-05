package x1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 None = new k0("None", 0);
    public static final k0 Selection = new k0("Selection", 1);
    public static final k0 Cursor = new k0("Cursor", 2);

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{None, Selection, Cursor};
    }

    static {
        k0[] k0VarArr$values = $values();
        $VALUES = k0VarArr$values;
        $ENTRIES = b8.m11548b(k0VarArr$values);
    }

    private k0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
