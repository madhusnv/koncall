package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class yn0 {

    /* renamed from: c */
    public static final C18435b f55715c = new C18435b(null);

    /* renamed from: a */
    public final String f55716a;

    /* renamed from: b */
    public final List f55717b;

    /* renamed from: o.yn0$a */
    public static final class C18434a {

        /* renamed from: a */
        public String f55718a;

        /* renamed from: b */
        public List f55719b;

        /* renamed from: a */
        public final yn0 m58003a() {
            return new yn0(this, null);
        }

        /* renamed from: b */
        public final C18434a m58004b() {
            return this;
        }

        /* renamed from: c */
        public final String m58005c() {
            return this.f55718a;
        }

        /* renamed from: d */
        public final List m58006d() {
            return this.f55719b;
        }

        /* renamed from: e */
        public final void m58007e(String str) {
            this.f55718a = str;
        }

        /* renamed from: f */
        public final void m58008f(List list) {
            this.f55719b = list;
        }
    }

    /* renamed from: o.yn0$b */
    public static final class C18435b {
        public C18435b() {
        }

        public /* synthetic */ C18435b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ yn0(C18434a c18434a, id5 id5Var) {
        this(c18434a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yn0.class != obj.getClass()) {
            return false;
        }
        yn0 yn0Var = (yn0) obj;
        return sq8.m48644c(this.f55716a, yn0Var.f55716a) && sq8.m48644c(this.f55717b, yn0Var.f55717b);
    }

    public int hashCode() {
        String str = this.f55716a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f55717b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppliedTerminology(");
        sb.append("name=" + this.f55716a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("terms=");
        sb2.append(this.f55717b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public yn0(C18434a c18434a) {
        this.f55716a = c18434a.m58005c();
        this.f55717b = c18434a.m58006d();
    }
}
