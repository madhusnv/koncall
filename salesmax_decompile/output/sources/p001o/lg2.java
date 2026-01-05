package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public abstract class lg2 extends h7 implements jg2 {

    /* renamed from: d */
    public final jg2 f33743d;

    public lg2(q74 q74Var, jg2 jg2Var, boolean z, boolean z2) {
        super(q74Var, z, z2);
        this.f33743d = jg2Var;
    }

    @Override // p001o.d79
    /* renamed from: L */
    public void mo22416L(Throwable th) {
        CancellationException cancellationExceptionL0 = d79.L0(this, th, null, 1, null);
        this.f33743d.mo23471f(cancellationExceptionL0);
        m22413I(cancellationExceptionL0);
    }

    public final jg2 W0() {
        return this;
    }

    public final jg2 X0() {
        return this.f33743d;
    }

    @Override // p001o.fdf
    /* renamed from: b */
    public void mo23470b(xk7 xk7Var) {
        this.f33743d.mo23470b(xk7Var);
    }

    @Override // p001o.d79, p001o.p69
    /* renamed from: f */
    public final void mo22429f(CancellationException cancellationException) {
        if (q0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new q69(mo22419P(), null, this);
        }
        mo22416L(cancellationException);
    }

    @Override // p001o.fdf
    /* renamed from: g */
    public Object mo23472g(Object obj) {
        return this.f33743d.mo23472g(obj);
    }

    @Override // p001o.eee
    /* renamed from: i */
    public pbf mo23473i() {
        return this.f33743d.mo23473i();
    }

    @Override // p001o.eee
    public sg2 iterator() {
        return this.f33743d.iterator();
    }

    @Override // p001o.eee
    /* renamed from: j */
    public pbf mo23474j() {
        return this.f33743d.mo23474j();
    }

    @Override // p001o.fdf
    /* renamed from: l */
    public Object mo23475l(Object obj, n64 n64Var) {
        return this.f33743d.mo23475l(obj, n64Var);
    }

    @Override // p001o.eee
    /* renamed from: m */
    public Object mo23476m(n64 n64Var) {
        return this.f33743d.mo23476m(n64Var);
    }

    @Override // p001o.fdf
    /* renamed from: n */
    public boolean mo23477n() {
        return this.f33743d.mo23477n();
    }

    @Override // p001o.fdf
    /* renamed from: q */
    public boolean mo23478q(Throwable th) {
        return this.f33743d.mo23478q(th);
    }
}
