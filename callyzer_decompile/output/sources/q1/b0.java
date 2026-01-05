package q1;

import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import k1.x0;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import og.hg;
import og.ue;
import rw.C6668r;
import s4.AbstractC6746b;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a */
    public static final C6090r f29638a = new C6090r(null, 0, false, DefinitionKt.NO_Float_VALUE, new C6098z(0), DefinitionKt.NO_Float_VALUE, false, tx.c0.m13479b(C7565i.f36440a), ue.m10985a(), AbstractC6746b.m12924b(0, 0, 15), C6668r.f31943a, 0, 0, 0, x0.Vertical, 0, 0);

    /* renamed from: a */
    public static final C6097y m12082a(int i10, int i11, InterfaceC3962k interfaceC3962k) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        C0917l c0917l = C6097y.f29769w;
        boolean zM8612e = ((C3966o) interfaceC3962k).m8612e(i10) | ((C3966o) interfaceC3962k).m8612e(0);
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        if (zM8612e || objM8596M == C3961j.f20408a) {
            objM8596M = new a0(i10, 0);
            c3966o.j0(objM8596M);
        }
        return (C6097y) hg.m10691b(objArr, c0917l, (InterfaceC2137a) objM8596M, c3966o, 0, 4);
    }
}
