package o1;

import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import w2.C7864c;
import w2.C7870i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a */
    public static final n1 f25791a = new n1(AbstractC5251j.f25757a, C7864c.f37651k);

    /* renamed from: a */
    public static final n1 m10357a(InterfaceC5247f interfaceC5247f, C7870i c7870i, InterfaceC3962k interfaceC3962k, int i10) {
        if (AbstractC4154l.m8918a(interfaceC5247f, AbstractC5251j.f25757a) && AbstractC4154l.m8918a(c7870i, C7864c.f37651k)) {
            C3966o c3966o = (C3966o) interfaceC3962k;
            c3966o.m8607Y(-848964613);
            c3966o.m8623p(false);
            return f25791a;
        }
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.m8607Y(-848913742);
        boolean z6 = true;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c3966o2.m8614g(interfaceC5247f)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) <= 32 || !c3966o2.m8614g(c7870i)) && (i10 & 48) != 32) {
            z6 = false;
        }
        boolean z11 = z10 | z6;
        Object objM8596M = c3966o2.m8596M();
        if (z11 || objM8596M == C3961j.f20408a) {
            objM8596M = new n1(interfaceC5247f, c7870i);
            c3966o2.j0(objM8596M);
        }
        n1 n1Var = (n1) objM8596M;
        c3966o2.m8623p(false);
        return n1Var;
    }
}
