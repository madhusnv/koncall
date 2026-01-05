package im;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.y */
/* loaded from: classes3.dex */
public final class EnumC3323y {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3323y[] $VALUES;
    public static final EnumC3323y LEAD_DETAILS_SCREEN = new EnumC3323y("LEAD_DETAILS_SCREEN", 0, "lead_details_screen", "lead_details_screen/{call_screen}/{leadPhoneNumber}/{simNumbers}/{leadId}");
    private final String popUpRoute;
    private final String route;

    private static final /* synthetic */ EnumC3323y[] $values() {
        return new EnumC3323y[]{LEAD_DETAILS_SCREEN};
    }

    static {
        EnumC3323y[] enumC3323yArr$values = $values();
        $VALUES = enumC3323yArr$values;
        $ENTRIES = b8.m11548b(enumC3323yArr$values);
    }

    private EnumC3323y(String str, int i10, String str2, String str3) {
        this.route = str2;
        this.popUpRoute = str3;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3323y valueOf(String str) {
        return (EnumC3323y) Enum.valueOf(EnumC3323y.class, str);
    }

    public static EnumC3323y[] values() {
        return (EnumC3323y[]) $VALUES.clone();
    }

    public final String getPopUpRoute() {
        return this.popUpRoute;
    }

    public final String getRoute() {
        return this.route;
    }
}
