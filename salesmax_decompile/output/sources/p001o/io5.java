package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class io5 {

    /* renamed from: e */
    public static final C14342b f29022e = new C14342b(null);

    /* renamed from: a */
    public final eo5 f29023a;

    /* renamed from: b */
    public final List f29024b;

    /* renamed from: c */
    public final go5 f29025c;

    /* renamed from: d */
    public final ko5 f29026d;

    /* renamed from: o.io5$a */
    public static final class C14341a {

        /* renamed from: a */
        public eo5 f29027a;

        /* renamed from: b */
        public List f29028b;

        /* renamed from: c */
        public go5 f29029c;

        /* renamed from: d */
        public ko5 f29030d;

        /* renamed from: a */
        public final io5 m32510a() {
            return new io5(this, null);
        }

        /* renamed from: b */
        public final C14341a m32511b() {
            return this;
        }

        /* renamed from: c */
        public final eo5 m32512c() {
            return this.f29027a;
        }

        /* renamed from: d */
        public final List m32513d() {
            return this.f29028b;
        }

        /* renamed from: e */
        public final go5 m32514e() {
            return this.f29029c;
        }

        /* renamed from: f */
        public final ko5 m32515f() {
            return this.f29030d;
        }

        /* renamed from: g */
        public final void m32516g(eo5 eo5Var) {
            this.f29027a = eo5Var;
        }

        /* renamed from: h */
        public final void m32517h(List list) {
            this.f29028b = list;
        }

        /* renamed from: i */
        public final void m32518i(go5 go5Var) {
            this.f29029c = go5Var;
        }

        /* renamed from: j */
        public final void m32519j(ko5 ko5Var) {
            this.f29030d = ko5Var;
        }
    }

    /* renamed from: o.io5$b */
    public static final class C14342b {
        public C14342b() {
        }

        public /* synthetic */ C14342b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ io5(C14341a c14341a, id5 id5Var) {
        this(c14341a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io5.class != obj.getClass()) {
            return false;
        }
        io5 io5Var = (io5) obj;
        return sq8.m48644c(this.f29023a, io5Var.f29023a) && sq8.m48644c(this.f29024b, io5Var.f29024b) && sq8.m48644c(this.f29025c, io5Var.f29025c) && sq8.m48644c(this.f29026d, io5Var.f29026d);
    }

    public int hashCode() {
        eo5 eo5Var = this.f29023a;
        int iHashCode = (eo5Var != null ? eo5Var.hashCode() : 0) * 31;
        List list = this.f29024b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        go5 go5Var = this.f29025c;
        int iHashCode3 = (iHashCode2 + (go5Var != null ? go5Var.hashCode() : 0)) * 31;
        ko5 ko5Var = this.f29026d;
        return iHashCode3 + (ko5Var != null ? ko5Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectLabelsImageProperties(");
        sb.append("background=" + this.f29023a + ',');
        sb.append("dominantColors=" + this.f29024b + ',');
        sb.append("foreground=" + this.f29025c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("quality=");
        sb2.append(this.f29026d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public io5(C14341a c14341a) {
        this.f29023a = c14341a.m32512c();
        this.f29024b = c14341a.m32513d();
        this.f29025c = c14341a.m32514e();
        this.f29026d = c14341a.m32515f();
    }
}
