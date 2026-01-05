package o1;

import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import w2.C7864c;
import w2.C7869h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.s */
/* loaded from: classes.dex */
public abstract class AbstractC5260s {

    /* renamed from: a */
    public static final C5261t f25837a = new C5261t(AbstractC5251j.f25759c, C7864c.f37654n);

    /* renamed from: a */
    public static final C5261t m10367a(InterfaceC5249h interfaceC5249h, C7869h c7869h, InterfaceC3962k interfaceC3962k, int i10) {
        if (AbstractC4154l.m8918a(interfaceC5249h, AbstractC5251j.f25759c) && c7869h.equals(C7864c.f37654n)) {
            C3966o c3966o = (C3966o) interfaceC3962k;
            c3966o.m8607Y(346089448);
            c3966o.m8623p(false);
            return f25837a;
        }
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.m8607Y(346143295);
        boolean z6 = true;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c3966o2.m8614g(interfaceC5249h)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !c3966o2.m8614g(c7869h)) && (i10 & 48) != 32) {
            z6 = false;
        }
        boolean z11 = z10 | z6;
        Object objM8596M = c3966o2.m8596M();
        if (z11 || objM8596M == C3961j.f20408a) {
            objM8596M = new C5261t(interfaceC5249h, c7869h);
            c3966o2.j0(objM8596M);
        }
        C5261t c5261t = (C5261t) objM8596M;
        c3966o2.m8623p(false);
        return c5261t;
    }
}
