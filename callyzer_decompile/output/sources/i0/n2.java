package i0;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n2 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ n2[] $VALUES;
    public static final n2 PRIV = new n2("PRIV", 0);
    public static final n2 YUV = new n2("YUV", 1);
    public static final n2 JPEG = new n2("JPEG", 2);
    public static final n2 JPEG_R = new n2("JPEG_R", 3);
    public static final n2 RAW = new n2("RAW", 4);

    private static final /* synthetic */ n2[] $values() {
        return new n2[]{PRIV, YUV, JPEG, JPEG_R, RAW};
    }

    static {
        n2[] n2VarArr$values = $values();
        $VALUES = n2VarArr$values;
        $ENTRIES = b8.m11548b(n2VarArr$values);
    }

    private n2(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static n2 valueOf(String str) {
        return (n2) Enum.valueOf(n2.class, str);
    }

    public static n2[] values() {
        return (n2[]) $VALUES.clone();
    }
}
