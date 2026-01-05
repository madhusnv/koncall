package p001o;

/* loaded from: classes6.dex */
public final class qff implements m9c, su5 {

    /* renamed from: a */
    public final m9c f41831a;

    /* renamed from: b */
    public final boolean f41832b;

    /* renamed from: c */
    public su5 f41833c;

    /* renamed from: d */
    public boolean f41834d;

    /* renamed from: e */
    public ln0 f41835e;

    /* renamed from: f */
    public volatile boolean f41836f;

    public qff(m9c m9cVar) {
        this(m9cVar, false);
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public void mo16559a(su5 su5Var) {
        if (zu5.validate(this.f41833c, su5Var)) {
            this.f41833c = su5Var;
            this.f41831a.mo16559a(this);
        }
    }

    /* renamed from: b */
    public void m45367b() {
        ln0 ln0Var;
        do {
            synchronized (this) {
                ln0Var = this.f41835e;
                if (ln0Var == null) {
                    this.f41834d = false;
                    return;
                }
                this.f41835e = null;
            }
        } while (!ln0Var.m37506a(this.f41831a));
    }

    @Override // p001o.su5
    public void dispose() {
        this.f41836f = true;
        this.f41833c.dispose();
    }

    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        if (this.f41836f) {
            return;
        }
        if (obj == null) {
            this.f41833c.dispose();
            onError(xk6.m56414b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            if (this.f41836f) {
                return;
            }
            if (!this.f41834d) {
                this.f41834d = true;
                this.f41831a.mo16560e(obj);
                m45367b();
            } else {
                ln0 ln0Var = this.f41835e;
                if (ln0Var == null) {
                    ln0Var = new ln0(4);
                    this.f41835e = ln0Var;
                }
                ln0Var.m37507b(d3c.next(obj));
            }
        }
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return this.f41833c.isDisposed();
    }

    @Override // p001o.m9c
    public void onComplete() {
        if (this.f41836f) {
            return;
        }
        synchronized (this) {
            if (this.f41836f) {
                return;
            }
            if (!this.f41834d) {
                this.f41836f = true;
                this.f41834d = true;
                this.f41831a.onComplete();
            } else {
                ln0 ln0Var = this.f41835e;
                if (ln0Var == null) {
                    ln0Var = new ln0(4);
                    this.f41835e = ln0Var;
                }
                ln0Var.m37507b(d3c.complete());
            }
        }
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        if (this.f41836f) {
            fwe.m27599r(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f41836f) {
                if (this.f41834d) {
                    this.f41836f = true;
                    ln0 ln0Var = this.f41835e;
                    if (ln0Var == null) {
                        ln0Var = new ln0(4);
                        this.f41835e = ln0Var;
                    }
                    Object objError = d3c.error(th);
                    if (this.f41832b) {
                        ln0Var.m37507b(objError);
                    } else {
                        ln0Var.m37509d(objError);
                    }
                    return;
                }
                this.f41836f = true;
                this.f41834d = true;
                z = false;
            }
            if (z) {
                fwe.m27599r(th);
            } else {
                this.f41831a.onError(th);
            }
        }
    }

    public qff(m9c m9cVar, boolean z) {
        this.f41831a = m9cVar;
        this.f41832b = z;
    }
}
