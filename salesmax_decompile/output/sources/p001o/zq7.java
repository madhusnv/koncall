package p001o;

/* loaded from: classes2.dex */
public abstract class zq7 extends qo7 {

    /* renamed from: d */
    public static final C18695a f57511d = new C18695a(null);

    /* renamed from: c */
    public final String f57512c;

    /* renamed from: o.zq7$a */
    public static final class C18695a {
        public C18695a() {
        }

        public /* synthetic */ C18695a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final qo7 m59723a(String str, String str2) throws yj7 {
            sq8.m48649h(str, "type");
            try {
                if (e9g.m24597K(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
                    return yq7.f55817f.m58117a(str, str2);
                }
                throw new yj7();
            } catch (yj7 unused) {
                return new po7(str, str2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq7(String str, CharSequence charSequence) {
        super(str, charSequence);
        sq8.m48649h(str, "type");
        this.f57512c = str;
        if (!(mo43965a().length() > 0)) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }

    @Override // p001o.qo7
    /* renamed from: a */
    public String mo43965a() {
        return this.f57512c;
    }
}
