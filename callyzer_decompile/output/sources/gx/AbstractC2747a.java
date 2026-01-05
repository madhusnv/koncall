package gx;

import an.j5;
import android.graphics.Rect;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.FillElement;
import au.C0454r;
import au.C0456t;
import au.C0457u;
import bm.AbstractC0690a;
import cm.C0983a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d3.C1559m;
import ex.InterfaceC2139c;
import g2.e6;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import i3.AbstractC3166c;
import j3.C3552f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import k2.s0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import mm.C4802m;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.m1;
import o1.n1;
import og.t0;
import og.tb;
import og.wc;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p1.AbstractC5788a;
import pg.b9;
import pg.f9;
import pg.i0;
import r4.C6456k;
import sq.b1;
import uf.C7427b;
import uv.AbstractC7548a;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;
import x1.u0;

/* renamed from: gx.a */
/* loaded from: classes3.dex */
public abstract class AbstractC2747a {
    /* renamed from: a */
    public static final void m6737a(String str, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1801145008);
        int i11 = (c3966o.m8614g(str) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            C7870i c7870i = C7864c.f37652l;
            float f6 = 50;
            float f10 = 20;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(AbstractC0242a.m660n(c7876o, f6, f10, f6, DefinitionKt.NO_Float_VALUE, 8), 1.0f);
            n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o, 48);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM668e);
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
            C3552f c3552fM10928a = tb.m10928a();
            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o, f10);
            long j6 = AbstractC7548a.f36337J;
            e6.m6133b(c3552fM10928a, "", interfaceC7879rM678o, j6, c3966o, 3504, 0);
            String strM10919b = t0.m10919b(R.string.sync_number, Arrays.copyOf(new Object[]{str}, 1), c3966o);
            o0 o0Var = ((vd) c3966o.m8618k(xd.f13268a)).f13053i;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.m687x(c7876o), 8, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14);
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            b1.m13113q(strM10919b, AbstractC4801l.m9747u(1.0f, interfaceC7879rM660n, true), j6, null, new C6456k(5), 0, 0, 0L, null, o0Var, c3966o, KyberEngine.KyberPolyBytes, 488);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0457u(str, i10, 0);
        }
    }

    /* renamed from: b */
    public static final void m6738b(C0454r c0454r, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1032583481);
        int i11 = (c3966o.m8616i(c0454r) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, C7876o.f37669a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            m6740d(c0454r, c3966o, i11 & 14);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0456t(c0454r, i10, 1);
        }
    }

    /* renamed from: c */
    public static final void m6739c(C0454r c0454r, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2094466518);
        int i11 = (c3966o.m8616i(c0454r) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            FillElement fillElement = AbstractC0245d.f1971c;
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, fillElement);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            m6738b(c0454r, c3966o, i11 & 14);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0456t(c0454r, i10, 0);
        }
    }

    /* renamed from: d */
    public static final void m6740d(C0454r c0454r, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC3166c abstractC3166cM11551a;
        C7876o c7876o;
        float f6;
        boolean z6;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1994022396);
        int i11 = i10 | (c3966o.m8616i(c0454r) ? 4 : 2);
        int i12 = 1;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            C4802m c4802m = c0454r.f3254b;
            AbstractC4154l.m8920c(c4802m);
            C7870i c7870i = C7864c.f37652l;
            float f10 = 20;
            C7876o c7876o2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(c7876o2, f10, DefinitionKt.NO_Float_VALUE, 2);
            n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o, 48);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM658l);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            if (c4802m.f23893e == 1) {
                c3966o.m8607Y(977357687);
                abstractC3166cM11551a = b9.m11551a(R.drawable.ic_in_active_sim_1, 0, c3966o);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(977438039);
                abstractC3166cM11551a = b9.m11551a(R.drawable.ic_in_active_sim_2, 0, c3966o);
                c3966o.m8623p(false);
            }
            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o2, f10);
            i2 i2Var = y1.f13286a;
            i0.m11693a(abstractC3166cM11551a, "", interfaceC7879rM678o, null, null, DefinitionKt.NO_Float_VALUE, new C1559m(5, ((v1) c3966o.m8618k(i2Var)).f12970q), c3966o, 432, 56);
            String strValueOf = String.valueOf(c4802m.f23890b);
            i2 i2Var2 = xd.f13268a;
            b1.m13113q(strValueOf, AbstractC0242a.m656j(c7876o2, 10), ((v1) c3966o.m8618k(i2Var)).f12970q, null, null, 0, 0, 0L, null, ((vd) c3966o.m8618k(i2Var2)).f13052h, c3966o, 48, 504);
            c3966o.m8623p(true);
            String strValueOf2 = String.valueOf(c4802m.f23896h);
            InterfaceC7879r interfaceC7879rM658l2 = AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o2, 1.0f), f10, DefinitionKt.NO_Float_VALUE, 2);
            o0 o0Var = ((vd) c3966o.m8618k(i2Var2)).f13055k;
            u0 u0Var = new u0(i12, 0, 123);
            String strM11629c = f9.m11629c(c3966o, R.string.name);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = new j5(11);
                c3966o.j0(objM8596M);
            }
            b1.m13110n(strValueOf2, (InterfaceC2139c) objM8596M, interfaceC7879rM658l2, o0Var, strM11629c, u0Var, false, null, null, false, null, false, c3966o, 805503408, 0, 3520);
            String strValueOf3 = String.valueOf(c4802m.f23891c);
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o2, 1.0f);
            float f11 = f10;
            char c2 = 2;
            InterfaceC7879r interfaceC7879rM658l3 = AbstractC0242a.m658l(interfaceC7879rM668e, f11, DefinitionKt.NO_Float_VALUE, 2);
            ArrayList arrayListM11031a = wc.m11031a();
            int size = arrayListM11031a.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayListM11031a.get(i14);
                i14++;
                C0983a c0983a = (C0983a) obj;
                if (c0983a.f5813b.equals("+" + c4802m.f23892d)) {
                    Object objM8596M2 = c3966o.m8596M();
                    if (objM8596M2 == s0Var) {
                        objM8596M2 = new j5(12);
                        c3966o.j0(objM8596M2);
                    }
                    InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M2;
                    Object objM8596M3 = c3966o.m8596M();
                    if (objM8596M3 == s0Var) {
                        objM8596M3 = new j5(13);
                        c3966o.j0(objM8596M3);
                    }
                    float f12 = f11;
                    AbstractC0690a.m1990a(strValueOf3, null, true, interfaceC2139c, interfaceC7879rM658l3, false, false, c0983a, (InterfaceC2139c) objM8596M3, null, 0L, 0L, null, null, null, 0, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, null, false, null, 0L, false, false, false, null, 0, null, null, c3966o, 117468544, 24576, 2130706018);
                    c3966o = c3966o;
                    if (c4802m.f23904p.length() > 0) {
                        c3966o.m8607Y(-226722043);
                        String str = c4802m.f23904p;
                        Object objM8596M4 = c3966o.m8596M();
                        if (objM8596M4 == s0Var) {
                            objM8596M4 = new j5(14);
                            c3966o.j0(objM8596M4);
                        }
                        f6 = f12;
                        c7876o = c7876o2;
                        b1.m13110n(str, (InterfaceC2139c) objM8596M4, AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o2, 1.0f), f12, DefinitionKt.NO_Float_VALUE, 2), ((vd) c3966o.m8618k(xd.f13268a)).f13055k, f9.m11629c(c3966o, R.string.emp_code), null, false, null, null, false, null, false, c3966o, 805306800, 0, 3552);
                        z6 = false;
                    } else {
                        c7876o = c7876o2;
                        f6 = f12;
                        z6 = false;
                        c3966o.m8607Y(-230718594);
                    }
                    c3966o.m8623p(z6);
                    String strValueOf4 = String.valueOf(c4802m.f23897i);
                    Object objM8596M5 = c3966o.m8596M();
                    if (objM8596M5 == s0Var) {
                        objM8596M5 = new j5(15);
                        c3966o.j0(objM8596M5);
                    }
                    b1.m13110n(strValueOf4, (InterfaceC2139c) objM8596M5, AbstractC0242a.m658l(AbstractC0245d.m668e(c7876o, 1.0f), f6, DefinitionKt.NO_Float_VALUE, 2), ((vd) c3966o.m8618k(xd.f13268a)).f13055k, f9.m11629c(c3966o, R.string.dcc), null, false, null, new C7427b(3), false, null, false, c3966o, 805306800, 0, 3296);
                    m6737a(String.valueOf(c4802m.f23909u), c3966o, z6 ? 1 : 0);
                } else {
                    f11 = f11;
                    c2 = c2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        c3966o.m8601S();
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0456t(c0454r, i10, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6741e(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = m6742f(r8, r9, r10)
            boolean r1 = m6742f(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = m6744h(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gx.AbstractC2747a.m6741e(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: f */
    public static boolean m6742f(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: g */
    public static boolean m6743g(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    /* renamed from: h */
    public static int m6744h(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    /* renamed from: i */
    public static int m6745i(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* renamed from: j */
    public static int m6746j(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    /* renamed from: k */
    public static int m6747k(float f6) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f6);
    }

    /* renamed from: l */
    public static long m6748l(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d2);
    }
}
