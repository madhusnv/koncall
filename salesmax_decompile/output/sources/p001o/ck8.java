package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class ck8 {

    /* renamed from: d */
    public static final C12698b f18266d = new C12698b(null);

    /* renamed from: a */
    public final gl1 f18267a;

    /* renamed from: b */
    public final Float f18268b;

    /* renamed from: c */
    public final List f18269c;

    /* renamed from: o.ck8$a */
    public static final class C12697a {

        /* renamed from: a */
        public gl1 f18270a;

        /* renamed from: b */
        public Float f18271b;

        /* renamed from: c */
        public List f18272c;

        /* renamed from: a */
        public final ck8 m21338a() {
            return new ck8(this, null);
        }

        /* renamed from: b */
        public final C12697a m21339b() {
            return this;
        }

        /* renamed from: c */
        public final gl1 m21340c() {
            return this.f18270a;
        }

        /* renamed from: d */
        public final Float m21341d() {
            return this.f18271b;
        }

        /* renamed from: e */
        public final List m21342e() {
            return this.f18272c;
        }

        /* renamed from: f */
        public final void m21343f(gl1 gl1Var) {
            this.f18270a = gl1Var;
        }

        /* renamed from: g */
        public final void m21344g(Float f) {
            this.f18271b = f;
        }

        /* renamed from: h */
        public final void m21345h(List list) {
            this.f18272c = list;
        }
    }

    /* renamed from: o.ck8$b */
    public static final class C12698b {
        public C12698b() {
        }

        public /* synthetic */ C12698b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ck8(C12697a c12697a, id5 id5Var) {
        this(c12697a);
    }

    /* renamed from: a */
    public final gl1 m21337a() {
        return this.f18267a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ck8.class != obj.getClass()) {
            return false;
        }
        ck8 ck8Var = (ck8) obj;
        if (!sq8.m48644c(this.f18267a, ck8Var.f18267a)) {
            return false;
        }
        Float f = this.f18268b;
        return (f != null ? f.equals(ck8Var.f18268b) : ck8Var.f18268b == null) && sq8.m48644c(this.f18269c, ck8Var.f18269c);
    }

    public int hashCode() {
        gl1 gl1Var = this.f18267a;
        int iHashCode = (gl1Var != null ? gl1Var.hashCode() : 0) * 31;
        Float f = this.f18268b;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 31;
        List list = this.f18269c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instance(");
        sb.append("boundingBox=" + this.f18267a + ',');
        sb.append("confidence=" + this.f18268b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("dominantColors=");
        sb2.append(this.f18269c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ck8(C12697a c12697a) {
        this.f18267a = c12697a.m21340c();
        this.f18268b = c12697a.m21341d();
        this.f18269c = c12697a.m21342e();
    }
}
