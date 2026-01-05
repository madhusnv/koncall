package p001o;

/* loaded from: classes3.dex */
public final class c4g {

    /* renamed from: b */
    public static final C12550b f17275b = new C12550b(null);

    /* renamed from: a */
    public final rhg f17276a;

    /* renamed from: o.c4g$a */
    public static final class C12549a {

        /* renamed from: a */
        public rhg f17277a;

        /* renamed from: a */
        public final c4g m20198a() {
            return new c4g(this, null);
        }

        /* renamed from: b */
        public final C12549a m20199b() {
            return this;
        }

        /* renamed from: c */
        public final rhg m20200c() {
            return this.f17277a;
        }

        /* renamed from: d */
        public final void m20201d(rhg rhgVar) {
            this.f17277a = rhgVar;
        }
    }

    /* renamed from: o.c4g$b */
    public static final class C12550b {
        public C12550b() {
        }

        public /* synthetic */ C12550b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ c4g(C12549a c12549a, id5 id5Var) {
        this(c12549a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c4g.class == obj.getClass() && sq8.m48644c(this.f17276a, ((c4g) obj).f17276a);
    }

    public int hashCode() {
        rhg rhgVar = this.f17276a;
        if (rhgVar != null) {
            return rhgVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StartSpeechSynthesisTaskResponse(");
        sb.append("synthesisTask=" + this.f17276a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public c4g(C12549a c12549a) {
        this.f17276a = c12549a.m20200c();
    }
}
