package g2;

import ai.AbstractC0151h;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.ui.graphics.AbstractC0260a;
import au.C0446j;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g1.C2442v;
import h1.AbstractC2773d;
import h1.AbstractC2793x;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import o1.AbstractC5251j;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s2.AbstractC6740i;
import s2.C6734c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a7 {

    /* renamed from: a */
    public static final float f11170a;

    /* renamed from: b */
    public static final float f11171b;

    /* renamed from: c */
    public static final float f11172c = 12;

    /* renamed from: d */
    public static final float f11173d = 8;

    /* renamed from: e */
    public static final float f11174e = 112;

    /* renamed from: f */
    public static final float f11175f = 280;

    static {
        float f6 = 48;
        f11170a = f6;
        f11171b = f6;
    }

    /* renamed from: a */
    public static final void m6114a(InterfaceC7879r interfaceC7879r, h1.j0 j0Var, k2.w0 w0Var, i1.p1 p1Var, d3.l0 l0Var, long j6, float f6, float f10, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        Float f11;
        k2.e1 e1Var;
        boolean z6;
        h1.w1 w1VarM6795r;
        boolean z10;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-151448888);
        int i11 = i10 | (c3966o2.m8614g(interfaceC7879r) ? 4 : 2) | (c3966o2.m8614g(j0Var) ? 32 : 16) | (c3966o2.m8614g(p1Var) ? NewHope.SENDB_BYTES : 1024) | (c3966o2.m8614g(l0Var) ? 16384 : 8192) | (c3966o2.m8613f(j6) ? 131072 : 65536) | (c3966o2.m8611d(f6) ? 1048576 : 524288) | (c3966o2.m8611d(f10) ? 8388608 : 4194304) | (c3966o2.m8614g(null) ? 67108864 : 33554432) | (c3966o2.m8616i(c6734c) ? 536870912 : 268435456);
        if ((i11 & 306783379) == 306783378 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            h1.s1 s1VarM6871d = h1.v1.m6871d(j0Var, "DropDownMenu", c3966o2, (((i11 >> 3) & 14) | 48) & 126);
            h1.x1 x1Var = h1.y1.f15664a;
            AbstractC0151h abstractC0151h = s1VarM6871d.f15588a;
            k2.e1 e1Var2 = s1VarM6871d.f15591d;
            boolean zBooleanValue = ((Boolean) abstractC0151h.mo345y()).booleanValue();
            c3966o2.m8607Y(2139028452);
            float f12 = zBooleanValue ? 1.0f : 0.8f;
            c3966o2.m8623p(false);
            Float fValueOf = Float.valueOf(f12);
            boolean zBooleanValue2 = ((Boolean) e1Var2.getValue()).booleanValue();
            c3966o2.m8607Y(2139028452);
            float f13 = zBooleanValue2 ? 1.0f : 0.8f;
            c3966o2.m8623p(false);
            Float fValueOf2 = Float.valueOf(f13);
            h1.n1 n1VarM6857f = s1VarM6871d.m6857f();
            c3966o2.m8607Y(1033023423);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (n1VarM6857f.m6841b(bool, bool2)) {
                f11 = fValueOf2;
                e1Var = e1Var2;
                w1VarM6795r = AbstractC2773d.m6795r(120, 0, AbstractC2793x.f15640b, 2);
                z10 = false;
                z6 = true;
            } else {
                f11 = fValueOf2;
                e1Var = e1Var2;
                z6 = true;
                w1VarM6795r = AbstractC2773d.m6795r(1, 74, null, 4);
                z10 = false;
            }
            c3966o2.m8623p(z10);
            h1.p1 p1VarM6870c = h1.v1.m6870c(s1VarM6871d, fValueOf, f11, w1VarM6795r, x1Var, c3966o2, 0);
            boolean zBooleanValue3 = ((Boolean) s1VarM6871d.f15588a.mo345y()).booleanValue();
            c3966o2.m8607Y(-249413128);
            float f14 = zBooleanValue3 ? 1.0f : 0.0f;
            c3966o2.m8623p(false);
            Float fValueOf3 = Float.valueOf(f14);
            boolean zBooleanValue4 = ((Boolean) e1Var.getValue()).booleanValue();
            c3966o2.m8607Y(-249413128);
            float f15 = zBooleanValue4 ? 1.0f : 0.0f;
            c3966o2.m8623p(false);
            Float fValueOf4 = Float.valueOf(f15);
            h1.n1 n1VarM6857f2 = s1VarM6871d.m6857f();
            c3966o2.m8607Y(-1355418157);
            h1.w1 w1VarM6795r2 = n1VarM6857f2.m6841b(bool, bool2) ? AbstractC2773d.m6795r(30, 0, null, 6) : AbstractC2773d.m6795r(75, 0, null, 6);
            c3966o2.m8623p(false);
            h1.p1 p1VarM6870c2 = h1.v1.m6870c(s1VarM6871d, fValueOf3, fValueOf4, w1VarM6795r2, x1Var, c3966o2, 0);
            boolean zBooleanValue5 = ((Boolean) c3966o2.m8618k(w3.v1.f38043a)).booleanValue();
            boolean zM8615h = c3966o2.m8615h(zBooleanValue5) | c3966o2.m8614g(p1VarM6870c) | ((i11 & 112) != 32 ? false : z6) | c3966o2.m8614g(p1VarM6870c2);
            Object objM8596M = c3966o2.m8596M();
            if (zM8615h || objM8596M == C3961j.f20408a) {
                y6 y6Var = new y6(zBooleanValue5, j0Var, w0Var, p1VarM6870c, p1VarM6870c2);
                c3966o2.j0(y6Var);
                objM8596M = y6Var;
            }
            int i12 = i11 >> 9;
            int i13 = i11 >> 6;
            fb.m6164a(AbstractC0260a.m714a(C7876o.f37669a, (InterfaceC2139c) objM8596M), l0Var, j6, 0L, f6, f10, null, AbstractC6740i.m12902d(1573559053, new C0446j(2, interfaceC7879r, p1Var, c6734c), c3966o2), c3966o2, (i12 & 896) | (i12 & 112) | 12582912 | (57344 & i13) | (458752 & i13) | (i13 & 3670016), 8);
            c3966o = c3966o2;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2461o(interfaceC7879r, j0Var, w0Var, p1Var, l0Var, j6, f6, f10, c6734c, i10);
        }
    }

    /* renamed from: b */
    public static final void m6115b(C6734c c6734c, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, boolean z6, x6 x6Var, o1.h1 h1Var, InterfaceC4630l interfaceC4630l, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1564716777);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(c6734c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2137a) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8615h(z6) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o.m8614g(x6Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c3966o.m8614g(h1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c3966o.m8614g(interfaceC4630l) ? 67108864 : 33554432;
        }
        if ((i11 & 38347923) == 38347922 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            InterfaceC7879r interfaceC7879rM655i = AbstractC0242a.m655i(AbstractC0245d.m681r(AbstractC0245d.m668e(AbstractC0237a.m636d(interfaceC7879r, interfaceC4630l, q9.m6291c(true, DefinitionKt.NO_Float_VALUE, 0L, c3966o, 6, 6), z6, null, interfaceC2137a, 24), 1.0f), f11174e, f11175f, 8), h1Var);
            o1.n1 n1VarM10357a = o1.m1.m10357a(AbstractC5251j.f25757a, C7864c.f37652l, c3966o, 48);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM655i);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            sc.m6306a(((vd) c3966o.m8618k(xd.f13268a)).f13057m, AbstractC6740i.m12902d(1065051884, new C2442v(interfaceC2141e, x6Var, z6, interfaceC2141e2, c6734c), c3966o), c3966o, 48);
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new z6(c6734c, interfaceC2137a, interfaceC7879r, interfaceC2141e, interfaceC2141e2, z6, x6Var, h1Var, interfaceC4630l, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m6116c(s4.C6755k r11, s4.C6755k r12) {
        /*
            int r0 = r12.f32206a
            int r1 = r12.f32209d
            int r2 = r12.f32206a
            int r3 = r12.f32208c
            int r4 = r12.f32207b
            int r5 = r11.f32208c
            int r6 = r11.f32207b
            int r7 = r11.f32209d
            int r8 = r11.f32206a
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            if (r0 < r5) goto L19
        L17:
            r11 = r10
            goto L39
        L19:
            if (r3 > r8) goto L1d
            r11 = r9
            goto L39
        L1d:
            int r0 = r12.m12947d()
            if (r0 != 0) goto L24
            goto L17
        L24:
            int r0 = java.lang.Math.max(r8, r2)
            int r11 = r11.f32208c
            int r11 = java.lang.Math.min(r11, r3)
            int r11 = r11 + r0
            int r11 = r11 / 2
            int r11 = r11 - r2
            float r11 = (float) r11
            int r0 = r12.m12947d()
            float r0 = (float) r0
            float r11 = r11 / r0
        L39:
            if (r4 < r7) goto L3d
        L3b:
            r9 = r10
            goto L5b
        L3d:
            if (r1 > r6) goto L40
            goto L5b
        L40:
            int r0 = r12.m12945b()
            if (r0 != 0) goto L47
            goto L3b
        L47:
            int r0 = java.lang.Math.max(r6, r4)
            int r1 = java.lang.Math.min(r7, r1)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r1 = r1 - r4
            float r0 = (float) r1
            int r12 = r12.m12945b()
            float r12 = (float) r12
            float r9 = r0 / r12
        L5b:
            long r11 = d3.h0.m5136h(r11, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.a7.m6116c(s4.k, s4.k):long");
    }
}
