package tb;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.d */
/* loaded from: classes.dex */
public final class EnumC7093d {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7093d[] $VALUES;
    public static final EnumC7093d SIGV4 = new EnumC7093d("SIGV4", 0, "AWS4-HMAC-SHA256");
    public static final EnumC7093d SIGV4_ASYMMETRIC = new EnumC7093d("SIGV4_ASYMMETRIC", 1, "AWS4-ECDSA-P256-SHA256");
    private final String signingName;

    private static final /* synthetic */ EnumC7093d[] $values() {
        return new EnumC7093d[]{SIGV4, SIGV4_ASYMMETRIC};
    }

    static {
        EnumC7093d[] enumC7093dArr$values = $values();
        $VALUES = enumC7093dArr$values;
        $ENTRIES = b8.m11548b(enumC7093dArr$values);
    }

    private EnumC7093d(String str, int i10, String str2) {
        this.signingName = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7093d valueOf(String str) {
        return (EnumC7093d) Enum.valueOf(EnumC7093d.class, str);
    }

    public static EnumC7093d[] values() {
        return (EnumC7093d[]) $VALUES.clone();
    }

    public final String getSigningName() {
        return this.signingName;
    }
}
