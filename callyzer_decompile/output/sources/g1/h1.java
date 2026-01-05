package g1;

import android.view.ViewConfiguration;
import h1.C2790u;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import s4.InterfaceC6747c;
import w3.k1;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a */
    public static final float f11007a = ViewConfiguration.getScrollFriction();

    /* renamed from: a */
    public static final C2790u m6086a(InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        InterfaceC6747c interfaceC6747c = (InterfaceC6747c) c3966o.m8618k(k1.f37836h);
        boolean zM8611d = c3966o.m8611d(interfaceC6747c.mo155a());
        Object objM8596M = c3966o.m8596M();
        if (zM8611d || objM8596M == C3961j.f20408a) {
            objM8596M = new C2790u(new C8989c(interfaceC6747c));
            c3966o.j0(objM8596M);
        }
        return (C2790u) objM8596M;
    }
}
