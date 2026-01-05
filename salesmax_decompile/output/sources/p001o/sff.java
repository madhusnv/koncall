package p001o;

import p001o.ln0;

/* loaded from: classes6.dex */
public final class sff extends lag implements ln0.InterfaceC15107a {

    /* renamed from: a */
    public final lag f45348a;

    /* renamed from: b */
    public boolean f45349b;

    /* renamed from: c */
    public ln0 f45350c;

    /* renamed from: d */
    public volatile boolean f45351d;

    public sff(lag lagVar) {
        this.f45348a = lagVar;
    }

    public void M0() {
        ln0 ln0Var;
        while (true) {
            synchronized (this) {
                ln0Var = this.f45350c;
                if (ln0Var == null) {
                    this.f45349b = false;
                    return;
                }
                this.f45350c = null;
            }
            ln0Var.m37508c(this);
        }
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public void mo16559a(su5 su5Var) {
        boolean z = true;
        if (!this.f45351d) {
            synchronized (this) {
                if (!this.f45351d) {
                    if (this.f45349b) {
                        ln0 ln0Var = this.f45350c;
                        if (ln0Var == null) {
                            ln0Var = new ln0(4);
                            this.f45350c = ln0Var;
                        }
                        ln0Var.m37507b(d3c.disposable(su5Var));
                        return;
                    }
                    this.f45349b = true;
                    z = false;
                }
            }
        }
        if (z) {
            su5Var.dispose();
        } else {
            this.f45348a.mo16559a(su5Var);
            M0();
        }
    }

    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        if (this.f45351d) {
            return;
        }
        synchronized (this) {
            if (this.f45351d) {
                return;
            }
            if (!this.f45349b) {
                this.f45349b = true;
                this.f45348a.mo16560e(obj);
                M0();
            } else {
                ln0 ln0Var = this.f45350c;
                if (ln0Var == null) {
                    ln0Var = new ln0(4);
                    this.f45350c = ln0Var;
                }
                ln0Var.m37507b(d3c.next(obj));
            }
        }
    }

    @Override // p001o.m9c
    public void onComplete() {
        if (this.f45351d) {
            return;
        }
        synchronized (this) {
            if (this.f45351d) {
                return;
            }
            this.f45351d = true;
            if (!this.f45349b) {
                this.f45349b = true;
                this.f45348a.onComplete();
                return;
            }
            ln0 ln0Var = this.f45350c;
            if (ln0Var == null) {
                ln0Var = new ln0(4);
                this.f45350c = ln0Var;
            }
            ln0Var.m37507b(d3c.complete());
        }
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        if (this.f45351d) {
            fwe.m27599r(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f45351d) {
                this.f45351d = true;
                if (this.f45349b) {
                    ln0 ln0Var = this.f45350c;
                    if (ln0Var == null) {
                        ln0Var = new ln0(4);
                        this.f45350c = ln0Var;
                    }
                    ln0Var.m37509d(d3c.error(th));
                    return;
                }
                this.f45349b = true;
                z = false;
            }
            if (z) {
                fwe.m27599r(th);
            } else {
                this.f45348a.onError(th);
            }
        }
    }

    @Override // p001o.ln0.InterfaceC15107a, p001o.ggd
    public boolean test(Object obj) {
        return d3c.acceptFull(obj, this.f45348a);
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f45348a.mo55724b(m9cVar);
    }
}
