package p001o;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes3.dex */
public final class d01 {

    /* renamed from: b */
    public static final C12776a f18915b = new C12776a(null);

    /* renamed from: c */
    public static final String f18916c = m22167e("smithy.api#noAuth");

    /* renamed from: d */
    public static final String f18917d = m22167e("smithy.api#httpBasicAuth");

    /* renamed from: e */
    public static final String f18918e = m22167e("smithy.api#httpDigestAuth");

    /* renamed from: f */
    public static final String f18919f = m22167e("smithy.api#httpBearerAuth");

    /* renamed from: g */
    public static final String f18920g = m22167e("smithy.api#httpApiKeyAuth");

    /* renamed from: h */
    public static final String f18921h = m22167e("aws.auth#sigv4");

    /* renamed from: i */
    public static final String f18922i = m22167e("aws.auth#sigv4a");

    /* renamed from: a */
    public final String f18923a;

    /* renamed from: o.d01$a */
    public static final class C12776a {
        public C12776a() {
        }

        public /* synthetic */ C12776a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m22173a() {
            return d01.f18916c;
        }

        /* renamed from: b */
        public final String m22174b() {
            return d01.f18921h;
        }

        /* renamed from: c */
        public final String m22175c() {
            return d01.f18922i;
        }
    }

    public /* synthetic */ d01(String str) {
        this.f18923a = str;
    }

    /* renamed from: d */
    public static final /* synthetic */ d01 m22166d(String str) {
        return new d01(str);
    }

    /* renamed from: e */
    public static String m22167e(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return str;
    }

    /* renamed from: f */
    public static boolean m22168f(String str, Object obj) {
        return (obj instanceof d01) && sq8.m48644c(str, ((d01) obj).m22172j());
    }

    /* renamed from: g */
    public static final boolean m22169g(String str, String str2) {
        return sq8.m48644c(str, str2);
    }

    /* renamed from: h */
    public static int m22170h(String str) {
        return str.hashCode();
    }

    /* renamed from: i */
    public static String m22171i(String str) {
        return "AuthSchemeId(id=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m22168f(this.f18923a, obj);
    }

    public int hashCode() {
        return m22170h(this.f18923a);
    }

    /* renamed from: j */
    public final /* synthetic */ String m22172j() {
        return this.f18923a;
    }

    public String toString() {
        return m22171i(this.f18923a);
    }
}
