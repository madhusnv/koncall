package v3;

import ex.InterfaceC2139c;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import s3.AbstractC6744a;
import t3.C7027n;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n0 extends t3.w0 implements b1, t3.l0 {

    /* renamed from: f */
    public boolean f36954f;

    /* renamed from: g */
    public boolean f36955g;

    /* renamed from: h */
    public boolean f36956h;

    /* renamed from: j */
    public final t3.g0 f36957j = new t3.g0(0, this);

    /* renamed from: k */
    public e1.c0 f36958k;

    /* renamed from: l */
    public e1.c0 f36959l;

    public static void F0(h1 h1Var) {
        h0 h0Var;
        h1 h1Var2 = h1Var.f36903n;
        g0 g0Var = h1Var.f36902m;
        if (!AbstractC4154l.m8918a(h1Var2 != null ? h1Var2.f36902m : null, g0Var)) {
            g0Var.f36833L.f36943p.f37043B.m14619f();
            return;
        }
        InterfaceC7629a interfaceC7629aMo14527r = g0Var.f36833L.f36943p.mo14527r();
        if (interfaceC7629aMo14527r == null || (h0Var = ((y0) interfaceC7629aMo14527r).f37043B) == null) {
            return;
        }
        h0Var.m14619f();
    }

    public abstract boolean A0();

    public abstract g0 B0();

    public abstract t3.k0 C0();

    public abstract n0 D0();

    @Override // v3.b1
    /* renamed from: E */
    public final void mo14532E(boolean z6) {
        n0 n0VarD0 = D0();
        g0 g0VarB0 = n0VarD0 != null ? n0VarD0.B0() : null;
        if (AbstractC4154l.m8918a(g0VarB0, B0())) {
            this.f36954f = z6;
            return;
        }
        if ((g0VarB0 != null ? g0VarB0.f36833L.f36931d : null) != c0.LayingOut) {
            if ((g0VarB0 != null ? g0VarB0.f36833L.f36931d : null) != c0.LookaheadLayingOut) {
                return;
            }
        }
        this.f36954f = z6;
    }

    public abstract long E0();

    public abstract void G0();

    @Override // t3.l0
    /* renamed from: M */
    public final t3.k0 mo12873M(int i10, int i11, Map map, InterfaceC2139c interfaceC2139c) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            AbstractC6744a.m12907b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new l0(i10, i11, map, interfaceC2139c, this);
    }

    @Override // t3.InterfaceC7028o
    /* renamed from: R */
    public boolean mo12874R() {
        return false;
    }

    @Override // t3.w0
    public final int d0(C7027n c7027n) {
        int iT0;
        if (A0() && (iT0 = t0(c7027n)) != Integer.MIN_VALUE) {
            return iT0 + ((int) (this.f34034e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract int t0(C7027n c7027n);

    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(v3.t1 r26) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.n0.u0(v3.t1):void");
    }

    public abstract n0 x0();

    public abstract InterfaceC7033t z0();
}
