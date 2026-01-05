package i9;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.o */
/* loaded from: classes.dex */
public final class EnumC3197o {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3197o[] $VALUES;
    private final String urlBase;
    public static final EnumC3197o LEGACY = new EnumC3197o("LEGACY", 0, "/latest/meta-data/iam/security-credentials/");
    public static final EnumC3197o EXTENDED = new EnumC3197o("EXTENDED", 1, "/latest/meta-data/iam/security-credentials-extended/");

    private static final /* synthetic */ EnumC3197o[] $values() {
        return new EnumC3197o[]{LEGACY, EXTENDED};
    }

    static {
        EnumC3197o[] enumC3197oArr$values = $values();
        $VALUES = enumC3197oArr$values;
        $ENTRIES = b8.m11548b(enumC3197oArr$values);
    }

    private EnumC3197o(String str, int i10, String str2) {
        this.urlBase = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3197o valueOf(String str) {
        return (EnumC3197o) Enum.valueOf(EnumC3197o.class, str);
    }

    public static EnumC3197o[] values() {
        return (EnumC3197o[]) $VALUES.clone();
    }

    public final String getUrlBase() {
        return this.urlBase;
    }
}
