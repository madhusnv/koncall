package v3;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import m2.C4640e;
import s4.C6754j;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f37039a;

    /* renamed from: b */
    public final /* synthetic */ y0 f37040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i10) {
        super(0);
        this.f37039a = i10;
        this.f37040b = y0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        t3.v0 placementScope;
        switch (this.f37039a) {
            case 0:
                y0 y0Var = this.f37040b;
                k0 k0Var = y0Var.f37057f;
                k0Var.f36936i = 0;
                C4640e c4640eM14613z = k0Var.f36928a.m14613z();
                Object[] objArr = c4640eM14613z.f22884a;
                int i10 = c4640eM14613z.f22886c;
                for (int i11 = 0; i11 < i10; i11++) {
                    y0 y0Var2 = ((g0) objArr[i11]).f36833L.f36943p;
                    y0Var2.f37059h = y0Var2.f37060j;
                    y0Var2.f37060j = Integer.MAX_VALUE;
                    y0Var2.f37071w = false;
                    if (y0Var2.f37063m == e0.InLayoutBlock) {
                        y0Var2.f37063m = e0.NotUsed;
                    }
                }
                g0 g0Var = k0Var.f36928a;
                g0 g0Var2 = k0Var.f36928a;
                C4640e c4640eM14613z2 = g0Var.m14613z();
                Object[] objArr2 = c4640eM14613z2.f22884a;
                int i12 = c4640eM14613z2.f22886c;
                for (int i13 = 0; i13 < i12; i13++) {
                    ((g0) objArr2[i13]).f36833L.f36943p.f37043B.f36881d = false;
                }
                y0Var.mo14526j().C0().mo12110d();
                C4640e c4640eM14613z3 = g0Var2.m14613z();
                Object[] objArr3 = c4640eM14613z3.f22884a;
                int i14 = c4640eM14613z3.f22886c;
                for (int i15 = 0; i15 < i14; i15++) {
                    g0 g0Var3 = (g0) objArr3[i15];
                    k0 k0Var2 = g0Var3.f36833L;
                    if (k0Var2.f36943p.f37059h != g0Var3.m14610w()) {
                        g0Var2.m14584N();
                        g0Var2.m14573C();
                        if (g0Var3.m14610w() == Integer.MAX_VALUE) {
                            if (k0Var2.f36930c) {
                                s0 s0Var = k0Var2.f36944q;
                                AbstractC4154l.m8920c(s0Var);
                                s0Var.t0(false);
                            }
                            k0Var2.f36943p.x0();
                        }
                    }
                }
                C4640e c4640eM14613z4 = g0Var2.m14613z();
                Object[] objArr4 = c4640eM14613z4.f22884a;
                int i16 = c4640eM14613z4.f22886c;
                for (int i17 = 0; i17 < i16; i17++) {
                    h0 h0Var = ((g0) objArr4[i17]).f36833L.f36943p.f37043B;
                    h0Var.f36882e = h0Var.f36881d;
                }
                break;
            case 1:
                y0 y0Var3 = this.f37040b;
                y0Var3.f37057f.m14637a().mo13314z(y0Var3.f37047F);
                break;
            default:
                y0 y0Var4 = this.f37040b;
                k0 k0Var3 = y0Var4.f37057f;
                h1 h1Var = k0Var3.m14637a().f36904p;
                if (h1Var == null || (placementScope = h1Var.f36957j) == null) {
                    placementScope = ((C7904v) j0.m14636a(k0Var3.f36928a)).getPlacementScope();
                }
                InterfaceC2139c interfaceC2139c = y0Var4.f37052L;
                if (interfaceC2139c == null) {
                    h1 h1VarM14637a = k0Var3.m14637a();
                    long j6 = y0Var4.f37053M;
                    float f6 = y0Var4.f37054N;
                    placementScope.getClass();
                    t3.v0.m13316a(placementScope, h1VarM14637a);
                    h1VarM14637a.k0(C6754j.m12942c(j6, h1VarM14637a.f34034e), f6, null);
                } else {
                    h1 h1VarM14637a2 = k0Var3.m14637a();
                    long j10 = y0Var4.f37053M;
                    float f10 = y0Var4.f37054N;
                    placementScope.getClass();
                    t3.v0.m13316a(placementScope, h1VarM14637a2);
                    h1VarM14637a2.k0(C6754j.m12942c(j10, h1VarM14637a2.f34034e), f10, interfaceC2139c);
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
