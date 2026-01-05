package p001o;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class y9b {

    /* renamed from: e */
    public static final C18360a f55104e = new C18360a(null);

    /* renamed from: a */
    public final String f55105a;

    /* renamed from: b */
    public final String f55106b;

    /* renamed from: c */
    public final String f55107c;

    /* renamed from: d */
    public final String[] f55108d;

    /* renamed from: o.y9b$a */
    public static final class C18360a {
        public C18360a() {
        }

        public /* synthetic */ C18360a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final y9b m57403a(String str) {
            sq8.m48649h(str, "<this>");
            return yfj.m57767d(str);
        }

        /* renamed from: b */
        public final y9b m57404b(String str) {
            sq8.m48649h(str, "<this>");
            return yfj.m57768e(str);
        }
    }

    public y9b(String str, String str2, String str3, String[] strArr) {
        sq8.m48649h(str, "mediaType");
        sq8.m48649h(str2, "type");
        sq8.m48649h(str3, "subtype");
        sq8.m48649h(strArr, "parameterNamesAndValues");
        this.f55105a = str;
        this.f55106b = str2;
        this.f55107c = str3;
        this.f55108d = strArr;
    }

    /* renamed from: b */
    public static /* synthetic */ Charset m57395b(y9b y9bVar, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return y9bVar.m57398a(charset);
    }

    /* renamed from: c */
    public static final y9b m57396c(String str) {
        return f55104e.m57403a(str);
    }

    /* renamed from: g */
    public static final y9b m57397g(String str) {
        return f55104e.m57404b(str);
    }

    /* renamed from: a */
    public final Charset m57398a(Charset charset) {
        String strM57401f = m57401f("charset");
        if (strM57401f == null) {
            return charset;
        }
        try {
            return Charset.forName(strM57401f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* renamed from: d */
    public final String m57399d() {
        return this.f55105a;
    }

    /* renamed from: e */
    public final String[] m57400e() {
        return this.f55108d;
    }

    public boolean equals(Object obj) {
        return yfj.m57764a(this, obj);
    }

    /* renamed from: f */
    public final String m57401f(String str) {
        sq8.m48649h(str, "name");
        return yfj.m57766c(this, str);
    }

    /* renamed from: h */
    public final String m57402h() {
        return this.f55106b;
    }

    public int hashCode() {
        return yfj.m57765b(this);
    }

    public String toString() {
        return yfj.m57769f(this);
    }
}
