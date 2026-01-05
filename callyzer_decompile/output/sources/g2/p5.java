package g2;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.layout.AbstractC0264a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0408k;
import b2.C0543a;
import b3.C0592x;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import h2.AbstractC2812q;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5256o;
import og.ke;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p005f.C2156e;
import s2.C6734c;
import s4.InterfaceC6747c;
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
public abstract class p5 {

    /* renamed from: a */
    public static final float f12407a = 16;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, k2.k, k2.o] */
    /* JADX WARN: Type inference failed for: r4v9, types: [s2.c] */
    /* renamed from: a */
    public static final void m6227a(boolean z6, InterfaceC2139c interfaceC2139c, InterfaceC7879r interfaceC7879r, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        Object m5Var;
        int i11;
        Object obj;
        View view;
        int i12;
        k2.w0 w0Var;
        boolean z10;
        InterfaceC2139c interfaceC2139c2;
        InterfaceC7879r interfaceC7879r2;
        C6734c c6734c2;
        boolean z11 = z6;
        ?? r11 = (C3966o) interfaceC3962k;
        r11.a0(2067579792);
        int i13 = i10 | (r11.m8615h(z11) ? 4 : 2) | KyberEngine.KyberPolyBytes;
        if ((i13 & 1171) == 1170 && r11.m8586C()) {
            r11.m8601S();
            interfaceC2139c2 = interfaceC2139c;
            interfaceC7879r2 = interfaceC7879r;
            c6734c2 = c6734c;
        } else {
            Configuration configuration = (Configuration) r11.m8618k(AndroidCompositionLocals_androidKt.f2133a);
            View view2 = (View) r11.m8618k(AndroidCompositionLocals_androidKt.f2138f);
            InterfaceC6747c interfaceC6747c = (InterfaceC6747c) r11.m8618k(w3.k1.f37836h);
            int iE0 = interfaceC6747c.e0(a7.f11170a);
            Object objM8596M = r11.m8596M();
            Object obj2 = C3961j.f20408a;
            if (objM8596M == obj2) {
                objM8596M = C3953b.m8517t(null);
                r11.j0(objM8596M);
            }
            k2.w0 w0Var2 = (k2.w0) objM8596M;
            Object objM8596M2 = r11.m8596M();
            if (objM8596M2 == obj2) {
                objM8596M2 = new k2.b1(0);
                r11.j0(objM8596M2);
            }
            k2.b1 b1Var = (k2.b1) objM8596M2;
            Object objM8596M3 = r11.m8596M();
            if (objM8596M3 == obj2) {
                objM8596M3 = new k2.b1(0);
                r11.j0(objM8596M3);
            }
            k2.b1 b1Var2 = (k2.b1) objM8596M3;
            Object objM8596M4 = r11.m8596M();
            if (objM8596M4 == obj2) {
                objM8596M4 = new C0592x();
                r11.j0(objM8596M4);
            }
            C0592x c0592x = (C0592x) objM8596M4;
            w3.p2 p2Var = (w3.p2) r11.m8618k(w3.k1.f37844p);
            String strM6916h = AbstractC2812q.m6916h(r11, R.string.m3c_dropdown_menu_expanded);
            String strM6916h2 = AbstractC2812q.m6916h(r11, R.string.m3c_dropdown_menu_collapsed);
            String strM6916h3 = AbstractC2812q.m6916h(r11, R.string.m3c_dropdown_menu_toggle);
            Object objM8596M5 = r11.m8596M();
            if (objM8596M5 == obj2) {
                objM8596M5 = C3953b.m8517t(new v6());
                r11.j0(objM8596M5);
            }
            k2.w0 w0Var3 = (k2.w0) objM8596M5;
            int i14 = i13 & 14;
            boolean zM8614g = r11.m8614g(configuration) | (i14 == 4) | r11.m8614g(view2) | r11.m8614g(interfaceC6747c);
            Object objM8596M6 = r11.m8596M();
            if (zM8614g || objM8596M6 == obj2) {
                i11 = i14;
                obj = obj2;
                m5Var = new m5(c0592x, z11, strM6916h, strM6916h2, strM6916h3, p2Var, w0Var3, interfaceC2139c, b1Var, b1Var2);
                c0592x = c0592x;
                z11 = z11;
                r11.j0(m5Var);
            } else {
                i11 = i14;
                m5Var = objM8596M6;
                obj = obj2;
            }
            m5 m5Var2 = (m5) m5Var;
            boolean zM8616i = r11.m8616i(view2) | r11.m8612e(iE0);
            Object objM8596M7 = r11.m8596M();
            if (zM8616i || objM8596M7 == obj) {
                view = view2;
                i12 = iE0;
                w0Var = w0Var2;
                objM8596M7 = new b3.k0(i12, 3, view, w0Var, b1Var, b1Var2);
                r11.j0(objM8596M7);
            } else {
                view = view2;
                i12 = iE0;
                w0Var = w0Var2;
            }
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM723d = AbstractC0264a.m723d(c7876o, (InterfaceC2139c) objM8596M7);
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i15 = r11.f20462P;
            k2.i1 i1VarM8620m = r11.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(r11, interfaceC7879rM723d);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            r11.c0();
            if (r11.f20461O) {
                r11.m8619l(c7637i);
            } else {
                r11.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, r11);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, r11);
            C7636h c7636h = C7638j.f36926g;
            if (r11.f20461O || !AbstractC4154l.m8918a(r11.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, r11, i15, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, r11);
            ?? r42 = c6734c;
            r42.invoke(m5Var2, r11, 48);
            r11.m8623p(true);
            r11.m8607Y(426363998);
            if (z11) {
                boolean zM8616i2 = r11.m8616i(view) | r11.m8612e(i12);
                Object objM8596M8 = r11.m8596M();
                if (zM8616i2 || objM8596M8 == obj) {
                    objM8596M8 = new i5(view, i12, w0Var, b1Var2);
                    r11.j0(objM8596M8);
                }
                z10 = false;
                m6228b(view, interfaceC6747c, (InterfaceC2137a) objM8596M8, r11, 0);
            } else {
                z10 = false;
            }
            r11.m8623p(z10);
            int i16 = i11;
            boolean z12 = i16 == 4;
            Object objM8596M9 = r11.m8596M();
            if (z12 || objM8596M9 == obj) {
                objM8596M9 = new C2156e(z11, c0592x, 1);
                r11.j0(objM8596M9);
            }
            C3953b.m8505h((InterfaceC2137a) objM8596M9, r11);
            Object objM8596M10 = r11.m8596M();
            if (objM8596M10 == obj) {
                interfaceC2139c2 = interfaceC2139c;
                objM8596M10 = new j3(2, interfaceC2139c2);
                r11.j0(objM8596M10);
            } else {
                interfaceC2139c2 = interfaceC2139c;
            }
            ke.m10735a(z11, (InterfaceC2137a) objM8596M10, r11, i16, 0);
            interfaceC7879r2 = c7876o;
            c6734c2 = r42;
        }
        k2.n1 n1VarM8628u = r11.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new j5(z11, interfaceC2139c2, interfaceC7879r2, c6734c2, i10);
        }
    }

    /* renamed from: b */
    public static final void m6228b(View view, InterfaceC6747c interfaceC6747c, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1319522472);
        int i11 = (c3966o.m8616i(view) ? 4 : 2) | i10 | (c3966o.m8614g(interfaceC6747c) ? 32 : 16);
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2137a) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            boolean zM8616i = ((i11 & 896) == 256) | c3966o.m8616i(view);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C0408k(10, view, interfaceC2137a);
                c3966o.j0(objM8596M);
            }
            C3953b.m8501d(view, interfaceC6747c, (InterfaceC2139c) objM8596M, c3966o);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0543a(view, interfaceC6747c, interfaceC2137a, i10, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m6229c(int r3, c3.C0848c r4, c3.C0848c r5) {
        /*
            float r0 = r4.f5355b
            float r3 = (float) r3
            float r1 = r0 + r3
            float r4 = r4.f5357d
            float r3 = r4 - r3
            float r2 = r5.f5355b
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L21
            float r4 = r5.f5357d
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 >= 0) goto L16
            goto L21
        L16:
            float r2 = r2 - r1
            float r3 = r3 - r4
            float r3 = java.lang.Math.max(r2, r3)
            int r3 = gx.AbstractC2747a.m6747k(r3)
            goto L26
        L21:
            float r3 = r3 - r1
            int r3 = gx.AbstractC2747a.m6747k(r3)
        L26:
            r4 = 0
            int r3 = java.lang.Math.max(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.p5.m6229c(int, c3.c, c3.c):int");
    }
}
