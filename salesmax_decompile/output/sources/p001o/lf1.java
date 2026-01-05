package p001o;

/* loaded from: classes6.dex */
public abstract class lf1 implements m9c, e5e {

    /* renamed from: a */
    public final m9c f33700a;

    /* renamed from: b */
    public su5 f33701b;

    /* renamed from: c */
    public e5e f33702c;

    /* renamed from: d */
    public boolean f33703d;

    /* renamed from: e */
    public int f33704e;

    public lf1(m9c m9cVar) {
        this.f33700a = m9cVar;
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public final void mo16559a(su5 su5Var) {
        if (zu5.validate(this.f33701b, su5Var)) {
            this.f33701b = su5Var;
            if (su5Var instanceof e5e) {
                this.f33702c = (e5e) su5Var;
            }
            if (m37057d()) {
                this.f33700a.mo16559a(this);
                m37056b();
            }
        }
    }

    /* renamed from: b */
    public void m37056b() {
    }

    @Override // p001o.rtf
    public void clear() {
        this.f33702c.clear();
    }

    /* renamed from: d */
    public boolean m37057d() {
        return true;
    }

    @Override // p001o.su5
    public void dispose() {
        this.f33701b.dispose();
    }

    /* renamed from: f */
    public final void m37058f(Throwable th) {
        zk6.m59526b(th);
        this.f33701b.dispose();
        onError(th);
    }

    /* renamed from: h */
    public final int m37059h(int i) {
        e5e e5eVar = this.f33702c;
        if (e5eVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = e5eVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.f33704e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return this.f33701b.isDisposed();
    }

    @Override // p001o.rtf
    public boolean isEmpty() {
        return this.f33702c.isEmpty();
    }

    @Override // p001o.rtf
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p001o.m9c
    public void onComplete() {
        if (this.f33703d) {
            return;
        }
        this.f33703d = true;
        this.f33700a.onComplete();
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        if (this.f33703d) {
            fwe.m27599r(th);
        } else {
            this.f33703d = true;
            this.f33700a.onError(th);
        }
    }
}
