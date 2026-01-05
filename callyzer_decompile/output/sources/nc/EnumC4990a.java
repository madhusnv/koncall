package nc;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nc.a */
/* loaded from: classes.dex */
public final class EnumC4990a {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4990a[] $VALUES;
    private final String protocolId;
    public static final EnumC4990a HTTP1_1 = new EnumC4990a("HTTP1_1", 0, "http/1.1");
    public static final EnumC4990a HTTP2 = new EnumC4990a("HTTP2", 1, "h2");
    public static final EnumC4990a H2_PRIOR_KNOWLEDGE = new EnumC4990a("H2_PRIOR_KNOWLEDGE", 2, "h2_prior_knowledge");
    public static final EnumC4990a HTTP3 = new EnumC4990a("HTTP3", 3, "h3");

    private static final /* synthetic */ EnumC4990a[] $values() {
        return new EnumC4990a[]{HTTP1_1, HTTP2, H2_PRIOR_KNOWLEDGE, HTTP3};
    }

    static {
        EnumC4990a[] enumC4990aArr$values = $values();
        $VALUES = enumC4990aArr$values;
        $ENTRIES = b8.m11548b(enumC4990aArr$values);
    }

    private EnumC4990a(String str, int i10, String str2) {
        this.protocolId = str2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4990a valueOf(String str) {
        return (EnumC4990a) Enum.valueOf(EnumC4990a.class, str);
    }

    public static EnumC4990a[] values() {
        return (EnumC4990a[]) $VALUES.clone();
    }

    public final String getProtocolId() {
        return this.protocolId;
    }
}
