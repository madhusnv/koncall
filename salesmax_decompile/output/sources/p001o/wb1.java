package p001o;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class wb1 implements dz4 {

    /* renamed from: a */
    public final boolean f51707a;

    /* renamed from: b */
    public final ArrayList f51708b = new ArrayList(1);

    /* renamed from: c */
    public int f51709c;

    /* renamed from: d */
    public iz4 f51710d;

    public wb1(boolean z) {
        this.f51707a = z;
    }

    @Override // p001o.dz4
    /* renamed from: j */
    public final void mo23961j(juh juhVar) {
        op0.m42515e(juhVar);
        if (this.f51708b.contains(juhVar)) {
            return;
        }
        this.f51708b.add(juhVar);
        this.f51709c++;
    }

    /* renamed from: n */
    public final void m54152n(int i) {
        iz4 iz4Var = (iz4) sqi.m48729h(this.f51710d);
        for (int i2 = 0; i2 < this.f51709c; i2++) {
            ((juh) this.f51708b.get(i2)).mo24759f(this, iz4Var, this.f51707a, i);
        }
    }

    /* renamed from: o */
    public final void m54153o() {
        iz4 iz4Var = (iz4) sqi.m48729h(this.f51710d);
        for (int i = 0; i < this.f51709c; i++) {
            ((juh) this.f51708b.get(i)).mo24762i(this, iz4Var, this.f51707a);
        }
        this.f51710d = null;
    }

    /* renamed from: p */
    public final void m54154p(iz4 iz4Var) {
        for (int i = 0; i < this.f51709c; i++) {
            ((juh) this.f51708b.get(i)).mo24760g(this, iz4Var, this.f51707a);
        }
    }

    /* renamed from: q */
    public final void m54155q(iz4 iz4Var) {
        this.f51710d = iz4Var;
        for (int i = 0; i < this.f51709c; i++) {
            ((juh) this.f51708b.get(i)).mo24761h(this, iz4Var, this.f51707a);
        }
    }
}
