package j7;

import d7.g0;
import d7.h0;
import k7.RunnableC4019a;
import nf.C5042d;
import og.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j7.b */
/* loaded from: classes.dex */
public final class C3595b extends g0 {

    /* renamed from: l */
    public final C5042d f19214l;

    /* renamed from: m */
    public Object f19215m;

    /* renamed from: n */
    public C3596c f19216n;

    public C3595b(C5042d c5042d) {
        this.f19214l = c5042d;
        if (c5042d.f24806a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        c5042d.f24806a = this;
    }

    @Override // d7.d0
    /* renamed from: g */
    public final void mo5317g() {
        C5042d c5042d = this.f19214l;
        c5042d.f24807b = true;
        c5042d.f24809d = false;
        c5042d.f24808c = false;
        c5042d.f24814i.drainPermits();
        c5042d.m9962a();
        c5042d.f24812g = new RunnableC4019a(c5042d);
        c5042d.m9963b();
    }

    @Override // d7.d0
    /* renamed from: h */
    public final void mo5318h() {
        this.f19214l.f24807b = false;
    }

    @Override // d7.d0
    /* renamed from: j */
    public final void mo5320j(h0 h0Var) {
        super.mo5320j(h0Var);
        this.f19215m = null;
        this.f19216n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [d7.u, java.lang.Object] */
    /* renamed from: l */
    public final void m8159l() {
        ?? r02 = this.f19215m;
        C3596c c3596c = this.f19216n;
        if (r02 == 0 || c3596c == null) {
            return;
        }
        super.mo5320j(c3596c);
        m5315e(r02, c3596c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        v0.m11008a(this.f19214l, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
