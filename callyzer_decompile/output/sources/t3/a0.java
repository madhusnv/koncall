package t3;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import java.util.Map;
import m2.C4637b;
import rw.AbstractC6663m;
import s3.AbstractC6744a;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements g1 {

    /* renamed from: a */
    public EnumC6757m f33951a = EnumC6757m.Rtl;

    /* renamed from: b */
    public float f33952b;

    /* renamed from: c */
    public float f33953c;

    /* renamed from: d */
    public final /* synthetic */ f0 f33954d;

    public a0(f0 f0Var) {
        this.f33954d = f0Var;
    }

    @Override // t3.l0
    /* renamed from: M */
    public final k0 mo12873M(int i10, int i11, Map map, InterfaceC2139c interfaceC2139c) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            AbstractC6744a.m12907b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C7039z(i10, i11, map, this, this.f33954d, interfaceC2139c);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f33953c;
    }

    @Override // t3.InterfaceC7028o
    /* renamed from: R */
    public final boolean mo12874R() {
        v3.c0 c0Var = this.f33954d.f33979a.f36833L.f36931d;
        return c0Var == v3.c0.LookaheadLayingOut || c0Var == v3.c0.LookaheadMeasuring;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f33952b;
    }

    @Override // t3.g1
    public final List b0(Object obj, InterfaceC2141e interfaceC2141e) {
        f0 f0Var = this.f33954d;
        f0Var.m13287d();
        v3.g0 g0Var = f0Var.f33979a;
        v3.c0 c0Var = g0Var.f36833L.f36931d;
        v3.c0 c0Var2 = v3.c0.Measuring;
        if (c0Var != c0Var2 && c0Var != v3.c0.LayingOut && c0Var != v3.c0.LookaheadMeasuring && c0Var != v3.c0.LookaheadLayingOut) {
            AbstractC6744a.m12907b("subcompose can only be used inside the measure or layout blocks");
        }
        e1.j0 j0Var = f0Var.f33985g;
        Object objM5574g = j0Var.m5574g(obj);
        if (objM5574g == null) {
            objM5574g = (v3.g0) f0Var.f33988k.m5577j(obj);
            if (objM5574g != null) {
                if (f0Var.f33993q <= 0) {
                    AbstractC6744a.m12907b("Check failed.");
                }
                f0Var.f33993q--;
            } else {
                objM5574g = f0Var.m13291i(obj);
                if (objM5574g == null) {
                    int i10 = f0Var.f33982d;
                    v3.g0 g0Var2 = new v3.g0(2);
                    g0Var.f36858s = true;
                    g0Var.m14572B(i10, g0Var2);
                    g0Var.f36858s = false;
                    objM5574g = g0Var2;
                }
            }
            j0Var.m5579l(obj, objM5574g);
        }
        v3.g0 g0Var3 = (v3.g0) objM5574g;
        if (AbstractC6663m.m12744H(g0Var.m14604q(), f0Var.f33982d) != g0Var3) {
            int iM9513k = ((C4637b) g0Var.m14604q()).f22878a.m9513k(g0Var3);
            if (iM9513k < f0Var.f33982d) {
                AbstractC6744a.m12906a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i11 = f0Var.f33982d;
            if (i11 != iM9513k) {
                g0Var.f36858s = true;
                g0Var.m14582L(iM9513k, i11, 1);
                g0Var.f36858s = false;
            }
        }
        f0Var.f33982d++;
        f0Var.m13290g(g0Var3, obj, interfaceC2141e);
        return (c0Var == c0Var2 || c0Var == v3.c0.LayingOut) ? g0Var3.m14602o() : g0Var3.m14601m();
    }

    @Override // t3.InterfaceC7028o
    public final EnumC6757m getLayoutDirection() {
        return this.f33951a;
    }
}
