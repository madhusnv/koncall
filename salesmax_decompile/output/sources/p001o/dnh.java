package p001o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class dnh {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ dnh[] $VALUES;
    public static final C13006a Companion;
    private final String javaName;
    public static final dnh TLS_1_3 = new dnh("TLS_1_3", 0, "TLSv1.3");
    public static final dnh TLS_1_2 = new dnh("TLS_1_2", 1, "TLSv1.2");
    public static final dnh TLS_1_1 = new dnh("TLS_1_1", 2, "TLSv1.1");
    public static final dnh TLS_1_0 = new dnh("TLS_1_0", 3, "TLSv1");
    public static final dnh SSL_3_0 = new dnh("SSL_3_0", 4, "SSLv3");

    /* renamed from: o.dnh$a */
    public static final class C13006a {
        public C13006a() {
        }

        public /* synthetic */ C13006a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final dnh m23634a(String str) {
            sq8.m48649h(str, "javaName");
            int iHashCode = str.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return dnh.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return dnh.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return dnh.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return dnh.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return dnh.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    private static final /* synthetic */ dnh[] $values() {
        return new dnh[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    static {
        dnh[] dnhVarArr$values = $values();
        $VALUES = dnhVarArr$values;
        $ENTRIES = hi6.m30609a(dnhVarArr$values);
        Companion = new C13006a(null);
    }

    private dnh(String str, int i, String str2) {
        this.javaName = str2;
    }

    public static final dnh forJavaName(String str) {
        return Companion.m23634a(str);
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static dnh valueOf(String str) {
        return (dnh) Enum.valueOf(dnh.class, str);
    }

    public static dnh[] values() {
        return (dnh[]) $VALUES.clone();
    }

    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m68998deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
