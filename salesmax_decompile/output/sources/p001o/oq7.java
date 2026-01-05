package p001o;

/* loaded from: classes3.dex */
public final class oq7 {

    /* renamed from: c */
    public static final C15870b f38722c = new C15870b(null);

    /* renamed from: a */
    public final zba f38723a;

    /* renamed from: b */
    public final aca f38724b;

    /* renamed from: o.oq7$a */
    public static final class C15869a {

        /* renamed from: a */
        public zba f38725a;

        /* renamed from: b */
        public aca f38726b;

        /* renamed from: a */
        public final oq7 m42540a() {
            return new oq7(this, null);
        }

        /* renamed from: b */
        public final C15869a m42541b() {
            return this;
        }

        /* renamed from: c */
        public final zba m42542c() {
            return this.f38725a;
        }

        /* renamed from: d */
        public final aca m42543d() {
            return this.f38726b;
        }

        /* renamed from: e */
        public final void m42544e(zba zbaVar) {
            this.f38725a = zbaVar;
        }

        /* renamed from: f */
        public final void m42545f(aca acaVar) {
            this.f38726b = acaVar;
        }
    }

    /* renamed from: o.oq7$b */
    public static final class C15870b {
        public C15870b() {
        }

        public /* synthetic */ C15870b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ oq7(C15869a c15869a, id5 id5Var) {
        this(c15869a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oq7.class != obj.getClass()) {
            return false;
        }
        oq7 oq7Var = (oq7) obj;
        return sq8.m48644c(this.f38723a, oq7Var.f38723a) && sq8.m48644c(this.f38724b, oq7Var.f38724b);
    }

    public int hashCode() {
        zba zbaVar = this.f38723a;
        int iHashCode = (zbaVar != null ? zbaVar.hashCode() : 0) * 31;
        aca acaVar = this.f38724b;
        return iHashCode + (acaVar != null ? acaVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetLexiconResponse(");
        sb.append("lexicon=" + this.f38723a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lexiconAttributes=");
        sb2.append(this.f38724b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public oq7(C15869a c15869a) {
        this.f38723a = c15869a.m42542c();
        this.f38724b = c15869a.m42543d();
    }
}
