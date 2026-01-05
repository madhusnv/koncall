package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class i4e {

    /* renamed from: d */
    public static final C14156b f28014d = new C14156b(null);

    /* renamed from: a */
    public final String f28015a;

    /* renamed from: b */
    public final List f28016b;

    /* renamed from: c */
    public final String f28017c;

    /* renamed from: o.i4e$a */
    public static final class C14155a {

        /* renamed from: a */
        public String f28018a;

        /* renamed from: b */
        public List f28019b;

        /* renamed from: c */
        public String f28020c;

        /* renamed from: a */
        public final i4e m31496a() {
            return new i4e(this, null);
        }

        /* renamed from: b */
        public final C14155a m31497b() {
            if (this.f28020c == null) {
                this.f28020c = "";
            }
            return this;
        }

        /* renamed from: c */
        public final String m31498c() {
            return this.f28018a;
        }

        /* renamed from: d */
        public final List m31499d() {
            return this.f28019b;
        }

        /* renamed from: e */
        public final String m31500e() {
            return this.f28020c;
        }

        /* renamed from: f */
        public final void m31501f(String str) {
            this.f28018a = str;
        }

        /* renamed from: g */
        public final void m31502g(List list) {
            this.f28019b = list;
        }

        /* renamed from: h */
        public final void m31503h(String str) {
            this.f28020c = str;
        }
    }

    /* renamed from: o.i4e$b */
    public static final class C14156b {
        public C14156b() {
        }

        public /* synthetic */ C14156b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ i4e(C14155a c14155a, id5 id5Var) {
        this(c14155a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i4e.class != obj.getClass()) {
            return false;
        }
        i4e i4eVar = (i4e) obj;
        return sq8.m48644c(this.f28015a, i4eVar.f28015a) && sq8.m48644c(this.f28016b, i4eVar.f28016b) && sq8.m48644c(this.f28017c, i4eVar.f28017c);
    }

    public int hashCode() {
        String str = this.f28015a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f28016b;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f28017c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append("alias=" + this.f28015a + ',');
        sb.append("pages=" + this.f28016b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("text=");
        sb2.append(this.f28017c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public i4e(C14155a c14155a) {
        this.f28015a = c14155a.m31498c();
        this.f28016b = c14155a.m31499d();
        String strM31500e = c14155a.m31500e();
        if (strM31500e == null) {
            throw new IllegalArgumentException("A non-null value must be provided for text".toString());
        }
        this.f28017c = strM31500e;
    }
}
