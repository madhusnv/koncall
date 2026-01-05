package kn;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.g */
/* loaded from: classes3.dex */
public final class EnumC4127g {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4127g[] $VALUES;
    public static final EnumC4127g Normal = new EnumC4127g("Normal", 0);
    public static final EnumC4127g Silent = new EnumC4127g("Silent", 1);
    public static final EnumC4127g Floating = new EnumC4127g("Floating", 2);

    private static final /* synthetic */ EnumC4127g[] $values() {
        return new EnumC4127g[]{Normal, Silent, Floating};
    }

    static {
        EnumC4127g[] enumC4127gArr$values = $values();
        $VALUES = enumC4127gArr$values;
        $ENTRIES = b8.m11548b(enumC4127gArr$values);
    }

    private EnumC4127g(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4127g valueOf(String str) {
        return (EnumC4127g) Enum.valueOf(EnumC4127g.class, str);
    }

    public static EnumC4127g[] values() {
        return (EnumC4127g[]) $VALUES.clone();
    }
}
