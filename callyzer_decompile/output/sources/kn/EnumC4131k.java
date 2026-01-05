package kn;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.k */
/* loaded from: classes3.dex */
public final class EnumC4131k {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4131k[] $VALUES;
    public static final EnumC4131k START = new EnumC4131k("START", 0);
    public static final EnumC4131k PROGRESS = new EnumC4131k("PROGRESS", 1);
    public static final EnumC4131k ERROR = new EnumC4131k("ERROR", 2);
    public static final EnumC4131k SUCCESS = new EnumC4131k("SUCCESS", 3);

    private static final /* synthetic */ EnumC4131k[] $values() {
        return new EnumC4131k[]{START, PROGRESS, ERROR, SUCCESS};
    }

    static {
        EnumC4131k[] enumC4131kArr$values = $values();
        $VALUES = enumC4131kArr$values;
        $ENTRIES = b8.m11548b(enumC4131kArr$values);
    }

    private EnumC4131k(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4131k valueOf(String str) {
        return (EnumC4131k) Enum.valueOf(EnumC4131k.class, str);
    }

    public static EnumC4131k[] values() {
        return (EnumC4131k[]) $VALUES.clone();
    }
}
