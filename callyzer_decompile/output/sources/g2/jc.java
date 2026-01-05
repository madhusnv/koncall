package g2;

import androidx.compose.ui.draw.AbstractC0258a;
import aq.C0408k;
import b3.C0581m;
import ex.InterfaceC2141e;
import fb.AbstractC2250x;
import h1.AbstractC2773d;
import k2.C3966o;
import k2.InterfaceC3962k;
import m1.InterfaceC4629k;
import o1.AbstractC5256o;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import s2.AbstractC6740i;
import w2.AbstractC7862a;
import w2.C7876o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class jc {

    /* renamed from: a */
    public static final jc f11877a = new jc();

    /* renamed from: b */
    public static final float f11878b = 56;

    /* renamed from: c */
    public static final float f11879c = 280;

    /* renamed from: d */
    public static final float f11880d = 1;

    /* renamed from: e */
    public static final float f11881e = 2;

    /* renamed from: c */
    public static o1.i1 m6183c() {
        float f6 = h2.s0.f15774b;
        return new o1.i1(f6, h2.s0.f15776d, f6, 0);
    }

    /* renamed from: a */
    public final void m6184a(boolean z6, boolean z10, InterfaceC4629k interfaceC4629k, ec ecVar, d3.l0 l0Var, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-818661242);
        int i11 = i10 | (c3966o.m8615h(z6) ? 4 : 2) | (c3966o.m8615h(z10) ? 32 : 16) | (c3966o.m8614g(interfaceC4629k) ? 256 : 128) | (c3966o.m8614g(ecVar) ? 16384 : 8192) | (c3966o.m8614g(l0Var) ? 131072 : 65536);
        if ((38347923 & i11) == 38347922 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            c3966o.m8603U();
            if ((i10 & 1) != 0 && !c3966o.m8584A()) {
                c3966o.m8601S();
            }
            c3966o.m8624q();
            ic icVar = new ic(new C0581m(0, 2, k2.h2.class, g1.b1.m6085a(!z6 ? ecVar.f11510g : z10 ? ecVar.f11511h : ((Boolean) AbstractC2250x.m5950d(interfaceC4629k, c3966o, (i11 >> 6) & 14).getValue()).booleanValue() ? ecVar.f11508e : ecVar.f11509f, AbstractC2773d.m6795r(150, 0, null, 6), c3966o, 48), "value", "getValue()Ljava/lang/Object;"));
            float f6 = h2.s0.f15774b;
            AbstractC5256o.m10358a(AbstractC7862a.m14843a(AbstractC0258a.m708b(C7876o.f37669a, new C0408k(26, l0Var, icVar)), new hc(interfaceC4629k, z6, z10, ecVar)), c3966o, 0);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new fc(this, z6, z10, interfaceC4629k, ecVar, l0Var, i10);
        }
    }

    /* renamed from: b */
    public final void m6185b(String str, InterfaceC2141e interfaceC2141e, boolean z6, boolean z10, l4.k0 k0Var, InterfaceC4629k interfaceC4629k, boolean z11, InterfaceC2141e interfaceC2141e2, InterfaceC2141e interfaceC2141e3, d3.l0 l0Var, ec ecVar, o1.h1 h1Var, InterfaceC2141e interfaceC2141e4, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC2141e interfaceC2141e5;
        boolean z12;
        boolean z13;
        l4.k0 k0Var2;
        int i12;
        InterfaceC2141e interfaceC2141eM12902d;
        o1.h1 h1Var2;
        C3966o c3966o;
        o1.h1 h1Var3;
        InterfaceC2141e interfaceC2141e6;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(289640444);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8614g(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            interfaceC2141e5 = interfaceC2141e;
            i11 |= c3966o2.m8616i(interfaceC2141e5) ? 32 : 16;
        } else {
            interfaceC2141e5 = interfaceC2141e;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            z12 = z6;
            i11 |= c3966o2.m8615h(z12) ? 256 : 128;
        } else {
            z12 = z6;
        }
        if ((i10 & 3072) == 0) {
            z13 = z10;
            i11 |= c3966o2.m8615h(z13) ? 2048 : 1024;
        } else {
            z13 = z10;
        }
        if ((i10 & 24576) == 0) {
            k0Var2 = k0Var;
            i11 |= c3966o2.m8614g(k0Var2) ? 16384 : 8192;
        } else {
            k0Var2 = k0Var;
        }
        if ((i10 & 196608) == 0) {
            i11 |= c3966o2.m8614g(interfaceC4629k) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= c3966o2.m8615h(z11) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= c3966o2.m8616i(null) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= c3966o2.m8616i(null) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= c3966o2.m8616i(null) ? 536870912 : 268435456;
        }
        int i13 = 100663296 | (c3966o2.m8616i(interfaceC2141e2) ? 4 : 2) | (c3966o2.m8616i(null) ? 32 : 16) | (c3966o2.m8616i(null) ? 256 : 128) | (c3966o2.m8616i(interfaceC2141e3) ? 2048 : 1024) | (c3966o2.m8614g(l0Var) ? 16384 : 8192) | (c3966o2.m8614g(ecVar) ? 131072 : 65536) | 13107200;
        if ((306783379 & i11) == 306783378 && (38347923 & i13) == 38347922 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            h1Var3 = h1Var;
            interfaceC2141e6 = interfaceC2141e4;
            c3966o = c3966o2;
        } else {
            c3966o2.m8603U();
            if ((i10 & 1) == 0 || c3966o2.m8584A()) {
                float f6 = h2.s0.f15774b;
                o1.i1 i1Var = new o1.i1(f6, f6, f6, f6);
                i12 = i13 & (-3670017);
                interfaceC2141eM12902d = AbstractC6740i.m12902d(-435523791, new m9(z12, z11, interfaceC4629k, ecVar, l0Var), c3966o2);
                h1Var2 = i1Var;
            } else {
                c3966o2.m8601S();
                i12 = i13 & (-3670017);
                h1Var2 = h1Var;
                interfaceC2141eM12902d = interfaceC2141e4;
            }
            c3966o2.m8624q();
            int i14 = i11 << 3;
            int i15 = i11 >> 3;
            int i16 = i11 >> 9;
            int i17 = i12 << 21;
            c3966o = c3966o2;
            h2.s0.m6918a(h2.t0.Filled, str, interfaceC2141e5, k0Var2, null, null, null, interfaceC2141e2, interfaceC2141e3, z13, z6, z11, interfaceC4629k, h1Var2, ecVar, interfaceC2141eM12902d, c3966o, (i14 & 896) | (i14 & 112) | 6 | (i15 & 7168) | (i16 & 57344) | (458752 & i16) | (i16 & 3670016) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), ((i12 << 3) & 3670016) | ((i12 >> 9) & 14) | ((i11 >> 6) & 112) | (i11 & 896) | (i16 & 7168) | (i15 & 57344) | 12582912);
            h1Var3 = h1Var2;
            interfaceC2141e6 = interfaceC2141eM12902d;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new gc(this, str, interfaceC2141e, z6, z10, k0Var, interfaceC4629k, z11, interfaceC2141e2, interfaceC2141e3, l0Var, ecVar, h1Var3, interfaceC2141e6, i10);
        }
    }
}
