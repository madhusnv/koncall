package og;

import ex.InterfaceC2141e;
import k2.C3966o;
import k2.InterfaceC3962k;
import lu.C4516b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class na {
    /* renamed from: a */
    public static final void m10773a(boolean z6, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1818896922);
        int i11 = (c3966o.m8615h(z6) ? 4 : 2) | i10 | (c3966o.m8616i(interfaceC2141e) ? 32 : 16);
        if ((i11 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            le.m10750a(z6, interfaceC2141e, c3966o, i11 & 126);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C4516b(z6, interfaceC2141e, i10, 1);
        }
    }
}
