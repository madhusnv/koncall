package p001o;

/* loaded from: classes3.dex */
public final class f6 {

    /* renamed from: b */
    public static final C13344b f22773b = new C13344b(null);

    /* renamed from: a */
    public final ame f22774a;

    /* renamed from: o.f6$a */
    public static final class C13343a {

        /* renamed from: a */
        public ame f22775a;

        /* renamed from: a */
        public final f6 m26194a() {
            return new f6(this, null);
        }

        /* renamed from: b */
        public final C13343a m26195b() {
            return this;
        }

        /* renamed from: c */
        public final ame m26196c() {
            return this.f22775a;
        }

        /* renamed from: d */
        public final void m26197d(ame ameVar) {
            this.f22775a = ameVar;
        }
    }

    /* renamed from: o.f6$b */
    public static final class C13344b {
        public C13344b() {
        }

        public /* synthetic */ C13344b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ f6(C13343a c13343a, id5 id5Var) {
        this(c13343a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f6.class == obj.getClass() && sq8.m48644c(this.f22774a, ((f6) obj).f22774a);
    }

    public int hashCode() {
        ame ameVar = this.f22774a;
        if (ameVar != null) {
            return ameVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AbortMultipartUploadResponse(");
        sb.append("requestCharged=" + this.f22774a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public f6(C13343a c13343a) {
        this.f22774a = c13343a.m26196c();
    }
}
