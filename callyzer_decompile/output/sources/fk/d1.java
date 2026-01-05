package fk;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 GENERAL = new d1("GENERAL", 0);
    public static final d1 FALLBACK = new d1("FALLBACK", 1);

    private static final /* synthetic */ d1[] $values() {
        return new d1[]{GENERAL, FALLBACK};
    }

    static {
        d1[] d1VarArr$values = $values();
        $VALUES = d1VarArr$values;
        $ENTRIES = b8.m11548b(d1VarArr$values);
    }

    private d1(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }
}
