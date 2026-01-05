package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b2.C0543a;
import b3.e0;
import com.sun.mail.util.AbstractC1452a;
import d7.InterfaceC1649u;
import e7.AbstractC1967c;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import g2.k3;
import g8.InterfaceC2547g;
import k2.C3953b;
import k2.C3961j;
import k2.C3964m;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import t2.AbstractC7011j;
import t2.InterfaceC7009h;
import v3.C7636h;
import v3.C7638j;
import v3.InterfaceC7639k;
import v3.a1;
import v3.g0;
import v4.C7657c;
import v4.C7666l;
import v4.C7667m;
import v4.C7672r;
import w2.AbstractC7862a;
import w2.AbstractC7878q;
import w2.C7876o;
import w2.InterfaceC7879r;
import w3.k1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.ui.viewinterop.a */
/* loaded from: classes.dex */
public abstract class AbstractC0265a {
    /* renamed from: a */
    public static final void m728a(int i10, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, InterfaceC7879r interfaceC7879r) {
        int i11;
        InterfaceC2547g interfaceC2547g;
        i1 i1Var;
        InterfaceC1649u interfaceC1649u;
        EnumC6757m enumC6757m;
        C7657c c7657c = C7657c.f37088e;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-180024211);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(interfaceC2139c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 32 : 16;
        }
        int i12 = i11 | KyberEngine.KyberPolyBytes;
        if ((i10 & 3072) == 0) {
            i12 |= c3966o.m8616i(c7657c) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c3966o.m8616i(c7657c) ? 16384 : 8192;
        }
        if (c3966o.m8598P(i12 & 1, (i12 & 9363) != 9362)) {
            int i13 = c3966o.f20462P;
            InterfaceC7879r interfaceC7879rMo14852e = interfaceC7879r.mo14852e(FocusGroupPropertiesElement.f2143a);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new a1() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                public final boolean equals(Object obj) {
                    return obj == this;
                }

                @Override // v3.a1
                /* renamed from: h */
                public final AbstractC7878q mo621h() {
                    return new e0(0, 7, null);
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // v3.a1
                /* renamed from: i */
                public final /* bridge */ /* synthetic */ void mo622i(AbstractC7878q abstractC7878q) {
                }
            };
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rMo14852e.mo14852e(focusTargetNode$FocusTargetElement).mo14852e(FocusTargetPropertiesElement.f2144a).mo14852e(focusTargetNode$FocusTargetElement));
            InterfaceC6747c interfaceC6747c = (InterfaceC6747c) c3966o.m8618k(k1.f37836h);
            EnumC6757m enumC6757m2 = (EnumC6757m) c3966o.m8618k(k1.f37842n);
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC1649u interfaceC1649u2 = (InterfaceC1649u) c3966o.m8618k(AbstractC1967c.f9212a);
            InterfaceC2547g interfaceC2547g2 = (InterfaceC2547g) c3966o.m8618k(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            c3966o.m8607Y(608635513);
            int i14 = i12 & 14;
            int i15 = c3966o.f20462P;
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            C3964m c3964mM8519v = C3953b.m8519v(c3966o);
            InterfaceC7009h interfaceC7009h = (InterfaceC7009h) c3966o.m8618k(AbstractC7011j.f33948a);
            View view = (View) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2138f);
            boolean zM8616i = c3966o.m8616i(context) | ((((i14 & 14) ^ 6) > 4 && c3966o.m8614g(interfaceC2139c)) || (i14 & 6) == 4) | c3966o.m8616i(c3964mM8519v) | c3966o.m8616i(interfaceC7009h) | c3966o.m8612e(i15) | c3966o.m8616i(view);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                interfaceC2547g = interfaceC2547g2;
                i1Var = i1VarM8620m;
                interfaceC1649u = interfaceC1649u2;
                enumC6757m = enumC6757m2;
                C7667m c7667m = new C7667m(context, interfaceC2139c, c3964mM8519v, interfaceC7009h, i15, view);
                c3966o.j0(c7667m);
                objM8596M = c7667m;
            } else {
                interfaceC2547g = interfaceC2547g2;
                i1Var = i1VarM8620m;
                interfaceC1649u = interfaceC1649u2;
                enumC6757m = enumC6757m2;
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M;
            c3966o.m8602T(null, 125, null, 1);
            c3966o.f20480q = true;
            if (c3966o.f20461O) {
                c3966o.m8619l(interfaceC2137a);
            } else {
                c3966o.m0();
            }
            InterfaceC7639k.V0.getClass();
            C3953b.m8521x(C7638j.f36924e, i1Var, c3966o);
            C3953b.m8521x(C7666l.f37133d, interfaceC7879rM14845c, c3966o);
            C3953b.m8521x(C7666l.f37134e, interfaceC6747c, c3966o);
            C3953b.m8521x(C7666l.f37135f, interfaceC1649u, c3966o);
            C3953b.m8521x(C7666l.f37136g, interfaceC2547g, c3966o);
            C3953b.m8521x(C7666l.f37137h, enumC6757m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7666l.f37131b, c7657c, c3966o);
            C3953b.m8521x(C7666l.f37132c, c7657c, c3966o);
            c3966o.m8623p(true);
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new k3(interfaceC2139c, interfaceC7879r, i10);
        }
    }

    /* renamed from: b */
    public static final void m729b(InterfaceC2139c interfaceC2139c, InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c2, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        int i12;
        InterfaceC2139c interfaceC2139c3;
        C7657c c7657c = C7657c.f37088e;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1783766393);
        int i13 = (c3966o.m8616i(interfaceC2139c) ? 4 : 2) | i10;
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 = i13 | 48;
        } else {
            i12 = i13 | (c3966o.m8614g(interfaceC7879r) ? 32 : 16);
        }
        int i15 = i12 | KyberEngine.KyberPolyBytes;
        if (c3966o.m8598P(i15 & 1, (i15 & 147) != 146)) {
            if (i14 != 0) {
                interfaceC7879r = C7876o.f37669a;
            }
            m728a((i15 & 14) | 3072 | (i15 & 112) | 24576, interfaceC2139c, c3966o, interfaceC7879r);
            interfaceC2139c3 = c7657c;
        } else {
            c3966o.m8601S();
            interfaceC2139c3 = interfaceC2139c2;
        }
        InterfaceC7879r interfaceC7879r2 = interfaceC7879r;
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0543a(interfaceC2139c, interfaceC7879r2, interfaceC2139c3, i10, i11, 8);
        }
    }

    /* renamed from: c */
    public static final C7672r m730c(g0 g0Var) {
        C7672r c7672r = g0Var.f36856q;
        if (c7672r != null) {
            return c7672r;
        }
        throw p020v.a1.m14342v("Required value was null.");
    }
}
