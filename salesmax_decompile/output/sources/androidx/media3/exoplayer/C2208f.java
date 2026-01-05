package androidx.media3.exoplayer;

import p001o.g3g;
import p001o.jb3;
import p001o.kad;
import p001o.l1b;
import p001o.op0;
import p001o.qm6;

/* renamed from: androidx.media3.exoplayer.f */
/* loaded from: classes2.dex */
public final class C2208f implements l1b {

    /* renamed from: a */
    public final g3g f8303a;

    /* renamed from: b */
    public final a f8304b;

    /* renamed from: c */
    public InterfaceC2218o f8305c;

    /* renamed from: d */
    public l1b f8306d;

    /* renamed from: e */
    public boolean f8307e = true;

    /* renamed from: f */
    public boolean f8308f;

    /* renamed from: androidx.media3.exoplayer.f$a */
    public interface a {
        /* renamed from: q */
        void mo7111q(kad kadVar);
    }

    public C2208f(a aVar, jb3 jb3Var) {
        this.f8304b = aVar;
        this.f8303a = new g3g(jb3Var);
    }

    @Override // p001o.l1b
    /* renamed from: G */
    public long mo7099G() {
        return this.f8307e ? this.f8303a.mo7099G() : ((l1b) op0.m42515e(this.f8306d)).mo7099G();
    }

    /* renamed from: a */
    public void m7100a(InterfaceC2218o interfaceC2218o) {
        if (interfaceC2218o == this.f8305c) {
            this.f8306d = null;
            this.f8305c = null;
            this.f8307e = true;
        }
    }

    /* renamed from: b */
    public void m7101b(InterfaceC2218o interfaceC2218o) throws qm6 {
        l1b l1bVar;
        l1b l1bVarMo6876N = interfaceC2218o.mo6876N();
        if (l1bVarMo6876N == null || l1bVarMo6876N == (l1bVar = this.f8306d)) {
            return;
        }
        if (l1bVar != null) {
            throw qm6.m45650d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f8306d = l1bVarMo6876N;
        this.f8305c = interfaceC2218o;
        l1bVarMo6876N.mo7103d(this.f8303a.mo7104e());
    }

    /* renamed from: c */
    public void m7102c(long j) {
        this.f8303a.m28026a(j);
    }

    @Override // p001o.l1b
    /* renamed from: d */
    public void mo7103d(kad kadVar) {
        l1b l1bVar = this.f8306d;
        if (l1bVar != null) {
            l1bVar.mo7103d(kadVar);
            kadVar = this.f8306d.mo7104e();
        }
        this.f8303a.mo7103d(kadVar);
    }

    @Override // p001o.l1b
    /* renamed from: e */
    public kad mo7104e() {
        l1b l1bVar = this.f8306d;
        return l1bVar != null ? l1bVar.mo7104e() : this.f8303a.mo7104e();
    }

    /* renamed from: f */
    public final boolean m7105f(boolean z) {
        InterfaceC2218o interfaceC2218o = this.f8305c;
        return interfaceC2218o == null || interfaceC2218o.mo7429b() || (z && this.f8305c.getState() != 2) || (!this.f8305c.isReady() && (z || this.f8305c.mo6890i()));
    }

    /* renamed from: g */
    public void m7106g() {
        this.f8308f = true;
        this.f8303a.m28027b();
    }

    /* renamed from: h */
    public void m7107h() {
        this.f8308f = false;
        this.f8303a.m28028c();
    }

    /* renamed from: i */
    public long m7108i(boolean z) {
        m7109j(z);
        return mo7099G();
    }

    /* renamed from: j */
    public final void m7109j(boolean z) {
        if (m7105f(z)) {
            this.f8307e = true;
            if (this.f8308f) {
                this.f8303a.m28027b();
                return;
            }
            return;
        }
        l1b l1bVar = (l1b) op0.m42515e(this.f8306d);
        long jMo7099G = l1bVar.mo7099G();
        if (this.f8307e) {
            if (jMo7099G < this.f8303a.mo7099G()) {
                this.f8303a.m28028c();
                return;
            } else {
                this.f8307e = false;
                if (this.f8308f) {
                    this.f8303a.m28027b();
                }
            }
        }
        this.f8303a.m28026a(jMo7099G);
        kad kadVarMo7104e = l1bVar.mo7104e();
        if (kadVarMo7104e.equals(this.f8303a.mo7104e())) {
            return;
        }
        this.f8303a.mo7103d(kadVarMo7104e);
        this.f8304b.mo7111q(kadVarMo7104e);
    }

    @Override // p001o.l1b
    /* renamed from: t */
    public boolean mo7110t() {
        return this.f8307e ? this.f8303a.mo7110t() : ((l1b) op0.m42515e(this.f8306d)).mo7110t();
    }
}
