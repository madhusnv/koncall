package p001o;

/* loaded from: classes6.dex */
public final class av5 implements m9c, su5 {

    /* renamed from: a */
    public final m9c f15277a;

    /* renamed from: b */
    public final gu3 f15278b;

    /* renamed from: c */
    public final jm f15279c;

    /* renamed from: d */
    public su5 f15280d;

    public av5(m9c m9cVar, gu3 gu3Var, jm jmVar) {
        this.f15277a = m9cVar;
        this.f15278b = gu3Var;
        this.f15279c = jmVar;
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public void mo16559a(su5 su5Var) {
        try {
            this.f15278b.accept(su5Var);
            if (zu5.validate(this.f15280d, su5Var)) {
                this.f15280d = su5Var;
                this.f15277a.mo16559a(this);
            }
        } catch (Throwable th) {
            zk6.m59526b(th);
            su5Var.dispose();
            this.f15280d = zu5.DISPOSED;
            h66.error(th, this.f15277a);
        }
    }

    @Override // p001o.su5
    public void dispose() {
        su5 su5Var = this.f15280d;
        zu5 zu5Var = zu5.DISPOSED;
        if (su5Var != zu5Var) {
            this.f15280d = zu5Var;
            try {
                this.f15279c.run();
            } catch (Throwable th) {
                zk6.m59526b(th);
                fwe.m27599r(th);
            }
            su5Var.dispose();
        }
    }

    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        this.f15277a.mo16560e(obj);
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return this.f15280d.isDisposed();
    }

    @Override // p001o.m9c
    public void onComplete() {
        su5 su5Var = this.f15280d;
        zu5 zu5Var = zu5.DISPOSED;
        if (su5Var != zu5Var) {
            this.f15280d = zu5Var;
            this.f15277a.onComplete();
        }
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        su5 su5Var = this.f15280d;
        zu5 zu5Var = zu5.DISPOSED;
        if (su5Var == zu5Var) {
            fwe.m27599r(th);
        } else {
            this.f15280d = zu5Var;
            this.f15277a.onError(th);
        }
    }
}
