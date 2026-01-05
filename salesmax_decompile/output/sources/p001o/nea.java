package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class nea {

    /* renamed from: c */
    public static final C15555b f36749c = new C15555b(null);

    /* renamed from: a */
    public final List f36750a;

    /* renamed from: b */
    public final String f36751b;

    /* renamed from: o.nea$a */
    public static final class C15554a {

        /* renamed from: a */
        public List f36752a;

        /* renamed from: b */
        public String f36753b;

        /* renamed from: a */
        public final nea m40420a() {
            return new nea(this, null);
        }

        /* renamed from: b */
        public final C15554a m40421b() {
            return this;
        }

        /* renamed from: c */
        public final List m40422c() {
            return this.f36752a;
        }

        /* renamed from: d */
        public final String m40423d() {
            return this.f36753b;
        }

        /* renamed from: e */
        public final void m40424e(List list) {
            this.f36752a = list;
        }

        /* renamed from: f */
        public final void m40425f(String str) {
            this.f36753b = str;
        }
    }

    /* renamed from: o.nea$b */
    public static final class C15555b {
        public C15555b() {
        }

        public /* synthetic */ C15555b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ nea(C15554a c15554a, id5 id5Var) {
        this(c15554a);
    }

    /* renamed from: a */
    public final List m40419a() {
        return this.f36750a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nea.class != obj.getClass()) {
            return false;
        }
        nea neaVar = (nea) obj;
        return sq8.m48644c(this.f36750a, neaVar.f36750a) && sq8.m48644c(this.f36751b, neaVar.f36751b);
    }

    public int hashCode() {
        List list = this.f36750a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f36751b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListDevicesResponse(");
        sb.append("devices=" + this.f36750a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("paginationToken=");
        sb2.append(this.f36751b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public nea(C15554a c15554a) {
        this.f36750a = c15554a.m40422c();
        this.f36751b = c15554a.m40423d();
    }
}
