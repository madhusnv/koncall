package pg;

import androidx.compose.ui.draw.AbstractC0258a;
import ex.InterfaceC2139c;
import k2.C3966o;
import k2.InterfaceC3962k;
import o1.AbstractC5244c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a */
    public static final /* synthetic */ int f28823a = 0;

    /* renamed from: a */
    public static final void m11594a(int i10, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, InterfaceC7879r interfaceC7879r) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c) ? 32 : 16;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            AbstractC5244c.m10322f(c3966o, AbstractC0258a.m707a(interfaceC7879r, interfaceC2139c));
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g2.k3(interfaceC7879r, interfaceC2139c, i10);
        }
    }
}
