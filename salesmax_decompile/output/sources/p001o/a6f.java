package p001o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.HttpHost;

/* loaded from: classes3.dex */
public final class a6f {

    /* renamed from: c */
    public static final C12101a f14208c = new C12101a(null);

    /* renamed from: d */
    public static final a6f f14209d;

    /* renamed from: e */
    public static final a6f f14210e;

    /* renamed from: f */
    public static final a6f f14211f;

    /* renamed from: g */
    public static final a6f f14212g;

    /* renamed from: h */
    public static final Map f14213h;

    /* renamed from: a */
    public final String f14214a;

    /* renamed from: b */
    public final int f14215b;

    /* renamed from: o.a6f$a */
    public static final class C12101a {
        public C12101a() {
        }

        public /* synthetic */ C12101a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Map m16523a() {
            return a6f.f14213h;
        }

        /* renamed from: b */
        public final a6f m16524b() {
            return a6f.f14210e;
        }

        /* renamed from: c */
        public final a6f m16525c() {
            return a6f.f14209d;
        }

        /* renamed from: d */
        public final a6f m16526d(String str) {
            sq8.m48649h(str, "scheme");
            Map mapM16523a = m16523a();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            a6f a6fVar = (a6f) mapM16523a.get(lowerCase);
            return a6fVar == null ? new a6f(str, -1) : a6fVar;
        }
    }

    static {
        a6f a6fVar = new a6f("https", 443);
        f14209d = a6fVar;
        a6f a6fVar2 = new a6f(HttpHost.DEFAULT_SCHEME_NAME, 80);
        f14210e = a6fVar2;
        a6f a6fVar3 = new a6f("ws", 80);
        f14211f = a6fVar3;
        a6f a6fVar4 = new a6f("wss", 443);
        f14212g = a6fVar4;
        List listM21249n = ch3.m21249n(a6fVar2, a6fVar, a6fVar3, a6fVar4);
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(listM21249n, 10)), 16));
        for (Object obj : listM21249n) {
            linkedHashMap.put(((a6f) obj).f14214a, obj);
        }
        f14213h = linkedHashMap;
    }

    public a6f(String str, int i) {
        sq8.m48649h(str, "protocolName");
        this.f14214a = str;
        this.f14215b = i;
    }

    /* renamed from: d */
    public final int m16521d() {
        return this.f14215b;
    }

    /* renamed from: e */
    public final String m16522e() {
        return this.f14214a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6f)) {
            return false;
        }
        a6f a6fVar = (a6f) obj;
        return sq8.m48644c(this.f14214a, a6fVar.f14214a) && this.f14215b == a6fVar.f14215b;
    }

    public int hashCode() {
        return (this.f14214a.hashCode() * 31) + Integer.hashCode(this.f14215b);
    }

    public String toString() {
        return "Scheme(protocolName=" + this.f14214a + ", defaultPort=" + this.f14215b + ')';
    }
}
