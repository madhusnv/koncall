package p001o;

/* loaded from: classes2.dex */
public final class uu5 implements yhe {

    /* renamed from: a */
    public final xk7 f49497a;

    /* renamed from: b */
    public vu5 f49498b;

    public uu5(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "effect");
        this.f49497a = xk7Var;
    }

    @Override // p001o.yhe
    /* renamed from: a */
    public void mo26695a() {
        this.f49498b = (vu5) this.f49497a.invoke(k46.f31455a);
    }

    @Override // p001o.yhe
    /* renamed from: b */
    public void mo26696b() {
    }

    @Override // p001o.yhe
    /* renamed from: c */
    public void mo26697c() {
        vu5 vu5Var = this.f49498b;
        if (vu5Var != null) {
            vu5Var.dispose();
        }
        this.f49498b = null;
    }
}
