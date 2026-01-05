package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class mm3 {

    /* renamed from: b */
    public static final C15361b f35681b = new C15361b(null);

    /* renamed from: a */
    public final List f35682a;

    /* renamed from: o.mm3$a */
    public static final class C15360a {

        /* renamed from: a */
        public List f35683a;

        /* renamed from: a */
        public final mm3 m39343a() {
            return new mm3(this, null);
        }

        /* renamed from: b */
        public final List m39344b() {
            return this.f35683a;
        }

        /* renamed from: c */
        public final void m39345c(List list) {
            this.f35683a = list;
        }
    }

    /* renamed from: o.mm3$b */
    public static final class C15361b {
        public C15361b() {
        }

        public /* synthetic */ C15361b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final mm3 m39346a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C15360a c15360a = new C15360a();
            xk7Var.invoke(c15360a);
            return c15360a.m39343a();
        }
    }

    public /* synthetic */ mm3(C15360a c15360a, id5 id5Var) {
        this(c15360a);
    }

    /* renamed from: a */
    public final List m39342a() {
        return this.f35682a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mm3.class == obj.getClass() && sq8.m48644c(this.f35682a, ((mm3) obj).f35682a);
    }

    public int hashCode() {
        List list = this.f35682a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompletedMultipartUpload(");
        sb.append("parts=" + this.f35682a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public mm3(C15360a c15360a) {
        this.f35682a = c15360a.m39344b();
    }
}
