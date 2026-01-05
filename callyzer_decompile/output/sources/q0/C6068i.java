package q0;

import a1.c0;
import android.util.Size;
import i0.m0;
import i0.u0;
import i0.v0;
import l0.AbstractC4308h;
import og.y0;
import pg.i7;
import pg.o7;
import pg.t8;
import x4.C8299i;
import x4.C8302l;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q0.i */
/* loaded from: classes.dex */
public final class C6068i extends v0 {

    /* renamed from: o */
    public final C8302l f29589o;

    /* renamed from: p */
    public C8299i f29590p;

    /* renamed from: q */
    public v0 f29591q;

    /* renamed from: r */
    public C6070k f29592r;

    public C6068i(Size size, int i10) {
        super(size, i10);
        this.f29589o = i7.m11697b(new c0(17, this));
    }

    @Override // i0.v0
    /* renamed from: a */
    public final void mo7416a() {
        super.mo7416a();
        o7.m11809d(new RunnableC6065f(this, 2));
    }

    @Override // i0.v0
    /* renamed from: f */
    public final InterfaceFutureC8957d mo2229f() {
        return this.f29589o;
    }

    /* renamed from: g */
    public final boolean m12073g(v0 v0Var, Runnable runnable) {
        boolean z6;
        Size size = this.f16607h;
        o7.m11806a();
        v0Var.getClass();
        int i10 = v0Var.f16608i;
        Size size2 = v0Var.f16607h;
        v0 v0Var2 = this.f29591q;
        if (v0Var2 == v0Var) {
            return false;
        }
        y0.m11056f("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", v0Var2 == null);
        y0.m11051a("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i11 = this.f16608i;
        y0.m11051a(m0.m7377j(i11, i10, "The provider's format(", ") must match the parent(", ")"), i11 == i10);
        synchronized (this.f16600a) {
            z6 = this.f16602c;
        }
        y0.m11056f("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z6);
        this.f29591q = v0Var;
        AbstractC4308h.m9035e(v0Var.m7418c(), this.f29590p);
        v0Var.m7419d();
        AbstractC4308h.m9034d(this.f16604e).mo9026a(new u0(v0Var, 2), t8.m11872a());
        AbstractC4308h.m9034d(v0Var.f16606g).mo9026a(runnable, t8.m11875d());
        return true;
    }
}
