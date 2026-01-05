package iz;

import pg.b8;
import qw.InterfaceC6353c;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final e0 Companion;
    private final String protocol;
    public static final f0 HTTP_1_0 = new f0("HTTP_1_0", 0, "http/1.0");
    public static final f0 HTTP_1_1 = new f0("HTTP_1_1", 1, "http/1.1");

    @InterfaceC6353c
    public static final f0 SPDY_3 = new f0("SPDY_3", 2, "spdy/3.1");
    public static final f0 HTTP_2 = new f0("HTTP_2", 3, "h2");
    public static final f0 H2_PRIOR_KNOWLEDGE = new f0("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final f0 QUIC = new f0("QUIC", 5, "quic");
    public static final f0 HTTP_3 = new f0("HTTP_3", 6, "h3");

    private static final /* synthetic */ f0[] $values() {
        return new f0[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    static {
        f0[] f0VarArr$values = $values();
        $VALUES = f0VarArr$values;
        $ENTRIES = b8.m11548b(f0VarArr$values);
        Companion = new e0();
    }

    private f0(String str, int i10, String str2) {
        this.protocol = str2;
    }

    public static final f0 get(String str) {
        Companion.getClass();
        return e0.m7729a(str);
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
