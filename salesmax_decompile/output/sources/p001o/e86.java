package p001o;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e86 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ e86[] $VALUES;
    public static final C13128a Companion;
    public static final e86 IPv4 = new e86("IPv4", 0, new b86("http://169.254.169.254"));
    public static final e86 IPv6 = new e86("IPv6", 1, new b86("http://[fd00:ec2::254]"));
    private final b86 defaultEndpoint;

    /* renamed from: o.e86$a */
    public static final class C13128a {
        public C13128a() {
        }

        public /* synthetic */ C13128a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final e86 m24522a(String str) {
            sq8.m48649h(str, "value");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            if (sq8.m48644c(lowerCase, "ipv4")) {
                return e86.IPv4;
            }
            if (sq8.m48644c(lowerCase, "ipv6")) {
                return e86.IPv6;
            }
            throw new IllegalArgumentException("invalid EndpointMode: `" + str + '`');
        }
    }

    private static final /* synthetic */ e86[] $values() {
        return new e86[]{IPv4, IPv6};
    }

    static {
        e86[] e86VarArr$values = $values();
        $VALUES = e86VarArr$values;
        $ENTRIES = hi6.m30609a(e86VarArr$values);
        Companion = new C13128a(null);
    }

    private e86(String str, int i, b86 b86Var) {
        this.defaultEndpoint = b86Var;
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static e86 valueOf(String str) {
        return (e86) Enum.valueOf(e86.class, str);
    }

    public static e86[] values() {
        return (e86[]) $VALUES.clone();
    }

    public final b86 getDefaultEndpoint$aws_config() {
        return this.defaultEndpoint;
    }
}
