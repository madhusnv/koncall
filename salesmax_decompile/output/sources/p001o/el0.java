package p001o;

/* loaded from: classes5.dex */
public enum el0 {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;

    public static final C13211a Companion = new C13211a(null);

    /* renamed from: o.el0$a */
    public static final class C13211a {
        public C13211a() {
        }

        public /* synthetic */ C13211a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final el0 m25195a(String str) {
            sq8.m48649h(str, "rawValue");
            return sq8.m48644c(str, "MOBILE_APP_INSTALL") ? el0.MOBILE_APP_INSTALL : sq8.m48644c(str, "CUSTOM_APP_EVENTS") ? el0.CUSTOM : el0.OTHER;
        }
    }
}
