package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class uhe {

    /* renamed from: c */
    public static final C17379b f48940c = new C17379b(null);

    /* renamed from: a */
    public final List f48941a;

    /* renamed from: b */
    public final she f48942b;

    /* renamed from: o.uhe$a */
    public static final class C17378a {

        /* renamed from: a */
        public List f48943a;

        /* renamed from: b */
        public she f48944b;

        /* renamed from: a */
        public final uhe m51589a() {
            return new uhe(this, null);
        }

        /* renamed from: b */
        public final C17378a m51590b() {
            return this;
        }

        /* renamed from: c */
        public final List m51591c() {
            return this.f48943a;
        }

        /* renamed from: d */
        public final she m51592d() {
            return this.f48944b;
        }

        /* renamed from: e */
        public final void m51593e(List list) {
            this.f48943a = list;
        }

        /* renamed from: f */
        public final void m51594f(she sheVar) {
            this.f48944b = sheVar;
        }
    }

    /* renamed from: o.uhe$b */
    public static final class C17379b {
        public C17379b() {
        }

        public /* synthetic */ C17379b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ uhe(C17378a c17378a, id5 id5Var) {
        this(c17378a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uhe.class != obj.getClass()) {
            return false;
        }
        uhe uheVar = (uhe) obj;
        return sq8.m48644c(this.f48941a, uheVar.f48941a) && sq8.m48644c(this.f48942b, uheVar.f48942b);
    }

    public int hashCode() {
        List list = this.f48941a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        she sheVar = this.f48942b;
        return iHashCode + (sheVar != null ? sheVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RelationshipsListItem(");
        sb.append("ids=" + this.f48941a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type=");
        sb2.append(this.f48942b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public uhe(C17378a c17378a) {
        this.f48941a = c17378a.m51591c();
        this.f48942b = c17378a.m51592d();
    }
}
