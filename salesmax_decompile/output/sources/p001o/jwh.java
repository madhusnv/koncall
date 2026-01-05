package p001o;

/* loaded from: classes3.dex */
public final class jwh {

    /* renamed from: d */
    public static final C14679b f31203d = new C14679b(null);

    /* renamed from: a */
    public final nl1 f31204a;

    /* renamed from: b */
    public final gf7 f31205b;

    /* renamed from: c */
    public final ild f31206c;

    /* renamed from: o.jwh$a */
    public static final class C14678a {

        /* renamed from: a */
        public nl1 f31207a;

        /* renamed from: b */
        public gf7 f31208b;

        /* renamed from: c */
        public ild f31209c;

        /* renamed from: a */
        public final jwh m34640a() {
            return new jwh(this, null);
        }

        /* renamed from: b */
        public final C14678a m34641b() {
            return this;
        }

        /* renamed from: c */
        public final nl1 m34642c() {
            return this.f31207a;
        }

        /* renamed from: d */
        public final gf7 m34643d() {
            return this.f31208b;
        }

        /* renamed from: e */
        public final ild m34644e() {
            return this.f31209c;
        }

        /* renamed from: f */
        public final void m34645f(nl1 nl1Var) {
            this.f31207a = nl1Var;
        }

        /* renamed from: g */
        public final void m34646g(gf7 gf7Var) {
            this.f31208b = gf7Var;
        }

        /* renamed from: h */
        public final void m34647h(ild ildVar) {
            this.f31209c = ildVar;
        }
    }

    /* renamed from: o.jwh$b */
    public static final class C14679b {
        public C14679b() {
        }

        public /* synthetic */ C14679b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ jwh(C14678a c14678a, id5 id5Var) {
        this(c14678a);
    }

    /* renamed from: a */
    public final nl1 m34637a() {
        return this.f31204a;
    }

    /* renamed from: b */
    public final gf7 m34638b() {
        return this.f31205b;
    }

    /* renamed from: c */
    public final ild m34639c() {
        return this.f31206c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jwh.class != obj.getClass()) {
            return false;
        }
        jwh jwhVar = (jwh) obj;
        return sq8.m48644c(this.f31204a, jwhVar.f31204a) && sq8.m48644c(this.f31205b, jwhVar.f31205b) && sq8.m48644c(this.f31206c, jwhVar.f31206c);
    }

    public int hashCode() {
        nl1 nl1Var = this.f31204a;
        int iHashCode = (nl1Var != null ? nl1Var.hashCode() : 0) * 31;
        gf7 gf7Var = this.f31205b;
        int iHashCode2 = (iHashCode + (gf7Var != null ? gf7Var.hashCode() : 0)) * 31;
        ild ildVar = this.f31206c;
        return iHashCode2 + (ildVar != null ? ildVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TranslationSettings(");
        sb.append("brevity=" + this.f31204a + ',');
        sb.append("formality=" + this.f31205b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("profanity=");
        sb2.append(this.f31206c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public jwh(C14678a c14678a) {
        this.f31204a = c14678a.m34642c();
        this.f31205b = c14678a.m34643d();
        this.f31206c = c14678a.m34644e();
    }
}
