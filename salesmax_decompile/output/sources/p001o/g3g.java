package p001o;

/* loaded from: classes2.dex */
public final class g3g implements l1b {

    /* renamed from: a */
    public final jb3 f24531a;

    /* renamed from: b */
    public boolean f24532b;

    /* renamed from: c */
    public long f24533c;

    /* renamed from: d */
    public long f24534d;

    /* renamed from: e */
    public kad f24535e = kad.f31765d;

    public g3g(jb3 jb3Var) {
        this.f24531a = jb3Var;
    }

    @Override // p001o.l1b
    /* renamed from: G */
    public long mo7099G() {
        long j = this.f24533c;
        if (!this.f24532b) {
            return j;
        }
        long jElapsedRealtime = this.f24531a.elapsedRealtime() - this.f24534d;
        kad kadVar = this.f24535e;
        return j + (kadVar.f31768a == 1.0f ? sqi.O0(jElapsedRealtime) : kadVar.m35247a(jElapsedRealtime));
    }

    /* renamed from: a */
    public void m28026a(long j) {
        this.f24533c = j;
        if (this.f24532b) {
            this.f24534d = this.f24531a.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public void m28027b() {
        if (this.f24532b) {
            return;
        }
        this.f24534d = this.f24531a.elapsedRealtime();
        this.f24532b = true;
    }

    /* renamed from: c */
    public void m28028c() {
        if (this.f24532b) {
            m28026a(mo7099G());
            this.f24532b = false;
        }
    }

    @Override // p001o.l1b
    /* renamed from: d */
    public void mo7103d(kad kadVar) {
        if (this.f24532b) {
            m28026a(mo7099G());
        }
        this.f24535e = kadVar;
    }

    @Override // p001o.l1b
    /* renamed from: e */
    public kad mo7104e() {
        return this.f24535e;
    }
}
