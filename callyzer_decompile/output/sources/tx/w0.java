package tx;

import rw.C6661k;
import yx.AbstractC8808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class w0 extends AbstractC7262v {

    /* renamed from: f */
    public static final /* synthetic */ int f34690f = 0;

    /* renamed from: c */
    public long f34691c;

    /* renamed from: d */
    public boolean f34692d;

    /* renamed from: e */
    public C6661k f34693e;

    @Override // tx.AbstractC7262v
    public final AbstractC7262v E0(int i10) {
        AbstractC8808b.m16243c(i10);
        return this;
    }

    public final void F0(boolean z6) {
        long j6 = this.f34691c - (z6 ? 4294967296L : 1L);
        this.f34691c = j6;
        if (j6 <= 0 && this.f34692d) {
            shutdown();
        }
    }

    public final void G0(k0 k0Var) {
        C6661k c6661k = this.f34693e;
        if (c6661k == null) {
            c6661k = new C6661k();
            this.f34693e = c6661k;
        }
        c6661k.addLast(k0Var);
    }

    public abstract Thread H0();

    public final void I0(boolean z6) {
        this.f34691c = (z6 ? 4294967296L : 1L) + this.f34691c;
        if (z6) {
            return;
        }
        this.f34692d = true;
    }

    public abstract long J0();

    public final boolean K0() {
        C6661k c6661k = this.f34693e;
        if (c6661k == null) {
            return false;
        }
        k0 k0Var = (k0) (c6661k.isEmpty() ? null : c6661k.removeFirst());
        if (k0Var == null) {
            return false;
        }
        k0Var.run();
        return true;
    }

    public void L0(long j6, t0 t0Var) {
        d0.f34618k.Q0(j6, t0Var);
    }

    public abstract void shutdown();
}
