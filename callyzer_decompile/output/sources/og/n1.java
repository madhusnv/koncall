package og;

import aq.C0403f;
import bt.C0767l;
import d7.InterfaceC1637j;
import e7.AbstractC1967c;
import ex.InterfaceC2139c;
import f1.C2177b;
import g7.C2536a;
import h7.AbstractC2868a;
import h8.AbstractC2869a;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k4.C4001v;
import kotlin.jvm.internal.C4147e;
import l7.C4409i;
import n7.C4956a;
import n7.C4967l;
import pg.AbstractC5928i;
import s2.AbstractC6740i;
import s2.C6734c;
import t2.InterfaceC7003b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a */
    public static final /* synthetic */ int f26661a = 0;

    /* renamed from: a */
    public static final void m10771a(C4409i c4409i, InterfaceC7003b interfaceC7003b, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(233973821);
        if ((((c3966o.m8616i(c4409i) ? 4 : 2) | i10 | (c3966o.m8616i(interfaceC7003b) ? 32 : 16)) & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            C3953b.m8499b(new k2.m1[]{AbstractC2868a.f15876a.mo8541a(c4409i), AbstractC1967c.f9212a.mo8541a(c4409i), AbstractC2869a.f15877a.mo8541a(c4409i)}, AbstractC6740i.m12902d(1808964477, new C4967l(1, interfaceC7003b, c6734c), c3966o), c3966o, 56);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0767l(c4409i, interfaceC7003b, c6734c, i10, 19);
        }
    }

    /* renamed from: b */
    public static final void m10772b(InterfaceC7003b interfaceC7003b, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(832919318);
        int i11 = (c3966o.m8616i(interfaceC7003b) ? 4 : 2) | i10 | (c3966o.m8616i(c6734c) ? 32 : 16);
        if ((i11 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == C3961j.f20408a) {
                objM8596M = new hq.d0(21);
                c3966o.j0(objM8596M);
            }
            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M;
            d7.c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(C4956a.class);
            C2177b c2177b = new C2177b(1);
            c2177b.m5865a(kotlin.jvm.internal.a0.m8901a(C4956a.class), interfaceC2139c);
            C4956a c4956a = (C4956a) AbstractC5928i.m11691b(c1VarM6992a, c4147eM8901a, null, c2177b.m5866b(), c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b);
            c4956a.f24645c = new C4001v(interfaceC7003b);
            interfaceC7003b.mo12855a(c4956a.f24644b, c6734c, c3966o, ((i11 << 6) & 896) | (i11 & 112));
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0403f(interfaceC7003b, c6734c, i10, 25);
        }
    }
}
