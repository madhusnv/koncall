package p001o;

/* loaded from: classes2.dex */
public final class fh9 implements yhe {

    /* renamed from: a */
    public final nl7 f23329a;

    /* renamed from: b */
    public final h84 f23330b;

    /* renamed from: c */
    public p69 f23331c;

    public fh9(q74 q74Var, nl7 nl7Var) {
        sq8.m48649h(q74Var, "parentCoroutineContext");
        sq8.m48649h(nl7Var, "task");
        this.f23329a = nl7Var;
        this.f23330b = i84.m31707a(q74Var);
    }

    @Override // p001o.yhe
    /* renamed from: a */
    public void mo26695a() {
        p69 p69Var = this.f23331c;
        if (p69Var != null) {
            a79.m16548f(p69Var, "Old job was still running!", null, 2, null);
        }
        this.f23331c = rm1.m46952d(this.f23330b, null, null, this.f23329a, 3, null);
    }

    @Override // p001o.yhe
    /* renamed from: b */
    public void mo26696b() {
        p69 p69Var = this.f23331c;
        if (p69Var != null) {
            p69Var.mo22429f(new kba());
        }
        this.f23331c = null;
    }

    @Override // p001o.yhe
    /* renamed from: c */
    public void mo26697c() {
        p69 p69Var = this.f23331c;
        if (p69Var != null) {
            p69Var.mo22429f(new kba());
        }
        this.f23331c = null;
    }
}
