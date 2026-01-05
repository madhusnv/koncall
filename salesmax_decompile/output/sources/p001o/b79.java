package p001o;

/* loaded from: classes6.dex */
public abstract class b79 extends kia implements yu5, oh8 {

    /* renamed from: d */
    public d79 f15642d;

    @Override // p001o.oh8
    /* renamed from: a */
    public boolean mo18081a() {
        return true;
    }

    @Override // p001o.oh8
    /* renamed from: b */
    public b0c mo18082b() {
        return null;
    }

    @Override // p001o.yu5
    public void dispose() {
        m18249u().G0(this);
    }

    @Override // p001o.kia
    public String toString() {
        return o75.m41657a(this) + '@' + o75.m41658b(this) + "[job@" + o75.m41658b(m18249u()) + ']';
    }

    /* renamed from: u */
    public final d79 m18249u() {
        d79 d79Var = this.f15642d;
        if (d79Var != null) {
            return d79Var;
        }
        sq8.m48667z("job");
        return null;
    }

    /* renamed from: v */
    public abstract boolean mo18250v();

    /* renamed from: w */
    public abstract void mo18251w(Throwable th);

    /* renamed from: x */
    public final void m18252x(d79 d79Var) {
        this.f15642d = d79Var;
    }
}
