package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o38 {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ o38[] $VALUES;
    public static final C15702a Companion;
    public static final o38 GET = new o38("GET", 0);
    public static final o38 POST = new o38("POST", 1);
    public static final o38 PUT = new o38("PUT", 2);
    public static final o38 PATCH = new o38("PATCH", 3);
    public static final o38 DELETE = new o38("DELETE", 4);
    public static final o38 HEAD = new o38("HEAD", 5);
    public static final o38 OPTIONS = new o38("OPTIONS", 6);

    /* renamed from: o.o38$a */
    public static final class C15702a {
        public C15702a() {
        }

        public /* synthetic */ C15702a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final o38 m41496a(String str) {
            sq8.m48649h(str, FirebaseAnalytics.Param.METHOD);
            String upperCase = str.toUpperCase(Locale.ROOT);
            sq8.m48648g(upperCase, "toUpperCase(...)");
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        return o38.OPTIONS;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        return o38.GET;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        return o38.PUT;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        return o38.HEAD;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        return o38.POST;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        return o38.PATCH;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        return o38.DELETE;
                    }
                    break;
            }
            throw new IllegalArgumentException("unknown HTTP method: " + str);
        }
    }

    private static final /* synthetic */ o38[] $values() {
        return new o38[]{GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS};
    }

    static {
        o38[] o38VarArr$values = $values();
        $VALUES = o38VarArr$values;
        $ENTRIES = hi6.m30609a(o38VarArr$values);
        Companion = new C15702a(null);
    }

    private o38(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static o38 valueOf(String str) {
        return (o38) Enum.valueOf(o38.class, str);
    }

    public static o38[] values() {
        return (o38[]) $VALUES.clone();
    }
}
