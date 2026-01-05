package p001o;

/* loaded from: classes6.dex */
public abstract class kf1 implements kq3, g5e {

    /* renamed from: a */
    public final kq3 f32129a;

    /* renamed from: b */
    public rag f32130b;

    /* renamed from: c */
    public g5e f32131c;

    /* renamed from: d */
    public boolean f32132d;

    /* renamed from: e */
    public int f32133e;

    public kf1(kq3 kq3Var) {
        this.f32129a = kq3Var;
    }

    /* renamed from: a */
    public void m35565a() {
    }

    @Override // p001o.h67, p001o.qag
    /* renamed from: b */
    public final void mo18165b(rag ragVar) {
        if (wag.validate(this.f32130b, ragVar)) {
            this.f32130b = ragVar;
            if (ragVar instanceof g5e) {
                this.f32131c = (g5e) ragVar;
            }
            if (m35566c()) {
                this.f32129a.mo18165b(this);
                m35565a();
            }
        }
    }

    /* renamed from: c */
    public boolean m35566c() {
        return true;
    }

    @Override // p001o.rag
    public void cancel() {
        this.f32130b.cancel();
    }

    @Override // p001o.rtf
    public void clear() {
        this.f32131c.clear();
    }

    /* renamed from: d */
    public final void m35567d(Throwable th) {
        zk6.m59526b(th);
        this.f32130b.cancel();
        onError(th);
    }

    /* renamed from: g */
    public final int m35568g(int i) {
        g5e g5eVar = this.f32131c;
        if (g5eVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = g5eVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.f32133e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // p001o.rtf
    public boolean isEmpty() {
        return this.f32131c.isEmpty();
    }

    @Override // p001o.rtf
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p001o.qag
    public void onComplete() {
        if (this.f32132d) {
            return;
        }
        this.f32132d = true;
        this.f32129a.onComplete();
    }

    @Override // p001o.qag
    public void onError(Throwable th) {
        if (this.f32132d) {
            fwe.m27599r(th);
        } else {
            this.f32132d = true;
            this.f32129a.onError(th);
        }
    }

    @Override // p001o.rag
    public void request(long j) {
        this.f32130b.request(j);
    }
}
