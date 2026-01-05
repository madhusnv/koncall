package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class ho7 {

    /* renamed from: c */
    public static final C14018b f27245c = new C14018b(null);

    /* renamed from: a */
    public final gl1 f27246a;

    /* renamed from: b */
    public final List f27247b;

    /* renamed from: o.ho7$a */
    public static final class C14017a {

        /* renamed from: a */
        public gl1 f27248a;

        /* renamed from: b */
        public List f27249b;

        /* renamed from: a */
        public final ho7 m30881a() {
            return new ho7(this, null);
        }

        /* renamed from: b */
        public final C14017a m30882b() {
            return this;
        }

        /* renamed from: c */
        public final gl1 m30883c() {
            return this.f27248a;
        }

        /* renamed from: d */
        public final List m30884d() {
            return this.f27249b;
        }

        /* renamed from: e */
        public final void m30885e(gl1 gl1Var) {
            this.f27248a = gl1Var;
        }

        /* renamed from: f */
        public final void m30886f(List list) {
            this.f27249b = list;
        }
    }

    /* renamed from: o.ho7$b */
    public static final class C14018b {
        public C14018b() {
        }

        public /* synthetic */ C14018b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ho7(C14017a c14017a, id5 id5Var) {
        this(c14017a);
    }

    /* renamed from: a */
    public final gl1 m30879a() {
        return this.f27246a;
    }

    /* renamed from: b */
    public final List m30880b() {
        return this.f27247b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ho7.class != obj.getClass()) {
            return false;
        }
        ho7 ho7Var = (ho7) obj;
        return sq8.m48644c(this.f27246a, ho7Var.f27246a) && sq8.m48644c(this.f27247b, ho7Var.f27247b);
    }

    public int hashCode() {
        gl1 gl1Var = this.f27246a;
        int iHashCode = (gl1Var != null ? gl1Var.hashCode() : 0) * 31;
        List list = this.f27247b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Geometry(");
        sb.append("boundingBox=" + this.f27246a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("polygon=");
        sb2.append(this.f27247b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ho7(C14017a c14017a) {
        this.f27246a = c14017a.m30883c();
        this.f27247b = c14017a.m30884d();
    }
}
