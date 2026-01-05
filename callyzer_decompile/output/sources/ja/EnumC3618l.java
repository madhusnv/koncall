package ja;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.l */
/* loaded from: classes.dex */
public final class EnumC3618l {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3618l[] $VALUES;
    public static final EnumC3618l PROFILE = new EnumC3618l("PROFILE", 0);
    public static final EnumC3618l SSO_SESSION = new EnumC3618l("SSO_SESSION", 1);
    public static final EnumC3618l SERVICES = new EnumC3618l("SERVICES", 2);
    public static final EnumC3618l UNKNOWN = new EnumC3618l("UNKNOWN", 3);

    private static final /* synthetic */ EnumC3618l[] $values() {
        return new EnumC3618l[]{PROFILE, SSO_SESSION, SERVICES, UNKNOWN};
    }

    static {
        EnumC3618l[] enumC3618lArr$values = $values();
        $VALUES = enumC3618lArr$values;
        $ENTRIES = b8.m11548b(enumC3618lArr$values);
    }

    private EnumC3618l(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3618l valueOf(String str) {
        return (EnumC3618l) Enum.valueOf(EnumC3618l.class, str);
    }

    public static EnumC3618l[] values() {
        return (EnumC3618l[]) $VALUES.clone();
    }
}
