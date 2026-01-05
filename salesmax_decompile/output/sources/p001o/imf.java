package p001o;

/* loaded from: classes6.dex */
public interface imf {

    /* renamed from: a */
    public static final C14327a f28923a = C14327a.f28924a;

    /* renamed from: o.imf$a */
    public static final class C14327a {

        /* renamed from: a */
        public static final /* synthetic */ C14327a f28924a = new C14327a();

        /* renamed from: b */
        public static final imf f28925b = new j4g();

        /* renamed from: c */
        public static final imf f28926c = new k4g();

        /* renamed from: b */
        public static /* synthetic */ imf m32414b(C14327a c14327a, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return c14327a.m32415a(j, j2);
        }

        /* renamed from: a */
        public final imf m32415a(long j, long j2) {
            return new l4g(j, j2);
        }

        /* renamed from: c */
        public final imf m32416c() {
            return f28925b;
        }

        /* renamed from: d */
        public final imf m32417d() {
            return f28926c;
        }
    }

    /* renamed from: a */
    v37 mo32413a(q4g q4gVar);
}
