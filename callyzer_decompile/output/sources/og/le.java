package og;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b2.C0566x;
import d7.InterfaceC1649u;
import dt.C1817w;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.C3975x;
import k2.InterfaceC3962k;
import p005f.AbstractC2161j;
import p005f.C2164m;
import p005f.C2165n;
import tx.InterfaceC7266z;
import uw.C7565i;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class le {

    /* renamed from: a */
    public static final /* synthetic */ int f26622a = 0;

    /* renamed from: a */
    public static final void m10750a(boolean z6, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-642000585);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8615h(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            k2.w0 w0VarM8520w = C3953b.m8520w(interfaceC2141e, c3966o);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                C3975x c3975x = new C3975x(C3953b.m8510m(C7565i.f36440a, c3966o));
                c3966o.j0(c3975x);
                objM8596M = c3975x;
            }
            InterfaceC7266z interfaceC7266z = ((C3975x) objM8596M).f20607a;
            Object objM8596M2 = c3966o.m8596M();
            Object obj = objM8596M2;
            if (objM8596M2 == s0Var) {
                InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) w0VarM8520w.getValue();
                C2164m c2164m = new C2164m(z6);
                c2164m.f10021d = interfaceC7266z;
                c2164m.f10022e = interfaceC2141e2;
                c3966o.j0(c2164m);
                obj = c2164m;
            }
            C2164m c2164m2 = (C2164m) obj;
            boolean zM8614g = c3966o.m8614g((InterfaceC2141e) w0VarM8520w.getValue()) | c3966o.m8614g(interfaceC7266z);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8614g || objM8596M3 == s0Var) {
                c2164m2.f10022e = (InterfaceC2141e) w0VarM8520w.getValue();
                c2164m2.f10021d = interfaceC7266z;
                c3966o.j0(qw.a0.f30746a);
            }
            Boolean boolValueOf = Boolean.valueOf(z6);
            boolean zM8616i = ((i11 & 14) == 4) | c3966o.m8616i(c2164m2);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8616i || objM8596M4 == s0Var) {
                objM8596M4 = new C1817w(c2164m2, z6, (InterfaceC7559c) null);
                c3966o.j0(objM8596M4);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M4, boolValueOf, c3966o);
            p004e.e0 e0VarM5822a = AbstractC2161j.m5822a(c3966o);
            if (e0VarM5822a == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            p004e.c0 onBackPressedDispatcher = e0VarM5822a.getOnBackPressedDispatcher();
            InterfaceC1649u interfaceC1649u = (InterfaceC1649u) c3966o.m8618k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zM8616i2 = c3966o.m8616i(onBackPressedDispatcher) | c3966o.m8616i(interfaceC1649u) | c3966o.m8616i(c2164m2);
            Object objM8596M5 = c3966o.m8596M();
            if (zM8616i2 || objM8596M5 == s0Var) {
                objM8596M5 = new C0566x(4, onBackPressedDispatcher, interfaceC1649u, c2164m2);
                c3966o.j0(objM8596M5);
            }
            C3953b.m8501d(interfaceC1649u, onBackPressedDispatcher, (InterfaceC2139c) objM8596M5, c3966o);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2165n(z6, interfaceC2141e, i10);
        }
    }
}
