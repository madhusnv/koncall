package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v6i {

    /* renamed from: d */
    public static final C17518b f49927d = new C17518b(null);

    /* renamed from: a */
    public final String f49928a;

    /* renamed from: b */
    public final Map f49929b;

    /* renamed from: c */
    public final List f49930c;

    /* renamed from: o.v6i$a */
    public static final class C17517a {

        /* renamed from: a */
        public String f49931a;

        /* renamed from: b */
        public Map f49932b;

        /* renamed from: c */
        public List f49933c;

        /* renamed from: a */
        public final v6i m52366a() {
            return new v6i(this, null);
        }

        /* renamed from: b */
        public final String m52367b() {
            return this.f49931a;
        }

        /* renamed from: c */
        public final Map m52368c() {
            return this.f49932b;
        }

        /* renamed from: d */
        public final List m52369d() {
            return this.f49933c;
        }

        /* renamed from: e */
        public final void m52370e(String str) {
            this.f49931a = str;
        }

        /* renamed from: f */
        public final void m52371f(Map map) {
            this.f49932b = map;
        }

        /* renamed from: g */
        public final void m52372g(List list) {
            this.f49933c = list;
        }
    }

    /* renamed from: o.v6i$b */
    public static final class C17518b {
        public C17518b() {
        }

        public /* synthetic */ C17518b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ v6i(C17517a c17517a, id5 id5Var) {
        this(c17517a);
    }

    /* renamed from: a */
    public final String m52363a() {
        return this.f49928a;
    }

    /* renamed from: b */
    public final Map m52364b() {
        return this.f49929b;
    }

    /* renamed from: c */
    public final List m52365c() {
        return this.f49930c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v6i.class != obj.getClass()) {
            return false;
        }
        v6i v6iVar = (v6i) obj;
        return sq8.m48644c(this.f49928a, v6iVar.f49928a) && sq8.m48644c(this.f49929b, v6iVar.f49929b) && sq8.m48644c(this.f49930c, v6iVar.f49930c);
    }

    public int hashCode() {
        String str = this.f49928a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f49929b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        List list = this.f49930c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateUserAttributesRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.f49929b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("userAttributes=");
        sb2.append(this.f49930c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public v6i(C17517a c17517a) {
        this.f49928a = c17517a.m52367b();
        this.f49929b = c17517a.m52368c();
        this.f49930c = c17517a.m52369d();
    }
}
