package p001o;

/* loaded from: classes3.dex */
public final class oee {

    /* renamed from: b */
    public static final C15782b f38258b = new C15782b(null);

    /* renamed from: a */
    public final fc8 f38259a;

    /* renamed from: o.oee$a */
    public static final class C15781a {

        /* renamed from: a */
        public fc8 f38260a;

        /* renamed from: a */
        public final oee m42141a() {
            return new oee(this, null);
        }

        /* renamed from: b */
        public final fc8 m42142b() {
            return this.f38260a;
        }

        /* renamed from: c */
        public final void m42143c(fc8 fc8Var) {
            this.f38260a = fc8Var;
        }
    }

    /* renamed from: o.oee$b */
    public static final class C15782b {
        public C15782b() {
        }

        public /* synthetic */ C15782b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ oee(C15781a c15781a, id5 id5Var) {
        this(c15781a);
    }

    /* renamed from: a */
    public final fc8 m42140a() {
        return this.f38259a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && oee.class == obj.getClass() && sq8.m48644c(this.f38259a, ((oee) obj).f38259a);
    }

    public int hashCode() {
        fc8 fc8Var = this.f38259a;
        if (fc8Var != null) {
            return fc8Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecognizeCelebritiesRequest(");
        sb.append("image=" + this.f38259a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public oee(C15781a c15781a) {
        this.f38259a = c15781a.m42142b();
    }
}
