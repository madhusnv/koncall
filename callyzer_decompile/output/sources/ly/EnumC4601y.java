package ly;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.y */
/* loaded from: classes3.dex */
public final class EnumC4601y {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4601y[] $VALUES;
    public final char begin;
    public final char end;
    public static final EnumC4601y OBJ = new EnumC4601y("OBJ", 0, '{', '}');
    public static final EnumC4601y LIST = new EnumC4601y("LIST", 1, '[', ']');
    public static final EnumC4601y MAP = new EnumC4601y("MAP", 2, '{', '}');
    public static final EnumC4601y POLY_OBJ = new EnumC4601y("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ EnumC4601y[] $values() {
        return new EnumC4601y[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    static {
        EnumC4601y[] enumC4601yArr$values = $values();
        $VALUES = enumC4601yArr$values;
        $ENTRIES = b8.m11548b(enumC4601yArr$values);
    }

    private EnumC4601y(String str, int i10, char c2, char c10) {
        this.begin = c2;
        this.end = c10;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4601y valueOf(String str) {
        return (EnumC4601y) Enum.valueOf(EnumC4601y.class, str);
    }

    public static EnumC4601y[] values() {
        return (EnumC4601y[]) $VALUES.clone();
    }
}
