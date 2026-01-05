package o1;

import com.sun.mail.util.AbstractC1452a;
import g2.ed;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7871j;
import w2.InterfaceC7866e;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.o */
/* loaded from: classes.dex */
public abstract class AbstractC5256o {

    /* renamed from: a */
    public static final e1.j0 f25798a = m10360c(true);

    /* renamed from: b */
    public static final e1.j0 f25799b = m10360c(false);

    /* renamed from: c */
    public static final C5255n f25800c = C5255n.f25792b;

    /* renamed from: a */
    public static final void m10358a(InterfaceC7879r interfaceC7879r, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            int i12 = c3966o.f20462P;
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, f25800c, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new ed(i10, 1, interfaceC7879r);
        }
    }

    /* renamed from: b */
    public static final void m10359b(t3.v0 v0Var, t3.w0 w0Var, t3.i0 i0Var, EnumC6757m enumC6757m, int i10, int i11, InterfaceC7866e interfaceC7866e) {
        C7871j c7871j;
        Object objMo13310C = i0Var.mo13310C();
        C5253l c5253l = objMo13310C instanceof C5253l ? (C5253l) objMo13310C : null;
        t3.v0.m13318f(v0Var, w0Var, ((c5253l == null || (c7871j = c5253l.f25778q) == null) ? interfaceC7866e : c7871j).mo14848a((w0Var.f34030a << 32) | (w0Var.f34031b & 4294967295L), (i10 << 32) | (i11 & 4294967295L), enumC6757m));
    }

    /* renamed from: c */
    public static final e1.j0 m10360c(boolean z6) {
        e1.j0 j0Var = new e1.j0(9);
        C7871j c7871j = C7864c.f37642a;
        j0Var.m5579l(c7871j, new C5258q(c7871j, z6));
        C7871j c7871j2 = C7864c.f37643b;
        j0Var.m5579l(c7871j2, new C5258q(c7871j2, z6));
        C7871j c7871j3 = C7864c.f37644c;
        j0Var.m5579l(c7871j3, new C5258q(c7871j3, z6));
        C7871j c7871j4 = C7864c.f37645d;
        j0Var.m5579l(c7871j4, new C5258q(c7871j4, z6));
        C7871j c7871j5 = C7864c.f37646e;
        j0Var.m5579l(c7871j5, new C5258q(c7871j5, z6));
        C7871j c7871j6 = C7864c.f37647f;
        j0Var.m5579l(c7871j6, new C5258q(c7871j6, z6));
        C7871j c7871j7 = C7864c.f37648g;
        j0Var.m5579l(c7871j7, new C5258q(c7871j7, z6));
        C7871j c7871j8 = C7864c.f37649h;
        j0Var.m5579l(c7871j8, new C5258q(c7871j8, z6));
        C7871j c7871j9 = C7864c.f37650j;
        j0Var.m5579l(c7871j9, new C5258q(c7871j9, z6));
        return j0Var;
    }

    /* renamed from: d */
    public static final t3.j0 m10361d(InterfaceC7866e interfaceC7866e, boolean z6) {
        t3.j0 j0Var = (t3.j0) (z6 ? f25798a : f25799b).m5574g(interfaceC7866e);
        return j0Var == null ? new C5258q(interfaceC7866e, z6) : j0Var;
    }
}
