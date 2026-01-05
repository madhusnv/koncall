package h1;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.g */
/* loaded from: classes.dex */
public final class EnumC2776g {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2776g[] $VALUES;
    public static final EnumC2776g BoundReached = new EnumC2776g("BoundReached", 0);
    public static final EnumC2776g Finished = new EnumC2776g("Finished", 1);

    private static final /* synthetic */ EnumC2776g[] $values() {
        return new EnumC2776g[]{BoundReached, Finished};
    }

    static {
        EnumC2776g[] enumC2776gArr$values = $values();
        $VALUES = enumC2776gArr$values;
        $ENTRIES = b8.m11548b(enumC2776gArr$values);
    }

    private EnumC2776g(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2776g valueOf(String str) {
        return (EnumC2776g) Enum.valueOf(EnumC2776g.class, str);
    }

    public static EnumC2776g[] values() {
        return (EnumC2776g[]) $VALUES.clone();
    }
}
