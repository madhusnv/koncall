package p001o;

/* loaded from: classes6.dex */
public final class s79 {

    /* renamed from: a */
    public boolean f44886a;

    /* renamed from: b */
    public boolean f44887b;

    /* renamed from: c */
    public boolean f44888c;

    /* renamed from: d */
    public boolean f44889d;

    /* renamed from: e */
    public boolean f44890e;

    /* renamed from: f */
    public boolean f44891f;

    /* renamed from: g */
    public String f44892g;

    /* renamed from: h */
    public boolean f44893h;

    /* renamed from: i */
    public boolean f44894i;

    /* renamed from: j */
    public String f44895j;

    /* renamed from: k */
    public ea3 f44896k;

    /* renamed from: l */
    public boolean f44897l;

    /* renamed from: m */
    public boolean f44898m;

    /* renamed from: n */
    public v99 f44899n;

    /* renamed from: o */
    public boolean f44900o;

    /* renamed from: p */
    public boolean f44901p;

    /* renamed from: q */
    public wff f44902q;

    public s79(p79 p79Var) {
        sq8.m48649h(p79Var, "json");
        this.f44886a = p79Var.m43087d().m51131h();
        this.f44887b = p79Var.m43087d().m51132i();
        this.f44888c = p79Var.m43087d().m51133j();
        this.f44889d = p79Var.m43087d().m51139p();
        this.f44890e = p79Var.m43087d().m51125b();
        this.f44891f = p79Var.m43087d().m51135l();
        this.f44892g = p79Var.m43087d().m51136m();
        this.f44893h = p79Var.m43087d().m51129f();
        this.f44894i = p79Var.m43087d().m51138o();
        this.f44895j = p79Var.m43087d().m51127d();
        this.f44896k = p79Var.m43087d().m51128e();
        this.f44897l = p79Var.m43087d().m51124a();
        this.f44898m = p79Var.m43087d().m51137n();
        this.f44899n = p79Var.m43087d().m51134k();
        this.f44900o = p79Var.m43087d().m51130g();
        this.f44901p = p79Var.m43087d().m51126c();
        this.f44902q = p79Var.mo43085a();
    }

    /* renamed from: a */
    public final u79 m47944a() {
        boolean z = true;
        if (this.f44894i) {
            if (!sq8.m48644c(this.f44895j, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
            }
            if (!(this.f44896k == ea3.POLYMORPHIC)) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.".toString());
            }
        }
        if (this.f44891f) {
            if (!sq8.m48644c(this.f44892g, "    ")) {
                String str = this.f44892g;
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        break;
                    }
                    char cCharAt = str.charAt(i);
                    if (!(cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f44892g).toString());
                }
            }
        } else if (!sq8.m48644c(this.f44892g, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new u79(this.f44886a, this.f44888c, this.f44889d, this.f44890e, this.f44891f, this.f44887b, this.f44892g, this.f44893h, this.f44894i, this.f44895j, this.f44897l, this.f44898m, this.f44899n, this.f44900o, this.f44901p, this.f44896k);
    }

    /* renamed from: b */
    public final wff m47945b() {
        return this.f44902q;
    }

    /* renamed from: c */
    public final void m47946c(boolean z) {
        this.f44887b = z;
    }

    /* renamed from: d */
    public final void m47947d(boolean z) {
        this.f44888c = z;
    }

    /* renamed from: e */
    public final void m47948e(v99 v99Var) {
        this.f44899n = v99Var;
    }
}
