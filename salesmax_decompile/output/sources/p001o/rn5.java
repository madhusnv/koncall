package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class rn5 {

    /* renamed from: f */
    public static final C16631b f43836f = new C16631b(null);

    /* renamed from: a */
    public final List f43837a;

    /* renamed from: b */
    public final bw5 f43838b;

    /* renamed from: c */
    public final List f43839c;

    /* renamed from: d */
    public final List f43840d;

    /* renamed from: e */
    public final List f43841e;

    /* renamed from: o.rn5$a */
    public static final class C16630a {

        /* renamed from: a */
        public List f43842a;

        /* renamed from: b */
        public bw5 f43843b;

        /* renamed from: c */
        public List f43844c;

        /* renamed from: d */
        public List f43845d;

        /* renamed from: e */
        public List f43846e;

        /* renamed from: a */
        public final rn5 m46989a() {
            return new rn5(this, null);
        }

        /* renamed from: b */
        public final C16630a m46990b() {
            return this;
        }

        /* renamed from: c */
        public final List m46991c() {
            return this.f43842a;
        }

        /* renamed from: d */
        public final bw5 m46992d() {
            return this.f43843b;
        }

        /* renamed from: e */
        public final List m46993e() {
            return this.f43844c;
        }

        /* renamed from: f */
        public final List m46994f() {
            return this.f43845d;
        }

        /* renamed from: g */
        public final List m46995g() {
            return this.f43846e;
        }

        /* renamed from: h */
        public final void m46996h(List list) {
            this.f43842a = list;
        }

        /* renamed from: i */
        public final void m46997i(bw5 bw5Var) {
            this.f43843b = bw5Var;
        }

        /* renamed from: j */
        public final void m46998j(List list) {
            this.f43844c = list;
        }

        /* renamed from: k */
        public final void m46999k(List list) {
            this.f43845d = list;
        }

        /* renamed from: l */
        public final void m47000l(List list) {
            this.f43846e = list;
        }
    }

    /* renamed from: o.rn5$b */
    public static final class C16631b {
        public C16631b() {
        }

        public /* synthetic */ C16631b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ rn5(C16630a c16630a, id5 id5Var) {
        this(c16630a);
    }

    /* renamed from: a */
    public final List m46988a() {
        return this.f43840d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rn5.class != obj.getClass()) {
            return false;
        }
        rn5 rn5Var = (rn5) obj;
        return sq8.m48644c(this.f43837a, rn5Var.f43837a) && sq8.m48644c(this.f43838b, rn5Var.f43838b) && sq8.m48644c(this.f43839c, rn5Var.f43839c) && sq8.m48644c(this.f43840d, rn5Var.f43840d) && sq8.m48644c(this.f43841e, rn5Var.f43841e);
    }

    public int hashCode() {
        List list = this.f43837a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        bw5 bw5Var = this.f43838b;
        int iHashCode2 = (iHashCode + (bw5Var != null ? bw5Var.hashCode() : 0)) * 31;
        List list2 = this.f43839c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f43840d;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List list4 = this.f43841e;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        String str = "DetectEntitiesResponse(*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public rn5(C16630a c16630a) {
        this.f43837a = c16630a.m46991c();
        this.f43838b = c16630a.m46992d();
        this.f43839c = c16630a.m46993e();
        this.f43840d = c16630a.m46994f();
        this.f43841e = c16630a.m46995g();
    }
}
