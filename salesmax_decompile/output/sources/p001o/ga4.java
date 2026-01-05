package p001o;

/* loaded from: classes2.dex */
public abstract class ga4 extends o94 {

    /* renamed from: d */
    public static final C13662a f24826d = new C13662a(null);

    /* renamed from: c */
    public final String f24827c;

    /* renamed from: o.ga4$a */
    public static final class C13662a {
        public C13662a() {
        }

        public /* synthetic */ C13662a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final o94 m28286a(String str, String str2) throws yj7 {
            sq8.m48649h(str, "type");
            try {
                if (f9g.m26306P(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
                    return fa4.f23028f.m26342a(str, str2);
                }
                throw new yj7();
            } catch (yj7 unused) {
                return new n94(str, str2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga4(String str, CharSequence charSequence) {
        super(str, charSequence);
        sq8.m48649h(str, "type");
        this.f24827c = str;
        if (!(mo28285a().length() > 0)) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }

    @Override // p001o.o94
    /* renamed from: a */
    public String mo28285a() {
        return this.f24827c;
    }
}
