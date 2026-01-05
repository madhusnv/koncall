package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class io7 {

    /* renamed from: c */
    public static final C14344b f29032c = new C14344b(null);

    /* renamed from: a */
    public final hl1 f29033a;

    /* renamed from: b */
    public final List f29034b;

    /* renamed from: o.io7$a */
    public static final class C14343a {

        /* renamed from: a */
        public hl1 f29035a;

        /* renamed from: b */
        public List f29036b;

        /* renamed from: a */
        public final io7 m32522a() {
            return new io7(this, null);
        }

        /* renamed from: b */
        public final C14343a m32523b() {
            return this;
        }

        /* renamed from: c */
        public final hl1 m32524c() {
            return this.f29035a;
        }

        /* renamed from: d */
        public final List m32525d() {
            return this.f29036b;
        }

        /* renamed from: e */
        public final void m32526e(hl1 hl1Var) {
            this.f29035a = hl1Var;
        }

        /* renamed from: f */
        public final void m32527f(List list) {
            this.f29036b = list;
        }
    }

    /* renamed from: o.io7$b */
    public static final class C14344b {
        public C14344b() {
        }

        public /* synthetic */ C14344b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ io7(C14343a c14343a, id5 id5Var) {
        this(c14343a);
    }

    /* renamed from: a */
    public final hl1 m32520a() {
        return this.f29033a;
    }

    /* renamed from: b */
    public final List m32521b() {
        return this.f29034b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io7.class != obj.getClass()) {
            return false;
        }
        io7 io7Var = (io7) obj;
        return sq8.m48644c(this.f29033a, io7Var.f29033a) && sq8.m48644c(this.f29034b, io7Var.f29034b);
    }

    public int hashCode() {
        hl1 hl1Var = this.f29033a;
        int iHashCode = (hl1Var != null ? hl1Var.hashCode() : 0) * 31;
        List list = this.f29034b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Geometry(");
        sb.append("boundingBox=" + this.f29033a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("polygon=");
        sb2.append(this.f29034b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public io7(C14343a c14343a) {
        this.f29033a = c14343a.m32524c();
        this.f29034b = c14343a.m32525d();
    }
}
