package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class r58 {

    /* renamed from: d */
    public static final C16543b f43025d = new C16543b(null);

    /* renamed from: a */
    public final String f43026a;

    /* renamed from: b */
    public final List f43027b;

    /* renamed from: c */
    public final String f43028c;

    /* renamed from: o.r58$a */
    public static final class C16542a {

        /* renamed from: a */
        public String f43029a;

        /* renamed from: b */
        public List f43030b;

        /* renamed from: c */
        public String f43031c;

        /* renamed from: a */
        public final r58 m46238a() {
            return new r58(this, null);
        }

        /* renamed from: b */
        public final C16542a m46239b() {
            return this;
        }

        /* renamed from: c */
        public final String m46240c() {
            return this.f43029a;
        }

        /* renamed from: d */
        public final List m46241d() {
            return this.f43030b;
        }

        /* renamed from: e */
        public final String m46242e() {
            return this.f43031c;
        }

        /* renamed from: f */
        public final void m46243f(String str) {
            this.f43029a = str;
        }

        /* renamed from: g */
        public final void m46244g(List list) {
            this.f43030b = list;
        }

        /* renamed from: h */
        public final void m46245h(String str) {
            this.f43031c = str;
        }
    }

    /* renamed from: o.r58$b */
    public static final class C16543b {
        public C16543b() {
        }

        public /* synthetic */ C16543b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ r58(C16542a c16542a, id5 id5Var) {
        this(c16542a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r58.class != obj.getClass()) {
            return false;
        }
        r58 r58Var = (r58) obj;
        return sq8.m48644c(this.f43026a, r58Var.f43026a) && sq8.m48644c(this.f43027b, r58Var.f43027b) && sq8.m48644c(this.f43028c, r58Var.f43028c);
    }

    public int hashCode() {
        String str = this.f43026a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f43027b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f43028c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumanLoopActivationOutput(");
        sb.append("humanLoopActivationConditionsEvaluationResults=" + this.f43026a + ',');
        sb.append("humanLoopActivationReasons=" + this.f43027b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("humanLoopArn=");
        sb2.append(this.f43028c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public r58(C16542a c16542a) {
        this.f43026a = c16542a.m46240c();
        this.f43027b = c16542a.m46241d();
        this.f43028c = c16542a.m46242e();
    }
}
