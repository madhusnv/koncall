package j1;

import b2.j0;
import cp.C1475f;
import cp.C1476g;
import ex.InterfaceC2137a;
import ex.InterfaceC2142f;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.n1;
import s2.C6734c;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j1.e */
/* loaded from: classes.dex */
public final class C3513e {

    /* renamed from: a */
    public final C7320q f18392a = new C7320q();

    /* renamed from: b */
    public static void m8073b(C3513e c3513e, C1475f c1475f, InterfaceC2137a interfaceC2137a) {
        c3513e.f18392a.add(new C6734c(new j0(c1475f, interfaceC2137a), true, 262103052));
    }

    /* renamed from: a */
    public final void m8074a(C3509a c3509a, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1320309496);
        int i11 = (c3966o.m8614g(c3509a) ? 4 : 2) | i10 | (c3966o.m8614g(this) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            C7320q c7320q = this.f18392a;
            int size = c7320q.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((InterfaceC2142f) c7320q.get(i12)).invoke(c3509a, c3966o, Integer.valueOf(i11 & 14));
            }
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1476g(this, c3509a, i10, 12);
        }
    }
}
