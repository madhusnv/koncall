package p001o;

/* loaded from: classes6.dex */
public abstract class ek6 extends z74 {

    /* renamed from: c */
    public long f21787c;

    /* renamed from: d */
    public boolean f21788d;

    /* renamed from: e */
    public oo0 f21789e;

    public static /* synthetic */ void E0(ek6 ek6Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        ek6Var.A0(z);
    }

    public static /* synthetic */ void u0(ek6 ek6Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        ek6Var.r0(z);
    }

    public final void A0(boolean z) {
        this.f21787c += v0(z);
        if (z) {
            return;
        }
        this.f21788d = true;
    }

    public final boolean F0() {
        return this.f21787c >= v0(true);
    }

    public final boolean G0() {
        oo0 oo0Var = this.f21789e;
        if (oo0Var != null) {
            return oo0Var.isEmpty();
        }
        return true;
    }

    public abstract long H0();

    public final boolean I0() {
        bu5 bu5Var;
        oo0 oo0Var = this.f21789e;
        if (oo0Var == null || (bu5Var = (bu5) oo0Var.m42475O()) == null) {
            return false;
        }
        bu5Var.run();
        return true;
    }

    public boolean K0() {
        return false;
    }

    @Override // p001o.z74
    public final z74 l0(int i, String str) {
        jda.m33601a(i);
        return jda.m33602b(this, str);
    }

    public final void r0(boolean z) {
        long jV0 = this.f21787c - v0(z);
        this.f21787c = jV0;
        if (jV0 <= 0 && this.f21788d) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public final long v0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void y0(bu5 bu5Var) {
        oo0 oo0Var = this.f21789e;
        if (oo0Var == null) {
            oo0Var = new oo0();
            this.f21789e = oo0Var;
        }
        oo0Var.m42481o(bu5Var);
    }

    public long z0() {
        oo0 oo0Var = this.f21789e;
        return (oo0Var == null || oo0Var.isEmpty()) ? Long.MAX_VALUE : 0L;
    }
}
