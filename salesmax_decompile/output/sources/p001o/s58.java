package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class s58 {

    /* renamed from: d */
    public static final C16750b f44831d = new C16750b(null);

    /* renamed from: a */
    public final String f44832a;

    /* renamed from: b */
    public final List f44833b;

    /* renamed from: c */
    public final String f44834c;

    /* renamed from: o.s58$a */
    public static final class C16749a {

        /* renamed from: a */
        public String f44835a;

        /* renamed from: b */
        public List f44836b;

        /* renamed from: c */
        public String f44837c;

        /* renamed from: a */
        public final s58 m47875a() {
            return new s58(this, null);
        }

        /* renamed from: b */
        public final C16749a m47876b() {
            return this;
        }

        /* renamed from: c */
        public final String m47877c() {
            return this.f44835a;
        }

        /* renamed from: d */
        public final List m47878d() {
            return this.f44836b;
        }

        /* renamed from: e */
        public final String m47879e() {
            return this.f44837c;
        }

        /* renamed from: f */
        public final void m47880f(String str) {
            this.f44835a = str;
        }

        /* renamed from: g */
        public final void m47881g(List list) {
            this.f44836b = list;
        }

        /* renamed from: h */
        public final void m47882h(String str) {
            this.f44837c = str;
        }
    }

    /* renamed from: o.s58$b */
    public static final class C16750b {
        public C16750b() {
        }

        public /* synthetic */ C16750b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ s58(C16749a c16749a, id5 id5Var) {
        this(c16749a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s58.class != obj.getClass()) {
            return false;
        }
        s58 s58Var = (s58) obj;
        return sq8.m48644c(this.f44832a, s58Var.f44832a) && sq8.m48644c(this.f44833b, s58Var.f44833b) && sq8.m48644c(this.f44834c, s58Var.f44834c);
    }

    public int hashCode() {
        String str = this.f44832a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f44833b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f44834c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumanLoopActivationOutput(");
        sb.append("humanLoopActivationConditionsEvaluationResults=" + this.f44832a + ',');
        sb.append("humanLoopActivationReasons=" + this.f44833b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("humanLoopArn=");
        sb2.append(this.f44834c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public s58(C16749a c16749a) {
        this.f44832a = c16749a.m47877c();
        this.f44833b = c16749a.m47878d();
        this.f44834c = c16749a.m47879e();
    }
}
