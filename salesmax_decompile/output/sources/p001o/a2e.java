package p001o;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class a2e {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ a2e[] $VALUES;
    public static final C12077a Companion;
    private final String protocol;
    public static final a2e HTTP_1_0 = new a2e("HTTP_1_0", 0, "http/1.0");
    public static final a2e HTTP_1_1 = new a2e("HTTP_1_1", 1, "http/1.1");
    public static final a2e SPDY_3 = new a2e("SPDY_3", 2, "spdy/3.1");
    public static final a2e HTTP_2 = new a2e("HTTP_2", 3, "h2");
    public static final a2e H2_PRIOR_KNOWLEDGE = new a2e("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final a2e QUIC = new a2e("QUIC", 5, "quic");
    public static final a2e HTTP_3 = new a2e("HTTP_3", 6, "h3");

    /* renamed from: o.a2e$a */
    public static final class C12077a {
        public C12077a() {
        }

        public /* synthetic */ C12077a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final a2e m16367a(String str) throws IOException {
            sq8.m48649h(str, "protocol");
            a2e a2eVar = a2e.HTTP_1_0;
            if (!sq8.m48644c(str, a2eVar.protocol)) {
                a2eVar = a2e.HTTP_1_1;
                if (!sq8.m48644c(str, a2eVar.protocol)) {
                    a2eVar = a2e.H2_PRIOR_KNOWLEDGE;
                    if (!sq8.m48644c(str, a2eVar.protocol)) {
                        a2eVar = a2e.HTTP_2;
                        if (!sq8.m48644c(str, a2eVar.protocol)) {
                            a2eVar = a2e.SPDY_3;
                            if (!sq8.m48644c(str, a2eVar.protocol)) {
                                a2eVar = a2e.QUIC;
                                if (!sq8.m48644c(str, a2eVar.protocol)) {
                                    a2eVar = a2e.HTTP_3;
                                    if (!e9g.m24597K(str, a2eVar.protocol, false, 2, null)) {
                                        throw new IOException("Unexpected protocol: " + str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return a2eVar;
        }
    }

    private static final /* synthetic */ a2e[] $values() {
        return new a2e[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    static {
        a2e[] a2eVarArr$values = $values();
        $VALUES = a2eVarArr$values;
        $ENTRIES = hi6.m30609a(a2eVarArr$values);
        Companion = new C12077a(null);
    }

    private a2e(String str, int i, String str2) {
        this.protocol = str2;
    }

    public static final a2e get(String str) {
        return Companion.m16367a(str);
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static a2e valueOf(String str) {
        return (a2e) Enum.valueOf(a2e.class, str);
    }

    public static a2e[] values() {
        return (a2e[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
