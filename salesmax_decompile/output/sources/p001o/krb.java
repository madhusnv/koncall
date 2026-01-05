package p001o;

/* loaded from: classes6.dex */
public final class krb extends z74 implements mk5 {

    /* renamed from: c */
    public final /* synthetic */ mk5 f32602c;

    /* renamed from: d */
    public final z74 f32603d;

    /* renamed from: e */
    public final String f32604e;

    /* JADX WARN: Multi-variable type inference failed */
    public krb(z74 z74Var, String str) {
        mk5 mk5Var = z74Var instanceof mk5 ? (mk5) z74Var : null;
        this.f32602c = mk5Var == null ? xd5.m56042a() : mk5Var;
        this.f32603d = z74Var;
        this.f32604e = str;
    }

    @Override // p001o.mk5
    /* renamed from: D */
    public void mo26962D(long j, xb2 xb2Var) {
        this.f32602c.mo26962D(j, xb2Var);
    }

    @Override // p001o.z74
    /* renamed from: K */
    public void mo22314K(q74 q74Var, Runnable runnable) {
        this.f32603d.mo22314K(q74Var, runnable);
    }

    @Override // p001o.z74
    /* renamed from: X */
    public void mo26180X(q74 q74Var, Runnable runnable) {
        this.f32603d.mo26180X(q74Var, runnable);
    }

    @Override // p001o.z74
    public boolean k0(q74 q74Var) {
        return this.f32603d.k0(q74Var);
    }

    @Override // p001o.mk5
    /* renamed from: t */
    public yu5 mo26963t(long j, Runnable runnable, q74 q74Var) {
        return this.f32602c.mo26963t(j, runnable, q74Var);
    }

    @Override // p001o.z74
    public String toString() {
        return this.f32604e;
    }
}
