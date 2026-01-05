package k1;

import c9.C0908c;
import c9.C0925t;
import dr.C1769s;
import ex.InterfaceC2142f;
import hp.C2995b;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends f0 {

    /* renamed from: C */
    public C0908c f20140C;

    /* renamed from: D */
    public x0 f20141D;

    /* renamed from: E */
    public boolean f20142E;

    /* renamed from: F */
    public InterfaceC2142f f20143F;

    /* renamed from: G */
    public InterfaceC2142f f20144G;

    @Override // k1.f0
    public final Object S0(e0 e0Var, e0 e0Var2) throws Throwable {
        C0908c c0908c = this.f20140C;
        Object objM2674c = ((C0925t) c0908c.f5575c).m2674c(i1.y0.UserInput, new C1769s(c0908c, new C2995b(e0Var, this, (InterfaceC7559c) null, 10), (InterfaceC7559c) null), e0Var2);
        if (objM2674c != EnumC7794a.COROUTINE_SUSPENDED) {
            objM2674c = qw.a0.f30746a;
        }
        return objM2674c == EnumC7794a.COROUTINE_SUSPENDED ? objM2674c : qw.a0.f30746a;
    }

    @Override // k1.f0
    public final void T0(long j6) {
        if (!this.f37683p || AbstractC4154l.m8918a(this.f20143F, h0.f20107a)) {
            return;
        }
        tx.c0.m13502y(z0(), null, tx.b0.UNDISPATCHED, new i0(this, j6, (InterfaceC7559c) null, 0), 1);
    }

    @Override // k1.f0
    public final void U0(long j6) {
        if (!this.f37683p || AbstractC4154l.m8918a(this.f20144G, h0.f20108b)) {
            return;
        }
        tx.c0.m13502y(z0(), null, tx.b0.UNDISPATCHED, new i0(this, j6, (InterfaceC7559c) null, 1), 1);
    }

    @Override // k1.f0
    public final boolean V0() {
        return this.f20142E;
    }
}
