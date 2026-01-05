package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.ui.layout.AbstractC0264a;
import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1586n;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f3.C2202h;
import f3.InterfaceC2198d;
import h1.C2788s;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kx.C4262d;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class k9 {

    /* renamed from: a */
    public static final float f11942a;

    /* renamed from: b */
    public static final InterfaceC7879r f11943b;

    /* renamed from: c */
    public static final float f11944c = 240;

    /* renamed from: d */
    public static final float f11945d;

    /* renamed from: e */
    public static final float f11946e;

    /* renamed from: f */
    public static final C2788s f11947f;

    static {
        float f6 = 10;
        f11942a = f6;
        f11943b = AbstractC0242a.m658l(AbstractC1586n.m5204b(AbstractC0264a.m721b(C7876o.f37669a, b2.f11236f), true, p0.f12347D), DefinitionKt.NO_Float_VALUE, f6, 1);
        float f10 = j2.d0.f18540d;
        f11945d = f10;
        f11946e = j2.d0.f18541e - (f10 * 2);
        new C2788s(0.2f, DefinitionKt.NO_Float_VALUE, 0.8f, 1.0f);
        new C2788s(0.4f, DefinitionKt.NO_Float_VALUE, 1.0f, 1.0f);
        new C2788s(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 0.65f, 1.0f);
        new C2788s(0.1f, DefinitionKt.NO_Float_VALUE, 0.45f, 1.0f);
        f11947f = new C2788s(0.4f, DefinitionKt.NO_Float_VALUE, 0.2f, 1.0f);
    }

    /* renamed from: a */
    public static final void m6196a(InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, long j6, float f6, long j10, int i10, float f10, InterfaceC3962k interfaceC3962k, int i11, int i12) {
        int i13;
        long j11;
        int i14;
        float f11;
        long jM6345d;
        int i15;
        float f12;
        float f13;
        int i16;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1798883595);
        if ((i11 & 6) == 0) {
            i13 = (c3966o.m8616i(interfaceC2137a) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c3966o.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            j11 = j6;
            i13 |= ((i12 & 4) == 0 && c3966o.m8613f(j11)) ? 256 : 128;
        } else {
            j11 = j6;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c3966o.m8611d(f6) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c3966o.m8613f(j10) ? 16384 : 8192;
        }
        int i17 = i12 & 32;
        if (i17 != 0) {
            i13 |= 196608;
            i14 = i10;
        } else {
            i14 = i10;
            if ((i11 & 196608) == 0) {
                i13 |= c3966o.m8612e(i14) ? 131072 : 65536;
            }
        }
        int i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i11 & 1572864) == 0) {
                i13 |= c3966o.m8611d(f11) ? 1048576 : 524288;
            }
        }
        if ((i13 & 599187) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
            f13 = f11;
            i16 = i14;
        } else {
            c3966o.m8603U();
            if ((i11 & 1) == 0 || c3966o.m8584A()) {
                if ((i12 & 4) != 0) {
                    float f14 = c9.f11312a;
                    jM6345d = y1.m6345d(j2.d0.f18537a, c3966o);
                    i13 &= -897;
                } else {
                    jM6345d = j11;
                }
                int i19 = i17 != 0 ? c9.f11313b : i14;
                if (i18 != 0) {
                    i15 = i19;
                    f11 = c9.f11317f;
                } else {
                    i15 = i19;
                }
                j11 = jM6345d;
            } else {
                c3966o.m8601S();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                i15 = i14;
            }
            c3966o.m8624q();
            boolean z6 = (i13 & 14) == 4;
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            if (z6 || objM8596M == obj) {
                objM8596M = new v7(2, interfaceC2137a);
                c3966o.j0(objM8596M);
            }
            InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M;
            C2202h c2202h = new C2202h(((InterfaceC6747c) c3966o.m8618k(w3.k1.f37836h)).mo8435T(f6), DefinitionKt.NO_Float_VALUE, i15, 0, 26);
            boolean zM8614g = c3966o.m8614g(interfaceC2137a2);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g || objM8596M2 == obj) {
                objM8596M2 = new b2.d1(3, interfaceC2137a2);
                c3966o.j0(objM8596M2);
            }
            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(AbstractC1586n.m5204b(interfaceC7879r, true, (InterfaceC2139c) objM8596M2), f11946e);
            boolean zM8614g2 = ((i13 & 458752) == 131072) | c3966o.m8614g(interfaceC2137a2) | ((3670016 & i13) == 1048576) | ((i13 & 7168) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && c3966o.m8613f(j10)) || (i13 & 24576) == 16384) | c3966o.m8616i(c2202h) | ((((i13 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && c3966o.m8613f(j11)) || (i13 & KyberEngine.KyberPolyBytes) == 256);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8614g2 || objM8596M3 == obj) {
                f12 = f11;
                Object d9Var = new d9(interfaceC2137a2, i15, f12, f6, j10, c2202h, j11);
                c3966o.j0(d9Var);
                objM8596M3 = d9Var;
            } else {
                f12 = f11;
            }
            pg.e0.m11594a(0, (InterfaceC2139c) objM8596M3, c3966o, interfaceC7879rM678o);
            f13 = f12;
            i16 = i15;
        }
        long j12 = j11;
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new e9(interfaceC2137a, interfaceC7879r, j12, f6, j10, i16, f13, i11, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6197b(w2.InterfaceC7879r r34, long r35, float r37, long r38, int r40, k2.InterfaceC3962k r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.k9.m6197b(w2.r, long, float, long, int, k2.k, int, int):void");
    }

    /* renamed from: c */
    public static final void m6198c(InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, long j6, long j10, int i10, float f6, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, int i11) {
        float f10;
        int i12;
        InterfaceC2139c interfaceC2139c2;
        int i13;
        float f11;
        InterfaceC2139c interfaceC2139c3;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-339970038);
        int i14 = i11 | (c3966o.m8616i(interfaceC2137a) ? 4 : 2) | (c3966o.m8614g(interfaceC7879r) ? 32 : 16) | (c3966o.m8613f(j6) ? 256 : 128) | (c3966o.m8612e(i10) ? 16384 : 8192) | 720896;
        if ((599187 & i14) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
            f11 = f6;
            interfaceC2139c3 = interfaceC2139c;
        } else {
            c3966o.m8603U();
            int i15 = i11 & 1;
            Object obj = C3961j.f20408a;
            boolean z6 = true;
            if (i15 == 0 || c3966o.m8584A()) {
                f10 = c9.f11316e;
                i12 = 57344;
                boolean z10 = ((((i14 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && c3966o.m8613f(j6)) || (i14 & KyberEngine.KyberPolyBytes) == 256) | ((i14 & 57344) == 16384);
                Object objM8596M = c3966o.m8596M();
                if (z10 || objM8596M == obj) {
                    objM8596M = new h9(i10, j6);
                    c3966o.j0(objM8596M);
                }
                interfaceC2139c2 = (InterfaceC2139c) objM8596M;
                i13 = i14 & (-3670017);
            } else {
                c3966o.m8601S();
                i13 = i14 & (-3670017);
                f10 = f6;
                interfaceC2139c2 = interfaceC2139c;
                i12 = 57344;
            }
            c3966o.m8624q();
            boolean z11 = (i13 & 14) == 4;
            Object objM8596M2 = c3966o.m8596M();
            if (z11 || objM8596M2 == obj) {
                objM8596M2 = new v7(3, interfaceC2137a);
                c3966o.j0(objM8596M2);
            }
            InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M2;
            InterfaceC7879r interfaceC7879rMo14852e = interfaceC7879r.mo14852e(f11943b);
            boolean zM8614g = c3966o.m8614g(interfaceC2137a2);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8614g || objM8596M3 == obj) {
                objM8596M3 = new b2.d1(4, interfaceC2137a2);
                c3966o.j0(objM8596M3);
            }
            InterfaceC7879r interfaceC7879rM679p = AbstractC0245d.m679p(AbstractC1586n.m5204b(interfaceC7879rMo14852e, true, (InterfaceC2139c) objM8596M3), f11944c, f11945d);
            boolean zM8614g2 = ((i13 & i12) == 16384) | c3966o.m8614g(interfaceC2137a2);
            if ((((i13 & 896) ^ KyberEngine.KyberPolyBytes) <= 256 || !c3966o.m8613f(j6)) && (i13 & KyberEngine.KyberPolyBytes) != 256) {
                z6 = false;
            }
            boolean zM8614g3 = zM8614g2 | z6 | c3966o.m8614g(interfaceC2139c2);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8614g3 || objM8596M4 == obj) {
                Object i9Var = new i9(i10, f10, interfaceC2137a2, j10, j6, interfaceC2139c2);
                c3966o.j0(i9Var);
                objM8596M4 = i9Var;
            }
            pg.e0.m11594a(0, (InterfaceC2139c) objM8596M4, c3966o, interfaceC7879rM679p);
            f11 = f10;
            interfaceC2139c3 = interfaceC2139c2;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new j9(interfaceC2137a, interfaceC7879r, j6, j10, i10, f11, interfaceC2139c3, i11);
        }
    }

    /* renamed from: d */
    public static final void m6199d(InterfaceC2198d interfaceC2198d, float f6, float f10, long j6, float f11, int i10) {
        float fM2293d = C0850e.m2293d(interfaceC2198d.mo5913e());
        float fM2291b = C0850e.m2291b(interfaceC2198d.mo5913e());
        float f12 = 2;
        float f13 = fM2291b / f12;
        boolean z6 = interfaceC2198d.getLayoutDirection() == EnumC6757m.Ltr;
        float f14 = (z6 ? f6 : 1.0f - f10) * fM2293d;
        float f15 = (z6 ? f10 : 1.0f - f6) * fM2293d;
        if (i10 == 0 || fM2291b > fM2293d) {
            interfaceC2198d.r0(j6, og.a2.m10524a(f14, f13), og.a2.m10524a(f15, f13), f11, (496 & 16) != 0 ? 0 : 0, 3);
            return;
        }
        float f16 = f11 / f12;
        C4262d c4262d = new C4262d(f16, fM2293d - f16);
        float fFloatValue = ((Number) pg.w9.m11915f(Float.valueOf(f14), c4262d)).floatValue();
        float fFloatValue2 = ((Number) pg.w9.m11915f(Float.valueOf(f15), c4262d)).floatValue();
        if (Math.abs(f10 - f6) > DefinitionKt.NO_Float_VALUE) {
            interfaceC2198d.r0(j6, og.a2.m10524a(fFloatValue, f13), og.a2.m10524a(fFloatValue2, f13), f11, (496 & 16) != 0 ? 0 : i10, 3);
        }
    }

    /* renamed from: e */
    public static final void m6200e(InterfaceC2198d interfaceC2198d, float f6, float f10, long j6, C2202h c2202h) {
        float f11 = 2;
        float f12 = c2202h.f10130a / f11;
        float fM2293d = C0850e.m2293d(interfaceC2198d.mo5913e()) - (f11 * f12);
        interfaceC2198d.mo5904i(j6, f6, f10, og.a2.m10524a(f12, f12), og.d2.m10598a(fM2293d, fM2293d), (832 & 64) != 0 ? 1.0f : DefinitionKt.NO_Float_VALUE, c2202h);
    }
}
