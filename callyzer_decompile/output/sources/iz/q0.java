package iz;

import pg.b8;
import qw.InterfaceC6353c;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final p0 Companion;
    private final String javaName;
    public static final q0 TLS_1_3 = new q0("TLS_1_3", 0, "TLSv1.3");
    public static final q0 TLS_1_2 = new q0("TLS_1_2", 1, "TLSv1.2");
    public static final q0 TLS_1_1 = new q0("TLS_1_1", 2, "TLSv1.1");
    public static final q0 TLS_1_0 = new q0("TLS_1_0", 3, "TLSv1");
    public static final q0 SSL_3_0 = new q0("SSL_3_0", 4, "SSLv3");

    private static final /* synthetic */ q0[] $values() {
        return new q0[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    static {
        q0[] q0VarArr$values = $values();
        $VALUES = q0VarArr$values;
        $ENTRIES = b8.m11548b(q0VarArr$values);
        Companion = new p0();
    }

    private q0(String str, int i10, String str2) {
        this.javaName = str2;
    }

    public static final q0 forJavaName(String str) {
        Companion.getClass();
        return p0.m7756a(str);
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }

    @InterfaceC6353c
    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m16693deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
