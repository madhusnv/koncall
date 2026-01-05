package og;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b2.C0566x;
import d7.InterfaceC1649u;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import p005f.AbstractC2161j;
import p005f.C2156e;
import p005f.C2157f;
import p005f.C2158g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ke {

    /* renamed from: a */
    public static final /* synthetic */ int f26597a = 0;

    /* renamed from: a */
    public static final void m10735a(boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        int i12;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c3966o.m8615h(z6) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c3966o.m8616i(interfaceC2137a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            if (i13 != 0) {
                z6 = true;
            }
            k2.w0 w0VarM8520w = C3953b.m8520w(interfaceC2137a, c3966o);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = new C2158g(z6, w0VarM8520w);
                c3966o.j0(objM8596M);
            }
            C2158g c2158g = (C2158g) objM8596M;
            boolean z10 = (i12 & 14) == 4;
            Object objM8596M2 = c3966o.m8596M();
            if (z10 || objM8596M2 == s0Var) {
                objM8596M2 = new C2156e(c2158g, z6);
                c3966o.j0(objM8596M2);
            }
            C3953b.m8505h((InterfaceC2137a) objM8596M2, c3966o);
            p004e.e0 e0VarM5822a = AbstractC2161j.m5822a(c3966o);
            if (e0VarM5822a == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            p004e.c0 onBackPressedDispatcher = e0VarM5822a.getOnBackPressedDispatcher();
            InterfaceC1649u interfaceC1649u = (InterfaceC1649u) c3966o.m8618k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zM8616i = c3966o.m8616i(onBackPressedDispatcher) | c3966o.m8616i(interfaceC1649u);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8616i || objM8596M3 == s0Var) {
                objM8596M3 = new C0566x(3, onBackPressedDispatcher, interfaceC1649u, c2158g);
                c3966o.j0(objM8596M3);
            }
            C3953b.m8501d(interfaceC1649u, onBackPressedDispatcher, (InterfaceC2139c) objM8596M3, c3966o);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2157f(z6, interfaceC2137a, i10, i11);
        }
    }
}
