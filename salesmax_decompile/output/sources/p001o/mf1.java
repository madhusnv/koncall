package p001o;

/* loaded from: classes6.dex */
public abstract class mf1 implements h67, g5e {

    /* renamed from: a */
    public final qag f35324a;

    /* renamed from: b */
    public rag f35325b;

    /* renamed from: c */
    public g5e f35326c;

    /* renamed from: d */
    public boolean f35327d;

    /* renamed from: e */
    public int f35328e;

    public mf1(qag qagVar) {
        this.f35324a = qagVar;
    }

    /* renamed from: a */
    public void m38865a() {
    }

    @Override // p001o.h67, p001o.qag
    /* renamed from: b */
    public final void mo18165b(rag ragVar) {
        if (wag.validate(this.f35325b, ragVar)) {
            this.f35325b = ragVar;
            if (ragVar instanceof g5e) {
                this.f35326c = (g5e) ragVar;
            }
            if (m38866c()) {
                this.f35324a.mo18165b(this);
                m38865a();
            }
        }
    }

    /* renamed from: c */
    public boolean m38866c() {
        return true;
    }

    @Override // p001o.rag
    public void cancel() {
        this.f35325b.cancel();
    }

    @Override // p001o.rtf
    public void clear() {
        this.f35326c.clear();
    }

    /* renamed from: d */
    public final void m38867d(Throwable th) {
        zk6.m59526b(th);
        this.f35325b.cancel();
        onError(th);
    }

    /* renamed from: g */
    public final int m38868g(int i) {
        g5e g5eVar = this.f35326c;
        if (g5eVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = g5eVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.f35328e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // p001o.rtf
    public boolean isEmpty() {
        return this.f35326c.isEmpty();
    }

    @Override // p001o.rtf
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p001o.qag
    public void onComplete() {
        if (this.f35327d) {
            return;
        }
        this.f35327d = true;
        this.f35324a.onComplete();
    }

    @Override // p001o.qag
    public void onError(Throwable th) {
        if (this.f35327d) {
            fwe.m27599r(th);
        } else {
            this.f35327d = true;
            this.f35324a.onError(th);
        }
    }

    @Override // p001o.rag
    public void request(long j) {
        this.f35325b.request(j);
    }
}
