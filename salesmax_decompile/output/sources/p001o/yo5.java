package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class yo5 {

    /* renamed from: f */
    public static final C18449b f55757f = new C18449b(null);

    /* renamed from: a */
    public final List f55758a;

    /* renamed from: b */
    public final r58 f55759b;

    /* renamed from: c */
    public final List f55760c;

    /* renamed from: d */
    public final String f55761d;

    /* renamed from: e */
    public final String f55762e;

    /* renamed from: o.yo5$a */
    public static final class C18448a {

        /* renamed from: a */
        public List f55763a;

        /* renamed from: b */
        public r58 f55764b;

        /* renamed from: c */
        public List f55765c;

        /* renamed from: d */
        public String f55766d;

        /* renamed from: e */
        public String f55767e;

        /* renamed from: a */
        public final yo5 m58035a() {
            return new yo5(this, null);
        }

        /* renamed from: b */
        public final C18448a m58036b() {
            return this;
        }

        /* renamed from: c */
        public final List m58037c() {
            return this.f55763a;
        }

        /* renamed from: d */
        public final r58 m58038d() {
            return this.f55764b;
        }

        /* renamed from: e */
        public final List m58039e() {
            return this.f55765c;
        }

        /* renamed from: f */
        public final String m58040f() {
            return this.f55766d;
        }

        /* renamed from: g */
        public final String m58041g() {
            return this.f55767e;
        }

        /* renamed from: h */
        public final void m58042h(List list) {
            this.f55763a = list;
        }

        /* renamed from: i */
        public final void m58043i(r58 r58Var) {
            this.f55764b = r58Var;
        }

        /* renamed from: j */
        public final void m58044j(List list) {
            this.f55765c = list;
        }

        /* renamed from: k */
        public final void m58045k(String str) {
            this.f55766d = str;
        }

        /* renamed from: l */
        public final void m58046l(String str) {
            this.f55767e = str;
        }
    }

    /* renamed from: o.yo5$b */
    public static final class C18449b {
        public C18449b() {
        }

        public /* synthetic */ C18449b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ yo5(C18448a c18448a, id5 id5Var) {
        this(c18448a);
    }

    /* renamed from: a */
    public final List m58034a() {
        return this.f55760c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yo5.class != obj.getClass()) {
            return false;
        }
        yo5 yo5Var = (yo5) obj;
        return sq8.m48644c(this.f55758a, yo5Var.f55758a) && sq8.m48644c(this.f55759b, yo5Var.f55759b) && sq8.m48644c(this.f55760c, yo5Var.f55760c) && sq8.m48644c(this.f55761d, yo5Var.f55761d) && sq8.m48644c(this.f55762e, yo5Var.f55762e);
    }

    public int hashCode() {
        List list = this.f55758a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        r58 r58Var = this.f55759b;
        int iHashCode2 = (iHashCode + (r58Var != null ? r58Var.hashCode() : 0)) * 31;
        List list2 = this.f55760c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f55761d;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55762e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectModerationLabelsResponse(");
        sb.append("contentTypes=" + this.f55758a + ',');
        sb.append("humanLoopActivationOutput=" + this.f55759b + ',');
        sb.append("moderationLabels=" + this.f55760c + ',');
        sb.append("moderationModelVersion=" + this.f55761d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("projectVersion=");
        sb2.append(this.f55762e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public yo5(C18448a c18448a) {
        this.f55758a = c18448a.m58037c();
        this.f55759b = c18448a.m58038d();
        this.f55760c = c18448a.m58039e();
        this.f55761d = c18448a.m58040f();
        this.f55762e = c18448a.m58041g();
    }
}
