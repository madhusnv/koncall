package x1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 Cursor = new j0("Cursor", 0);
    public static final j0 SelectionStart = new j0("SelectionStart", 1);
    public static final j0 SelectionEnd = new j0("SelectionEnd", 2);

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{Cursor, SelectionStart, SelectionEnd};
    }

    static {
        j0[] j0VarArr$values = $values();
        $VALUES = j0VarArr$values;
        $ENTRIES = b8.m11548b(j0VarArr$values);
    }

    private j0(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
