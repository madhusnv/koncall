package p001o;

/* loaded from: classes3.dex */
public final class mr7 {

    /* renamed from: b */
    public static final C15406b f35869b = new C15406b(null);

    /* renamed from: a */
    public final rhg f35870a;

    /* renamed from: o.mr7$a */
    public static final class C15405a {

        /* renamed from: a */
        public rhg f35871a;

        /* renamed from: a */
        public final mr7 m39518a() {
            return new mr7(this, null);
        }

        /* renamed from: b */
        public final C15405a m39519b() {
            return this;
        }

        /* renamed from: c */
        public final rhg m39520c() {
            return this.f35871a;
        }

        /* renamed from: d */
        public final void m39521d(rhg rhgVar) {
            this.f35871a = rhgVar;
        }
    }

    /* renamed from: o.mr7$b */
    public static final class C15406b {
        public C15406b() {
        }

        public /* synthetic */ C15406b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ mr7(C15405a c15405a, id5 id5Var) {
        this(c15405a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mr7.class == obj.getClass() && sq8.m48644c(this.f35870a, ((mr7) obj).f35870a);
    }

    public int hashCode() {
        rhg rhgVar = this.f35870a;
        if (rhgVar != null) {
            return rhgVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetSpeechSynthesisTaskResponse(");
        sb.append("synthesisTask=" + this.f35870a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public mr7(C15405a c15405a) {
        this.f35870a = c15405a.m39520c();
    }
}
