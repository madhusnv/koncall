package pu;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pu.g */
/* loaded from: classes3.dex */
public final class EnumC6039g {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6039g[] $VALUES;
    public static final EnumC6039g PENDING = new EnumC6039g("PENDING", 0);
    public static final EnumC6039g WORKING = new EnumC6039g("WORKING", 1);
    public static final EnumC6039g SUCCESS = new EnumC6039g("SUCCESS", 2);
    public static final EnumC6039g ERROR = new EnumC6039g("ERROR", 3);

    private static final /* synthetic */ EnumC6039g[] $values() {
        return new EnumC6039g[]{PENDING, WORKING, SUCCESS, ERROR};
    }

    static {
        EnumC6039g[] enumC6039gArr$values = $values();
        $VALUES = enumC6039gArr$values;
        $ENTRIES = b8.m11548b(enumC6039gArr$values);
    }

    private EnumC6039g(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6039g valueOf(String str) {
        return (EnumC6039g) Enum.valueOf(EnumC6039g.class, str);
    }

    public static EnumC6039g[] values() {
        return (EnumC6039g[]) $VALUES.clone();
    }
}
