package s2;

import ex.InterfaceC2141e;
import java.util.ArrayList;
import k2.C3961j;
import k2.C3966o;
import k2.C3972u;
import k2.InterfaceC3962k;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s2.i */
/* loaded from: classes.dex */
public abstract class AbstractC6740i {

    /* renamed from: a */
    public static final C6741j f32190a = new C6741j(0, new long[0], new Object[0]);

    /* renamed from: a */
    public static final int m12899a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    /* renamed from: b */
    public static final long m12900b() {
        return Thread.currentThread().getId();
    }

    /* renamed from: c */
    public static final void m12901c(C3966o c3966o, InterfaceC2141e interfaceC2141e) {
        AbstractC4154l.m8921d(interfaceC2141e, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        d0.m8907d(2, interfaceC2141e);
        interfaceC2141e.invoke(c3966o, 1);
    }

    /* renamed from: d */
    public static final C6734c m12902d(int i10, InterfaceC6355e interfaceC6355e, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        if (objM8596M == C3961j.f20408a) {
            objM8596M = new C6734c(interfaceC6355e, true, i10);
            c3966o.j0(objM8596M);
        }
        C6734c c6734c = (C6734c) objM8596M;
        if (!AbstractC4154l.m8918a(c6734c.f32174c, interfaceC6355e)) {
            boolean z6 = c6734c.f32174c == null;
            c6734c.f32174c = interfaceC6355e;
            if (!z6 && c6734c.f32173b) {
                n1 n1Var = c6734c.f32175d;
                if (n1Var != null) {
                    C3972u c3972u = n1Var.f20441b;
                    if (c3972u != null) {
                        c3972u.m8673p(n1Var, null);
                    }
                    c6734c.f32175d = null;
                }
                ArrayList arrayList = c6734c.f32176e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        n1 n1Var2 = (n1) arrayList.get(i11);
                        C3972u c3972u2 = n1Var2.f20441b;
                        if (c3972u2 != null) {
                            c3972u2.m8673p(n1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c6734c;
    }

    /* renamed from: e */
    public static final boolean m12903e(n1 n1Var, n1 n1Var2) {
        if (n1Var == null) {
            return true;
        }
        if (n1Var instanceof n1) {
            return !n1Var.m8577b() || n1Var.equals(n1Var2) || AbstractC4154l.m8918a(n1Var.f20442c, n1Var2.f20442c);
        }
        return false;
    }
}
