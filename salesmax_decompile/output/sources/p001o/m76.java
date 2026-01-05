package p001o;

/* loaded from: classes3.dex */
public interface m76 {

    /* renamed from: a */
    public static final C15242a f34923a = C15242a.f34924a;

    /* renamed from: o.m76$a */
    public static final class C15242a {

        /* renamed from: a */
        public static final /* synthetic */ C15242a f34924a = new C15242a();

        /* renamed from: b */
        public static final m76 f34925b = new a();

        /* renamed from: o.m76$a$a */
        public static final class a implements m76 {

            /* renamed from: b */
            public final String f34926b = "(no encoding)";

            @Override // p001o.m76
            /* renamed from: a */
            public String mo24241a(String str) {
                sq8.m48649h(str, "decoded");
                return str;
            }

            @Override // p001o.m76
            /* renamed from: b */
            public y66 mo24242b(String str) {
                return C15243b.m38480a(this, str);
            }

            @Override // p001o.m76
            /* renamed from: c */
            public y66 mo24243c(String str) {
                return C15243b.m38481b(this, str);
            }

            @Override // p001o.m76
            public String decode(String str) {
                sq8.m48649h(str, "encoded");
                return str;
            }

            @Override // p001o.m76
            public String getName() {
                return this.f34926b;
            }
        }

        /* renamed from: a */
        public final m76 m38479a() {
            return f34925b;
        }
    }

    /* renamed from: o.m76$b */
    public static final class C15243b {
        /* renamed from: a */
        public static y66 m38480a(m76 m76Var, String str) {
            sq8.m48649h(str, "decoded");
            return new y66(str, m76Var.mo24241a(str), m76Var);
        }

        /* renamed from: b */
        public static y66 m38481b(m76 m76Var, String str) {
            sq8.m48649h(str, "encoded");
            return new y66(m76Var.decode(str), str, m76Var);
        }
    }

    /* renamed from: a */
    String mo24241a(String str);

    /* renamed from: b */
    y66 mo24242b(String str);

    /* renamed from: c */
    y66 mo24243c(String str);

    String decode(String str);

    String getName();
}
