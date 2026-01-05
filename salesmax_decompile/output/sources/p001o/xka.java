package p001o;

/* loaded from: classes5.dex */
public enum xka {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final C18174a Companion = new C18174a(null);
    private final String targetApp;

    /* renamed from: o.xka$a */
    public static final class C18174a {
        public C18174a() {
        }

        public /* synthetic */ C18174a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final xka m56421a(String str) {
            for (xka xkaVar : xka.values()) {
                if (sq8.m48644c(xkaVar.toString(), str)) {
                    return xkaVar;
                }
            }
            return xka.FACEBOOK;
        }
    }

    xka(String str) {
        this.targetApp = str;
    }

    public static final xka fromString(String str) {
        return Companion.m56421a(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }
}
