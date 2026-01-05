package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class wn5 {

    /* renamed from: c */
    public static final C17933b f52373c = new C17933b(null);

    /* renamed from: a */
    public final List f52374a;

    /* renamed from: b */
    public final fc8 f52375b;

    /* renamed from: o.wn5$a */
    public static final class C17932a {

        /* renamed from: a */
        public List f52376a;

        /* renamed from: b */
        public fc8 f52377b;

        /* renamed from: a */
        public final wn5 m54724a() {
            return new wn5(this, null);
        }

        /* renamed from: b */
        public final List m54725b() {
            return this.f52376a;
        }

        /* renamed from: c */
        public final fc8 m54726c() {
            return this.f52377b;
        }

        /* renamed from: d */
        public final void m54727d(List list) {
            this.f52376a = list;
        }

        /* renamed from: e */
        public final void m54728e(fc8 fc8Var) {
            this.f52377b = fc8Var;
        }
    }

    /* renamed from: o.wn5$b */
    public static final class C17933b {
        public C17933b() {
        }

        public /* synthetic */ C17933b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ wn5(C17932a c17932a, id5 id5Var) {
        this(c17932a);
    }

    /* renamed from: a */
    public final List m54722a() {
        return this.f52374a;
    }

    /* renamed from: b */
    public final fc8 m54723b() {
        return this.f52375b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wn5.class != obj.getClass()) {
            return false;
        }
        wn5 wn5Var = (wn5) obj;
        return sq8.m48644c(this.f52374a, wn5Var.f52374a) && sq8.m48644c(this.f52375b, wn5Var.f52375b);
    }

    public int hashCode() {
        List list = this.f52374a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        fc8 fc8Var = this.f52375b;
        return iHashCode + (fc8Var != null ? fc8Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectFacesRequest(");
        sb.append("attributes=" + this.f52374a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("image=");
        sb2.append(this.f52375b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public wn5(C17932a c17932a) {
        this.f52374a = c17932a.m54725b();
        this.f52375b = c17932a.m54726c();
    }
}
